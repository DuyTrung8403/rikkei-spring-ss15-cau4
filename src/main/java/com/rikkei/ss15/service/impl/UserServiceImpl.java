package com.rikkei.ss15.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.rikkei.ss15.entity.User;
import com.rikkei.ss15.repository.UserRepository;
import com.rikkei.ss15.service.UserService;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public User updateRole(Long id, String role) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));
        user.setRole(role);
        return userRepository.save(user);
    }

    @Override
    public User getCurrentUser(String email) {
        return userRepository.findByEmail(email)
                .orElseThrow(() -> new RuntimeException("User not found"));
    }
}
