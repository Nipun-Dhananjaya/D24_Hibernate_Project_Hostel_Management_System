package com.d24hostels.bo.custom;

import com.d24hostels.bo.SuperBo;
import com.d24hostels.dto.PriceDto;

public interface PriceBo extends SuperBo {
    void savePrice(PriceDto priceDto) throws Exception;
    void updatePrice(PriceDto priceDto) throws Exception;
    void getAllPrices() throws Exception;
    void searchPrice() throws Exception;
}
