package com.cg.apps.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.cg.apps.dao.IRoomRepository;
import com.cg.apps.entity.Room;
import com.cg.apps.exception.RoomNotFoundException;

@Service
public class RoomServiceImpl implements IRoomService {

	@Autowired
	private IRoomRepository repo;

	@Override
	public Room addRoom(int floorNum, int roomNum) {
		Room room = new Room(floorNum,roomNum);
		room=repo.save(room);
		return room;
	}

	@Override
	public Room findById(Long roomId) {
		Optional<Room> room = repo.findById(roomId);
		if(!room.isPresent()) {
			throw new RoomNotFoundException("Room doesnt exists");
		}
		return room.get();
	}
	
	
}
