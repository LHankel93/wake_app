package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.SpringLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import Controller.*;
import model.Wecker;

/**
 * Diese Klasse ist zum erzeugen der GUIs da
 * 
 * @author Maria siegmann
 * @version v0.0.1
 * 
 *
 */
@SuppressWarnings("serial")
public class Hauptansicht extends JFrame {

	private JPanel contentPane;
	private JTextField txtFertigmachenMinuten;
	private JTextField txtWohnort;
	private JTextField txtZielort;
	private JTextField txtFertigmachenStunden;
	private JTextField txtAnkunftMinuten;
	private JTextField txtAnkunftStunden;
	private JTextField txtFahrenStunden;
	private JTextField txtFahrenMinuten;
	private JTextField text_Name;
	// manuell hinzugefügte Attribute
	public JLabel lblHilfeTextZeit;
	private CSVHandler csv;

	public JTextField getTxtFertigmachenMinuten() {
		return txtFertigmachenMinuten;
	}

	public JTextField getTxtWohnort() {
		return txtWohnort;
	}

	public JTextField getTxtZielort() {
		return txtZielort;
	}

	public JTextField getTxtFertigmachenStunden() {
		return txtFertigmachenStunden;
	}

	public JTextField getTxtAnkunftMinuten() {
		return txtAnkunftMinuten;
	}

	public JTextField getTxtAnkunftStunden() {
		return txtAnkunftStunden;
	}

	public JTextField getTxtFahrenStunden() {
		return txtFahrenStunden;
	}

	public JTextField getTxtFahrenMinuten() {
		return txtFahrenMinuten;
	}

	public JTextField getText_Name() {
		return text_Name;
	}

	public void setTxtFertigmachenMinuten(JTextField txtFertigmachenMinuten) {
		this.txtFertigmachenMinuten = txtFertigmachenMinuten;
	}

	public void setTxtWohnort(JTextField txtWohnort) {
		this.txtWohnort = txtWohnort;
	}

	public void setTxtZielort(JTextField txtZielort) {
		this.txtZielort = txtZielort;
	}

	public void setTxtFertigmachenStunden(JTextField txtFertigmachenStunden) {
		this.txtFertigmachenStunden = txtFertigmachenStunden;
	}

	public void setTxtAnkunftMinuten(JTextField txtAnkunftMinuten) {
		this.txtAnkunftMinuten = txtAnkunftMinuten;
	}

	public void setTxtAnkunftStunden(JTextField txtAnkunftStunden) {
		this.txtAnkunftStunden = txtAnkunftStunden;
	}

	public void setTxtFahrenStunden(JTextField txtFahrenStunden) {
		this.txtFahrenStunden = txtFahrenStunden;
	}

	public void setTxtFahrenMinuten(JTextField txtFahrenMinuten) {
		this.txtFahrenMinuten = txtFahrenMinuten;
	}

	public void setText_Name(JTextField text_Name) {
		this.text_Name = text_Name;
	}

	public CSVHandler getCsv() {
		return csv;
	}

	public void setCsv(CSVHandler csv) {
		this.csv = csv;
	}

	public JLabel getLblHilfeTextZeit() {
		return lblHilfeTextZeit;
	}

	public Calculator getCalculator() {
		return calculator;
	}

	public JButton getBtnWeckerHinzufgen() {
		return btnWeckerHinzufgen;
	}

	public void setLblHilfeTextZeit(JLabel lblHilfeTextZeit) {
		this.lblHilfeTextZeit = lblHilfeTextZeit;
	}

	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}

	public void setBtnWeckerHinzufgen(JButton btnWeckerHinzufgen) {
		this.btnWeckerHinzufgen = btnWeckerHinzufgen;
	}

	public Calculator calculator;
	private JButton btnWeckerHinzufgen;

	/**
	 * Konstruktor um den für den JFrame.
	 */
	public Hauptansicht(CSVHandler csv) {
		// Wecker Rechner initialisieren und deklarieren.
		this.csv = csv;

		setIconImage(Toolkit.getDefaultToolkit().getImage(Hauptansicht.class.getResource("/img/app_icon.png")));
		setTitle("Wake App");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 442, 640);
		contentPane = new JPanel();
		// contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane);

		JPanel panelWeckerErstellen = new JPanel();
		panelWeckerErstellen.setBackground(new Color(255, 255, 255));
		tabbedPane.addTab("Wecker erstellen", null, panelWeckerErstellen, null);
		SpringLayout sl_panelWeckerErstellen = new SpringLayout();
		panelWeckerErstellen.setLayout(sl_panelWeckerErstellen);

		JButton btn_Berechnen = new JButton("Berechnen");
		btn_Berechnen.setForeground(new Color(255, 255, 255));
		sl_panelWeckerErstellen.putConstraint(SpringLayout.WEST, btn_Berechnen, 6, SpringLayout.WEST,
				panelWeckerErstellen);
		sl_panelWeckerErstellen.putConstraint(SpringLayout.EAST, btn_Berechnen, -5, SpringLayout.EAST,
				panelWeckerErstellen);
		btn_Berechnen.setFont(new Font("Arial", Font.PLAIN, 12));
		btn_Berechnen.setBackground(new Color(138, 43, 226));
		panelWeckerErstellen.add(btn_Berechnen);

		JLabel label_FettWakeApp = new JLabel("WakeApp");
		label_FettWakeApp.setFont(new Font("Arial", Font.BOLD, 20));
		panelWeckerErstellen.add(label_FettWakeApp);

		JLabel label_Ankunftszeit = new JLabel("Ankunftszeit:");
		sl_panelWeckerErstellen.putConstraint(SpringLayout.WEST, label_Ankunftszeit, 6, SpringLayout.WEST,
				panelWeckerErstellen);
		label_Ankunftszeit.setBackground(Color.LIGHT_GRAY);
		label_Ankunftszeit.setFont(new Font("Arial", Font.PLAIN, 12));
		panelWeckerErstellen.add(label_Ankunftszeit);

		JLabel label_Fertigmachzeit = new JLabel("Benötigte Zeit zum Fertigmachen");
		sl_panelWeckerErstellen.putConstraint(SpringLayout.WEST, label_Fertigmachzeit, 0, SpringLayout.WEST,
				label_Ankunftszeit);
		label_Fertigmachzeit.setFont(new Font("Arial", Font.PLAIN, 12));
		panelWeckerErstellen.add(label_Fertigmachzeit);

		JLabel label_Wohnort = new JLabel("Wohnort:");
		sl_panelWeckerErstellen.putConstraint(SpringLayout.WEST, label_Wohnort, 0, SpringLayout.WEST, label_Ankunftszeit);
		label_Wohnort.setFont(new Font("Arial", Font.PLAIN, 12));
		panelWeckerErstellen.add(label_Wohnort);

		JLabel label_Zielort = new JLabel("Zielort:");
		sl_panelWeckerErstellen.putConstraint(SpringLayout.NORTH, label_Zielort, 278, SpringLayout.NORTH, panelWeckerErstellen);
		sl_panelWeckerErstellen.putConstraint(SpringLayout.SOUTH, label_Wohnort, -16, SpringLayout.NORTH, label_Zielort);
		sl_panelWeckerErstellen.putConstraint(SpringLayout.WEST, label_Zielort, 0, SpringLayout.WEST, label_Ankunftszeit);
		label_Zielort.setFont(new Font("Arial", Font.PLAIN, 12));
		panelWeckerErstellen.add(label_Zielort);

		txtFertigmachenMinuten = new JTextField();
		sl_panelWeckerErstellen.putConstraint(SpringLayout.NORTH, label_Fertigmachzeit, 3, SpringLayout.NORTH,
				txtFertigmachenMinuten);
		sl_panelWeckerErstellen.putConstraint(SpringLayout.EAST, txtFertigmachenMinuten, -22, SpringLayout.EAST,
				panelWeckerErstellen);
		txtFertigmachenMinuten.setFont(new Font("Arial", Font.PLAIN, 12));
		txtFertigmachenMinuten.setForeground(new Color(192, 192, 192));
		txtFertigmachenMinuten.setText("30");
		panelWeckerErstellen.add(txtFertigmachenMinuten);
		txtFertigmachenMinuten.setColumns(10);

		txtWohnort = new JTextField();
		sl_panelWeckerErstellen.putConstraint(SpringLayout.WEST, txtWohnort, 206, SpringLayout.EAST, label_Wohnort);
		sl_panelWeckerErstellen.putConstraint(SpringLayout.EAST, txtWohnort, 0, SpringLayout.EAST, txtFertigmachenMinuten);
		txtWohnort.setFont(new Font("Arial", Font.PLAIN, 12));
		txtWohnort.setForeground(new Color(192, 192, 192));
		txtWohnort.setText("Start-Adresse");
		panelWeckerErstellen.add(txtWohnort);
		txtWohnort.setColumns(10);

		txtZielort = new JTextField();
		sl_panelWeckerErstellen.putConstraint(SpringLayout.SOUTH, txtWohnort, -10, SpringLayout.NORTH, txtZielort);
		sl_panelWeckerErstellen.putConstraint(SpringLayout.WEST, txtZielort, 218, SpringLayout.EAST, label_Zielort);
		sl_panelWeckerErstellen.putConstraint(SpringLayout.EAST, txtZielort, 0, SpringLayout.EAST, txtFertigmachenMinuten);
		sl_panelWeckerErstellen.putConstraint(SpringLayout.NORTH, txtZielort, 275, SpringLayout.NORTH,
				panelWeckerErstellen);
		txtZielort.setForeground(new Color(192, 192, 192));
		txtZielort.setFont(new Font("Arial", Font.PLAIN, 12));
		txtZielort.setText("Ziel-Adresse");
		panelWeckerErstellen.add(txtZielort);
		txtZielort.setColumns(10);

		JLabel label_zwischen = new JLabel(":");
		sl_panelWeckerErstellen.putConstraint(SpringLayout.WEST, label_zwischen, 322, SpringLayout.WEST,
				panelWeckerErstellen);
		sl_panelWeckerErstellen.putConstraint(SpringLayout.WEST, txtFertigmachenMinuten, 6, SpringLayout.EAST,
				label_zwischen);
		label_zwischen.setFont(new Font("Arial", Font.PLAIN, 12));
		label_zwischen.setForeground(new Color(0, 0, 0));
		panelWeckerErstellen.add(label_zwischen);

		txtFertigmachenStunden = new JTextField();
		sl_panelWeckerErstellen.putConstraint(SpringLayout.WEST, txtFertigmachenStunden, 261, SpringLayout.WEST,
				panelWeckerErstellen);
		sl_panelWeckerErstellen.putConstraint(SpringLayout.EAST, txtFertigmachenStunden, -6, SpringLayout.EAST,
				label_zwischen);
		txtFertigmachenStunden.setFont(new Font("Arial", Font.PLAIN, 12));
		txtFertigmachenStunden.setForeground(new Color(192, 192, 192));
		txtFertigmachenStunden.setText("0");
		panelWeckerErstellen.add(txtFertigmachenStunden);
		txtFertigmachenStunden.setColumns(10);
		// RadioButtons zu Wahl zwischen ÖPNV und Auto
		JRadioButton rdbtnopnv = new JRadioButton("ÖPNV");
		sl_panelWeckerErstellen.putConstraint(SpringLayout.WEST, rdbtnopnv, 0, SpringLayout.WEST, label_Ankunftszeit);
		rdbtnopnv.setFont(new Font("Arial", Font.PLAIN, 12));
		panelWeckerErstellen.add(rdbtnopnv);

		JRadioButton rdbtnauto = new JRadioButton("Auto");
		sl_panelWeckerErstellen.putConstraint(SpringLayout.EAST, label_FettWakeApp, 0, SpringLayout.EAST, rdbtnauto);
		sl_panelWeckerErstellen.putConstraint(SpringLayout.WEST, rdbtnauto, 128, SpringLayout.EAST, rdbtnopnv);
		sl_panelWeckerErstellen.putConstraint(SpringLayout.NORTH, btn_Berechnen, 6, SpringLayout.SOUTH, rdbtnauto);
		sl_panelWeckerErstellen.putConstraint(SpringLayout.NORTH, rdbtnauto, 0, SpringLayout.NORTH, rdbtnopnv);
		rdbtnauto.setFont(new Font("Arial", Font.PLAIN, 12));
		rdbtnauto.setForeground(new Color(0, 0, 0));
		panelWeckerErstellen.add(rdbtnauto);

		JLabel lblErgebnis = new JLabel("Ergebnis");
		sl_panelWeckerErstellen.putConstraint(SpringLayout.NORTH, lblErgebnis, 46, SpringLayout.SOUTH, rdbtnopnv);
		sl_panelWeckerErstellen.putConstraint(SpringLayout.WEST, lblErgebnis, 0, SpringLayout.WEST, label_Ankunftszeit);
		lblErgebnis.setForeground(new Color(128, 128, 128));
		lblErgebnis.setFont(new Font("Arial", Font.BOLD, 14));
		panelWeckerErstellen.add(lblErgebnis);

		JLabel lblHilfeTextErgebnis = new JLabel("Sie sollten Ihren Wecker auf die folgende Zeit stellen:");
		lblHilfeTextErgebnis.setForeground(new Color(128, 128, 128));
		lblHilfeTextErgebnis.setFont(new Font("Arial", Font.PLAIN, 12));
		sl_panelWeckerErstellen.putConstraint(SpringLayout.NORTH, lblHilfeTextErgebnis, 6, SpringLayout.SOUTH,
				lblErgebnis);
		sl_panelWeckerErstellen.putConstraint(SpringLayout.WEST, lblHilfeTextErgebnis, 0, SpringLayout.WEST,
				label_Ankunftszeit);
		panelWeckerErstellen.add(lblHilfeTextErgebnis);

		lblHilfeTextZeit = new JLabel("Zeit");
		sl_panelWeckerErstellen.putConstraint(SpringLayout.NORTH, lblHilfeTextZeit, 35, SpringLayout.SOUTH,
				lblHilfeTextErgebnis);
		sl_panelWeckerErstellen.putConstraint(SpringLayout.WEST, lblHilfeTextZeit, 51, SpringLayout.WEST,
				panelWeckerErstellen);
		lblHilfeTextZeit.setFont(new Font("Arial", Font.BOLD, 24));
		lblHilfeTextZeit.setForeground(new Color(128, 128, 128));
		panelWeckerErstellen.add(lblHilfeTextZeit);

		JLabel label_zwischen_1 = new JLabel(":");
		sl_panelWeckerErstellen.putConstraint(SpringLayout.WEST, label_zwischen_1, 0, SpringLayout.WEST,
				label_zwischen);
		sl_panelWeckerErstellen.putConstraint(SpringLayout.SOUTH, label_zwischen_1, 0, SpringLayout.SOUTH,
				label_Ankunftszeit);
		label_zwischen_1.setForeground(Color.BLACK);
		label_zwischen_1.setFont(new Font("Arial", Font.PLAIN, 12));
		panelWeckerErstellen.add(label_zwischen_1);

		txtAnkunftMinuten = new JTextField();
		sl_panelWeckerErstellen.putConstraint(SpringLayout.NORTH, txtFertigmachenMinuten, 26, SpringLayout.SOUTH,
				txtAnkunftMinuten);
		sl_panelWeckerErstellen.putConstraint(SpringLayout.NORTH, txtAnkunftMinuten, -3, SpringLayout.NORTH,
				label_Ankunftszeit);
		sl_panelWeckerErstellen.putConstraint(SpringLayout.WEST, txtAnkunftMinuten, 6, SpringLayout.EAST,
				label_zwischen_1);
		sl_panelWeckerErstellen.putConstraint(SpringLayout.EAST, txtAnkunftMinuten, -24, SpringLayout.EAST,
				panelWeckerErstellen);
		txtAnkunftMinuten.setText("00");
		txtAnkunftMinuten.setForeground(Color.LIGHT_GRAY);
		txtAnkunftMinuten.setFont(new Font("Arial", Font.PLAIN, 12));
		txtAnkunftMinuten.setColumns(10);
		panelWeckerErstellen.add(txtAnkunftMinuten);

		txtAnkunftStunden = new JTextField();
		sl_panelWeckerErstellen.putConstraint(SpringLayout.NORTH, txtFertigmachenStunden, 26, SpringLayout.SOUTH,
				txtAnkunftStunden);
		sl_panelWeckerErstellen.putConstraint(SpringLayout.NORTH, txtAnkunftStunden, -3, SpringLayout.NORTH,
				label_Ankunftszeit);
		sl_panelWeckerErstellen.putConstraint(SpringLayout.WEST, txtAnkunftStunden, 0, SpringLayout.WEST,
				txtFertigmachenStunden);
		sl_panelWeckerErstellen.putConstraint(SpringLayout.EAST, txtAnkunftStunden, 0, SpringLayout.EAST,
				txtFertigmachenStunden);
		txtAnkunftStunden.setText("12");
		txtAnkunftStunden.setForeground(Color.LIGHT_GRAY);
		txtAnkunftStunden.setFont(new Font("Arial", Font.PLAIN, 12));
		txtAnkunftStunden.setColumns(10);
		panelWeckerErstellen.add(txtAnkunftStunden);

		JLabel lblNewLabel_2 = new JLabel("Fahrzeit:");
		sl_panelWeckerErstellen.putConstraint(SpringLayout.NORTH, lblNewLabel_2, 28, SpringLayout.SOUTH, label_Fertigmachzeit);
		sl_panelWeckerErstellen.putConstraint(SpringLayout.WEST, lblNewLabel_2, 0, SpringLayout.WEST, label_Ankunftszeit);
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 12));
		panelWeckerErstellen.add(lblNewLabel_2);

		txtFahrenStunden = new JTextField();
		sl_panelWeckerErstellen.putConstraint(SpringLayout.EAST, txtFahrenStunden, -102, SpringLayout.EAST,
				panelWeckerErstellen);
		sl_panelWeckerErstellen.putConstraint(SpringLayout.NORTH, txtFahrenStunden, 22, SpringLayout.SOUTH,
				txtFertigmachenMinuten);
		sl_panelWeckerErstellen.putConstraint(SpringLayout.WEST, txtFahrenStunden, 0, SpringLayout.WEST,
				txtFertigmachenStunden);
		txtFahrenStunden.setText("0");
		txtFahrenStunden.setForeground(Color.LIGHT_GRAY);
		txtFahrenStunden.setFont(new Font("Arial", Font.PLAIN, 12));
		txtFahrenStunden.setColumns(10);
		panelWeckerErstellen.add(txtFahrenStunden);

		txtFahrenMinuten = new JTextField();
		sl_panelWeckerErstellen.putConstraint(SpringLayout.NORTH, txtFahrenMinuten, 22, SpringLayout.SOUTH,
				txtFertigmachenMinuten);
		sl_panelWeckerErstellen.putConstraint(SpringLayout.WEST, txtFahrenMinuten, 0, SpringLayout.WEST, txtFertigmachenMinuten);
		sl_panelWeckerErstellen.putConstraint(SpringLayout.EAST, txtFahrenMinuten, -23, SpringLayout.EAST,
				panelWeckerErstellen);
		txtFahrenMinuten.setText("30");
		txtFahrenMinuten.setForeground(Color.LIGHT_GRAY);
		txtFahrenMinuten.setFont(new Font("Arial", Font.PLAIN, 12));
		txtFahrenMinuten.setColumns(10);
		panelWeckerErstellen.add(txtFahrenMinuten);

		JLabel label_zwischen_2 = new JLabel(":");
		sl_panelWeckerErstellen.putConstraint(SpringLayout.NORTH, label_zwischen_2, 207, SpringLayout.NORTH,
				panelWeckerErstellen);
		sl_panelWeckerErstellen.putConstraint(SpringLayout.SOUTH, label_zwischen, -25, SpringLayout.NORTH, label_zwischen_2);
		sl_panelWeckerErstellen.putConstraint(SpringLayout.WEST, label_zwischen_2, 0, SpringLayout.WEST,
				label_zwischen);
		label_zwischen_2.setForeground(Color.BLACK);
		label_zwischen_2.setFont(new Font("Arial", Font.PLAIN, 12));
		panelWeckerErstellen.add(label_zwischen_2);
		// Textfeld um den Wecker einen Namen zu geben
		text_Name = new JTextField();
		sl_panelWeckerErstellen.putConstraint(SpringLayout.NORTH, text_Name, 14, SpringLayout.SOUTH, label_FettWakeApp);
		sl_panelWeckerErstellen.putConstraint(SpringLayout.NORTH, label_Ankunftszeit, 19, SpringLayout.SOUTH,
				text_Name);
		sl_panelWeckerErstellen.putConstraint(SpringLayout.WEST, text_Name, 0, SpringLayout.WEST, label_Ankunftszeit);
		text_Name.setFont(new Font("Arial", Font.BOLD, 18));
		text_Name.setForeground(new Color(192, 192, 192));
		text_Name.setText("Wecker Name");
		panelWeckerErstellen.add(text_Name);
		text_Name.setColumns(10);

		JLabel lblFortbewegung = new JLabel("Fortbewegung");
		sl_panelWeckerErstellen.putConstraint(SpringLayout.WEST, lblFortbewegung, 0, SpringLayout.WEST,
				label_Ankunftszeit);
		sl_panelWeckerErstellen.putConstraint(SpringLayout.SOUTH, lblFortbewegung, -251, SpringLayout.SOUTH,
				panelWeckerErstellen);
		sl_panelWeckerErstellen.putConstraint(SpringLayout.NORTH, rdbtnopnv, 12, SpringLayout.SOUTH, lblFortbewegung);
		lblFortbewegung.setForeground(new Color(128, 128, 128));
		lblFortbewegung.setFont(new Font("Arial", Font.PLAIN, 14));
		panelWeckerErstellen.add(lblFortbewegung);
		// ButtnWecker hinzufügen
		// Soll bei betätigen den wecker in die CSV speichern
		btnWeckerHinzufgen = new JButton("Wecker hinzufügen");
		btnWeckerHinzufgen.setForeground(new Color(255, 255, 255));
		btnWeckerHinzufgen.setBackground(new Color(138, 43, 226));
		sl_panelWeckerErstellen.putConstraint(SpringLayout.NORTH, btnWeckerHinzufgen, 0, SpringLayout.NORTH,
				lblHilfeTextZeit);
		sl_panelWeckerErstellen.putConstraint(SpringLayout.EAST, btnWeckerHinzufgen, -10, SpringLayout.EAST,
				panelWeckerErstellen);
		btnWeckerHinzufgen.setFont(new Font("Arial", Font.PLAIN, 12));
		panelWeckerErstellen.add(btnWeckerHinzufgen);
		// Button für den Oberen Schriftzug da ein Label sich nicht entsprächent
		// Formatieren lässt
		JButton btnWeckapp = new JButton("WakeApp");
		sl_panelWeckerErstellen.putConstraint(SpringLayout.NORTH, label_FettWakeApp, 6, SpringLayout.SOUTH, btnWeckapp);
		btnWeckapp.setEnabled(false);
		sl_panelWeckerErstellen.putConstraint(SpringLayout.NORTH, btnWeckapp, 0, SpringLayout.NORTH,
				panelWeckerErstellen);
		sl_panelWeckerErstellen.putConstraint(SpringLayout.WEST, btnWeckapp, 0, SpringLayout.WEST,
				panelWeckerErstellen);
		sl_panelWeckerErstellen.putConstraint(SpringLayout.EAST, btnWeckapp, 2, SpringLayout.EAST,
				panelWeckerErstellen);
		btnWeckapp.setFont(new Font("Arial", Font.BOLD, 18));
		btnWeckapp.setBackground(new Color(138, 43, 226));
		btnWeckapp.setForeground(new Color(255, 255, 255));
		btnWeckapp.setHorizontalAlignment(SwingConstants.LEFT);
		panelWeckerErstellen.add(btnWeckapp);

		// Panel in den alle Gespeicherten Wecker aufgelistet werden
		JPanel panelWeckerUebersicht = new JPanel();

		panelWeckerUebersicht.setBackground(Color.WHITE);
		tabbedPane.addTab("Übersicht", new ImageIcon(Hauptansicht.class.getResource("/img/glocke.png")),
				panelWeckerUebersicht, null);
		SpringLayout sl_panelWeckerUebersicht = new SpringLayout();
		panelWeckerUebersicht.setLayout(sl_panelWeckerUebersicht);

		// Liste erzeugen um dynamisch die Buttons zu erzeugen
		ArrayList<Wecker> weckerListe = csv.weckerLaden();
		int j = 0;// Variable zum Label Anortnen
		for (Wecker i : weckerListe) {
			j++;
			String name = String.valueOf(i.getName());
			String weckstunde = "";
			// Weckzeit für den User normal speichern
			if (i.getWeckzeitStunden() < 10 && i.getWeckzeitStunden() >= 0) {
				weckstunde = String.format("%02d", i.getWeckzeitStunden());
			}
			String weckminute = "";
			if (i.getWeckzeitMinuten() < 10 && i.getWeckzeitMinuten() >= 0) {
				weckminute = String.format("%02d", i.getWeckzeitMinuten());
			}
			// Stringausgabe vorbereiten
			String uhrzeit = weckstunde + ":" + weckminute;
			String ausgabe = name + " Weckzeit: " + uhrzeit;
			// Label für die Wecker
			JLabel lblUebersichtwecker = new JLabel(ausgabe);

			Border border = BorderFactory.createLineBorder(Color.LIGHT_GRAY, 2);
			lblUebersichtwecker.setBorder(border);

			sl_panelWeckerUebersicht.putConstraint(SpringLayout.NORTH, lblUebersichtwecker, 10 + (j * 30),
					SpringLayout.NORTH, panelWeckerUebersicht);
			sl_panelWeckerUebersicht.putConstraint(SpringLayout.WEST, lblUebersichtwecker, 40, SpringLayout.WEST,
					panelWeckerUebersicht);
			sl_panelWeckerUebersicht.putConstraint(SpringLayout.EAST, lblUebersichtwecker, -40, SpringLayout.EAST,
					panelWeckerUebersicht);
			panelWeckerUebersicht.add(lblUebersichtwecker);

		}

		// Action Listener implementieren
		ActionListener aL = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				switch (e.getActionCommand()) {
				// Jedes anklickbare Element bekommt ein Action Command weiter unten.
				// Hier wird einfach per Switch Case durch-iteriert um die richtige
				// Aktion zu finden.
				case "berechnen": {
					berechnen();
					break;
				}
				case "wecker hinzufuegen": {
					// Aufruf der funktion zum speichern der Daten
					// Übergabe von CSV da in der neuen funktion die Variable sonst nicht exestiert
					speicherwecker(csv);
					break;
				}
				}
			}
		};

		tabbedPane.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				panelWeckerUebersicht.removeAll();
				panelWeckerUebersicht.updateUI();
				uebersichtErzeugen(sl_panelWeckerUebersicht, panelWeckerUebersicht);

			}
		});

		// Action Commands & Listener setzen.
		btn_Berechnen.setActionCommand("berechnen");
		btn_Berechnen.addActionListener(aL);
		btnWeckerHinzufgen.setActionCommand("wecker hinzufuegen");
		btnWeckerHinzufgen.addActionListener(aL);

	}

	// Ab hier die Methoden schreiben!

	/**
	 * Diese Methode soll die voraussichtliche Weckzeit berechnen und diese in das
	 * Label lblHilfeTextZeit schreiben.
	 */
	public void berechnen() {
		this.getCalculator().Rechnung();
	}

	public void uebersichtErzeugen(SpringLayout sl_panelWeckerUebersicht, JPanel panelWeckerUebersicht) {
		// Liste erzeugen um dynamisch die Buttons zu erzeugen
		ArrayList<Wecker> weckerListe = csv.weckerLaden();
		int j = 0;// Variable zum Label Anortnen
		for (Wecker i : weckerListe) {
			j++;
			String name = String.valueOf(i.getName());
			String weckstunde = "";
			String weckminute = "";
			// Weckzeit für den User normal speichern
			weckstunde = String.format("%02d", i.getWeckzeitStunden());
			weckminute = String.format("%02d", i.getWeckzeitMinuten());
			// Stringausgabe vorbereiten
			String uhrzeit = weckstunde + ":" + weckminute;
			String ausgabe = name + " Weckzeit: " + uhrzeit;
			// Label für die Wecker
			JLabel lblUebersichtwecker = new JLabel(ausgabe);

			Border border = BorderFactory.createLineBorder(Color.LIGHT_GRAY, 2);
			lblUebersichtwecker.setBorder(border);

			sl_panelWeckerUebersicht.putConstraint(SpringLayout.NORTH, lblUebersichtwecker, 10 + (j * 30),
					SpringLayout.NORTH, panelWeckerUebersicht);
			sl_panelWeckerUebersicht.putConstraint(SpringLayout.WEST, lblUebersichtwecker, 40, SpringLayout.WEST,
					panelWeckerUebersicht);
			sl_panelWeckerUebersicht.putConstraint(SpringLayout.EAST, lblUebersichtwecker, -40, SpringLayout.EAST,
					panelWeckerUebersicht);
			panelWeckerUebersicht.add(lblUebersichtwecker);
		}
	}

	/**
	 * Diese Funktion speichert einen Wecker in der CSV Datei.
	 * @param csv der CSVHandler.
	 */
	public void speicherwecker(CSVHandler csv) {
		// String Variable die in die CSV sollen
		String s_name = String.valueOf(this.getText_Name().getText());
		String s_zielort = String.valueOf(this.getTxtZielort().getText());
		String s_startort = String.valueOf(this.getTxtWohnort().getText());
		// Int Variablen die in die CSV sollen
		int arriveTimeHour = Integer.parseInt(this.getTxtAnkunftStunden().getText());
		int arriveTimeMinute = Integer.parseInt(this.getTxtAnkunftMinuten().getText());
		int preperationTimeHour = Integer.parseInt(this.getTxtFertigmachenStunden().getText());
		int preperationTimeMinute = Integer.parseInt(this.getTxtFertigmachenMinuten().getText());
		int travelTimeMinute = Integer.parseInt(this.getTxtFahrenMinuten().getText());
		int travelTimeHour = Integer.parseInt(this.getTxtFahrenStunden().getText());
		// Weckzeit
		// Aus einen String ein Integer vormen
		String s_zeit = String.valueOf(this.getLblHilfeTextZeit().getText());
		String split[] = s_zeit.split(":", 0);
		// Leerzeichen entfernen aus den String Array
		for (String string : split) {
			string.replaceAll("\\s+", "");
		}
		int alarmTimeHour = 0;
		int alarmTimeMinute = 0;
		int zahl = 0;
		for (String s : split) {
			if (zahl == 0) {
				alarmTimeHour = Integer.parseInt(s.replace(" ", ""));
			}
			if (zahl == 2) {
				alarmTimeMinute = Integer.parseInt(s.replace(" ", ""));
			}
			zahl++;
		}
		// Speichern
		csv.weckerSpeichern(new Wecker(s_name, arriveTimeHour, arriveTimeMinute, travelTimeHour, travelTimeMinute,
				preperationTimeHour, preperationTimeMinute, s_zielort, s_startort, alarmTimeHour, alarmTimeMinute));
	}

}
