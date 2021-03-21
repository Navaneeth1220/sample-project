package com.cg.apps.hotelbooking.roomms.dto;

public class RoomAddRequest {
	
	private Long hotelId;
	private int floorNum; 
	private int roomNum;
	private double cost;
	
	public RoomAddRequest() {
		
	}

	public Long getHotelId() {
		
		return hotelId;
	}

	public void setHotelId(Long hotelId) {
		
		this.hotelId = hotelId;
	}

	public int getFloorNum() {
		
		return floorNum;
	}

	public void setFloorNum(int floorNum) {
		
		this.floorNum = floorNum;
	}

	public int getRoomNum() {
		
		return roomNum;
	}

	public void setRoomNum(int roomNum) {
		
		this.roomNum = roomNum;
	}

	public double getCost() {
		
		return cost;
	}

	public void setCost(double cost) {
		
		this.cost = cost;
	}
	
	
	

}
