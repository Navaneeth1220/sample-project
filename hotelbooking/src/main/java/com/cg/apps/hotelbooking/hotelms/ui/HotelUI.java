package com.cg.apps.hotelbooking.hotelms.ui;

import org.springframework.beans.factory.annotation.Autowired;

import com.cg.apps.hotelbooking.roomms.entities.*;
import com.cg.apps.hotelbooking.roomms.exceptions.*;
import org.springframework.stereotype.Component;
import com.cg.apps.hotelbooking.roomms.service.*;
import java.util.*;
import com.cg.apps.hotelbooking.hotelms.service.*;
import com.cg.apps.hotelbooking.hotelms.entities.*;
import com.cg.apps.hotelbooking.hotelms.exceptions.*;

@Component
public class HotelUI {


	
	@Autowired
	private IHotelService hotelService;
	
	@Autowired
	private IRoomService roomService;
	
	public void start() {

		try {

			Hotel trident = hotelService.addHotel("Trident", "Nanganallur", null);
			Hotel itc = hotelService.addHotel("Itc", "Chennai", null);
			displayHotel(trident);
			displayHotel(itc);

			Room room1 = roomService.addRoom(trident.getHotelId(), 1, 4);
			Room room2 = roomService.addRoom(itc.getHotelId(), 5, 13);
			displayRoom(room1);
			displayRoom(room2);

			Hotel tridentId = hotelService.findById(2L);
			displayHotel(tridentId);

			Room room1Id = roomService.findById(4L);
			displayRoom(room1Id);

			Room findRoom1 = roomService.findRoom(trident.getHotelId(), 1, 4);
			displayRoom(findRoom1);

			List<Room> allRooms = roomService.findAllRoomsInHotel(2L);
			System.out.println(allRooms);

			List<Room> availableRooms = roomService.availableRoomsInHotel(2L);
			System.out.println(availableRooms);
			
			

		} catch (HotelNotFoundException e) {

			System.out.println("hotel not found");
			e.printStackTrace();

		} catch (InvalidHotelIdException e) {

			System.out.println(e.getMessage());
			e.printStackTrace();

		} catch (InvalidHotelNameException e) {

			System.out.println(e.getMessage());
			e.printStackTrace();

		} catch (RoomNotFoundException e) {

			System.out.println("room not found");
			e.printStackTrace();

		} catch (InvalidRoomIdException e) {

			System.out.println(e.getMessage());
			e.printStackTrace();

		} catch (InvalidRoomNumberException e) {

			System.out.println(e.getMessage());
			e.printStackTrace();

		} catch (InvalidFloorNumberException e) {

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

	public void displayRoom(Room room) {

		System.out.println("room id: " + room.getRoomId() + " room number: " + room.getRoomNumber() + " floor number: "
				+ room.getFloorNumber() + " available: " + room.getAvailable() + " cost: " + room.getCost());

	}

}
