package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    UserService service;

    @RequestMapping(value = "/getUserItem", method = RequestMethod.GET)
    public String getUserItem(Integer id) {
        User user = service.getUserInfo();
        System.out.println("" + id);
        return new Gson().toJson(user);
    }

    @RequestMapping(value = "/getTest", method = RequestMethod.POST)
    public String getTest(Integer id) {
        User user = service.getUserInfo();
        System.out.println("" + id);
        return new Gson().toJson(user);
    }

    @RequestMapping(value = "/getTest2", method = RequestMethod.GET)
    public String getTest2(Integer id, @RequestParam(required = false) @RequestHeader("token") String token) {
        User user = service.getUserInfo();
        System.out.println("" + id);
        System.out.println("" + token);
        return new Gson().toJson(user);
    }
}
