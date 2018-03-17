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
import javax.swing.DropMode;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Mails extends JFrame {

	private JPanel contentPane;

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
		setBounds(100, 100, 410, 273);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.textHighlight);
		contentPane.setToolTipText("Escreva aqui as suas dúvidas");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea txtrEscrevaAquiAs = new JTextArea();
		txtrEscrevaAquiAs.setToolTipText("");
		txtrEscrevaAquiAs.setBounds(39, 99, 331, 83);
		contentPane.add(txtrEscrevaAquiAs);
		
		JButton btnEnviar = new JButton("Cancel");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnEnviar.setBounds(36, 195, 117, 29);
		contentPane.add(btnEnviar);
		
		JButton btnSend = new JButton("Send");
		btnSend.setBounds(154, 195, 117, 29);
		contentPane.add(btnSend);
		
		JTextArea textArea = new JTextArea();
		textArea.setToolTipText("");
		textArea.setBounds(39, 41, 232, 29);
		contentPane.add(textArea);
		
		JLabel lblSubject = new JLabel("Subject:");
		lblSubject.setBounds(39, 22, 61, 16);
		contentPane.add(lblSubject);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(39, 82, 61, 16);
		contentPane.add(lblEmail);
	}
}
