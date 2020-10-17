package csse.controller;

import csse.entity.User;
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
    public User userLogin(@PathVariable String id, @PathVariable String password) {
        return userService.userLogin(id, password);
    }

    @GetMapping(value = CommonConstants.ROUTE_CHECK_BALANCE)
    public double checkBalance(@PathVariable String id) {
        return userService.checkBalance(id);
    }

    @GetMapping(value = CommonConstants.ROUTE_CHECK_USERNAME_IS_EXISTS)
    public boolean checkUserNameIsExists(@PathVariable String username) {
        return userService.checkUserNameIsExists(username);
    }

    @GetMapping(value = CommonConstants.ROUTE_UPDATE_PAYMENT)
    public User updatePayment(@PathVariable String amount,@PathVariable String tokenNumber) {
        return userService.updatePayment(amount,tokenNumber);
    }

}
