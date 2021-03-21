package com.cg.apps.hotelbooking;

import org.springframework.boot.SpringApplication;
import org.slf4j.*;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.cg.apps.hotelbooking.hotelms.ui.*;

@SpringBootApplication
public class HotelbookingApplication {

	private static final Logger Log = LoggerFactory.getLogger(HotelbookingApplication.class);

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(HotelbookingApplication.class, args);
		HotelUI hotelUI = context.getBean(HotelUI.class);
		hotelUI.start();
		
		Log.debug("i am logged using debug level");
		Log.info("i am logged using info level");
		Log.error("i am logged using error level");
		
	}
	
	

}
