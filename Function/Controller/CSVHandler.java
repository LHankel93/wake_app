package Controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import model.Wecker;

public class CSVHandler {
	
	private static String filename = "gespeicherte_Wecker.csv";

	public static ArrayList<Wecker> weckerLaden() { // soll noch Wecker werden

		ArrayList<Wecker> savedWecker = new ArrayList<Wecker>();

		try {
			BufferedReader reader = new BufferedReader(new FileReader(filename));
			String zeile = "";
			String[] wdaten;

			while ((zeile = reader.readLine()) != null) {
				wdaten = zeile.split(",");
				savedWecker.add(new Wecker(wdaten[0], Integer.parseInt(wdaten[1]), Integer.parseInt(wdaten[2]),
						Integer.parseInt(wdaten[3]), Integer.parseInt(wdaten[4]), Integer.parseInt(wdaten[5]),
						Integer.parseInt(wdaten[6]), wdaten[7], wdaten[8], Integer.parseInt(wdaten[9]),
						Integer.parseInt(wdaten[10])));
			}
			reader.close();
		} catch (IOException e) {
			System.out.println("Lesen fehlgeschlagen!");
		}
		
		return savedWecker;

	}

	public static void weckerSpeichern(ArrayList<Wecker> wecker) {

		String dateiname = "gespeicherte_Wecker.csv";
		
		ArrayList<Wecker> wliste = wecker;
		
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
			
			for (Wecker w : wliste) {
				String wstring = w.getName() + ";" + w.getAnkunftStunden() + ";" + w.getAnkunftMinuten() + ";"
						+ w.getFahrzeitStunden() + ";" + w.getFahrzeitMinuten() + ";" + w.getVorbereitungStunden() + ";"
						+ w.getVorbereitungMinuten() + ";" + w.getZielOrt() + ";" + w.getStartOrt() + ";"
						+ w.getWeckzeitStunden() + ";" + w.getWeckzeitMinuten();
				writer.write(wstring);
				writer.newLine();
			}
			writer.close();
		}
		catch (IOException e) {
			System.out.println("Schreiben fehlgeschlagen!");
		}

	}

}
