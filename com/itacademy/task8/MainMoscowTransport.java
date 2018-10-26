package com.itacademy.task8;

import com.itacademy.task8.transport.AviaTransport;
import com.itacademy.task8.transport.Bus;
import com.itacademy.task8.transport.GroundTransport;
import com.itacademy.task8.transport.Railway;
import com.itacademy.task8.transport.Subway;
import com.itacademy.task8.transport.Taxi;
import com.itacademy.task8.transport.Transport;
import com.itacademy.task8.util.PrintInfoUtil;

public class MainMoscowTransport {

	String cityName;
	
	// логический блок инициализации
	{
		cityName = "Moscow";
	}


	
	public static void main(String[] args) {
		
		//вызов статического метода, без создания объекта
		GroundTransport.demoStaticMetod();
		System.out.println();
		System.out.println();

		AviaTransport flight = new AviaTransport(1063.00f, 45.6f, "avia", "SurgutAirlines", "Economy", 432);

		//taxiNumber1
		Taxi uber = new Taxi(60.0f, 4.10f, "Taxi", "toplivo", false, "Uber", 4);
		//taxiNumber2
		Taxi taxi7788 = new Taxi(60.0f, 4.10f, "Taxi", "toplivo", false, "Uber", 4);


		Subway subway = new Subway(83.50f, 0.7f, "Subway", "Belorusskaya");

		Railway train = new Railway(123.0f, 7.20f, "trains", "Mezhdunarodny lines");

		Bus bus = new Bus(35.00f, 0.65f, "Bus", "type1", true, 27);


		Transport[] moscowTransportArray = new Transport[5];

		moscowTransportArray[0] = flight;
		moscowTransportArray[1] = uber;
		moscowTransportArray[2] = subway;
		moscowTransportArray[3] = train;
		moscowTransportArray[4] = bus;

		Transport[] sortedTransportArray = sortBySpeed(moscowTransportArray);
		//вызов статического метода, без создания объекта
		PrintInfoUtil.printInfo(sortedTransportArray);

		System.out.println();
		System.out.println();

		Transport[] sortedByPriceArray = sortByTicketPrice(moscowTransportArray);
		//вызов статического метода, без создания объекта
		PrintInfoUtil.printInfo(sortedByPriceArray);

	}

	public static Transport[] sortBySpeed(Transport[] transportArray) {
		Transport[] resArr = transportArray;
		for (int i = resArr.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (resArr[j].getSpeed() > resArr[j + 1].getSpeed()) {
					Transport temp = resArr[j + 1];
					resArr[j + 1] = resArr[j];
					resArr[j] = temp;
				}
			}
		}
		return resArr;

	}

	public static Transport[] sortByTicketPrice(Transport[] transportArray) {
		Transport[] resArr = transportArray;
		for (int i = resArr.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (resArr[j].getTicketPrice() > resArr[j + 1].getTicketPrice()) {
					Transport temp = resArr[j + 1];
					resArr[j + 1] = resArr[j];
					resArr[j] = temp;
				}
			}
		}
		return resArr;

	}

	

}
