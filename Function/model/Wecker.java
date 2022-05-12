package model;

/**
 * 
 * @author Lorenz Hankel
 * @version v0.0.1
 * 
 *
 */
public class Wecker {
	private String name;
	private int ankunftStunden;
	private int ankunftMinuten;
	private int fahrzeitStunden;
	private int fahrzeitMinuten;
	private int vorbereitungStunden;
	private int vorbereitungMinuten;
	private String zielOrt;
	private String startOrt;
	private int weckzeitStunden;
	private int weckzeitMinuten;
	

	/**
	 * Standard Konstruktor der Klasse mit allen Variablen
	 * @author Lorenz Hankel
	 * @param name Name Des Weckers
	 * @param ankunftStunden Stunden der Uhrzeit der geplanten Ankuft als int.
	 * @param ankunftMinuten Minuten der Uhrzeit der geplanten Ankufnt als int.
	 * @param fahrzeitStunden Stunden der voraussichtlichen Fahrzeit als int.
	 * @param fahrzeitMinuten Minuten der voraussichtlichen Fahrzeit als int.
	 * @param vorbereitungStunden Stunden der voraussichtlichen Vorbereitungszeit als int.
	 * @param vorbereitungMinuten Minuten der voraussichtlichen Vorbereitungszeit als int.
	 * @param zielOrt Ziel Ort als String.
	 * @param startOrt Start Ort als String.
	 * @param weckzeitStunden Stunden der Uhrzeit der berechneten Weckzeit als int.
	 * @param weckzeitMinuten Minuten der Uhrzeit der berechneten Weckzeit als int.
	 */
	public Wecker(String name, int ankunftStunden, int ankunftMinuten, int fahrzeitStunden, int fahrzeitMinuten,
			int vorbereitungStunden, int vorbereitungMinuten, String zielOrt, String startOrt, int weckzeitStunden,
			int weckzeitMinuten) {
		super();
		this.name = name;
		this.ankunftStunden = ankunftStunden;
		this.ankunftMinuten = ankunftMinuten;
		this.fahrzeitStunden = fahrzeitStunden;
		this.fahrzeitMinuten = fahrzeitMinuten;
		this.vorbereitungStunden = vorbereitungStunden;
		this.vorbereitungMinuten = vorbereitungMinuten;
		this.zielOrt = zielOrt;
		this.startOrt = startOrt;
		if(weckzeitStunden ) {
			
		}
		this.weckzeitStunden = weckzeitStunden;
		this.weckzeitMinuten = weckzeitMinuten;
	}
	
	
	}
