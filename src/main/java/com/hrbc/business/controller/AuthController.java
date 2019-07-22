package com.hrbc.business.controller;

import com.google.common.collect.Maps;
import com.hrbc.business.common.JwtToken;
import com.hrbc.business.domain.SysUser;
import com.hrbc.business.domain.common.ResponseDTO;
import com.hrbc.business.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @author huangyongchao
 */
@CrossOrigin
@RestController
public class AuthController {

    @Autowired
    SysUserService sysUserService;

    @PostMapping("api/auth/login")
    public ResponseDTO save(@RequestBody SysUser entity) {
        if (sysUserService.verify(entity) > 0) {
            String token = JwtToken.generToken(entity.getUsername(), entity.getUsername());
            JwtToken.setUserLocal(entity.getUsername());
            Map<String, String> user = Maps.newHashMap();
            user.put("token", token);
            user.put("cname", entity.getCnname());
            return new ResponseDTO(true, "success", user);
        } else {
            return new ResponseDTO(false, "error", null);
        }
    }

    @PostMapping("api/auth/logout")
    public ResponseDTO logout() {
        return new ResponseDTO(true, "success", "");
    }
    @RequestMapping(value = "api/auth/tokeninvalid", method = {RequestMethod.POST, RequestMethod.GET})
    public ResponseDTO tokeninvalid() {
        return new ResponseDTO(false, "Token  Is Invalid , Please Login", "tokeninvalid");
    }
    @GetMapping("/")
    public ResponseDTO ping() {
        return new ResponseDTO(true, "success", null);
    }

}
