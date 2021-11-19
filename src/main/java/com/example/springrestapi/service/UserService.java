package com.example.springrestapi.service;

import com.example.springrestapi.entity.User;
import com.example.springrestapi.model.dto.request.CreateUser;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    public List<User> getListUser();
    public User getUserById(int id);
    public User createUser(CreateUser user);
    public void updateUserById(User user);
    public void deleteUserById(int id);
}
