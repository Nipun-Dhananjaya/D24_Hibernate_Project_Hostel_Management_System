
package com.d24hostels.util;

import com.d24hostels.entity.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.IOException;
import java.util.Properties;

public class FactoryConfiguration {
    private static FactoryConfiguration factoryConfiguration;
    private SessionFactory sessionFactory;
    private FactoryConfiguration(){
        /*Configuration configuration=new Configuration().configure("hibernate.properties").addAnnotatedClass(Student.class).addAnnotatedClass(Room.class).addAnnotatedClass(Payment.class).addAnnotatedClass(User.class).addAnnotatedClass(Price.class).addAnnotatedClass(University.class);
        sessionFactory=configuration.buildSessionFactory();*/
        Properties properties = new Properties();

        try {
            properties.load(ClassLoader.getSystemClassLoader().getResourceAsStream("hibernate.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        sessionFactory=new Configuration().addAnnotatedClass(Student.class).addAnnotatedClass(Room.class).addAnnotatedClass(Reservation.class).addAnnotatedClass(User.class).addAnnotatedClass(Price.class).addAnnotatedClass(University.class).mergeProperties(properties).buildSessionFactory();
    }

    public static FactoryConfiguration getInstance(){
        return (factoryConfiguration==null)? factoryConfiguration=new FactoryConfiguration():factoryConfiguration;
    }
    public Session getSession(){
        return sessionFactory.openSession();
    }
}
