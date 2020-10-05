package csse.service.impl;

import csse.business.BOFactory;
import csse.business.custom.UserBO;
import csse.service.UserService;
import org.springframework.stereotype.Service;
@Service
public class UserServiceImpl implements UserService {

    private UserBO userBO;

    public UserServiceImpl(){
        userBO = (UserBO) BOFactory.getInstance().getBO(BOFactory.BoTypes.USER);

    }
}
