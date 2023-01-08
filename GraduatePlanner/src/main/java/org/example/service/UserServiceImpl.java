package org.example.service;

import org.example.domain.User;
import org.example.repository.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    private final UserMapper userMapper;

    @Autowired
    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public User getUserInfo(long id) {
        return userMapper.getUserById(id);
    }

    public void createUser(User user) {
        userMapper.create(user);
    }
}
