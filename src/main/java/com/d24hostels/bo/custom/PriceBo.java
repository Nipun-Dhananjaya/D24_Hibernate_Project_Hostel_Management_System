package com.d24hostels.bo.custom;

import com.d24hostels.bo.SuperBo;
import com.d24hostels.dto.PriceDto;
import com.d24hostels.entity.Price;

import java.util.List;

public interface PriceBo extends SuperBo {
    void savePrice(PriceDto priceDto) throws Exception;
    void updatePrice(PriceDto priceDto) throws Exception;
    List<PriceDto> getAllPrices() throws Exception;
    PriceDto searchPrice(String id) throws Exception;
}
