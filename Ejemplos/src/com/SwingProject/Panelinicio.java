package com.SwingProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLayeredPane;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import java.awt.Checkbox;
import javax.swing.JList;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Panelinicio {

	public Panelinicio Panelinicio; 
	public JFrame frame;
	private JTextField textField;
	private JTabbedPane tabbedPane ;
	JPanel panel_1 ;
	JComboBox comboBox;
	JButton btnNewButton_1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Panelinicio window = new Panelinicio();
					window.frame.setVisible(true);
					window.frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Panelinicio() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frame.setBounds(370, 106, 1105, 831);
		frame.setLocationRelativeTo(null);// Se ejecuta siempre centrado
		frame.setResizable(false);   //no permite modificar el tamaño de la aplicacion
		frame.setTitle("Aplicaion buscar logs");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.dispose();
		frame.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		initComponents();
		
		

	}
	
	public void initComponents() {
		
		jpconex ();
		jpBusqueda ();
	
	}
	
	public void jpconex () {
		
		panel_1 = new JPanel();
		
		panel_1.setLayout(null);
		
		comboBox = new JComboBox();
		comboBox.setBounds(370, 106, 28, 20);
		panel_1.add(comboBox);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
		rdbtnNewRadioButton.setBounds(130, 144, 109, 23);
		panel_1.add(rdbtnNewRadioButton);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(561, 91, 106, 20);
		panel_1.add(editorPane);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(465, 347, 89, 23);
		panel_1.add(btnNewButton_1);
		
		tabbedPane.addTab("New tab", null, panel_1, null);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(701, 225, 89, 23);
		panel_1.add(btnNewButton_2);
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
	}
	
	
	public void jpBusqueda () {
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("New tab", null, panel, null);
		panel.setLayout(null);
		
		
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(229, 101, 89, 23);
		panel.add(btnNewButton);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(379, 153, 164, 22);
		panel.add(textArea);
		
		textField = new JTextField();
		textField.setBounds(534, 102, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(430, 304, 164, 22);
		panel.add(textArea_1);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(265, 234, 115, 20);
		panel.add(textPane);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(617, 133, 106, 20);
		panel.add(editorPane);
		

		
	}
	
	

	public Panelinicio(Panelinicio panelinicio) {
		super();
		Panelinicio = panelinicio;
	}

}
