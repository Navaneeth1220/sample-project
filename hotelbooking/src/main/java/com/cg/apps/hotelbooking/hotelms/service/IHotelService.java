package com.cg.apps.hotelbooking.hotelms.service;

import com.cg.apps.hotelbooking.hotelms.entities.*;
import com.cg.apps.hotelbooking.roomms.entities.*;
import com.cg.apps.hotelbooking.guestms.entities.*;
import java.util.*;

public interface IHotelService {

	Hotel findById(Long hotelId);

	Hotel addHotel(String hotelName, String address, List<Room>rooms);

	Set<Guest> findAllGuestsLivingInHotel(Long hotelId);

    List<Guest> findAllGuestsCheckedOutTodayInHotel(Long hotelId);

}
