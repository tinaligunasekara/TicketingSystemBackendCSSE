package csse.service.impl;

import csse.business.BOFactory;
import csse.business.custom.ForeignUserBO;
import csse.entity.User;
import csse.service.ForeignUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ForeignUserServiceImpl implements ForeignUserService {

    @Autowired
    private ForeignUserBO foreignUserBO;

    public ForeignUserServiceImpl() {
        foreignUserBO = (ForeignUserBO) BOFactory.getInstance().getBO(BOFactory.BoTypes.FOREIGN_USER_BO);
    }


    @Override
    public User addForeignUser(User user) {
        return foreignUserBO.addForeignUser(user);
    }
}
