package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Window.Type;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class Login {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void login() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setType(Type.POPUP);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 206, 278);
		panel_1.setBackground(Color.GRAY);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Login.class.getResource("/images/loginnn.jpg")));
		label.setBounds(-12, 0, 217, 288);
		panel_1.add(label);
		
		JButton btnHelp = new JButton("Next");
		btnHelp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		btnHelp.setBackground(SystemColor.controlHighlight);
		btnHelp.setBounds(267, 236, 117, 29);
		frame.getContentPane().add(btnHelp);
		
		textField = new JTextField();
		textField.setBounds(223, 34, 196, 40);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblUser = new JLabel("PASSWORD");
		lblUser.setFont(new Font("Adobe Kaiti Std", Font.PLAIN, 13));
		lblUser.setBounds(223, 160, 144, 29);
		frame.getContentPane().add(lblUser);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(223, 214, 196, 16);
		frame.getContentPane().add(separator);
		
		JLabel lblUsername = new JLabel("USERNAME");
		lblUsername.setFont(new Font("Adobe Kaiti Std", Font.PLAIN, 13));
		lblUsername.setBounds(223, 16, 75, 26);
		frame.getContentPane().add(lblUsername);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(223, 105, 196, 40);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(223, 185, 196, 40);
		frame.getContentPane().add(textField_2);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(223, 138, 196, 16);
		frame.getContentPane().add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(223, 64, 196, 16);
		frame.getContentPane().add(separator_2);
		
		JLabel lblEmail = new JLabel("EMAIL");
		lblEmail.setFont(new Font("Adobe Kaiti Std", Font.PLAIN, 13));
		lblEmail.setBounds(223, 86, 144, 26);
		frame.getContentPane().add(lblEmail);
	}
}
