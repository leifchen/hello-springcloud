package com.chen.controller;

import com.chen.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * UserController
 * <p>
 * @Author LeifChen
 * @Date 2019-11-21
 */
@RestController
@RequestMapping("/users")
public class UserController {

    private static List<User> userList = new ArrayList<>();

    static {
        userList.add(new User("Leif", 29));
        userList.add(new User("Chen", 18));
    }

    @GetMapping
    public List<User> getUserList() {
        return userList;
    }
}
