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
		int arriveTimeHour = Integer.parseInt(mainWindow.text_StundeUhrzeit.getText());
		int arriveTimeMinute = Integer.parseInt(mainWindow.textMinutenUrzeit.getText());
		int preperationTimeHour = Integer.parseInt(mainWindow.txtStunden.getText());
		int preperationTimeMinute = Integer.parseInt(mainWindow.txt_ZeitInMinuten.getText());
		int travelTimeMinute=Integer.parseInt(mainWindow.Text_MinutenFahrzeit.getText());
		int travelTimeHour = Integer.parseInt(mainWindow.text_StundenFahrzeit.getText());

	
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
		
		
		//System.out.println(totalTimeHour+ ":"+totalTimeMinute);
		
	
		
		
	}
}
