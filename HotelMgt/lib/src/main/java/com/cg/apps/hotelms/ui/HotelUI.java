package com.cg.apps.hotelms.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.apps.roomms.entity.Room;
import com.cg.apps.roomms.service.IRoomService;
import com.cg.apps.hotelms.entities.Hotel;
import com.cg.apps.hotelms.exceptions.HotelNotFoundException;
import com.cg.apps.hotelms.exceptions.InvalidHotelIdException;
import com.cg.apps.hotelms.exceptions.InvalidHotelNameException;
import com.cg.apps.hotelms.service.IHotelService;

@Component
public class HotelUI {

	@Autowired
	private IHotelService hotelService;
	
	@Autowired
	private IRoomService roomService;

	public void start() {

		try {
			
			Hotel trident = hotelService.addHotel("Trident", "Nanganallur",null);
			Hotel itc = hotelService.addHotel("Itc", "Chennai",null);
			displayHotel(trident);
			displayHotel(itc);
			
			Room room = roomService.addRoom(trident.getHotelId(),1, 1);
			

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
