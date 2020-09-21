package com.SwingProject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class JpConexion extends JPanel implements ActionListener{

	/**
	 * 
	 */
	
	JPanel panel_1;
	JComboBox comboBox;
	
	private static final long serialVersionUID = -4426972728113893917L;
	
	public JPanel JpConexionSSH () {
		
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
		return panel_1;
		
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
