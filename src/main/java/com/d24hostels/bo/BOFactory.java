package com.d24hostels.bo;

import com.d24hostels.bo.custom.Impl.*;

public class BOFactory {
    private BOFactory(){}
    private static BOFactory BoFactory;

    public static BOFactory getBoFactory() {
        return (BoFactory==null)?BoFactory=new BOFactory():BoFactory;
    }
    public enum BOTypes{
        STUDENT,ROOMS,PAYMENTS,USER,PRICE,UNIVERSITY
    }
    public static SuperBo getBO(BOTypes boTypes){
        switch (boTypes){
            case STUDENT:return new StudentBoImpl();
            case ROOMS:return new RoomBoImpl();
            case PAYMENTS:return new PaymentBoImpl();
            case USER:return new UserBoImpl();
            case PRICE:return new PriceBoImpl();
            case UNIVERSITY:return new UniversityBoImpl();
            default: return null;
        }
    }
}
