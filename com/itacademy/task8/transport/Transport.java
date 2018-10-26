package com.itacademy.task8.transport;

public abstract class Transport {

	private String name;
	private float speed;
	private float ticketPrice;

	public Transport() {

	}

	public Transport(float speed, float ticketPrice, String name) {
		this.speed = speed;
		this.ticketPrice = ticketPrice;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSpeed() {
		return speed;
	}

	public void setSpeed(float speed) {
		this.speed = speed;
	}

	public float getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(float ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	
	public abstract void move();

}
