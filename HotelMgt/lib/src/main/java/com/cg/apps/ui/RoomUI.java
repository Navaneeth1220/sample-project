package com.cg.apps.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.apps.service.IRoomService;

@Component
public class RoomUI {
	
	@Autowired
	IRoomService service;
	
	public void start() {
		
		service.addRoom(1, 2);
		
	}
	
	

}
