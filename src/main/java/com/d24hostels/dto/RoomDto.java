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
    private String availability;
    private List<StudentDto> studentDtos;
    private List<PaymentDto> paymentDtos;
    private PriceDto priceDto;

    public RoomDto(String roomNo,PriceDto priceDto,String availability) {
        this.roomNo = roomNo;
        this.priceDto= priceDto;
        this.availability= availability;
    }
    public RoomDto(String roomNo,PriceDto priceDto) {
        this.roomNo = roomNo;
        this.priceDto= priceDto;
    }

    public RoomDto(String roomNo, String availability) {
        this.roomNo = roomNo;
        this.availability = availability;
    }

    public RoomDto(String roomNo) {
        this.roomNo = roomNo;
    }
}
