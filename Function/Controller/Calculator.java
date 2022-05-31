package Controller;
import java.time.*;
import view.Hauptansicht;
/**
 * 
 * @author Demir
 * @version 1.00
 */

public class Calculator {

	private Hauptansicht mainWindow;
	

	public  Calculator(Hauptansicht mainWindow) {
	
	this.mainWindow = mainWindow;
	 
		
	}
	
	public void Rechnung() {
		
		int arriveTimeHour = Integer.parseInt(mainWindow.getTxtAnkunftStunden().getText());
		int arriveTimeMinute = Integer.parseInt(mainWindow.getTxtAnkunftMinuten().getText());
		int preperationTimeHour = Integer.parseInt(mainWindow.getTxtFertigmachenStunden().getText());
		int preperationTimeMinute = Integer.parseInt(mainWindow.getTxtFertigmachenMinuten().getText());
		int travelTimeMinute= Integer.parseInt(mainWindow.getTxtFahrenMinuten().getText());
		int travelTimeHour = Integer.parseInt(mainWindow.getTxtFahrenStunden().getText());

	
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
		
		//mainWindow.getLblHilfeTextZeit().setText(ZielStringed);
		mainWindow.lblHilfeTextZeit.setText(ZielStringed);
		
	}
}
