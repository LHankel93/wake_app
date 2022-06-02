import Controller.CSVHandler;
import Controller.Calculator;
import model.Wecker;
import view.Hauptansicht;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;

public class newMain {

	public static void main(String[] args) {
		// Zum Testen der Schreib Funktion des CSV Handlers
		Wecker wecker = new Wecker("Ein Test Wecker", 8, 30, 0, 45, 1, 0, "Start Adresse", "Ziel Adresse", 6, 0);
		CSVHandler csv = new CSVHandler();
		ArrayList<Wecker> liste = new ArrayList<Wecker>();
		liste.add(wecker);
		csv.weckerSpeichern(liste);
		ArrayList<Wecker> weckerLesenListe = csv.weckerLaden();

		for (Wecker i : weckerLesenListe) {
			System.out.println(i.getName() + i.getAnkunftStunden());
		}

	}
}
