package com.auth_app.demo.dto;

import lombok.Data;

@Data
public class SignInRequest {
    private String username;
    private String password;
}
