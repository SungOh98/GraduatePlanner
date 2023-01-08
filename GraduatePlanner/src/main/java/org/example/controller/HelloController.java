package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.logging.Level;
import java.util.logging.Logger;


@Controller
public class HelloController {
    private static Logger logger = Logger.getLogger(HelloController.class.getName());
    @RequestMapping(value = "helloBody", method = RequestMethod.GET)
    @ResponseBody
    public String hello() {
        return "Hello Spring (text)";
    }

    @RequestMapping(value ="hello", method = RequestMethod.GET)
    public String helloBody() {
        logger.log(Level.INFO, "김의년 love 최예나");
        return "hello";
    }
}