import java.awt.EventQueue;
import controller.CSVHandler;
import controller.Calculator;
import view.Hauptansicht;

/**
 * Diese Klasse stellt die Starter-Klasse für die WakeApp dar.
 * 
 * @author Lorenz Hankel
 * @version v0.0.1 02.06.2022
 *
 */
public class StarteWakeApp {

	/**
	 * Main Methode zum eigentlichen Starten der WakeApp.
	 * 
	 * @param args Übergebene Parameter, kann ignoriert werden.
	 */
	public static void main(String[] args) {
		// JFrame initialisieren
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					// Wichtige Objekte initialisieren, deklarieren und den entsprechende
					// Konstruktoren übergeben.
					CSVHandler csv = new CSVHandler();
					Hauptansicht frame = new Hauptansicht(csv);
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
