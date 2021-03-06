package com.hrbc.business.common;


import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.hrbc.business.domain.Staffs;
import com.hrbc.business.domain.StaffsExample;
import com.hrbc.business.domain.enums.DelFlagE;
import com.hrbc.business.mapper.StaffsMapper;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import javax.annotation.PostConstruct;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;
import java.security.Key;
import java.util.*;

/**
 * @author huangyongchao
 */
@Component
public class JwtToken {
    public static Set<String> SUPER_ADMIN = Sets.newHashSet();

    static {
        SUPER_ADMIN.add("guocq");
        SUPER_ADMIN.add("admin");
        SUPER_ADMIN.add("admin1");
        SUPER_ADMIN.add("admin2");
        SUPER_ADMIN.add("Amanda.zhao");
    }

    @Autowired
    private StaffsMapper staffsMapper;

    public static String ISSUER = "GCQ";
    public static String sercetKey = "gcqsys";
    public final static long keeptime = 1000 * 60 * 60 * 24 * 1;

    private static ThreadLocal<String> USER_LOCAL = new ThreadLocal<>();
    public static Map<String, Staffs> CURRENTSTAFFMAP = Maps.newHashMap();

    public static void setUserLocal(String user) {
        USER_LOCAL.set(user);
    }

    public static String getUser() {
        return USER_LOCAL.get();
    }

    /**
     * 判断是否超级账号
     *
     * @return
     */
    public static boolean isAdmin() {
        return SUPER_ADMIN.contains(USER_LOCAL.get());
    }

    public static Staffs getStaff(String username) {
        return CURRENTSTAFFMAP.get(username);
    }

    public static String getUserName(String username) {
        return CURRENTSTAFFMAP.get(username).getStaffname();
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

    @PostConstruct
    public void init() {
        StaffsExample example = new StaffsExample();
        example.createCriteria().andDelflagEqualTo(DelFlagE.NO.code);
        example.setLimit(2000);
        example.setOffset(0);

        List<Staffs> list = staffsMapper.selectByExample(example);
        Optional.of(list).orElse(Lists.newArrayList()).stream().filter(n -> !StringUtils.isEmpty(n.getUsername())).forEach(n -> {
            CURRENTSTAFFMAP.put(n.getUsername(), n);
        });
    }

    public static void main(String[] args) throws Exception {
        String token = JwtToken.generToken("Vivi.li", "Vivi.li", "Vivi.li");
        Thread.sleep(2000);
        Claims claims = JwtToken.verifyToken("eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJtYXlrZSIsImlhdCI6MTU1NzE5OTgzMCwic3ViIjoibWF5a2UiLCJpc3MiOiJUYWlNdUtlSmkiLCJleHAiOjE1NTc4MDQ2MzB9.wszEsK8Va8VIDwmxXlyrHTZhcDnWKLgyNhL4lTR6a7Y");
        System.out.println(token);

        System.out.println(claims.getSubject());


    }
}