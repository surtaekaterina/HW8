package com.itacademy.task8.transport;

public class Bus extends GroundTransport {

	private int routeNumber;

	public Bus() {
	}

	public Bus(float speed, float ticketPrice, String name, String engineType, boolean isPublicTransport, int routeNumber) {
		super(speed, ticketPrice, name, engineType, isPublicTransport);
		this.routeNumber = routeNumber;
	}

	public int getRouteNumber() {
		return routeNumber;
	}

	public void setRouteNumber(int routeNumber) {
		this.routeNumber = routeNumber;
	}
	
	public void move() {
		System.out.println("Move as a bus");
	}

}
