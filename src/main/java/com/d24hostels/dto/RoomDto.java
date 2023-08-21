package com.d24hostels.dto;


import com.d24hostels.entity.Reservation;
import jakarta.persistence.ManyToOne;
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
    private String room_type_Id;
    private String type;
    private double key_money;
    private int qty;
    private Reservation reservation;
}
