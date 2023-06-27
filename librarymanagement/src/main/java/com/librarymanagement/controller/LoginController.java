package com.librarymanagement.controller;

import com.librarymanagement.entity.Login;
import com.librarymanagement.model.ApiResponse;
import com.librarymanagement.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    LoginService LoginService;

    @GetMapping("/getAllLogin")
    public ResponseEntity<ApiResponse> getAllLogin(){
        var result = this.LoginService.getAllLoginService();
        return ResponseEntity.ok(ApiResponse.Ok(result));
    }

}
