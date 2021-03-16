package com.cg.apps.roomms.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.apps.hotelms.dao.IHotelRepository;
import com.cg.apps.hotelms.entities.Hotel;
import com.cg.apps.hotelms.exceptions.HotelNotFoundException;
import com.cg.apps.roomms.dao.IRoomRepository;
import com.cg.apps.roomms.entity.Room;
import com.cg.apps.roomms.exception.RoomNotFoundException;

@Service
public class RoomServiceImpl implements IRoomService {

	@Autowired
	private IRoomRepository repo;

	@Autowired
	private IHotelRepository hRepo;

	@Transactional
	@Override
	public Room addRoom(Long hotelId, int floorNum, int roomNum) {
		Hotel hotel = hRepo.findById(hotelId).get();
		Room room = new Room(floorNum, roomNum, hotel);
		room = repo.save(room);
		return room;
	}

	@Override
	public Room findById(Long roomId) {
		Optional<Room> room = repo.findById(roomId);
		if (!room.isPresent()) {
			throw new RoomNotFoundException("Room doesnt exists");
		}
		return room.get();
	}

	@Override
	public Room findRoom(Long hotelId, int floorNum, int RoomNum) {

		Room room = new Room();

		Optional<Hotel> optional = hRepo.findById(hotelId);
		if (!optional.isPresent()) {
			throw new HotelNotFoundException("Room doesnt exists");
		}

		Hotel hotel = optional.get();

		room.setHotel(hotel);
		room.setFloorNumber(floorNum);
		room.setRoomNumber(RoomNum);
		room.setCost(1000.0);
		room.setAvailable(true);

		Room room1 = repo.save(room);

		List<Room> rooms = hotel.getRooms();
		if (rooms == null) {
			rooms = new ArrayList<>();
			hotel.setRooms(rooms);
		}

		rooms.add(room);
		hRepo.save(hotel);
		return room1;
	}

	@Override
	public List<Room> findAllRoomsInHotel(Long hotelId) {
		Optional<Hotel> optional = hRepo.findById(hotelId);
		if (!optional.isPresent()) {
			throw new HotelNotFoundException("Hotel not found");
		}
		Hotel hotel = optional.get();
		List<Room> rooms = hotel.getRooms();
		return rooms;
	}

	@Override
	public List<Room> availableRoomInHotel(Long hotelId) {
		List<Room> availableRooms = new ArrayList<>();
		
		List<Room> rooms = findAllRoomsInHotel(hotelId);
		
		for(Room room:rooms) {
			if(room.isAvailable()) {
				availableRooms.add(room);
			}
		}
		
		return availableRooms;
	}

}
