package com.ditotest.autocompleteService.dto;

import java.sql.Timestamp;

public class RequestDto {
	private String event;
	private Timestamp timestamp;
	public String getEvent() {
		return event;
	}
	public void setEvent(String event) {
		this.event = event;
	}
	public Timestamp getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}
	
	
}
