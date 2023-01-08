package org.example.repository;

import org.example.domain.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    User getUserById(Long id);
    void create(User user);

}
