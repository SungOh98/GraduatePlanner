package org.example.service;

import org.example.domain.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    User getUserInfo(long id);
    void createUser(User user);
}
