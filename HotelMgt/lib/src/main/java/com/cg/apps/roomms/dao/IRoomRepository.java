package com.cg.apps.roomms.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cg.apps.roomms.entity.Room;

public interface IRoomRepository extends JpaRepository<Room, Long> {
	
	@Query("from Room where floorNumber=:floorArg and roomNumber=:roomArg")
	Room findRoom(@Param("floorArg") int floorNum,@Param("roomArg") int roomNum);
}
