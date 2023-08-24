package com.d24hostels.dao.custom;

import com.d24hostels.dao.CrudDAO;
import com.d24hostels.entity.Room;

import java.util.List;

public interface RoomDao extends CrudDAO<Room,String> {
    public List<Room> getAvailableRooms() throws Exception ;
    public List<Room> getFilledRooms() throws Exception ;
}
