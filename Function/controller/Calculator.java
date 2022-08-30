package controller;
import javax.swing.JOptionPane;
import view.Hauptansicht;
/**
 * 
 * @author Demir
 * @version 1.00
 */

/**
 * 
 *Haubtansicht mit Konstruktor verbinden
 *
 */
public class Calculator {

	private Hauptansicht mainWindow;
	

	public  Calculator(Hauptansicht mainWindow) {
	
	this.mainWindow = mainWindow;
	 
		
	}
	/**
	 * Funktion zum Berechnen der Startzeit
	 */
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
		int staticResetTime = 24;
		int addTime=0;
		boolean error=false;
		

		String Message = "";
		
		if(		arriveTimeHour < 0|
				travelTimeHour<0 |
				travelTimeMinute<0|
				preperationTimeHour<0|
				preperationTimeMinute<0|
				arriveTimeMinute<0) {
			try {
				Message = "unzulässige Eingabe";
				JOptionPane.showMessageDialog(mainWindow, Message);
				error=true;
			}catch(Exception e) {
				
			}
		}
		
		if(arriveTimeHour >= 24 ) {
			try {
				Message = "die Ankunftzeit existiert nicht";
				JOptionPane.showMessageDialog(mainWindow, Message);
				error=true;
				
				
			} catch (Exception e) {
			}
		}
		
		if(arriveTimeMinute >= 60) {
			try {
				Message = "die Ankunftzeit existiert nicht";
				JOptionPane.showMessageDialog(mainWindow, Message);
				error=true;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		
		if(!error) {
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
		
		if(totalTimeHour < 0 ) {
		 totalTimeHour=	totalTimeHour+ staticResetTime;
		}
		
		String newValue ="";
		
		if(totalTimeMinute <10 || totalTimeMinute>0) {
			 newValue = String.format("%02d", totalTimeMinute);
		}
		
		String ZielStringed = totalTimeHour + " : " + newValue;
		
		//Test für Funktionalität der Rechnung
		//System.out.println(totalTimeHour+ ":"+totalTimeMinute);
		
		//mainWindow.getLblHilfeTextZeit().setText(ZielStringed);
		mainWindow.lblHilfeTextZeit.setText(ZielStringed);
		
	}
	}
}
