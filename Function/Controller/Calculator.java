package Controller;
import java.time.*;
/**
 * 
 * @author Demir
 * @version 1.00
 */

public class Calculator {

	public static void TimerCalculator(int arriveTimeHour,int arriveTimeMinute,int travelTimeHour, int travelTimeMinute,int preperationTimeMinute) {
		int wakeUpHour,wakeUpMinute,negTime =0,staticMinuteTime = 60,test;

		
		wakeUpHour = arriveTimeHour - travelTimeHour;
		
		wakeUpMinute = arriveTimeMinute- travelTimeMinute;
		
		//Berechnung der preptime
		
		test = preperationTimeMinute % staticMinuteTime;
		
		
		
		
		
		
		
		//return in label (totalEndhour+":"+totalEndMinute);
		
	}
}
