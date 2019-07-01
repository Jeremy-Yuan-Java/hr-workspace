package com.hrbc.business.controller;

import com.hrbc.business.common.JwtToken;
import com.hrbc.business.domain.SysUser;
import com.hrbc.business.domain.common.ResponseDTO;
import com.hrbc.business.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
public class AuthController {

    @Autowired
    SysUserService sysUserService;

    @PostMapping("api/auth/login")
    public ResponseDTO save(@RequestBody SysUser entity) {
        if (sysUserService.verify(entity) > 0) {
            return new ResponseDTO(true, "success", JwtToken.generToken(entity.getUsername(), entity.getUsername()));
        } else {
            return new ResponseDTO(false, "error", null);
        }
    }

    @PostMapping("api/auth/logout")
    public ResponseDTO logout() {
        return new ResponseDTO(true, "success", "");
    }

    @GetMapping("/")
    public ResponseDTO ping() {
        return new ResponseDTO(true, "success", null);
    }

}