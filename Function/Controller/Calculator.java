package Controller;
import java.time.*;
/**
 * 
 * @author Demir
 * @version 1.00
 */

public class Calculator {

	public static void TimerCalculator(int startHour, int startMinute ,int endHour,int endMinute) {
		int totalEndHour,totalEndMinute;
		
		totalEndHour = endHour-startHour;
		
		totalEndMinute = endMinute-startMinute;
		System.out.println(totalEndHour+":"+totalEndMinute);
		
		//return in label (totalEndhour+":"+totalEndMinute);
		
	}
}
