package com.d24hostels.dao.custom;

import com.d24hostels.dao.CrudDAO;
import com.d24hostels.entity.Price;

import java.util.List;

public interface PriceDao extends CrudDAO<Price,String> {
    List<Price> getAllPrices();
}
