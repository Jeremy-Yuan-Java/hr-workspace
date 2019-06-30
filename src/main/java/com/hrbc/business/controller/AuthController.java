package com.hrbc.business.controller;

import com.hrbc.business.domain.SysUser;
import com.hrbc.business.domain.common.ResponseDTO;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
public class AuthController {

    @GetMapping("api/auth/login")
    public ResponseDTO save(@RequestBody SysUser entity) {
        return new ResponseDTO(true, "success", entity.getId());
    }

    @GetMapping("/")
    public ResponseDTO ping() {
        return new ResponseDTO(true, "success", null);
    }

}
