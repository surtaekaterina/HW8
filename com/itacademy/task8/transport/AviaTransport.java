package com.itacademy.task8.transport;

public class AviaTransport extends Transport {

	private int flightNumber;
	private String aviaCompany;
	private String flightCategory;
	

	public AviaTransport() {
		super();
	}

	public AviaTransport(float speed, float ticketPrice, String name) {
		super(speed, ticketPrice, name);
	}
	public AviaTransport(float speed, float ticketPrice, String name, String aviaCompany, String flightCategory, int flightNumber) {
		super(speed, ticketPrice, name);
		this.aviaCompany = aviaCompany;
		this.flightCategory = flightCategory;
		this.flightNumber = flightNumber;
	}

	public int getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getAviaCompany() {
		return aviaCompany;
	}

	public void setAviaCompany(String aviaCompany) {
		this.aviaCompany = aviaCompany;
	}

	public String getFlightCategory() {
		return flightCategory;
	}

	public void setFlightCategory(String flightCategory) {
		this.flightCategory = flightCategory;
	}
	public void move() {
		System.out.println("Move as a bird");
	}

}
