package com.hrbc.business.controller;

import com.hrbc.business.domain.SysUser;
import com.hrbc.business.domain.common.ResponseDTO;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
public class AuthController {

    @PostMapping("api/auth/login")
    public ResponseDTO save(@RequestBody SysUser entity) {
        return new ResponseDTO(true, "success", "test");
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
