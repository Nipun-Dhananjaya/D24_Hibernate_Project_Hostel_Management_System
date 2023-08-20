package com.d24hostels.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
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
public class Room {
    @Id
    private String roomNo;
    private double bedCount;
    @OneToMany(mappedBy = "room")
    private List<Student> students;
    @OneToMany(mappedBy = "room")
    private List<Payment> payments;
    @ManyToOne
    private Price price;

    public Room(String roomNo, double bedCount) {
        this.roomNo = roomNo;
        this.bedCount = bedCount;
    }
}
