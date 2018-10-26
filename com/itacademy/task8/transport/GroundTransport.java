package com.itacademy.task8.transport;

public abstract class GroundTransport extends Transport {

	private String engineType;
	private boolean isPublicTransport = true;

	public GroundTransport() {

	}

	public GroundTransport(float speed, float ticketPrice, String name, String engineType, boolean isPublicTransport) {
		super(speed, ticketPrice, name);
		this.engineType = engineType;
		this.isPublicTransport = isPublicTransport;
	}

	public String getEngineType() {
		return engineType;
	}

	public boolean isPublicTransport() {
		return isPublicTransport;
	}
	
	public abstract void move();
	
	public static void demoStaticMetod() {
		System.out.println("Static metod");
	}

}
