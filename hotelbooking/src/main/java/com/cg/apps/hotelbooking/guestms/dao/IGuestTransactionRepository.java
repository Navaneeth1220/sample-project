package com.cg.apps.hotelbooking.guestms.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cg.apps.hotelbooking.guestms.entities.*;

public interface IGuestTransactionRepository extends JpaRepository<GuestTransaction,Long> {

}
