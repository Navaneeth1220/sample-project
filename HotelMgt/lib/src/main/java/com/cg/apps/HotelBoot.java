package com.cg.apps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.cg.apps.ui.RoomUI;


@SpringBootApplication
public class HotelBoot {
	
	public static void main(String args[]) {
	
	ConfigurableApplicationContext context = SpringApplication.run(HotelBoot.class, args);
	RoomUI room = context.getBean(RoomUI.class);
	room.start();
	}
}
