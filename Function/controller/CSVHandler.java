package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import model.Wecker;

/**
 * Eine Klasse, welche für die Verwaltung von der lokalen CSV Datei zum lesen
 * und schreiben verantwortlich ist.
 * 
 * @author Lorenz Hankel, Thomas Schädler
 * @version v0.0.2 03.06.2022
 *
 */
public class CSVHandler {
	// Statische Variablen für diesen Handler deklarieren und initialisieren.
	private static char delimiter = ';';
	private static String dateiname = "gespeicherte_Wecker.csv";

	/**
	 * Liest die lokale CSV Datei aus und gibt eine ArrayList mit allen Weckern
	 * zurück.
	 * 
	 * @return Eine ArrayList mit Wecker-Objekten.
	 */
	public ArrayList<Wecker> weckerLaden() {
		ArrayList<Wecker> savedWecker = new ArrayList<Wecker>();

		try {
			BufferedReader reader = new BufferedReader(new FileReader("gespeicherte_Wecker.csv"));
			String zeile = "";
			String[] pdaten;

			while ((zeile = reader.readLine()) != null) {
				pdaten = zeile.split(";");
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

	/**
	 * Diese Methode speichert ein einzelnes Wecker-Objekt in der CSV Datei.
	 * 
	 * @param wecker Wecker-Objekt, welches gespeichert werden soll.
	 */
	public void weckerSpeichern(Wecker wecker) {

		// bestehende CSV Datei auslesen.
		ArrayList<Wecker> liste = weckerLaden();
		// Neues Wecker-Objekt der Liste anfügen.
		liste.add(wecker);
		// Neue Liste in CSV Datei speichern. Überschreibt die alte Datei mit der Neuen.
		weckerListeSpeichern(liste);
	}

	/**
	 * Speichert eine ArrayList mit Wecker-Objekten in der csv Datei.
	 * 
	 * @param wecker Eine ArrayList mit Wecker-Objekten zum speichern.
	 */
	public void weckerListeSpeichern(ArrayList<Wecker> wecker) {

		try (PrintWriter writer = new PrintWriter(new File(dateiname))) {

			StringBuilder sb = new StringBuilder();
			for (Wecker i : wecker) {
				sb.append(i.getName());
				sb.append(delimiter);
				sb.append(i.getAnkunftStunden());
				sb.append(delimiter);
				sb.append(i.getAnkunftMinuten());
				sb.append(delimiter);
				sb.append(i.getFahrzeitStunden());
				sb.append(delimiter);
				sb.append(i.getFahrzeitMinuten());
				sb.append(delimiter);
				sb.append(i.getVorbereitungStunden());
				sb.append(delimiter);
				sb.append(i.getVorbereitungMinuten());
				sb.append(delimiter);
				sb.append(i.getZielOrt());
				sb.append(delimiter);
				sb.append(i.getStartOrt());
				sb.append(delimiter);
				sb.append(i.getWeckzeitStunden());
				sb.append(delimiter);
				sb.append(i.getWeckzeitMinuten());
				sb.append(delimiter);
				sb.append('\n');
			}
			writer.write(sb.toString());
			writer.close();
			System.out.println("done!");

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

}
