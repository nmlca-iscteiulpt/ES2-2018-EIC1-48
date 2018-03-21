package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.DropMode;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Mails extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void mails() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mails frame = new Mails();
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
	public Mails() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 459, 327);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.textHighlight);
		contentPane.setToolTipText("Escreva aqui as suas dúvidas");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea txtrEscrevaAquiAs = new JTextArea();
		txtrEscrevaAquiAs.setToolTipText("");
		txtrEscrevaAquiAs.setBounds(42, 181, 331, 83);
		contentPane.add(txtrEscrevaAquiAs);
		
		JButton btnEnviar = new JButton("Cancel");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnEnviar.setBounds(39, 276, 117, 29);
		contentPane.add(btnEnviar);
		
		JTextArea textArea = new JTextArea();
		textArea.setToolTipText("");
		textArea.setBounds(41, 108, 232, 29);
		

		
		JButton btnSend = new JButton("Send");
		btnSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			SendMail m = new SendMail();
			m.sendFromGMail2(textArea.getText(),txtrEscrevaAquiAs.getText(),textField_1.getText(), String.valueOf(passwordField.getPassword()));
			dispose();
			JOptionPane.showMessageDialog(contentPane, "Email enviado");
			}
		});
		
		btnSend.setBounds(154, 276, 117, 29);
		contentPane.add(btnSend);
		
//		JTextArea textArea = new JTextArea();
//		textArea.setToolTipText("");
//		textArea.setBounds(39, 41, 232, 29);
		contentPane.add(textArea);
		
		JLabel lblSubject = new JLabel("Subject:");
		lblSubject.setBounds(42, 92, 61, 16);
		contentPane.add(lblSubject);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(39, 163, 61, 16);
		contentPane.add(lblEmail);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setBounds(39, 25, 92, 16);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(192, 25, 92, 16);
		contentPane.add(lblPassword);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(37, 41, 143, 29);
		contentPane.add(textField_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(192, 42, 143, 29);
		contentPane.add(passwordField);
	}
}
