package csse.business.custom;

import csse.business.SuperBO;
import csse.entity.User;

public interface ForeignUserBO extends SuperBO {
    User addForeignUser(User user);
}
