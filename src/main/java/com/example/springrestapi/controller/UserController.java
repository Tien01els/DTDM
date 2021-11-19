package com.example.springrestapi.controller;

import com.example.springrestapi.entity.User;
import com.example.springrestapi.model.dto.request.CreateUser;
import com.example.springrestapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
//import javax.validation.Valid;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("")
    public ResponseEntity<?> getListUser() {
        List<User> users = userService.getListUser();
        return ResponseEntity.ok(users);
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> getUser(@PathVariable int id) {
        return null;
    }
    @PostMapping("")
    public ResponseEntity<?> createUser(@RequestBody CreateUser req) {
        User result = userService.createUser(req);
        return ResponseEntity.ok(result);
    }
    @PutMapping("/{id}")
    public ResponseEntity<?> updateUser() {
        return null;
    }
    @DeleteMapping ("/{id}")
    public ResponseEntity<?> deleteUser() {
        return null;
    }
}
