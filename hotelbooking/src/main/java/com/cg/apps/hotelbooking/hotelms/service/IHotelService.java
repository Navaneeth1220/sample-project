package com.cg.apps.hotelbooking.hotelms.service;

import com.cg.apps.hotelbooking.hotelms.entities.*;

public interface IHotelService {

	Hotel findById(Long hotelId);

	Hotel addHotel(String hotelName, String address);

	// SetfindAllGuestsLivingInHotel(Long hotelId);

	// ListfindAllGuestsCheckedOutTodayInHotel(Long hotelId);

}
