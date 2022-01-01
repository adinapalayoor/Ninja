package ninjase.view;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JOptionPane;
import ninjase.controller.Controller;
import ninjase.model.Model;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JLabel;

public class App extends JFrame {

	Model model;
	Controller controller;
	PuzzleViewer puzzle;
	JLabel lblNewLabel_1;

	/**
	 * Create the frame.
	 */
	public App(Model model) {
		this.model = model;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1212, 733);
		getContentPane().setLayout(null);

        controller = new Controller(model, this);
        puzzle = new PuzzleViewer(controller);

		JPanel panel = new JPanel();
		panel.setBounds(835, 11, 357, 677);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Level 1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.processLevel(1);
			}
		});
		btnNewButton.setBounds(10, 225, 89, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Level 2");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.processLevel(2);
			}
		});
		btnNewButton_1.setBounds(10, 274, 89, 23);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Level 3");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.processLevel(3);
			}
		});
		btnNewButton_2.setBounds(10, 318, 89, 23);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Reset");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.processLevel(controller.getLevel()[2]);
			}
		});
		btnNewButton_3.setBounds(10, 365, 89, 23);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("^");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.moveController.process(1);
			}
		});
		btnNewButton_4.setBounds(135, 30, 89, 23);
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("<");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.moveController.process(2);
			}
		});
		btnNewButton_5.setBounds(57, 64, 89, 23);
		panel.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton(">");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.moveController.process(3);
			}
		});
		btnNewButton_6.setBounds(207, 64, 89, 23);
		panel.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("V");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.moveController.process(4);
			}
		});
		btnNewButton_7.setBounds(135, 98, 89, 23);
		panel.add(btnNewButton_7);
		
		JLabel lblNewLabel = new JLabel("Moves:");
		lblNewLabel.setBounds(10, 399, 47, 14);
		panel.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("0");
		lblNewLabel_1.setBounds(52, 399, 47, 14);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1;
		panel_1 = puzzle;
		panel_1.setBounds(10, 11, 815, 677);
		getContentPane().add(panel_1);
	}

	public void setMoveCount(String moves) {
		 lblNewLabel_1.setText(moves);
	}

	public void showMessage() {
		JOptionPane.showMessageDialog(this, "Level Completed!");
        controller.processLevel(controller.getLevel()[2]);
	}
}
