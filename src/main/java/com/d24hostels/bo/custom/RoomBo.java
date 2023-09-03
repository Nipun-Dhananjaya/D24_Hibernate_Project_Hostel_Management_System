package com.d24hostels.bo.custom;

import com.d24hostels.bo.SuperBo;
import com.d24hostels.dto.PriceDto;
import com.d24hostels.dto.RoomDto;
import com.d24hostels.dto.StudentDto;

import java.util.List;

public interface RoomBo extends SuperBo {
    void saveRoom(RoomDto roomDto) throws Exception;
    void updateRoom(RoomDto roomDto) throws Exception;
    void deleteRoom(String roomNo) throws Exception;
    List<RoomDto> getAllRooms() throws Exception;
    List<RoomDto> getAvailableRooms() throws Exception;
    List<RoomDto> getFilledRooms() throws Exception;
    RoomDto searchRoom(String roomNo) throws Exception;

    int getCount(String status) throws Exception;
}
