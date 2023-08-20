package com.d24hostels.dto;


import com.d24hostels.entity.Payment;
import com.d24hostels.entity.Price;
import com.d24hostels.entity.Student;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RoomDto {
    private String roomNo;
    private double bedCount;
    private List<StudentDto> studentDtos;
    private List<PaymentDto> paymentDtos;
    private PriceDto priceDto;

    public RoomDto(String roomNo, double bedCount) {
        this.roomNo = roomNo;
        this.bedCount = bedCount;
    }
}
