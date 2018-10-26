package com.itacademy.task8.util;

import com.itacademy.task8.transport.Transport;

public class PrintInfoUtil {
	
	public static void printInfo(Transport[] transport) {
		for (int i = 0; i < transport.length; i++) {
			System.out.println(transport[i].getName() + transport[i].getSpeed() + transport[i].getTicketPrice());
		}
	}

}
