package com.hrbc.business.common;


import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Component;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;
import java.security.Key;
import java.util.Date;

@Component
public class JwtToken {

    public static String ISSUER = "GCQ";
    public static String sercetKey = "gcqsys";
    public final static long keeptime = 1000 * 60 * 60 * 24 * 1;

    private static ThreadLocal<String> USER_LOCAL = new ThreadLocal<>();

    public static void setUserLocal(String user) {
        USER_LOCAL.set(user);
    }

    public static String getUser() {
        return USER_LOCAL.get();
    }

    public static String generToken(String id, String username) {
        return generToken(id, ISSUER, username);
    }

    public static String generToken(String id, String issuer, String subject) {
        long ttlMillis = keeptime;
        SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256;
        long nowMillis = System.currentTimeMillis();
        Date now = new Date(nowMillis);
        byte[] apiKeySecretBytes = DatatypeConverter.parseBase64Binary(sercetKey);
        Key signingKey = new SecretKeySpec(apiKeySecretBytes, signatureAlgorithm.getJcaName());

        JwtBuilder builder = Jwts.builder().setId(id)
                .setIssuedAt(now);
        if (subject != null) {
            builder.setSubject(subject);
        }
        if (issuer != null) {
            builder.setIssuer(issuer);
        }
        builder.signWith(signatureAlgorithm, signingKey);

        if (ttlMillis >= 0) {
            long expMillis = nowMillis + ttlMillis;
            Date exp = new Date(expMillis);
            builder.setExpiration(exp);
        }
        return builder.compact();
    }

    public String updateToken(String token) {
        try {
            Claims claims = verifyToken(token);
            String id = claims.getId();
            String subject = claims.getSubject();
            String issuer = claims.getIssuer();
            Date date = claims.getExpiration();
            return generToken(id, issuer, subject);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return "0";
    }


    public String updateTokenBase64Code(String token) {
        BASE64Encoder base64Encoder = new BASE64Encoder();
        BASE64Decoder decoder = new BASE64Decoder();
        try {
            token = new String(decoder.decodeBuffer(token), "utf-8");
            Claims claims = verifyToken(token);
            String id = claims.getId();
            String subject = claims.getSubject();
            String issuer = claims.getIssuer();
            Date date = claims.getExpiration();
            String newToken = generToken(id, issuer, subject);
            return base64Encoder.encode(newToken.getBytes());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return "0";
    }


    public static Claims verifyToken(String token) {
        Claims claims = Jwts.parser()
                .setSigningKey(DatatypeConverter.parseBase64Binary(sercetKey))
                .parseClaimsJws(token).getBody();
        return claims;
    }


    public static String checkUser(String token) {
        Claims claims = null;
        try {
            claims = verifyToken(token);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return claims.getSubject();
    }

    public static void main(String[] args) throws Exception {
        String token = JwtToken.generToken("aaa", "gcqsys", "zhouhongshuo");
        Thread.sleep(2000);
        Claims claims = JwtToken.verifyToken("eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJtYXlrZSIsImlhdCI6MTU1NzE5OTgzMCwic3ViIjoibWF5a2UiLCJpc3MiOiJUYWlNdUtlSmkiLCJleHAiOjE1NTc4MDQ2MzB9.wszEsK8Va8VIDwmxXlyrHTZhcDnWKLgyNhL4lTR6a7Y");
        System.out.println(token);

        System.out.println(claims.getSubject());


    }
}