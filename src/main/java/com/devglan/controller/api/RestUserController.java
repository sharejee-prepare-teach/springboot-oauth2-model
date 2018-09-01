package com.devglan.controller.api;

import com.devglan.model.User;
import com.devglan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Rith on 8/15/2018.
 */
@RestController
public class RestUserController {
    @Autowired
    public UserService userServiceAPI;

    @RequestMapping(value = "/users",method = {RequestMethod.GET, RequestMethod.POST})
    public List<User> getAllUsers(){
        return (List<User>) userServiceAPI.findAll();
    }
}
