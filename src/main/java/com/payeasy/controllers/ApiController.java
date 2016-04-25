package com.payeasy.controllers;

import com.payeasy.models.BaseRequest;
import com.payeasy.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shashank on 25/4/16.
 */
@Controller
public class ApiController {

    @RequestMapping(value = "/getUserById", method = RequestMethod.POST)
    @ResponseBody
    public User getUserById(@RequestBody BaseRequest baseRequest){

        User user = new User();
        user.setUserId(baseRequest.getId());
        user.setFirstName("Test");
        user.setFirstName("User");
        user.setPassword("sample");
        user.setEmail("test@user.com");
        user.setPhone("9999999999");

        return user;
    }

    @RequestMapping(value = "/getAllUsers", method = RequestMethod.GET)
    public @ResponseBody List<User> getAllUsers(){

        List<User> userList = new ArrayList<>();
        User user1 = new User();
        user1.setUserId(1);
        user1.setFirstName("Test1");
        user1.setFirstName("User1");
        user1.setPassword("sample1");
        user1.setEmail("test@user1.com");
        user1.setPhone("1111111111");

        User user2 = new User();
        user2.setUserId(2);
        user2.setFirstName("Test2");
        user2.setFirstName("User2");
        user2.setPassword("sample2");
        user2.setEmail("test@user2.com");
        user2.setPhone("2222222222");


        userList.add(user1);
        userList.add(user2);


        return userList;
    }

    @RequestMapping(value = "/createUser", method = RequestMethod.POST)
    public @ResponseBody Boolean createUser(@RequestBody User user){
        return true;
    }

}
