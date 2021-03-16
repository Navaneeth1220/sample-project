package com.cg.apps.hotelms.dao;

import com.cg.apps.hotelms.entities.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IHotelRepository extends JpaRepository<Hotel, Long> {

}
