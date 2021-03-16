package com.cg.apps.roomms.service;

import java.util.List;

import com.cg.apps.roomms.entity.Room;

public interface IRoomService {
	Room addRoom(Long hotelId,int floorNum,int roomNum);
	Room findById(Long roomId);	
	Room findRoom(Long hotelId,int floorNum,int RoomNum);
	List<Room>findAllRoomsInHotel(Long hotelId);
	List<Room>availableRoomInHotel(Long hotelId);	
}
