package com.cg.apps.hotelbooking;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.cg.apps.hotelbooking.hotelms.ui.*;

@SpringBootApplication
public class HotelbookingApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(HotelbookingApplication.class, args);
		HotelUI hotelUI = context.getBean(HotelUI.class);
		hotelUI.start();
	}

}
