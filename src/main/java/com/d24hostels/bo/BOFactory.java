package com.d24hostels.bo;

import com.d24hostels.bo.custom.Impl.PaymentBoImpl;
import com.d24hostels.bo.custom.Impl.RoomBoImpl;
import com.d24hostels.bo.custom.Impl.StudentBoImpl;
import com.d24hostels.bo.custom.Impl.UserBoImpl;

public class BOFactory {
    private BOFactory(){}
    private static BOFactory BoFactory;

    public static BOFactory getBoFactory() {
        return (BoFactory==null)?BoFactory=new BOFactory():BoFactory;
    }
    public enum BOTypes{
        STUDENT,ROOMS,PAYMENTS,USER
    }
    public static SuperBo getBO(BOTypes boTypes){
        switch (boTypes){
            case STUDENT:return new StudentBoImpl();
            case ROOMS:return new RoomBoImpl();
            case PAYMENTS:return new PaymentBoImpl();
            case USER:return new UserBoImpl();
            default: return null;
        }
    }
}
