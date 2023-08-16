package com.d24hostels.util;

import com.d24hostels.entity.Payment;
import com.d24hostels.entity.Room;
import com.d24hostels.entity.Student;
import com.d24hostels.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoryConfiguration {
    private static FactoryConfiguration factoryConfiguration;
    private SessionFactory sessionFactory;
    private FactoryConfiguration(){
        Configuration configuration=new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Room.class).addAnnotatedClass(Payment.class).addAnnotatedClass(User.class);
        sessionFactory=configuration.buildSessionFactory();
    }

    public static FactoryConfiguration getInstance(){
        return (factoryConfiguration==null)? factoryConfiguration=new FactoryConfiguration():factoryConfiguration;
    }
    public Session getSession(){
        return sessionFactory.openSession();
    }
}