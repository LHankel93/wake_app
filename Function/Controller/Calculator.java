package Controller;
import java.time.*;
import view.Hauptansicht;
/**
 * 
 * @author Demir
 * @version 1.00
 */

public class Calculator {

	public static void TimerCalculator() {
	
		Hauptansicht mainWindow = new Hauptansicht();
		int arriveTimeHour = Integer.parseInt(mainWindow.getTxtAnkunftStunden().toString());
		int arriveTimeMinute = Integer.parseInt(mainWindow.getTxtAnkunftMinuten().toString());
		int preperationTimeHour = Integer.parseInt(mainWindow.getTxtFertigmachenStunden().toString());
		int preperationTimeMinute = Integer.parseInt(mainWindow.getTxtFertigmachenMinuten().toString());
		int travelTimeMinute=Integer.parseInt(mainWindow.getTxtFahrenMinuten().toString());
		int travelTimeHour = Integer.parseInt(mainWindow.getTxtFahrenStunden().toString());

	
		int totalTimeHour =travelTimeHour+ preperationTimeHour;
		int totalTimeMinute = travelTimeMinute+ preperationTimeMinute;
		int staticTime = 60;
		int addTime=0;
		
		for(int i =0;totalTimeMinute>= staticTime;i++) {
			totalTimeMinute-=staticTime;
			addTime++;
		}
		
		
		totalTimeMinute = arriveTimeMinute-totalTimeMinute;
		
		if(totalTimeMinute< 0) {
			addTime++;
			totalTimeMinute = staticTime-(-totalTimeMinute);
		}
		totalTimeHour+=addTime;
		
		totalTimeHour = arriveTimeHour-totalTimeHour;
		
		String ZielStringed = totalTimeHour + " : " + totalTimeMinute;
		
		//Test für Funktionalität der Rechnung
		//System.out.println(totalTimeHour+ ":"+totalTimeMinute);
		
		mainWindow.getLblHilfeTextZeit().setText(ZielStringed);
		
	 
		
	}
}
