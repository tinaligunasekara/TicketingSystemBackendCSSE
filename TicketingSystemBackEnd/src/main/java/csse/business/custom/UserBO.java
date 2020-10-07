package csse.business.custom;

import csse.business.SuperBO;

public interface UserBO extends SuperBO {

    boolean userLogin(String id, String password);
}
