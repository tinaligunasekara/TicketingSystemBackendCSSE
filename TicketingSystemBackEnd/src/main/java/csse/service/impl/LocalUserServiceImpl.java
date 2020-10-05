package csse.service.impl;

import csse.business.BOFactory;
import csse.business.custom.LocalUserBO;
import csse.entity.User;
import csse.service.LocalUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocalUserServiceImpl implements LocalUserService {

    @Autowired
    private LocalUserBO localUserBO;
    public LocalUserServiceImpl() {
        localUserBO = (LocalUserBO) BOFactory.getInstance().getBO(BOFactory.BoTypes.LOCAL_USER_BO);
    }

    @Override
    public User addLocalUser(User user) {
        return localUserBO.addLocalUser(user);
    }

    @Override
    public List<User> getAllLocalUsers() {
        return localUserBO.getAllLocalUsers();
    }

    @Override
    public User getAllLocalUsersById(String id) {
        return localUserBO.getAllLocalUsersById(id);
    }
}
