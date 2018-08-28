package com.qa.QACinema.Controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qa.QACinema.Pojos.UserRegistration;
import com.qa.QACinema.Service.UserService;



@RestController
public class UserController {

	@Autowired
    private UserService userService;



    @PostMapping(value = "/register")
    public String register(@RequestBody UserRegistration userRegistration){
        if(!userRegistration.getPassword().equals(userRegistration.getPasswordConfirmation()))
            return "Error the two passwords do not match";
        else if(userService.getUser(userRegistration.getUsername()) != null)
            return "Error this username already exists";
        
        userService.save(new com.qa.QACinema.Entities.User(userRegistration.getUsername(), userRegistration.getPassword(), Arrays.asList(new com.qa.QACinema.Entities.Role("USER"), new com.qa.QACinema.Entities.Role("ACTUATOR"))));
        return "User created";
        
    }
    
    @GetMapping(value = "/users")
    public List<com.qa.QACinema.Entities.User> users(){
        return userService.getAllUsers();
    }
    
    

}
