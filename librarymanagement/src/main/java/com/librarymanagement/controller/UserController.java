package com.librarymanagement.controller;

import com.librarymanagement.entity.User;
import com.librarymanagement.model.ApiResponse;
import com.librarymanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/addUser")
    public ResponseEntity<ApiResponse> addUser(@RequestBody User user) throws Exception {
        var result = this.userService.addUserService(user);
        return ResponseEntity.ok(ApiResponse.Ok(result));
    }

    @PutMapping("/updateUser/{userId}")
    public ResponseEntity<ApiResponse> updateUser(@RequestBody User user, @PathVariable("userId") long userId) throws Exception {
        var result = this.userService.updateUserService(user, userId);
        return ResponseEntity.ok(ApiResponse.Ok(result));
    }

    @GetMapping("/getAllUser")
    public ResponseEntity<ApiResponse> getAllUser(){
        var result = this.userService.getAllUserService();
        return ResponseEntity.ok(ApiResponse.Ok(result));
    }

    @GetMapping("/getUserByUserId/{userId}")
    public ResponseEntity<ApiResponse> getUserByUserId(@PathVariable("userId") Long userId){
        var result = this.userService.getUserByUserIdService(userId);
        return ResponseEntity.ok(ApiResponse.Ok(result));
    }

    @DeleteMapping("/deleteUserByUserId/{userId}")
    public ResponseEntity<ApiResponse> deleteUserByUserId(@PathVariable("userId") Long userId){
        var result = this.userService.deleteUserByUserIdService(userId);
        return ResponseEntity.ok(ApiResponse.Ok(result));
    }

}
