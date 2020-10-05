package csse.controller;
import csse.entity.User;
import csse.repository.UserRepository;
import csse.service.LocalUserService;
import csse.util.CommonConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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


}
