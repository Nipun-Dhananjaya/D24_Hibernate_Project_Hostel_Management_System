package com.d24hostels.dao.custom.Impl;

import com.d24hostels.dao.custom.PriceDao;
import com.d24hostels.entity.Price;
import com.d24hostels.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;

import java.util.ArrayList;
import java.util.List;

public class PriceDaoImpl implements PriceDao {

    @Override
    public List<Price> getAll() throws Exception {
        return null;
    }

    @Override
    public void save(Price entity) throws Exception {
        Session session= FactoryConfiguration.getInstance().getSession();
        Transaction transaction=session.beginTransaction();

        session.persist(entity);

        transaction.commit();
        session.close();
    }

    @Override
    public void update(Price entity) throws Exception {
        Session session= FactoryConfiguration.getInstance().getSession();
        Transaction transaction=session.beginTransaction();

        session.update(entity);

        transaction.commit();
        session.close();
    }

    @Override
    public void delete(String s) throws Exception {

    }

    @Override
    public Price search(String s) throws Exception {
        Session session= FactoryConfiguration.getInstance().getSession();
        Transaction transaction=session.beginTransaction();

        Price price = session.get(Price.class, s);

        transaction.commit();
        session.close();
        return price;
    }

    @Override
    public List<Price> getAllPrices() {
        Session session= FactoryConfiguration.getInstance().getSession();
        Transaction transaction=session.beginTransaction();

        NativeQuery nativeQuery = session.createNativeQuery("SELECT * FROM price;");
        nativeQuery.addEntity(Price.class);
        List<Price> prices = nativeQuery.list();

        transaction.commit();
        session.close();

        return prices;
    }
}
