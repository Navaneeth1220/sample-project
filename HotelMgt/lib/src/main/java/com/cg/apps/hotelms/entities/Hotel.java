package com.cg.apps.hotelms.entities;

import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.cg.apps.roomms.entity.Room;

@Entity
public class Hotel {

	@GeneratedValue
	@Id
	private Long hotelId;
	private String hotelName;
	private String address;

	@OneToMany(mappedBy = "hotel")
	private List<Room> rooms;

	public Hotel() {

	}

	public Hotel(String hotelName, String address) {

		this.hotelName = hotelName;
		this.address = address;
	}

	public Long getHotelId() {

		return hotelId;
	}

	public void setHotelId(Long hotelId) {

		this.hotelId = hotelId;
	}

	public String getHotelName() {

		return hotelName;
	}

	public void setHotelName(String hotelName) {

		this.hotelName = hotelName;
	}

	public String getAddress() {

		return address;
	}

	public void setAddress(String address) {

		this.address = address;
	}

	public List<Room> getRooms() {
		return rooms;
	}

	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}

	@Override
	public String toString() {

		return "Hotel [hotelId=" + hotelId + ", hotelName=" + hotelName + ", address=" + address + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hotel other = (Hotel) obj;
		if (hotelId == null) {
			if (other.hotelId != null)
				return false;
		} else if (!hotelId.equals(other.hotelId))
			return false;
		return true;
	}

	@Override
	public int hashCode() {

		return Objects.hash(hotelId);
	}

}
