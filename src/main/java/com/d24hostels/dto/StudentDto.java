package com.d24hostels.dto;


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
    private String nic;
    private String gender;
    private String guardian;
    private String campus;
    private Date regDate;
    private boolean keyMoney;
}
