package com.cg.apps.hotelms.service;

import java.util.List;

import com.cg.apps.hotelms.entities.Hotel;
import com.cg.apps.roomms.entity.Room;

public interface IHotelService {

	Hotel findById(Long hotelId);

	Hotel addHotel(String hotelName, String address,List<Room> room);

	//SetfindAllGuestsLivingInHotel(Long hotelId);

	//ListfindAllGuestsCheckedOutTodayInHotel(Long hotelId);

}
