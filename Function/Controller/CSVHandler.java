package Controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import model.Wecker;

public class CSVHandler {

	public static ArrayList<Wecker> weckerLaden() { // soll noch Wecker werden

		ArrayList<Wecker> savedWecker = new ArrayList<Wecker>();

		try {
			BufferedReader reader = new BufferedReader(new FileReader("gespeicherte_Wecker.csv"));
			String zeile = "";
			String[] pdaten;

			while ((zeile = reader.readLine()) != null) {
				pdaten = zeile.split(",");
				savedWecker.add(new Wecker(pdaten[0], Integer.parseInt(pdaten[1]), Integer.parseInt(pdaten[2]),
						Integer.parseInt(pdaten[3]), Integer.parseInt(pdaten[4]), Integer.parseInt(pdaten[5]),
						Integer.parseInt(pdaten[6]), pdaten[7], pdaten[8], Integer.parseInt(pdaten[9]),
						Integer.parseInt(pdaten[10])));
			}
			reader.close();
		} catch (IOException e) {
			System.out.println("Lesen fehlgeschlagen!");
		}
		
		return savedWecker;

	}

	public static void weckerSpeichern(ArrayList<Wecker> wecker) {

		String dateiname = "gespeicherte_Wecker.csv";

	}

}
