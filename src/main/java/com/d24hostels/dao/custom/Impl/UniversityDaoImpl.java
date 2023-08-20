package com.d24hostels.dao.custom.Impl;

import com.d24hostels.dao.custom.UniversityDao;
import com.d24hostels.entity.Price;
import com.d24hostels.entity.University;
import com.d24hostels.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;

import java.util.List;

public class UniversityDaoImpl implements UniversityDao {
    @Override
    public List<University> getAll() throws Exception {
        Session session= FactoryConfiguration.getInstance().getSession();
        Transaction transaction=session.beginTransaction();

        NativeQuery nativeQuery = session.createNativeQuery("SELECT * FROM university;");
        nativeQuery.addEntity(University.class);
        List<University> universities = nativeQuery.list();

        transaction.commit();
        session.close();

        return universities;
    }

    @Override
    public void save(University entity) throws Exception {
        Session session= FactoryConfiguration.getInstance().getSession();
        Transaction transaction=session.beginTransaction();

        session.persist(entity);

        transaction.commit();
        session.close();
    }

    @Override
    public void update(University entity) throws Exception {

    }

    @Override
    public void delete(String s) throws Exception {

    }

    @Override
    public University search(String s) throws Exception {
        return null;
    }
}
