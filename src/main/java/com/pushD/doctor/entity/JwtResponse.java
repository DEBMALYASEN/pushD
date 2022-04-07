package com.pushD.doctor.entity;

public class JwtResponse
{
    String  token;

    public JwtResponse(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
//JWT REQUEST AND RESPONSE TWO TABLES TO BE MAINTAINED