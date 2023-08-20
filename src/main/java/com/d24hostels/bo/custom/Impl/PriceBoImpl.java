package com.d24hostels.bo.custom.Impl;

import com.d24hostels.bo.custom.PriceBo;
import com.d24hostels.dao.DAOFactory;
import com.d24hostels.dao.custom.PriceDao;
import com.d24hostels.dto.PriceDto;
import com.d24hostels.dto.RoomDto;
import com.d24hostels.entity.Price;
import com.d24hostels.entity.Room;

import java.util.ArrayList;
import java.util.List;

public class PriceBoImpl implements PriceBo {
    PriceDao priceDao= (PriceDao) DAOFactory.getDaoFactory().getDAO(DAOFactory.DAOTypes.PRICE);
    @Override
    public void savePrice(PriceDto priceDto) throws Exception {
        priceDao.save(new Price(priceDto.getTypeId(), priceDto.getRoomType(), priceDto.getPrice(),null));
    }

    @Override
    public void updatePrice(PriceDto priceDto) throws Exception {
        priceDao.update(new Price(priceDto.getTypeId(), priceDto.getRoomType(), priceDto.getPrice(),null));
    }

    @Override
    public List<PriceDto> getAllPrices() throws Exception {
        List<Price> prices=priceDao.getAllPrices();
        List<PriceDto> priceDtos=new ArrayList<>();
        for (Price price:prices) {
            priceDtos.add(new PriceDto(
                    price.getTypeId(),
                    price.getRoomType(),
                    price.getKeyMoney()
                    )
            );
        }
        return priceDtos;
    }

    @Override
    public PriceDto searchPrice(String id) throws Exception {
        Price price=priceDao.search(id);
        System.out.println(price.getTypeId());
        System.out.println(price.getRoomType());
        System.out.println(price.getKeyMoney());
        PriceDto priceDto=new PriceDto(price.getTypeId(), price.getRoomType(), price.getKeyMoney());
        return priceDto;
    }
}
