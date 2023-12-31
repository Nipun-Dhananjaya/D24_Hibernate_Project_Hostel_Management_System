package com.d24hostels.bo.custom.Impl;

import com.d24hostels.bo.custom.RoomBo;
import com.d24hostels.dao.DAOFactory;
import com.d24hostels.dao.custom.RoomDao;
import com.d24hostels.dto.PriceDto;
import com.d24hostels.dto.RoomDto;
import com.d24hostels.entity.Price;
import com.d24hostels.entity.Room;

import java.util.ArrayList;
import java.util.List;

public class RoomBoImpl implements RoomBo {
    RoomDao roomDao= (RoomDao) DAOFactory.getDaoFactory().getDAO(DAOFactory.DAOTypes.ROOMS);
    @Override
    public void saveRoom(RoomDto roomDto) throws Exception {
        System.out.println("bo: "+roomDto.getAvailability());
        roomDao.save(new Room(roomDto.getRoomNo(),new Price(roomDto.getPriceDto().getTypeId(),roomDto.getPriceDto().getRoomType(),roomDto.getPriceDto().getPrice()), roomDto.getAvailability()));
    }

    @Override
    public void updateRoom(RoomDto roomDto) throws Exception {
        if (roomDto.getAvailability()==null){
            roomDao.update(new Room(roomDto.getRoomNo(),new Price(roomDto.getPriceDto().getTypeId(),roomDto.getPriceDto().getRoomType(),roomDto.getPriceDto().getPrice())));
        }else {
            roomDao.update(new Room(roomDto.getRoomNo(), new Price(roomDto.getPriceDto().getTypeId(), roomDto.getPriceDto().getRoomType(), roomDto.getPriceDto().getPrice()), roomDto.getAvailability()));
        }
    }

    @Override
    public void deleteRoom(String roomNo) throws Exception {
        roomDao.delete(roomNo);
    }

    @Override
    public List<RoomDto> getAllRooms() throws Exception {
        List<Room> all = roomDao.getAll();
        List<RoomDto> dtoArrayList = new ArrayList<>();
        for (Room room : all) {
            dtoArrayList.add(
                    new RoomDto(
                            room.getRoomNo(),
                            new PriceDto(
                                    room.getPrice().getTypeId(),
                                    room.getPrice().getRoomType(),
                                    room.getPrice().getKeyMoney()
                            ),
                            room.getAvailability()
                    )
            );
        }
        return dtoArrayList;
    }

    @Override
    public List<RoomDto> getAvailableRooms() throws Exception {
        List<Room> all = roomDao.getAvailableRooms();
        List<RoomDto> dtoArrayList = new ArrayList<>();
        for (Room room : all) {
            dtoArrayList.add(
                    new RoomDto(
                            room.getRoomNo(),
                            new PriceDto(
                                    room.getPrice().getTypeId(),
                                    room.getPrice().getRoomType(),
                                    room.getPrice().getKeyMoney()
                            ),
                            room.getAvailability()
                    )
            );
        }
        return dtoArrayList;
    }

    @Override
    public List<RoomDto> getFilledRooms() throws Exception {
        List<Room> all = roomDao.getFilledRooms();
        List<RoomDto> dtoArrayList = new ArrayList<>();
        for (Room room : all) {
            dtoArrayList.add(
                    new RoomDto(
                            room.getRoomNo(),
                            new PriceDto(
                                    room.getPrice().getTypeId(),
                                    room.getPrice().getRoomType(),
                                    room.getPrice().getKeyMoney()
                            ),
                            room.getAvailability()
                    )
            );
        }
        return dtoArrayList;
    }

    @Override
    public RoomDto searchRoom(String roomNo) throws Exception {
        Room search = roomDao.search(roomNo);
        return new RoomDto(search.getRoomNo(), new PriceDto(search.getPrice().getTypeId(),search.getPrice().getRoomType(),search.getPrice().getKeyMoney()));
    }

    @Override
    public int getCount(String status) throws Exception {
        if (status.equals("Available")) {
            List<Room> availableRooms = roomDao.getAvailableRooms();
            return availableRooms.size();
        }else{
            List<Room> filledRooms = roomDao.getFilledRooms();
            return filledRooms.size();
        }
    }
}
