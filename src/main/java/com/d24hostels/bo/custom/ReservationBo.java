package com.d24hostels.bo.custom;

import com.d24hostels.bo.SuperBo;
import com.d24hostels.dto.ReservationDto;

import java.util.List;

public interface ReservationBo extends SuperBo {
    void saveReservation(ReservationDto paymentDto) throws Exception;
    void updateReservation(ReservationDto paymentDto) throws Exception;
    void deleteReservation(String stId) throws Exception;
    List<ReservationDto> getAllReservations() throws Exception;
    ReservationDto getStudentReservation(String id) throws Exception;
    void searchReservation(String stId) throws Exception;
}
