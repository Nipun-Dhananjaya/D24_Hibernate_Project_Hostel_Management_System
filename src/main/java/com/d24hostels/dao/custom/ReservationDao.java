package com.d24hostels.dao.custom;

import com.d24hostels.dao.CrudDAO;
import com.d24hostels.dto.ReservationDto;
import com.d24hostels.dto.ReservationTmDto;
import com.d24hostels.entity.Reservation;

public interface ReservationDao extends CrudDAO<Reservation,String> {
}
