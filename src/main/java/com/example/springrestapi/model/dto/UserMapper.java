package com.example.springrestapi.model.dto;

import com.example.springrestapi.entity.User;
import com.example.springrestapi.model.dto.request.CreateUser;

public class UserMapper {
    public static User toUser(CreateUser req) {
        User user = new User();
        user.setFullname(req.getFullname());
        user.setEmail(req.getEmail());
        user.setPhone(req.getPhone());
        // Hash password using BCrypt
//        String hash = BCrypt.hashpw(req.getPassword(), BCrypt.gensalt(12));
        user.setAge(req.getAge());

        return user;
    }
}
