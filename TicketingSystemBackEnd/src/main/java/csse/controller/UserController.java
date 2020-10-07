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

    @GetMapping(value = CommonConstants.ROUTE_ALL)
    public boolean userLogin(@PathVariable String id, @PathVariable String password) {
        return userService.userLogin(id, password);
    }
}
