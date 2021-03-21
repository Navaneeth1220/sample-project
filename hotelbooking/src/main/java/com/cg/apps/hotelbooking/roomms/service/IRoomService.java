package com.cg.apps.hotelbooking.roomms.service;

import com.cg.apps.hotelbooking.roomms.entities.*;
import java.util.*;

public interface IRoomService {

	Room addRoom(Long hotelId, int floorNum, int roomNum, double cost);

	Room findById(Long roomId);

	Room findRoom(Long hotelId, int floorNum, int roomNum);

	List<Room> findAllRoomsInHotel(Long hotelId);

	List<Room> availableRoomsInHotel(Long hotelId);

}
