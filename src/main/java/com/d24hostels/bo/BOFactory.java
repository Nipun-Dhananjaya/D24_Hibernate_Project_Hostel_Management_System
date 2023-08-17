package com.d24hostels.bo;

import com.d24hostels.bo.custom.Impl.PaymentBoImpl;
import com.d24hostels.bo.custom.Impl.RoomBoImpl;
import com.d24hostels.bo.custom.Impl.StudentBoImpl;

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
            default: return null;
        }
    }
}
