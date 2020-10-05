package csse.controller;


import csse.service.UserService;
import csse.util.CommonConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping(value = CommonConstants.ROUTE_USER_MAIN)
public class UserController {

    @Autowired
    private UserService userService;

    public UserController(){

    }
}
