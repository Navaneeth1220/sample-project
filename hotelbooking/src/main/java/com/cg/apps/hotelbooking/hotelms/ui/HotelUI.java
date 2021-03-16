package com.cg.apps.hotelbooking.hotelms.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.cg.apps.hotelbooking.hotelms.service.*;
import com.cg.apps.hotelbooking.hotelms.entities.*;
import com.cg.apps.hotelbooking.hotelms.exceptions.*;

@Component
public class HotelUI {

	@Autowired
	private IHotelService hotelService;

	public void start() {

		try {

			Hotel trident = hotelService.addHotel("Trident", "Nanganallur");
			Hotel itc = hotelService.addHotel("Itc", "Chennai");
			displayHotel(trident);
			displayHotel(itc);

			Long tridentId = trident.getHotelId();
			trident = hotelService.findById(tridentId);
			displayHotel(trident);

		} catch (HotelNotFoundException e) {

			System.out.println("hotel not found");
			e.printStackTrace();

		} catch (InvalidHotelIdException e) {

			System.out.println(e.getMessage());
			e.printStackTrace();

		} catch (InvalidHotelNameException e) {

			System.out.println(e.getMessage());
			e.printStackTrace();

		} catch (Exception e) {

			System.out.println("Something went wrong!");
			e.printStackTrace();

		}

	}

	public void displayHotel(Hotel hotel) {

		System.out.println("hotel id: " + hotel.getHotelId() + " hotel name: " + hotel.getHotelName() + " address: "
				+ hotel.getAddress());

	}

}
