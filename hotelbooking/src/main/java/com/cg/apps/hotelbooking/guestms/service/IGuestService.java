package com.cg.apps.hotelbooking.guestms.service;

import com.cg.apps.hotelbooking.guestms.entities.*;
import java.util.*;

public interface IGuestService {

	Guest findById(Long guestId);

	Guest allotRoom(String aadharId, String guestName, Long hotelId, int roomNumber, int floorNumber, double rent);

	List<GuestTransaction> transactionsHistory(Long guestId);

	Guest checkout(Long guestId, Long hotelId, int roomNumber, int floorNumber);

}
