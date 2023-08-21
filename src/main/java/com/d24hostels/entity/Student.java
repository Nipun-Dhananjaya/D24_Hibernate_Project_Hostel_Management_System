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
    private String address;
    private String contact;
    private Date dob;
    private String gender;
    @ManyToOne
    private Reservation reservation;
}
