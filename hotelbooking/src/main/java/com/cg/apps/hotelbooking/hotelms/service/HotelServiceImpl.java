package com.cg.apps.hotelbooking.hotelms.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.apps.hotelbooking.hotelms.dao.*;

import com.cg.apps.hotelbooking.hotelms.entities.Hotel;
import com.cg.apps.hotelbooking.hotelms.exceptions.*;

@Service
public class HotelServiceImpl implements IHotelService {

	@Autowired
	private IHotelRepository hotelRepository;

	@Override
	public Hotel findById(Long hotelId) {

		Optional<Hotel> optional = hotelRepository.findById(hotelId);
		if (!optional.isPresent()) {

			throw new HotelNotFoundException("hotel not found for hotelId=" + hotelId);
		}
		return optional.get();
	}

	@Override
	public Hotel addHotel(String hotelName, String address) {

		Hotel hotel = new Hotel();
		hotel.setHotelName(hotelName);
		hotel.setAddress(address);
		hotelRepository.save(hotel);
		return hotel;
	}

	public void validateId(Long id) {

		if (id < 0) {

			throw new InvalidHotelIdException("id should not be negative");
		}
	}

	void validateName(String name) {

		if (name == null || name.isEmpty() || name.trim().isEmpty()) {

			throw new InvalidHotelNameException("name can't be null or empty");
		}
	}

}
