package com.cg.apps.hotelbooking.roomms.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.*;

import com.cg.apps.hotelbooking.roomms.entities.*;

public interface IRoomRepository extends JpaRepository<Room, Long> {

	@Query("from Room where floorNumber=:floorNumArgs and roomNumber=:roomNumArgs")
	List<Room> findByFloorNumAndRoomNum(@Param("floorNumArgs") int floorNum, @Param("roomNumArgs") int roomNum);

}
