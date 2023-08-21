package com.d24hostels.dto;


import com.d24hostels.entity.Reservation;
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
public class StudentDto{
    private String sid;
    private String name;
    private String address;
    private String contact;
    private Date dob;
    private String gender;
    private Reservation reservation;
}
