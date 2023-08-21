package com.d24hostels.dao;

import com.d24hostels.dao.custom.Impl.*;

public class DAOFactory {
    private DAOFactory(){}
    private static DAOFactory daoFactory;

    public static DAOFactory getDaoFactory() {
        return (daoFactory==null)?daoFactory=new DAOFactory():daoFactory;
    }
    public enum DAOTypes{
        STUDENT,ROOMS,PAYMENTS,USER
    }
    public static SuperDAO getDAO(DAOTypes daoTypes){
        switch (daoTypes){
            case STUDENT:return new StudentDaoImpl();
            case ROOMS:return new RoomDaoImpl();
            case PAYMENTS:return new PaymentDaoImpl();
            case USER:return new UserDaoImpl();
            default: return null;
        }
    }
}
