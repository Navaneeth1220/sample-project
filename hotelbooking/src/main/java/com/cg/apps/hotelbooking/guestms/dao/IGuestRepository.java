package com.cg.apps.hotelbooking.guestms.dao;

import com.cg.apps.hotelbooking.guestms.entities.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IGuestRepository extends JpaRepository<Guest,Long> {

}
