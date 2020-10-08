package csse.controller;

import csse.service.UserService;
import csse.util.CommonConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping(value = CommonConstants.ROUTE_USER_MAIN)
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = CommonConstants.ROUTE_USER_LOGIN)
    public String userLogin(@PathVariable String id, @PathVariable String password) {
        return userService.userLogin(id, password);
    }

    @GetMapping(value = CommonConstants.ROUTE_CHECK_BALANCE)
    public double checkBalance(@PathVariable String id) {
        return userService.checkBalance(id);
    }

    @GetMapping(value = CommonConstants.ROUTE_CHECK_USERNAME_IS_EXISTS)
    public boolean checkUserNameIsExists(@PathVariable String userName) {
        return userService.checkUserNameIsExists(userName);
    }
}
