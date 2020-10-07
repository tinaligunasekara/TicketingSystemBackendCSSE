package csse.business;


import csse.business.custom.LocalUserBO;
import org.springframework.beans.factory.annotation.Autowired;

public class BOFactory {

    private static BOFactory boFactory;

    @Autowired
    private LocalUserBO localUserBO;

    public enum BoTypes {
        USER,LOCAL_USER_BO
    }


    private BOFactory() {
        //  we use this constructor to  create objects.
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
                return null;
            case LOCAL_USER_BO:
                return localUserBO;
            default:
                return null;
        }
    }
}
