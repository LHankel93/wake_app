package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JSplitPane;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JSeparator;
import javax.swing.JMenuBar;
import javax.swing.JToolBar;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.SpringLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class Hauptansicht extends JFrame {  

	private JPanel contentPane;
	private JTextField txt_ZeitInMinuten;
	private JTextField txt_Adresse;
	private JTextField txtAdresse;
	private JTextField txtStunden;
	private JTextField textMinutenUrzeit;
	private JTextField text_StundeUhrzeit;
	private JTextField text_StundenFahrzeit;
	private JTextField textField;
	private JTextField text_Name;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hauptansicht frame = new Hauptansicht();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Hauptansicht() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 442, 640);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane);
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.setBackground(new Color(255, 255, 255));
		tabbedPane.addTab("New tab", null, tabbedPane_1, null);
		
		JPanel Optionen = new JPanel();
		tabbedPane_1.addTab("New tab", null, Optionen, null);
		
		JButton button_Neu = new JButton("New button");
		button_Neu.setForeground(new Color(255, 255, 255));
		button_Neu.setFont(new Font("Arial", Font.PLAIN, 12));
		button_Neu.setBackground(new Color(148, 0, 211));
		
		JButton button_alt = new JButton("New button");
		button_alt.setFont(new Font("Arial", Font.PLAIN, 12));
		button_alt.setForeground(new Color(255, 255, 255));
		button_alt.setBackground(new Color(148, 0, 211));
		GroupLayout gl_Optionen = new GroupLayout(Optionen);
		gl_Optionen.setHorizontalGroup(
			gl_Optionen.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Optionen.createSequentialGroup()
					.addGap(150)
					.addGroup(gl_Optionen.createParallelGroup(Alignment.LEADING)
						.addComponent(button_alt)
						.addComponent(button_Neu))
					.addContainerGap(173, Short.MAX_VALUE))
		);
		gl_Optionen.setVerticalGroup(
			gl_Optionen.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Optionen.createSequentialGroup()
					.addGap(183)
					.addComponent(button_Neu)
					.addGap(81)
					.addComponent(button_alt)
					.addContainerGap(233, Short.MAX_VALUE))
		);
		Optionen.setLayout(gl_Optionen);
		
		JPanel Angaben = new JPanel();
		Angaben.setBackground(new Color(255, 255, 255));
		tabbedPane_1.addTab("New tab", null, Angaben, null);
		SpringLayout sl_Angaben = new SpringLayout();
		Angaben.setLayout(sl_Angaben);
		
		JButton button_Berechnen = new JButton("Berechnen");
		button_Berechnen.setForeground(new Color(255, 255, 255));
		sl_Angaben.putConstraint(SpringLayout.WEST, button_Berechnen, 6, SpringLayout.WEST, Angaben);
		sl_Angaben.putConstraint(SpringLayout.EAST, button_Berechnen, -5, SpringLayout.EAST, Angaben);
		button_Berechnen.setFont(new Font("Arial", Font.PLAIN, 12));
		button_Berechnen.setBackground(new Color(138, 43, 226));
		button_Berechnen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Angaben.add(button_Berechnen);
		
		JLabel label_FetWakeApp = new JLabel("WakeApp");
		label_FetWakeApp.setFont(new Font("Arial", Font.BOLD, 20));
		Angaben.add(label_FetWakeApp);
		
		JLabel label_Ankunftszeit = new JLabel("Ankunftszeit:");
		label_Ankunftszeit.setFont(new Font("Arial", Font.PLAIN, 12));
		sl_Angaben.putConstraint(SpringLayout.WEST, label_Ankunftszeit, 10, SpringLayout.WEST, Angaben);
		Angaben.add(label_Ankunftszeit);
		
		JLabel label_Fertigmachzeit = new JLabel("Benötigte Zeit zum Fertigmachen");
		label_Fertigmachzeit.setFont(new Font("Arial", Font.PLAIN, 12));
		sl_Angaben.putConstraint(SpringLayout.NORTH, label_Fertigmachzeit, 32, SpringLayout.SOUTH, label_Ankunftszeit);
		sl_Angaben.putConstraint(SpringLayout.WEST, label_Fertigmachzeit, 10, SpringLayout.WEST, Angaben);
		Angaben.add(label_Fertigmachzeit);
		
		JLabel label_Wohnort = new JLabel("Wohnort:");
		sl_Angaben.putConstraint(SpringLayout.WEST, label_Wohnort, 0, SpringLayout.WEST, button_Berechnen);
		label_Wohnort.setFont(new Font("Arial", Font.PLAIN, 12));
		Angaben.add(label_Wohnort);
		
		JLabel label_Zielort = new JLabel("Zielort:");
		sl_Angaben.putConstraint(SpringLayout.NORTH, label_Zielort, 278, SpringLayout.NORTH, Angaben);
		sl_Angaben.putConstraint(SpringLayout.WEST, label_Zielort, 10, SpringLayout.WEST, Angaben);
		label_Zielort.setFont(new Font("Arial", Font.PLAIN, 12));
		Angaben.add(label_Zielort);
		
		txt_ZeitInMinuten = new JTextField();
		sl_Angaben.putConstraint(SpringLayout.NORTH, txt_ZeitInMinuten, -3, SpringLayout.NORTH, label_Fertigmachzeit);
		sl_Angaben.putConstraint(SpringLayout.EAST, txt_ZeitInMinuten, -22, SpringLayout.EAST, Angaben);
		txt_ZeitInMinuten.setFont(new Font("Arial", Font.PLAIN, 12));
		txt_ZeitInMinuten.setForeground(new Color(192, 192, 192));
		txt_ZeitInMinuten.setText("Minuten");
		Angaben.add(txt_ZeitInMinuten);
		txt_ZeitInMinuten.setColumns(10);
		
		txt_Adresse = new JTextField();
		sl_Angaben.putConstraint(SpringLayout.NORTH, label_Wohnort, 3, SpringLayout.NORTH, txt_Adresse);
		txt_Adresse.setFont(new Font("Arial", Font.PLAIN, 12));
		txt_Adresse.setForeground(new Color(192, 192, 192));
		txt_Adresse.setText("Adresse");
		Angaben.add(txt_Adresse);
		txt_Adresse.setColumns(10);
		
		txtAdresse = new JTextField();
		sl_Angaben.putConstraint(SpringLayout.SOUTH, txt_Adresse, -10, SpringLayout.NORTH, txtAdresse);
		sl_Angaben.putConstraint(SpringLayout.EAST, txtAdresse, -40, SpringLayout.EAST, Angaben);
		sl_Angaben.putConstraint(SpringLayout.EAST, txt_Adresse, 0, SpringLayout.EAST, txtAdresse);
		sl_Angaben.putConstraint(SpringLayout.NORTH, txtAdresse, -3, SpringLayout.NORTH, label_Zielort);
		txtAdresse.setForeground(new Color(192, 192, 192));
		txtAdresse.setFont(new Font("Arial", Font.PLAIN, 12));
		txtAdresse.setText("Adresse");
		Angaben.add(txtAdresse);
		txtAdresse.setColumns(10);
		
		JLabel label_zwischen = new JLabel(":");
		sl_Angaben.putConstraint(SpringLayout.WEST, txt_ZeitInMinuten, 6, SpringLayout.EAST, label_zwischen);
		sl_Angaben.putConstraint(SpringLayout.WEST, label_zwischen, 140, SpringLayout.EAST, label_Fertigmachzeit);
		label_zwischen.setFont(new Font("Arial", Font.PLAIN, 12));
		label_zwischen.setForeground(new Color(0, 0, 0));
		sl_Angaben.putConstraint(SpringLayout.SOUTH, label_zwischen, 0, SpringLayout.SOUTH, label_Fertigmachzeit);
		Angaben.add(label_zwischen);
		
		txtStunden = new JTextField();
		sl_Angaben.putConstraint(SpringLayout.NORTH, txtStunden, -3, SpringLayout.NORTH, label_Fertigmachzeit);
		sl_Angaben.putConstraint(SpringLayout.WEST, txtStunden, -61, SpringLayout.WEST, label_zwischen);
		sl_Angaben.putConstraint(SpringLayout.EAST, txtStunden, -6, SpringLayout.WEST, label_zwischen);
		txtStunden.setFont(new Font("Arial", Font.PLAIN, 12));
		txtStunden.setForeground(new Color(192, 192, 192));
		txtStunden.setText("Stunden");
		Angaben.add(txtStunden);
		txtStunden.setColumns(10);
		
		JRadioButton rdbtnpnv = new JRadioButton("ÖPNV");
		sl_Angaben.putConstraint(SpringLayout.NORTH, rdbtnpnv, 42, SpringLayout.SOUTH, label_Zielort);
		sl_Angaben.putConstraint(SpringLayout.WEST, rdbtnpnv, 0, SpringLayout.WEST, label_Ankunftszeit);
		rdbtnpnv.setFont(new Font("Arial", Font.PLAIN, 12));
		Angaben.add(rdbtnpnv);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Auto");
		sl_Angaben.putConstraint(SpringLayout.EAST, label_FetWakeApp, 0, SpringLayout.EAST, rdbtnNewRadioButton);
		sl_Angaben.putConstraint(SpringLayout.WEST, rdbtnNewRadioButton, 128, SpringLayout.EAST, rdbtnpnv);
		sl_Angaben.putConstraint(SpringLayout.NORTH, button_Berechnen, 6, SpringLayout.SOUTH, rdbtnNewRadioButton);
		sl_Angaben.putConstraint(SpringLayout.NORTH, rdbtnNewRadioButton, 0, SpringLayout.NORTH, rdbtnpnv);
		rdbtnNewRadioButton.setFont(new Font("Arial", Font.PLAIN, 12));
		rdbtnNewRadioButton.setForeground(new Color(0, 0, 0));
		Angaben.add(rdbtnNewRadioButton);
		
		JLabel label_Ergebniss = new JLabel("Ergebniss");
		sl_Angaben.putConstraint(SpringLayout.NORTH, label_Ergebniss, 46, SpringLayout.SOUTH, rdbtnpnv);
		sl_Angaben.putConstraint(SpringLayout.WEST, label_Ergebniss, 0, SpringLayout.WEST, label_Ankunftszeit);
		label_Ergebniss.setForeground(new Color(128, 128, 128));
		label_Ergebniss.setFont(new Font("Arial", Font.BOLD, 14));
		Angaben.add(label_Ergebniss);
		
		JLabel lblNewLabel = new JLabel("Sie sollten Ihren Wecker auf die folgende Zeit stellen:");
		lblNewLabel.setForeground(new Color(128, 128, 128));
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		sl_Angaben.putConstraint(SpringLayout.NORTH, lblNewLabel, 6, SpringLayout.SOUTH, label_Ergebniss);
		sl_Angaben.putConstraint(SpringLayout.WEST, lblNewLabel, 0, SpringLayout.WEST, label_Ankunftszeit);
		Angaben.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Zeit");
		sl_Angaben.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 35, SpringLayout.SOUTH, lblNewLabel);
		sl_Angaben.putConstraint(SpringLayout.WEST, lblNewLabel_1, 51, SpringLayout.WEST, Angaben);
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 24));
		lblNewLabel_1.setForeground(new Color(128, 128, 128));
		Angaben.add(lblNewLabel_1);
		
		JLabel label_zwischen_1 = new JLabel(":");
		sl_Angaben.putConstraint(SpringLayout.WEST, label_zwischen_1, 0, SpringLayout.WEST, label_zwischen);
		sl_Angaben.putConstraint(SpringLayout.SOUTH, label_zwischen_1, 0, SpringLayout.SOUTH, label_Ankunftszeit);
		label_zwischen_1.setForeground(Color.BLACK);
		label_zwischen_1.setFont(new Font("Arial", Font.PLAIN, 12));
		Angaben.add(label_zwischen_1);
		
		textMinutenUrzeit = new JTextField();
		sl_Angaben.putConstraint(SpringLayout.NORTH, textMinutenUrzeit, -3, SpringLayout.NORTH, label_Ankunftszeit);
		sl_Angaben.putConstraint(SpringLayout.WEST, textMinutenUrzeit, 6, SpringLayout.EAST, label_zwischen_1);
		sl_Angaben.putConstraint(SpringLayout.EAST, textMinutenUrzeit, -24, SpringLayout.EAST, Angaben);
		textMinutenUrzeit.setText("Minuten");
		textMinutenUrzeit.setForeground(Color.LIGHT_GRAY);
		textMinutenUrzeit.setFont(new Font("Arial", Font.PLAIN, 12));
		textMinutenUrzeit.setColumns(10);
		Angaben.add(textMinutenUrzeit);
		
		text_StundeUhrzeit = new JTextField();
		sl_Angaben.putConstraint(SpringLayout.NORTH, text_StundeUhrzeit, -3, SpringLayout.NORTH, label_Ankunftszeit);
		sl_Angaben.putConstraint(SpringLayout.WEST, text_StundeUhrzeit, 0, SpringLayout.WEST, txtStunden);
		sl_Angaben.putConstraint(SpringLayout.EAST, text_StundeUhrzeit, 0, SpringLayout.EAST, txtStunden);
		text_StundeUhrzeit.setText("Stunden");
		text_StundeUhrzeit.setForeground(Color.LIGHT_GRAY);
		text_StundeUhrzeit.setFont(new Font("Arial", Font.PLAIN, 12));
		text_StundeUhrzeit.setColumns(10);
		Angaben.add(text_StundeUhrzeit);
		
		JLabel lblNewLabel_2 = new JLabel("Fahrzeit:");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 12));
		sl_Angaben.putConstraint(SpringLayout.NORTH, lblNewLabel_2, 25, SpringLayout.SOUTH, label_Fertigmachzeit);
		sl_Angaben.putConstraint(SpringLayout.WEST, lblNewLabel_2, 0, SpringLayout.WEST, label_Ankunftszeit);
		Angaben.add(lblNewLabel_2);
		
		text_StundenFahrzeit = new JTextField();
		sl_Angaben.putConstraint(SpringLayout.NORTH, text_StundenFahrzeit, 0, SpringLayout.NORTH, lblNewLabel_2);
		sl_Angaben.putConstraint(SpringLayout.WEST, text_StundenFahrzeit, 0, SpringLayout.WEST, txtStunden);
		sl_Angaben.putConstraint(SpringLayout.EAST, text_StundenFahrzeit, -93, SpringLayout.EAST, Angaben);
		text_StundenFahrzeit.setText("Stunden");
		text_StundenFahrzeit.setForeground(Color.LIGHT_GRAY);
		text_StundenFahrzeit.setFont(new Font("Arial", Font.PLAIN, 12));
		text_StundenFahrzeit.setColumns(10);
		Angaben.add(text_StundenFahrzeit);
		
		textField = new JTextField();
		sl_Angaben.putConstraint(SpringLayout.NORTH, textField, 0, SpringLayout.NORTH, lblNewLabel_2);
		sl_Angaben.putConstraint(SpringLayout.WEST, textField, 0, SpringLayout.WEST, txt_ZeitInMinuten);
		sl_Angaben.putConstraint(SpringLayout.EAST, textField, -23, SpringLayout.EAST, Angaben);
		textField.setText("Minuten");
		textField.setForeground(Color.LIGHT_GRAY);
		textField.setFont(new Font("Arial", Font.PLAIN, 12));
		textField.setColumns(10);
		Angaben.add(textField);
		
		JLabel label_zwischen_2 = new JLabel(":");
		sl_Angaben.putConstraint(SpringLayout.NORTH, label_zwischen_2, 0, SpringLayout.NORTH, lblNewLabel_2);
		sl_Angaben.putConstraint(SpringLayout.WEST, label_zwischen_2, 0, SpringLayout.WEST, label_zwischen);
		label_zwischen_2.setForeground(Color.BLACK);
		label_zwischen_2.setFont(new Font("Arial", Font.PLAIN, 12));
		Angaben.add(label_zwischen_2);
		
		text_Name = new JTextField();
		sl_Angaben.putConstraint(SpringLayout.NORTH, text_Name, 14, SpringLayout.SOUTH, label_FetWakeApp);
		sl_Angaben.putConstraint(SpringLayout.NORTH, label_Ankunftszeit, 19, SpringLayout.SOUTH, text_Name);
		sl_Angaben.putConstraint(SpringLayout.WEST, text_Name, 0, SpringLayout.WEST, label_Ankunftszeit);
		text_Name.setFont(new Font("Arial", Font.BOLD, 18));
		text_Name.setForeground(new Color(192, 192, 192));
		text_Name.setText("Wecker Name");
		Angaben.add(text_Name);
		text_Name.setColumns(10);
		
		JLabel label_Vortbewegung = new JLabel("Vortbewegung");
		sl_Angaben.putConstraint(SpringLayout.WEST, label_Vortbewegung, 9, SpringLayout.WEST, Angaben);
		label_Vortbewegung.setForeground(new Color(128, 128, 128));
		label_Vortbewegung.setFont(new Font("Arial", Font.PLAIN, 14));
		sl_Angaben.putConstraint(SpringLayout.SOUTH, label_Vortbewegung, -12, SpringLayout.NORTH, rdbtnpnv);
		Angaben.add(label_Vortbewegung);
		
		JButton btnWeckerHinzufgen = new JButton("Wecker hinzufügen");
		btnWeckerHinzufgen.setForeground(new Color(255, 255, 255));
		btnWeckerHinzufgen.setBackground(new Color(138, 43, 226));
		sl_Angaben.putConstraint(SpringLayout.NORTH, btnWeckerHinzufgen, 0, SpringLayout.NORTH, lblNewLabel_1);
		sl_Angaben.putConstraint(SpringLayout.EAST, btnWeckerHinzufgen, -10, SpringLayout.EAST, Angaben);
		btnWeckerHinzufgen.setFont(new Font("Arial", Font.PLAIN, 12));
		Angaben.add(btnWeckerHinzufgen);
		
		JButton btnWeckapp = new JButton("WakeApp");
		sl_Angaben.putConstraint(SpringLayout.NORTH, label_FetWakeApp, 6, SpringLayout.SOUTH, btnWeckapp);
		btnWeckapp.setEnabled(false);
		sl_Angaben.putConstraint(SpringLayout.NORTH, btnWeckapp, 0, SpringLayout.NORTH, Angaben);
		sl_Angaben.putConstraint(SpringLayout.WEST, btnWeckapp, 0, SpringLayout.WEST, Angaben);
		sl_Angaben.putConstraint(SpringLayout.EAST, btnWeckapp, 2, SpringLayout.EAST, Angaben);
		btnWeckapp.setFont(new Font("Arial", Font.BOLD, 18));
		btnWeckapp.setBackground(new Color(138, 43, 226));
		btnWeckapp.setForeground(new Color(255, 255, 255));
		btnWeckapp.setHorizontalAlignment(SwingConstants.LEFT);
		Angaben.add(btnWeckapp);
		
		JPanel Wacker = new JPanel();
		tabbedPane_1.addTab("New tab", null, Wacker, null);
		
		JLabel lblNewLabel_3 = new JLabel("Deine Wacker");
		lblNewLabel_3.setBackground(new Color(148, 0, 211));
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 14));
		GroupLayout gl_Wacker = new GroupLayout(Wacker);
		gl_Wacker.setHorizontalGroup(
			gl_Wacker.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Wacker.createSequentialGroup()
					.addGap(22)
					.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(273, Short.MAX_VALUE))
		);
		gl_Wacker.setVerticalGroup(
			gl_Wacker.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Wacker.createSequentialGroup()
					.addGap(34)
					.addComponent(lblNewLabel_3)
					.addContainerGap(488, Short.MAX_VALUE))
		);
		Wacker.setLayout(gl_Wacker);
	}
}
