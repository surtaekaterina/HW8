package com.itacademy.task8.transport;

public class Taxi extends GroundTransport {
	
	public static int counter;

	private String agencyName;
	private int countPassengers;
	private int taxiNumber;

	{
		++counter;
		this.taxiNumber = counter;
	}
	
	
	public Taxi() {

	}

	public Taxi(float speed, float ticketPrice, String name, String engineType, boolean isPublicTransport,
			String agencyName, int countPassengers) {
		super(speed, ticketPrice, name, engineType, isPublicTransport);
		this.agencyName = agencyName;
		this.countPassengers = countPassengers;
	}

	public String getAgencyName() {
		return agencyName;
	}

	public void setAgencyName(String agencyName) {
		this.agencyName = agencyName;
	}

	public int getCountPassengers() {
		return countPassengers;
	}

	public void setCountPassengers(int countPassengers) {
		this.countPassengers = countPassengers;
	}

	public void move() {
		System.out.println("Move as a taxi");
	}

}
