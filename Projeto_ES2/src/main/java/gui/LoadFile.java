package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import java.awt.TextArea;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

public class LoadFile extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void loadfile() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoadFile frame = new LoadFile();
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
	public LoadFile() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 474, 94);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.textHighlight);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);

		textField = new JTextField();

		textField.setBounds(66, 27, 304, 26);
		contentPane.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel = new JLabel("Path//:");
		lblNewLabel.setBounds(17, 32, 45, 16);
		contentPane.add(lblNewLabel);

		JButton btnNewButton = new JButton("Open");

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JFileChooser chooser = new JFileChooser();
				int returnName = chooser.showOpenDialog(null);
				String path;
				if (returnName == JFileChooser.APPROVE_OPTION) {
					File f = chooser.getSelectedFile();

					path = f.getAbsolutePath();//get the absolute path to selected file
					String extension = "";

					int i = f.getName().lastIndexOf('.');
					if (i > 0) {
						extension = f.getName().substring(i+1);
						System.out.println(extension);
					}
					if (f != null && extension.equals("jar")) {
						textField.setText(path);
						dispose();
						JOptionPane.showMessageDialog(contentPane, "Your file has been Uploaded");
					}else {

						JOptionPane.showMessageDialog(contentPane, "Please select a .jar file");

					}  }  	
			}
		});

		btnNewButton.setBounds(379, 27, 65, 29);
		contentPane.add(btnNewButton);

	}
}
