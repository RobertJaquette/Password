package MainPackage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPasswordField;

import java.awt.BorderLayout;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.util.Arrays;
import javax.swing.JLabel;

public class Password {

	private JFrame frame;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Password window = new Password();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Password() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.setBounds(223, 134, 110, 38);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				char[] password = passwordField.getPassword();
				char[] correctPass = new char[] {'b', 'u', 'g', 'a', 'b', 'o', 'o'};
			 
				if (Arrays.equals(password, correctPass)) {
					System.out.println("Password is correct");
				} else {
			    System.out.println("Incorrect password");
				}
				}
			});
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Help");
		btnNewButton_1.setBounds(223, 83, 110, 40);
		frame.getContentPane().add(btnNewButton_1);
		frame.getContentPane().add(btnNewButton);
		btnNewButton_1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			System.out.println("please enter the correct password");
		}});
		
		
		passwordField = new JPasswordField();
		passwordField.setBounds(86, 100, 116, 40);
		frame.getContentPane().add(passwordField);
		passwordField.setText("bugaboo");
		
		JLabel lblNewLabel = new JLabel("PassWord");
		lblNewLabel.setBounds(108, 60, 66, 29);
		frame.getContentPane().add(lblNewLabel);
	}
}
