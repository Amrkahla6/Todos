package com.example.demo.service;

import com.example.demo.request.RegisterRequest;

public interface AuthenticationService {
    void register(RegisterRequest input) throws Exception;
}
