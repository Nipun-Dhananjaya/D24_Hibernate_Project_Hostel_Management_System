package com.d24hostels.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Student {
    @Id
    private String sid;
    private String name;
    private String nic;
    private String gender;
    private String guardian;
    private String campus;
    private Date regDate;
    private boolean keyMoney;
    @ManyToOne
    private Room room;
    @ManyToOne
    private Payment payment;
    @ManyToOne
    private University university;
}
