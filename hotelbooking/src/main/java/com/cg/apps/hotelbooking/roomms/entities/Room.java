package com.cg.apps.hotelbooking.roomms.entities;

import java.util.Objects;
import com.cg.apps.hotelbooking.hotelms.entities.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Room {

	@GeneratedValue
	@Id
	private Long roomId;
	private Integer floorNumber;
	private Integer roomNumber;

	@ManyToOne
	private Hotel hotel;

	private Boolean available;
	private double cost;

	public Room() {

	}

	public Long getRoomId() {

		return roomId;
	}

	public void setRoomId(Long roomId) {

		this.roomId = roomId;
	}

	public Integer getFloorNumber() {

		return floorNumber;
	}

	public void setFloorNumber(Integer floorNumber) {

		this.floorNumber = floorNumber;
	}

	public Integer getRoomNumber() {

		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {

		this.roomNumber = roomNumber;
	}

	public Hotel getHotel() {

		return hotel;
	}

	public void setHotel(Hotel hotel) {

		this.hotel = hotel;
	}

	public Boolean getAvailable() {

		return available;
	}

	public void setAvailable(Boolean available) {

		this.available = available;
	}

	public double getCost() {

		return cost;
	}

	public void setCost(double cost) {

		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Room [roomId=" + roomId + ", floorNumber=" + floorNumber + ", roomNumber=" + roomNumber + ", available="
				+ available + ", cost=" + cost + "]";
	}

	@Override
	public boolean equals(Object obj) {

		if (this == obj) {

			return true;
		}

		if (obj == null) {

			return false;
		}

		if (getClass() != obj.getClass()) {

			return false;
		}

		Room other = (Room) obj;
		if (roomId == null) {

			if (other.roomId != null) {

				return false;
			}

		} else if (!roomId.equals(other.roomId)) {

			return false;
		}

		return true;
	}

	@Override
	public int hashCode() {

		return Objects.hash(roomId);
	}

}
