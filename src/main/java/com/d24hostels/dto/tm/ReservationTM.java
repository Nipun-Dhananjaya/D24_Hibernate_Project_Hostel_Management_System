package com.d24hostels.dto.tm;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class ReservationTM {
    private String resId;
    private String stId;
    private String stName;
    private String resDate;
    private String payAmount;
    private String roomTypeId;
    private String roomType;
    private String status;
}
