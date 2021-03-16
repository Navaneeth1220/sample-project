package com.cg.apps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.cg.apps.hotelms.ui.HotelUI;


@SpringBootApplication
public class HotelBoot {
	
	public static void main(String args[]) {
	
	ConfigurableApplicationContext context = SpringApplication.run(HotelBoot.class, args);
	HotelUI room = context.getBean(HotelUI.class);
	room.start();
	}
}
