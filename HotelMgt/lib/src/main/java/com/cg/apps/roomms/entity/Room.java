package com.cg.apps.roomms.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.cg.apps.hotelms.entities.Hotel;

@Entity
public class Room {
	@GeneratedValue
	@Id
	private Long roomId;
	private int floorNumber;
	private int roomNumber;
	private boolean available;
	private Double cost;

	@ManyToOne
	private Hotel hotel;

	public Room() {
	}

	public Room(int floorNumber, int roomNumber,Hotel hotel) {
		this.setHotel(hotel);
		this.setFloorNumber(floorNumber);
		this.setRoomNumber(roomNumber);
	}

	public Long getRoomId() {
		return roomId;
	}

	public void setRoomId(Long roomId) {
		this.roomId = roomId;
	}

	public int getFloorNumber() {
		return floorNumber;
	}

	public void setFloorNumber(int floorNumber) {
		this.floorNumber = floorNumber;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}	

}
