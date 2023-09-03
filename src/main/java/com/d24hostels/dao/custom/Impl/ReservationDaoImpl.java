package com.d24hostels.dao.custom.Impl;

import com.d24hostels.dao.custom.ReservationDao;
import com.d24hostels.dto.ReservationDto;
import com.d24hostels.entity.Reservation;
import com.d24hostels.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class ReservationDaoImpl implements ReservationDao {

    @Override
    public List<Reservation> getAll() throws Exception {
        return null;
    }

    @Override
    public void save(Reservation entity) throws Exception {
        Session session= FactoryConfiguration.getInstance().getSession();
        Transaction transaction=session.beginTransaction();

        session.persist(entity);

        transaction.commit();
        session.close();
    }

    @Override
    public void update(Reservation entity) throws Exception {
        Session session= FactoryConfiguration.getInstance().getSession();
        Transaction transaction=session.beginTransaction();

        session.update(entity);

        transaction.commit();
        session.close();
    }

    @Override
    public void delete(String s) throws Exception {
        Session session= FactoryConfiguration.getInstance().getSession();
        Transaction transaction=session.beginTransaction();

        Reservation reservation = session.get(Reservation.class, s);
        session.remove(reservation);

        transaction.commit();
        session.close();
    }

    @Override
    public Reservation search(String s) throws Exception {
        Session session= FactoryConfiguration.getInstance().getSession();
        Transaction transaction=session.beginTransaction();

        Reservation reservation = session.get(Reservation.class, s);

        transaction.commit();
        session.close();
        return reservation;
    }
}
