package com.d24hostels.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PriceDto {
    private String TypeId;
    private String roomType;
    private double price;
    private List<RoomDto> roomDtos;

    public PriceDto(String typeId, String roomType, double price) {
        TypeId = typeId;
        this.roomType = roomType;
        this.price = price;
    }
}
