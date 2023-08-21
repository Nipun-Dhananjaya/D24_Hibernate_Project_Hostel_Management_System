package com.d24hostels.bo.custom;

import com.d24hostels.bo.SuperBo;
import com.d24hostels.dto.PaymentDto;

public interface PaymentBo extends SuperBo {
    void savePayment(PaymentDto paymentDto) throws Exception;
    void updatePayment(PaymentDto paymentDto) throws Exception;
    void deletePayment(String stId) throws Exception;
    void getAllPayments() throws Exception;
    void searchPayment(String stId) throws Exception;
}
