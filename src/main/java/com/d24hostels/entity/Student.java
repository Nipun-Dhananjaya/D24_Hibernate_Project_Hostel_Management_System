package com.d24hostels.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

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
    @OneToOne
    private Room room;
    @OneToMany(mappedBy = "student")
    private List<Payment> payments;
    @OneToOne
    private University university;
}
