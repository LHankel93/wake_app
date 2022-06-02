package Controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import model.Wecker;

public class CSVHandler {
	private String delimiter;

	public static ArrayList<Wecker> weckerLaden() { // soll noch Wecker werden
		delimiter = ";";
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

		try (PrintWriter writer = new PrintWriter(new File(dateiname))) {

			StringBuilder sb = new StringBuilder();
			sb.append("id");
			sb.append(',');
			sb.append("Name");
			sb.append(',');
			sb.append("Address");
			sb.append('\n');

			sb.append("101");
			sb.append(',');
			sb.append("John Doe");
			sb.append(',');
			sb.append("Las Vegas");
			sb.append('\n');

			writer.write(sb.toString());
			writer.close();
			System.out.println("done!");

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

}
