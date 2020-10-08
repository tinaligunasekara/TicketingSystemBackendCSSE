package csse.business;


import csse.business.custom.ForeignUserBO;
import csse.business.custom.LocalUserBO;
import csse.business.custom.UserBO;
import org.springframework.beans.factory.annotation.Autowired;

public class BOFactory {

    private static BOFactory boFactory;

    @Autowired
    private LocalUserBO localUserBO;
    @Autowired
    private UserBO userBO;
    @Autowired
    private ForeignUserBO foreignUserBO;

    public enum BoTypes {
        USER,LOCAL_USER_BO,FOREIGN_USER_BO
    }


    private BOFactory() {
        //  we use this constructor to  create Factory objects.
    }

    public static BOFactory getInstance() {
        if (boFactory == null) {
            boFactory = new BOFactory();
        }
        return boFactory;
    }

    public SuperBO getBO(BoTypes type) {
        switch (type) {
            case USER:
                return userBO;
            case LOCAL_USER_BO:
                return localUserBO;
            case FOREIGN_USER_BO:
                return foreignUserBO;
            default:
                return null;
        }
    }
}
