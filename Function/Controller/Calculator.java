package Controller;

import java.util.HashMap;

/**
 * 
 * @author Demir
 * @version 1.00
 */

public class Calculator {

	/**
	 * TODO bitte JavaDoc füllen.
	 * 
	 * @param startHour
	 * @param startMinute
	 * @param endHour
	 * @param endMinute
	 * @return Die berechnete Weckzeit gespeichert in einer HashMap. Stunden unter
	 *         dem String "hours", Minuten unter dem String "minutes".
	 */
	public static HashMap<String, Integer> TimerCalculator(int startHour, int startMinute, int endHour, int endMinute) {
		@SuppressWarnings("unused")
		int totalEndHour, totalEndMinute;
		HashMap<String, Integer> totalEndTime = new HashMap<String, Integer>();
		totalEndHour = endHour - startHour;
		totalEndMinute = endMinute - startMinute;

		// Errechnete Daten in die HashMap einfügen:
		totalEndTime.put("hours", endHour);
		totalEndTime.put("minutes", endMinute);

		// totalEnd = (totalEndHour + ":" + totalEndMinute); // Überflüssig dank
		// HashMap.
		System.out.println(totalEndTime.get("hours") + " : " + totalEndTime.get("minutes")); // angepasst auf HashMap,
																								// kann später entfernt
																								// werden, wenn Methode
																								// korrekt arbeitet.

		return totalEndTime; // Sollte jetzt mit der HashMap super arbeiten :).
		// return in label (totalEndhour+":"+totalEndMinute);

	}
}
