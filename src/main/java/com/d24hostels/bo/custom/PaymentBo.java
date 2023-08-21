package com.d24hostels.bo.custom;

import com.d24hostels.bo.SuperBo;
import com.d24hostels.dto.ReservationDto;

public interface PaymentBo extends SuperBo {
    void savePayment(ReservationDto reservationDto) throws Exception;
    void updatePayment(ReservationDto reservationDto) throws Exception;
    void deletePayment(String stId) throws Exception;
    void getAllPayments() throws Exception;
    void searchPayment(String stId) throws Exception;
}
