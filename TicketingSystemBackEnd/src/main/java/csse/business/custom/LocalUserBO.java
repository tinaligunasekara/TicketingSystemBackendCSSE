package csse.business.custom;

import csse.business.SuperBO;
import csse.entity.User;

public interface LocalUserBO extends SuperBO {

    User addLocalUser(User user);

}
