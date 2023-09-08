package com.d24hostels.bo.custom.Impl;

import com.d24hostels.bo.custom.ReservationBo;
import com.d24hostels.dao.DAOFactory;
import com.d24hostels.dao.custom.ReservationDao;
import com.d24hostels.dto.*;
import com.d24hostels.entity.*;

import java.util.ArrayList;
import java.util.List;

public class ReservationBoImpl implements ReservationBo {
    ReservationDao reservationDao= (ReservationDao) DAOFactory.getDaoFactory().getDAO(DAOFactory.DAOTypes.RESERVATION);
    @Override
    public void saveReservation(ReservationDto paymentDto) throws Exception {
        System.out.println("bor: "+paymentDto.getRoomDto().getAvailability());
        reservationDao.save(new Reservation(
                paymentDto.getPaidDate(),
                paymentDto.getAmount(),
                paymentDto.isStatus(),
                new Room(
                        paymentDto.getRoomDto().getRoomNo(),
                        paymentDto.getRoomDto().getAvailability(),
                        new Price(
                                paymentDto.getRoomDto().getPriceDto().getTypeId(),
                                paymentDto.getRoomDto().getPriceDto().getRoomType(),
                                paymentDto.getRoomDto().getPriceDto().getPrice()
                        )
                ),
                new Student(
                        paymentDto.getStudentDto().getSid(),
                        paymentDto.getStudentDto().getName(),
                        paymentDto.getStudentDto().getNic(),
                        paymentDto.getStudentDto().getGender(),
                        paymentDto.getStudentDto().getGuardian(),
                        paymentDto.getStudentDto().getContact(),
                        paymentDto.getStudentDto().getEmail(),
                        paymentDto.getStudentDto().getRegDate(),
                        new University(paymentDto.getStudentDto().getUniversityDto().getUniName())
                )
        ));
    }

    @Override
    public void updateReservation(ReservationDto paymentDto) throws Exception {
        reservationDao.update(new Reservation(
                paymentDto.getPayId(),
                paymentDto.getPaidDate(),
                paymentDto.getAmount(),
                paymentDto.isStatus(),
                new Room(
                        paymentDto.getRoomDto().getRoomNo(),
                        paymentDto.getRoomDto().getAvailability(),
                        new Price(
                                paymentDto.getRoomDto().getPriceDto().getTypeId(),
                                paymentDto.getRoomDto().getPriceDto().getRoomType(),
                                paymentDto.getRoomDto().getPriceDto().getPrice()
                        )
                ),
                new Student(
                        paymentDto.getStudentDto().getSid(),
                        paymentDto.getStudentDto().getName(),
                        paymentDto.getStudentDto().getNic(),
                        paymentDto.getStudentDto().getGender(),
                        paymentDto.getStudentDto().getGuardian(),
                        paymentDto.getStudentDto().getContact(),
                        paymentDto.getStudentDto().getEmail(),
                        paymentDto.getStudentDto().getRegDate(),
                        new University(paymentDto.getStudentDto().getUniversityDto().getUniName())
                )
        ));
    }

    @Override
    public void deleteReservation(String id) throws Exception {
        reservationDao.delete(id);
    }

    @Override
    public List<ReservationDto> getAllReservations() throws Exception {
        List<ReservationDto> reservationDtos = new ArrayList<>();
        List<Reservation> all = reservationDao.getAll();
        for (Reservation reservation : all) {
            System.out.println("Room: "+reservation.getRoom());
            reservationDtos.add(new ReservationDto(
                    reservation.getPayId(),
                    reservation.getPaidDate(),
                    reservation.getAmount(),
                    reservation.isStatus(),
                    new RoomDto(
                            reservation.getRoom().getRoomNo(),
                            reservation.getRoom().getAvailability(),
                            new PriceDto(
                                    reservation.getRoom().getPrice().getTypeId(),
                                    reservation.getRoom().getPrice().getRoomType(),
                                    reservation.getRoom().getPrice().getKeyMoney()
                            )
                    ),
                    new StudentDto(
                            reservation.getStudent().getSid(),
                            reservation.getStudent().getName()
                    )
            ));
        }
        return reservationDtos;
    }

    @Override
    public ReservationDto getStudentReservation(String id) throws Exception {
        return null;
    }

    @Override
    public void searchReservation(String stId) throws Exception {

    }
}
