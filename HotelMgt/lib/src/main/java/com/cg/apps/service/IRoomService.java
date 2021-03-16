package com.cg.apps.service;

import com.cg.apps.entity.Room;

public interface IRoomService {
	Room addRoom(int floorNum,int roomNum);
	Room findById(Long roomId);	
}
