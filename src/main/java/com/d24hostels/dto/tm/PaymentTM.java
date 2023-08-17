package com.d24hostels.dto.tm;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class PaymentTM {
    private String payId;
    private String stId;
    private String stName;
    private String payDateTime;
    private String payAmount;
    private String roomNo;
    private String roomType;
    private String keyMoneyCompleted;
}
