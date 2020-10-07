package csse.controller;
import csse.entity.User;
import csse.service.LocalUserService;
import csse.util.CommonConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = CommonConstants.ROUTE_LOCAL_USER_MAIN)
public class LocalUserController {

    @Autowired
    private LocalUserService localUserService;


    @PostMapping(value = CommonConstants.ROUTE_CREATE)
    public User addLocalUser(@RequestBody User user) {
        return localUserService.addLocalUser(user);
    }

    @GetMapping(value =CommonConstants.ROUTE_ALL)
    public List<User> getAllLocalUsers(){
        return  localUserService.getAllLocalUsers();
    }

    @GetMapping(value =CommonConstants.ROUTE_SINGLE)
    public User getAllLocalUsersById(@PathVariable String id){
        return  localUserService.getAllLocalUsersById(id);
    }
}
