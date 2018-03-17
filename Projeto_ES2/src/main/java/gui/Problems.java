package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JMenuBar;
import javax.swing.JTextField;
import java.awt.Label;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JEditorPane;
import javax.swing.JFileChooser;

public class Problems extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void Problems() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Problems frame = new Problems();
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
	public Problems() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 684, 454);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.textHighlight);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setLocationRelativeTo(null);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Help");
		btnNewButton.setBounds(78, 397, 82, 29);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Mails nw = new Mails();
				nw.mails();
			}
		});
		contentPane.add(btnNewButton);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(18, 27, 221, 29);
		contentPane.add(textArea);
		
		JLabel lblNewLabel_1 = new JLabel("Name:");
		lblNewLabel_1.setBounds(18, 0, 61, 29);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Description:");
		lblNewLabel_2.setBounds(18, 61, 82, 16);
		contentPane.add(lblNewLabel_2);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(18, 79, 450, 115);
		contentPane.add(textArea_1);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnBack.setBounds(6, 397, 75, 29);
		contentPane.add(btnBack);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBounds(18, 217, 221, 29);
		contentPane.add(textArea_2);
		
		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setBounds(18, 199, 82, 16);
		contentPane.add(lblEmail);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {" 5  min", "10 min", "15 min", "20 min", "25 min", "30 min"}));
		comboBox.setBounds(263, 29, 100, 27);
		contentPane.add(comboBox);
		
		JLabel lblMaxtime = new JLabel("MaxTime:");
		lblMaxtime.setBounds(272, 0, 79, 29);
		contentPane.add(lblMaxtime);
		
		JButton btnNewButton_1 = new JButton("Optimize");
		btnNewButton_1.setBounds(561, 397, 117, 29);
		contentPane.add(btnNewButton_1);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"1 var", "2 var", "3 var", "4 var", "5 var", "6 var", "7 var", "8 var"}));
		comboBox_1.setBounds(368, 29, 100, 27);
		contentPane.add(comboBox_1);
		
		JLabel lblVarqnt = new JLabel("VarQnt:");
		lblVarqnt.setBounds(372, 0, 79, 29);
		contentPane.add(lblVarqnt);
		
		JLabel lblVartype = new JLabel("VarType:");
		lblVartype.setBounds(478, 0, 79, 29);
		contentPane.add(lblVartype);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Int", "", "Dec", "", "Bin"}));
		comboBox_2.setBounds(474, 29, 100, 27);
		contentPane.add(comboBox_2);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(540, 150, 61, 16);
		contentPane.add(editorPane);
		
		JEditorPane editorPane_1 = new JEditorPane();
		editorPane_1.setBounds(540, 97, 61, 16);
		contentPane.add(editorPane_1);
		
		JLabel lblFrom = new JLabel("From:");
		lblFrom.setBounds(540, 73, 43, 29);
		contentPane.add(lblFrom);
		
		JLabel lblTo = new JLabel("To:");
		lblTo.setBounds(540, 125, 61, 29);
		contentPane.add(lblTo);
		
		JButton btnLoadFile = new JButton("Load File");
		btnLoadFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoadFile nw = new LoadFile();
				nw.loadfile();
			}
		});
		btnLoadFile.setBounds(440, 397, 117, 29);
		contentPane.add(btnLoadFile);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					createFile();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnSave.setBounds(157, 397, 82, 29);
		contentPane.add(btnSave);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
	}
	
	public void createFile() throws IOException {
	
	final JFileChooser fc = new JFileChooser();
	String date = new SimpleDateFormat("yyyy/MM/dd").format(Calendar.getInstance().getTime());
	String hour = new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime());
	int returnVal = fc.showSaveDialog(contentPane); //parent component to JFileChooser
	if (returnVal == JFileChooser.APPROVE_OPTION) { //OK button pressed by user
	        File file = fc.getSelectedFile(); //get File selected by user
	        BufferedWriter o = new BufferedWriter(new FileWriter(file)); //use its name
	      //your writing code goes here
	        o.write("Name: byDefault" + "\n" + "Discription:Este problema bla bla bla" + "\n" + "Date: " + date + "\n" + "Hour: " + hour + "\n");
	        o.flush();
	        o.close();
	     }      
				
	}
}
