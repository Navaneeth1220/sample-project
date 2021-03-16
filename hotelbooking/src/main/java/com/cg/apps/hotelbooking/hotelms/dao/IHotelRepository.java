package com.cg.apps.hotelbooking.hotelms.dao;

import com.cg.apps.hotelbooking.hotelms.entities.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IHotelRepository extends JpaRepository<Hotel, Long> {

}
