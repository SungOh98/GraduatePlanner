package org.example.controller;

import org.example.domain.User;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;
    private static Logger logger = Logger.getLogger(UserController.class.getName());

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping()
    public String createUser(@RequestBody User user) {
        //로그 찍기
        logger.log(Level.INFO, "김의년 love 최예나");

        userService.createUser(user);

        return "create User";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User userInfo(@PathVariable("id") Long id) {
        return userService.getUserInfo(id);
    }

}

