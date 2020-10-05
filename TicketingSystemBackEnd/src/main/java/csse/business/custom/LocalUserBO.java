package csse.business.custom;

import csse.business.SuperBO;
import csse.entity.User;

import java.util.List;

public interface LocalUserBO extends SuperBO {

    User addLocalUser(User user);

    List<User> getAllLocalUsers();

    User getAllLocalUsersById(String id);
}
