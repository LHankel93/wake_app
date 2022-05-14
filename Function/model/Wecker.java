package model;

/**
 * Diese Klasse soll Wecker Objekte erstellen können.
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
	 * 
	 * @author Lorenz Hankel
	 * @param name                Name Des Weckers
	 * @param ankunftStunden      Stunden der Uhrzeit der geplanten Ankuft als int.
	 * @param ankunftMinuten      Minuten der Uhrzeit der geplanten Ankufnt als int.
	 * @param fahrzeitStunden     Stunden der voraussichtlichen Fahrzeit als int.
	 * @param fahrzeitMinuten     Minuten der voraussichtlichen Fahrzeit als int.
	 * @param vorbereitungStunden Stunden der voraussichtlichen Vorbereitungszeit
	 *                            als int.
	 * @param vorbereitungMinuten Minuten der voraussichtlichen Vorbereitungszeit
	 *                            als int.
	 * @param zielOrt             Ziel Ort als String.
	 * @param startOrt            Start Ort als String.
	 * @param weckzeitStunden     Stunden der Uhrzeit der berechneten Weckzeit als
	 *                            int.
	 * @param weckzeitMinuten     Minuten der Uhrzeit der berechneten Weckzeit als
	 *                            int.
	 */
	public Wecker(String name, int ankunftStunden, int ankunftMinuten, int fahrzeitStunden, int fahrzeitMinuten,
			int vorbereitungStunden, int vorbereitungMinuten, String zielOrt, String startOrt, Integer weckzeitStunden,
			Integer weckzeitMinuten) {
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
		if (weckzeitStunden == null || weckzeitMinuten == null) {
			this.weckzeitMinuten = 0;
			this.weckzeitStunden = 0;
		} else {
			this.weckzeitStunden = weckzeitStunden;
			this.weckzeitMinuten = weckzeitMinuten;
		}
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the ankunftStunden
	 */
	public int getAnkunftStunden() {
		return ankunftStunden;
	}

	/**
	 * @return the ankunftMinuten
	 */
	public int getAnkunftMinuten() {
		return ankunftMinuten;
	}

	/**
	 * @return the fahrzeitStunden
	 */
	public int getFahrzeitStunden() {
		return fahrzeitStunden;
	}

	/**
	 * @return the fahrzeitMinuten
	 */
	public int getFahrzeitMinuten() {
		return fahrzeitMinuten;
	}

	/**
	 * @return the vorbereitungStunden
	 */
	public int getVorbereitungStunden() {
		return vorbereitungStunden;
	}

	/**
	 * @return the vorbereitungMinuten
	 */
	public int getVorbereitungMinuten() {
		return vorbereitungMinuten;
	}

	/**
	 * @return the zielOrt
	 */
	public String getZielOrt() {
		return zielOrt;
	}

	/**
	 * @return the startOrt
	 */
	public String getStartOrt() {
		return startOrt;
	}

	/**
	 * @return the weckzeitStunden
	 */
	public int getWeckzeitStunden() {
		return weckzeitStunden;
	}

	/**
	 * @return the weckzeitMinuten
	 */
	public int getWeckzeitMinuten() {
		return weckzeitMinuten;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param ankunftStunden the ankunftStunden to set
	 */
	public void setAnkunftStunden(int ankunftStunden) {
		this.ankunftStunden = ankunftStunden;
	}

	/**
	 * @param ankunftMinuten the ankunftMinuten to set
	 */
	public void setAnkunftMinuten(int ankunftMinuten) {
		this.ankunftMinuten = ankunftMinuten;
	}

	/**
	 * @param fahrzeitStunden the fahrzeitStunden to set
	 */
	public void setFahrzeitStunden(int fahrzeitStunden) {
		this.fahrzeitStunden = fahrzeitStunden;
	}

	/**
	 * @param fahrzeitMinuten the fahrzeitMinuten to set
	 */
	public void setFahrzeitMinuten(int fahrzeitMinuten) {
		this.fahrzeitMinuten = fahrzeitMinuten;
	}

	/**
	 * @param vorbereitungStunden the vorbereitungStunden to set
	 */
	public void setVorbereitungStunden(int vorbereitungStunden) {
		this.vorbereitungStunden = vorbereitungStunden;
	}

	/**
	 * @param vorbereitungMinuten the vorbereitungMinuten to set
	 */
	public void setVorbereitungMinuten(int vorbereitungMinuten) {
		this.vorbereitungMinuten = vorbereitungMinuten;
	}

	/**
	 * @param zielOrt the zielOrt to set
	 */
	public void setZielOrt(String zielOrt) {
		this.zielOrt = zielOrt;
	}

	/**
	 * @param startOrt the startOrt to set
	 */
	public void setStartOrt(String startOrt) {
		this.startOrt = startOrt;
	}

	/**
	 * @param weckzeitStunden the weckzeitStunden to set
	 */
	public void setWeckzeitStunden(int weckzeitStunden) {
		this.weckzeitStunden = weckzeitStunden;
	}

	/**
	 * @param weckzeitMinuten the weckzeitMinuten to set
	 */
	public void setWeckzeitMinuten(int weckzeitMinuten) {
		this.weckzeitMinuten = weckzeitMinuten;
	}

}
