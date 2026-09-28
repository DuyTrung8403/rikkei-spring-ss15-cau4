package com.rikkei.ss15.service;

import com.rikkei.ss15.entity.User;

public interface UserService {
    User updateRole(Long id, String role);
    User getCurrentUser(String email);
}
