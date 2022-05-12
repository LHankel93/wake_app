package Controller;
import java.time.*;
/**
 * 
 * @author Demir
 * @version 1.00
 */

public class Calculator {

	public static void TimerCalculator(int arriveTimeHour,int arriveTimeMinute,int travelTimeHour, int travelTimeMinute,int preperationTimeHour,int preperationTimeMinute) {
	

		
	
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
			totalTimeHour++;
			totalTimeMinute = staticTime-(-totalTimeMinute);
		}
		totalTimeHour+=addTime;
		
		totalTimeHour = arriveTimeHour-totalTimeHour;
		
		
		
		System.out.println(totalTimeHour+" "+ totalTimeMinute);
		
		//Berechnung der preptime
		
		
		
		
		
		//return in label (totalEndhour+":"+totalEndMinute);
		
	}
}
