package com.d24hostels.bo.custom;

import com.d24hostels.bo.SuperBo;
import com.d24hostels.dto.RoomDto;
import com.d24hostels.dto.StudentDto;

public interface RoomBo extends SuperBo {
    void saveRoom(RoomDto roomDto) throws Exception;
    void updateRoom(RoomDto roomDto) throws Exception;
    void deleteRoom(String roomNo) throws Exception;
    void getAllRooms() throws Exception;
    void searchRoom(String roomNo) throws Exception;
}
