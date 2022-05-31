package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
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
	private JLabel lblHilfeTextZeit;
	public Calculator calculator;
	private JButton btnWeckerHinzufgen;

	/**
	 * Erstellt den Frame für die WakeApp.
	 */
	public Hauptansicht() {
		// Wecker Rechner initialisieren und deklarieren.
		calculator = new Calculator();
		setIconImage(Toolkit.getDefaultToolkit().getImage(Hauptansicht.class.getResource("/img/app_icon.png")));
		setTitle("Wake App");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 442, 640);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
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
		label_Ankunftszeit.setFont(new Font("Arial", Font.PLAIN, 12));
		sl_panelWeckerErstellen.putConstraint(SpringLayout.WEST, label_Ankunftszeit, 10, SpringLayout.WEST,
				panelWeckerErstellen);
		panelWeckerErstellen.add(label_Ankunftszeit);

		JLabel label_Fertigmachzeit = new JLabel("Benötigte Zeit zum Fertigmachen");
		label_Fertigmachzeit.setFont(new Font("Arial", Font.PLAIN, 12));
		sl_panelWeckerErstellen.putConstraint(SpringLayout.NORTH, label_Fertigmachzeit, 32, SpringLayout.SOUTH,
				label_Ankunftszeit);
		sl_panelWeckerErstellen.putConstraint(SpringLayout.WEST, label_Fertigmachzeit, 10, SpringLayout.WEST,
				panelWeckerErstellen);
		panelWeckerErstellen.add(label_Fertigmachzeit);

		JLabel label_Wohnort = new JLabel("Wohnort:");
		sl_panelWeckerErstellen.putConstraint(SpringLayout.WEST, label_Wohnort, 0, SpringLayout.WEST, btn_Berechnen);
		label_Wohnort.setFont(new Font("Arial", Font.PLAIN, 12));
		panelWeckerErstellen.add(label_Wohnort);

		JLabel label_Zielort = new JLabel("Zielort:");
		sl_panelWeckerErstellen.putConstraint(SpringLayout.NORTH, label_Zielort, 278, SpringLayout.NORTH,
				panelWeckerErstellen);
		sl_panelWeckerErstellen.putConstraint(SpringLayout.WEST, label_Zielort, 10, SpringLayout.WEST,
				panelWeckerErstellen);
		label_Zielort.setFont(new Font("Arial", Font.PLAIN, 12));
		panelWeckerErstellen.add(label_Zielort);

		txtFertigmachenMinuten = new JTextField();
		sl_panelWeckerErstellen.putConstraint(SpringLayout.NORTH, txtFertigmachenMinuten, -3, SpringLayout.NORTH,
				label_Fertigmachzeit);
		sl_panelWeckerErstellen.putConstraint(SpringLayout.EAST, txtFertigmachenMinuten, -22, SpringLayout.EAST,
				panelWeckerErstellen);
		txtFertigmachenMinuten.setFont(new Font("Arial", Font.PLAIN, 12));
		txtFertigmachenMinuten.setForeground(new Color(192, 192, 192));
		txtFertigmachenMinuten.setText("Minuten");
		panelWeckerErstellen.add(txtFertigmachenMinuten);
		txtFertigmachenMinuten.setColumns(10);

		txtWohnort = new JTextField();
		sl_panelWeckerErstellen.putConstraint(SpringLayout.NORTH, label_Wohnort, 3, SpringLayout.NORTH, txtWohnort);
		txtWohnort.setFont(new Font("Arial", Font.PLAIN, 12));
		txtWohnort.setForeground(new Color(192, 192, 192));
		txtWohnort.setText("Adresse");
		panelWeckerErstellen.add(txtWohnort);
		txtWohnort.setColumns(10);

		txtZielort = new JTextField();
		sl_panelWeckerErstellen.putConstraint(SpringLayout.SOUTH, txtWohnort, -10, SpringLayout.NORTH, txtZielort);
		sl_panelWeckerErstellen.putConstraint(SpringLayout.EAST, txtZielort, -40, SpringLayout.EAST,
				panelWeckerErstellen);
		sl_panelWeckerErstellen.putConstraint(SpringLayout.EAST, txtWohnort, 0, SpringLayout.EAST, txtZielort);
		sl_panelWeckerErstellen.putConstraint(SpringLayout.NORTH, txtZielort, -3, SpringLayout.NORTH, label_Zielort);
		txtZielort.setForeground(new Color(192, 192, 192));
		txtZielort.setFont(new Font("Arial", Font.PLAIN, 12));
		txtZielort.setText("Adresse");
		panelWeckerErstellen.add(txtZielort);
		txtZielort.setColumns(10);

		JLabel label_zwischen = new JLabel(":");
		sl_panelWeckerErstellen.putConstraint(SpringLayout.WEST, txtFertigmachenMinuten, 6, SpringLayout.EAST,
				label_zwischen);
		sl_panelWeckerErstellen.putConstraint(SpringLayout.WEST, label_zwischen, 140, SpringLayout.EAST,
				label_Fertigmachzeit);
		label_zwischen.setFont(new Font("Arial", Font.PLAIN, 12));
		label_zwischen.setForeground(new Color(0, 0, 0));
		sl_panelWeckerErstellen.putConstraint(SpringLayout.SOUTH, label_zwischen, 0, SpringLayout.SOUTH,
				label_Fertigmachzeit);
		panelWeckerErstellen.add(label_zwischen);

		txtFertigmachenStunden = new JTextField();
		sl_panelWeckerErstellen.putConstraint(SpringLayout.NORTH, txtFertigmachenStunden, -3, SpringLayout.NORTH,
				label_Fertigmachzeit);
		sl_panelWeckerErstellen.putConstraint(SpringLayout.WEST, txtFertigmachenStunden, -61, SpringLayout.WEST,
				label_zwischen);
		sl_panelWeckerErstellen.putConstraint(SpringLayout.EAST, txtFertigmachenStunden, -6, SpringLayout.WEST,
				label_zwischen);
		txtFertigmachenStunden.setFont(new Font("Arial", Font.PLAIN, 12));
		txtFertigmachenStunden.setForeground(new Color(192, 192, 192));
		txtFertigmachenStunden.setText("Stunden");
		panelWeckerErstellen.add(txtFertigmachenStunden);
		txtFertigmachenStunden.setColumns(10);
		//RadioButtons zu Wahl zwischen ÖPNV und Auto
		JRadioButton rdbtnopnv = new JRadioButton("ÖPNV");
		sl_panelWeckerErstellen.putConstraint(SpringLayout.NORTH, rdbtnopnv, 42, SpringLayout.SOUTH, label_Zielort);
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
		sl_panelWeckerErstellen.putConstraint(SpringLayout.NORTH, txtAnkunftMinuten, -3, SpringLayout.NORTH,
				label_Ankunftszeit);
		sl_panelWeckerErstellen.putConstraint(SpringLayout.WEST, txtAnkunftMinuten, 6, SpringLayout.EAST,
				label_zwischen_1);
		sl_panelWeckerErstellen.putConstraint(SpringLayout.EAST, txtAnkunftMinuten, -24, SpringLayout.EAST,
				panelWeckerErstellen);
		txtAnkunftMinuten.setText("Minuten");
		txtAnkunftMinuten.setForeground(Color.LIGHT_GRAY);
		txtAnkunftMinuten.setFont(new Font("Arial", Font.PLAIN, 12));
		txtAnkunftMinuten.setColumns(10);
		panelWeckerErstellen.add(txtAnkunftMinuten);

		txtAnkunftStunden = new JTextField();
		sl_panelWeckerErstellen.putConstraint(SpringLayout.NORTH, txtAnkunftStunden, -3, SpringLayout.NORTH,
				label_Ankunftszeit);
		sl_panelWeckerErstellen.putConstraint(SpringLayout.WEST, txtAnkunftStunden, 0, SpringLayout.WEST,
				txtFertigmachenStunden);
		sl_panelWeckerErstellen.putConstraint(SpringLayout.EAST, txtAnkunftStunden, 0, SpringLayout.EAST,
				txtFertigmachenStunden);
		txtAnkunftStunden.setText("Stunden");
		txtAnkunftStunden.setForeground(Color.LIGHT_GRAY);
		txtAnkunftStunden.setFont(new Font("Arial", Font.PLAIN, 12));
		txtAnkunftStunden.setColumns(10);
		panelWeckerErstellen.add(txtAnkunftStunden);

		JLabel lblNewLabel_2 = new JLabel("Fahrzeit:");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 12));
		sl_panelWeckerErstellen.putConstraint(SpringLayout.NORTH, lblNewLabel_2, 25, SpringLayout.SOUTH,
				label_Fertigmachzeit);
		sl_panelWeckerErstellen.putConstraint(SpringLayout.WEST, lblNewLabel_2, 0, SpringLayout.WEST,
				label_Ankunftszeit);
		panelWeckerErstellen.add(lblNewLabel_2);

		txtFahrenStunden = new JTextField();
		sl_panelWeckerErstellen.putConstraint(SpringLayout.NORTH, txtFahrenStunden, 0, SpringLayout.NORTH,
				lblNewLabel_2);
		sl_panelWeckerErstellen.putConstraint(SpringLayout.WEST, txtFahrenStunden, 0, SpringLayout.WEST,
				txtFertigmachenStunden);
		sl_panelWeckerErstellen.putConstraint(SpringLayout.EAST, txtFahrenStunden, -93, SpringLayout.EAST,
				panelWeckerErstellen);
		txtFahrenStunden.setText("Stunden");
		txtFahrenStunden.setForeground(Color.LIGHT_GRAY);
		txtFahrenStunden.setFont(new Font("Arial", Font.PLAIN, 12));
		txtFahrenStunden.setColumns(10);
		panelWeckerErstellen.add(txtFahrenStunden);

		txtFahrenMinuten = new JTextField();
		sl_panelWeckerErstellen.putConstraint(SpringLayout.NORTH, txtFahrenMinuten, 0, SpringLayout.NORTH,
				lblNewLabel_2);
		sl_panelWeckerErstellen.putConstraint(SpringLayout.WEST, txtFahrenMinuten, 0, SpringLayout.WEST,
				txtFertigmachenMinuten);
		sl_panelWeckerErstellen.putConstraint(SpringLayout.EAST, txtFahrenMinuten, -23, SpringLayout.EAST,
				panelWeckerErstellen);
		txtFahrenMinuten.setText("Minuten");
		txtFahrenMinuten.setForeground(Color.LIGHT_GRAY);
		txtFahrenMinuten.setFont(new Font("Arial", Font.PLAIN, 12));
		txtFahrenMinuten.setColumns(10);
		panelWeckerErstellen.add(txtFahrenMinuten);

		JLabel label_zwischen_2 = new JLabel(":");
		sl_panelWeckerErstellen.putConstraint(SpringLayout.NORTH, label_zwischen_2, 0, SpringLayout.NORTH,
				lblNewLabel_2);
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
		sl_panelWeckerErstellen.putConstraint(SpringLayout.WEST, lblFortbewegung, 9, SpringLayout.WEST,
				panelWeckerErstellen);
		lblFortbewegung.setForeground(new Color(128, 128, 128));
		lblFortbewegung.setFont(new Font("Arial", Font.PLAIN, 14));
		sl_panelWeckerErstellen.putConstraint(SpringLayout.SOUTH, lblFortbewegung, -12, SpringLayout.NORTH, rdbtnopnv);
		panelWeckerErstellen.add(lblFortbewegung);
		//ButtnWecker hinzufügen
		//Soll bei betätigen den wecker in die CSV speichern
		btnWeckerHinzufgen = new JButton("Wecker hinzufügen");
		btnWeckerHinzufgen.setForeground(new Color(255, 255, 255));
		btnWeckerHinzufgen.setBackground(new Color(138, 43, 226));
		sl_panelWeckerErstellen.putConstraint(SpringLayout.NORTH, btnWeckerHinzufgen, 0, SpringLayout.NORTH,
				lblHilfeTextZeit);
		sl_panelWeckerErstellen.putConstraint(SpringLayout.EAST, btnWeckerHinzufgen, -10, SpringLayout.EAST,
				panelWeckerErstellen);
		btnWeckerHinzufgen.setFont(new Font("Arial", Font.PLAIN, 12));
		panelWeckerErstellen.add(btnWeckerHinzufgen);
		//Button für den Oberen Schriftzug da ein Label sich ncht entsprächent Formatieren lässt
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
		
		//Panel in den alle Gespeicherten Wecker aufgelistet werden
		JPanel panelWeckerUebersicht = new JPanel();
		panelWeckerUebersicht.setBackground(Color.WHITE);
		tabbedPane.addTab("Übersicht", new ImageIcon(Hauptansicht.class.getResource("/img/glocke.png")),
				panelWeckerUebersicht, null);
		SpringLayout sl_panelWeckerUebersicht = new SpringLayout();
		panelWeckerUebersicht.setLayout(sl_panelWeckerUebersicht);
		
		
		//Liste erzeugen um dynamisch die Buttons zu erzeugen
		//ArrayList<Wecker> weckerListe = CSVHandler.weckerLaden();
		ArrayList<Integer> testListe = new ArrayList<Integer>();
		testListe.add(1);
		testListe.add(2);
		testListe.add(3);
		for(int i = 0; i < testListe.size(); i++) {
		String s = String.valueOf(testListe.get(i)); 
			JButton btnTest = new JButton(s);
			sl_panelWeckerUebersicht.putConstraint(SpringLayout.NORTH, btnTest, 10+(i*30), SpringLayout.NORTH, panelWeckerUebersicht);
			sl_panelWeckerUebersicht.putConstraint(SpringLayout.WEST, btnTest, 140, SpringLayout.WEST, panelWeckerUebersicht);
			panelWeckerUebersicht.add(btnTest);	
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
				}
			}
		};

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
		// TODO Hier die Methode von Gökmen zur Weckzeitberechnung aufrufen.
		lblHilfeTextZeit.setText("UwU"); // so wird das Label gefüllt
		// TODO Der Quellcode muss hier noch angepasst werden, damit die
		// lblHilfeTextZeit.setText(calculator.TimerCalculator(FRAMEBITS, ERROR,
		// ALLBITS, ABORT);
		// Wenn Zeit korrekt berechnet, dann den Button für Hinzufügen freigeben.
		// (btnWeckerHinzufgen)

	}

	public JPanel getContentPane() {
		return contentPane;
	}

	public void setContentPane(JPanel contentPane) {
		this.contentPane = contentPane;
	}

	public JTextField getTxtFertigmachenMinuten() {
		return txtFertigmachenMinuten;
	}

	public void setTxtFertigmachenMinuten(JTextField txtFertigmachenMinuten) {
		this.txtFertigmachenMinuten = txtFertigmachenMinuten;
	}

	public JTextField getTxtWohnort() {
		return txtWohnort;
	}

	public void setTxtWohnort(JTextField txtWohnort) {
		this.txtWohnort = txtWohnort;
	}

	public JTextField getTxtZielort() {
		return txtZielort;
	}

	public void setTxtZielort(JTextField txtZielort) {
		this.txtZielort = txtZielort;
	}

	public JTextField getTxtFertigmachenStunden() {
		return txtFertigmachenStunden;
	}

	public void setTxtFertigmachenStunden(JTextField txtFertigmachenStunden) {
		this.txtFertigmachenStunden = txtFertigmachenStunden;
	}

	public JTextField getTxtAnkunftMinuten() {
		return txtAnkunftMinuten;
	}

	public void setTxtAnkunftMinuten(JTextField txtAnkunftMinuten) {
		this.txtAnkunftMinuten = txtAnkunftMinuten;
	}

	public JTextField getTxtAnkunftStunden() {
		return txtAnkunftStunden;
	}

	public void setTxtAnkunftStunden(JTextField txtAnkunftStunden) {
		this.txtAnkunftStunden = txtAnkunftStunden;
	}

	public JTextField getTxtFahrenStunden() {
		return txtFahrenStunden;
	}

	public void setTxtFahrenStunden(JTextField txtFahrenStunden) {
		this.txtFahrenStunden = txtFahrenStunden;
	}

	public JTextField getTxtFahrenMinuten() {
		return txtFahrenMinuten;
	}

	public void setTxtFahrenMinuten(JTextField txtFahrenMinuten) {
		this.txtFahrenMinuten = txtFahrenMinuten;
	}

	public JTextField getText_Name() {
		return text_Name;
	}

	public void setText_Name(JTextField text_Name) {
		this.text_Name = text_Name;
	}

	public JLabel getLblHilfeTextZeit() {
		return lblHilfeTextZeit;
	}

	public void setLblHilfeTextZeit(JLabel lblHilfeTextZeit) {
		this.lblHilfeTextZeit = lblHilfeTextZeit;
	}

	public JButton getBtnWeckerHinzufgen() {
		return btnWeckerHinzufgen;
	}

	public void setBtnWeckerHinzufgen(JButton btnWeckerHinzufgen) {
		this.btnWeckerHinzufgen = btnWeckerHinzufgen;
	}

}
