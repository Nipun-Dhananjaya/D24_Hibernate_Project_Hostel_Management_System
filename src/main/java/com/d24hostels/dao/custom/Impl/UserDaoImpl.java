package com.d24hostels.dao.custom.Impl;

import com.d24hostels.dao.custom.UserDao;
import com.d24hostels.entity.User;
import com.d24hostels.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class UserDaoImpl implements UserDao {

    @Override
    public List<User> getAll() throws Exception {
        return null;
    }

    @Override
    public void save(User entity) throws Exception {
        Session session= FactoryConfiguration.getInstance().getSession();
        Transaction transaction=session.beginTransaction();

        session.persist(entity);

        transaction.commit();
        session.close();
    }

    @Override
    public void update(User entity) throws Exception {

    }

    @Override
    public void delete(String s) throws Exception {

    }

    @Override
    public User search(String s) throws Exception {
        return null;
    }
}
