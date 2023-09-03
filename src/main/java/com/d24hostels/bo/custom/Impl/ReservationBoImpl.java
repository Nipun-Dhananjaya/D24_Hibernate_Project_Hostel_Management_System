package com.d24hostels.bo.custom.Impl;

import com.d24hostels.bo.custom.ReservationBo;
import com.d24hostels.dao.DAOFactory;
import com.d24hostels.dao.custom.ReservationDao;
import com.d24hostels.dto.ReservationDto;
import com.d24hostels.dto.ReservationTmDto;
import com.d24hostels.entity.Price;
import com.d24hostels.entity.Reservation;
import com.d24hostels.entity.Room;

import java.util.List;

public class ReservationBoImpl implements ReservationBo {
    ReservationDao reservationDao= (ReservationDao) DAOFactory.getDaoFactory().getDAO(DAOFactory.DAOTypes.RESERVATION);
    @Override
    public void saveReservation(ReservationDto paymentDto) throws Exception {
        reservationDao.save(new Reservation(
                paymentDto.getPaidDate(),
                paymentDto.getAmount(),
                new Room(
                        paymentDto.getRoomDto().getRoomNo(),
                        paymentDto.getRoomDto().getAvailability(),
                        new Price(
                                paymentDto.getRoomDto().getPriceDto().getTypeId(),
                                paymentDto.getRoomDto().getPriceDto().getRoomType(),
                                paymentDto.getRoomDto().getPriceDto().getPrice()
                        )
                )
        ));
    }

    @Override
    public void updateReservation(ReservationDto paymentDto) throws Exception {
        reservationDao.update(new Reservation(
                paymentDto.getPaidDate(),
                paymentDto.getAmount(),
                new Room(
                        paymentDto.getRoomDto().getRoomNo(),
                        paymentDto.getRoomDto().getAvailability(),
                        new Price(
                                paymentDto.getRoomDto().getPriceDto().getTypeId(),
                                paymentDto.getRoomDto().getPriceDto().getRoomType(),
                                paymentDto.getRoomDto().getPriceDto().getPrice()
                        )
                )
        ));
    }

    @Override
    public void deleteReservation(String stId) throws Exception {

    }

    @Override
    public List<ReservationDto> getAllReservations() throws Exception {
        return null;
    }

    @Override
    public ReservationDto getStudentReservation(String id) throws Exception {
        return null;
    }

    @Override
    public void searchReservation(String stId) throws Exception {

    }
}
