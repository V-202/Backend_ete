package com.example.BackEnd_ETE.Controller;

import com.example.BackEnd_ETE.model.User;
import com.example.BackEnd_ETE.service.userService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class personalController {

    @Autowired
    public userService userservice;

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String adduser(@RequestBody String data) throws JsonProcessingException {
        System.out.println(data);
        User user = new ObjectMapper().readValue(data, User.class);
        System.out.println(user.toString());
        if(userservice.adduser(user))
        {
            System.out.println("yes");
            return "true";
        }
        System.out.println("no");
        return "false";
    }

    @RequestMapping("/getallusers")
    public List<User> getusers()  {
        List<User> userList=userservice.getallusers();
        System.out.println(userList);
        return userList;
    }
}
