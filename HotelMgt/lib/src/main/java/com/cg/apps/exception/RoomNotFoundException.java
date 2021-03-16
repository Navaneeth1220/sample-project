package com.cg.apps.exception;

public class RoomNotFoundException extends RuntimeException {
	public RoomNotFoundException(String msg) {
		super(msg);
	}
}
