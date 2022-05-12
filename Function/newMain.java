import Controller.Calculator;

public class newMain {

	public static void main(String[] args) {
		
		int arriveTimeHour=13,arriveTimeMinute=30,travelTimeHour=2,travelTimeMinute=0,preperationTimeHour=0,preperationTimeMinute=45;
		//Die methode zum berechnen der benötigten Zeit
		Calculator.TimerCalculator(arriveTimeHour, arriveTimeMinute,travelTimeHour,travelTimeMinute,preperationTimeHour,preperationTimeMinute);
	}
 
	

}
