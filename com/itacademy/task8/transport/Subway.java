package com.itacademy.task8.transport;

public class Subway extends Transport {
	
	private String lineOfMetro;

	public Subway() {
		
	}

	public Subway(float speed, float ticketPrice, String name, String lineOfMetro) {
		super(speed, ticketPrice, name);
		this.lineOfMetro = lineOfMetro;
		
			}

	public String getLineOfMetro() {
		return lineOfMetro;
	}
	
	public void move() {
		System.out.println("Move as a Metro");
	}

}
