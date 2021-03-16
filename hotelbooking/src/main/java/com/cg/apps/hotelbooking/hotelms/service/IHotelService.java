package com.cg.apps.hotelbooking.hotelms.service;

import com.cg.apps.hotelbooking.hotelms.entities.*;
import java.util.*;

public interface IHotelService {

	Hotel findById(Long hotelId);

	Hotel addHotel(String hotelName, String address, List rooms);

	// SetfindAllGuestsLivingInHotel(Long hotelId);

	// ListfindAllGuestsCheckedOutTodayInHotel(Long hotelId);

}
