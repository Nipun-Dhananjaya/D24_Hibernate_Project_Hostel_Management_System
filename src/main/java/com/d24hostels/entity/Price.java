package com.d24hostels.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Price {
    @Id
    private String TypeId;
    private String roomType;
    private double keyMoney;
    @OneToMany(mappedBy = "price")
    private List<Room> rooms;

    public Price(String typeId, String roomType, double keyMoney) {
        TypeId = typeId;
        this.roomType = roomType;
        this.keyMoney = keyMoney;
    }
}
