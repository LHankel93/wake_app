import java.awt.EventQueue;

import Controller.Calculator;
import view.Hauptansicht;

/**
 * Diese Klasse stellt eine main Methode dar, um die GUI Hauptansicht zu starten
 * und zu testen.
 * 
 * @author Lorenz Hankel
 * @version v0.0.1
 * 
 *
 */
public class TesteHauptansicht {

	/**
	 * Die Main Methode zum Testen der Hauptansicht.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Copy & Paste aus der Auto-Generierten Window Builder Methode.
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hauptansicht frame = new Hauptansicht();
				
					Calculator ctr = new Calculator(frame);
				
					frame.setCalculator(ctr);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
