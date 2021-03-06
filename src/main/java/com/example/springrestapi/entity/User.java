package com.example.springrestapi.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Component
public class User {
    private int id;

    private String fullname;

    private int age;

    private String email;

    private String phone;

    private String actions;
}
