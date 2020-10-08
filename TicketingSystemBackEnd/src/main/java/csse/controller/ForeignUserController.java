package csse.controller;

import csse.entity.User;
import csse.service.ForeignUserService;
import csse.util.CommonConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping(value = CommonConstants.ROUTE_FOREIGN_USER_MAIN)
public class ForeignUserController {

    @Autowired
    private ForeignUserService foreignUserService;


    @PostMapping(value = CommonConstants.ROUTE_CREATE)
    public User addForeignUser(@RequestBody User user) {
        return foreignUserService.addForeignUser(user);
    }

}
