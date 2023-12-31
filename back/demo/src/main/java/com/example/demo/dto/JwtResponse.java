package com.example.demo.dto;

import lombok.Data;

@Data
public class JwtResponse {
    String token;
    String tokenHeader = "Bearer";

    public JwtResponse(String token) {
        this.token = token;
    }
}
