package com.campusdual.classroom;

import java.util.Calendar;
import java.util.Date;

public class Exercise15 {

	public static void main(String[] args) {

		// Crear un objeto Calendar
		Calendar calendar = Calendar.getInstance();

		// Establecer una fecha concreta: año, mes (0-enero), día
		calendar.set(2023, Calendar.MAY, 5);  // 5 de mayo de 2023

		// Obtener el objeto Date a partir del Calendar
		Date expirationDate = calendar.getTime();

		FreshMerchandise fm = new FreshMerchandise("Manzanas", "001-9", "Frutería de ayer S.L.",
				8, "C", "114D", 53, expirationDate);
		fm.printSpecificData();
		System.out.println(fm.getLocation());

	}

}
