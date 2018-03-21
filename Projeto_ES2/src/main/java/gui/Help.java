package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JScrollBar;
import javax.swing.JList;
import java.awt.Color;
import javax.swing.AbstractListModel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Help extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void help() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Help frame = new Help();
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
	public Help() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 684, 454);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.textHighlight);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setLocationRelativeTo(null);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(44, 18, 612, 385);
		contentPane.add(scrollPane);
		
		JList list = new JList();
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"MENU BUTTONS:", "", "\tLOGIN:", "\t\tIn order to proceed to your problem optimization, you will have to \t\t\tpreviously Log In into to the platform.", "", "\tPROBLEM:", "\t\tThis area of the platform allows you to work on your problem solving/\t\toptimization.", "", "\tHELP:", "\t\tHelp is the window that is currently being displayed. Here you can \t\t\tfind all faq’s and functionalities of the platform itself.", "", "", "", "", "", "WHAT´S THIS PLATFORM?", "The Software Optimization Problem is a decision supporting and problem solving platform in which the user describes the characteristics of the problem meant to be solved. As an answer, the platform responds with the best solution for the problem provided.", "", "", "", "", "HOW CAN THE USER HELP THE OPTIMIZATION PROCESS?", "The user can help the optimization process by providing the best solutions that he can find for the problem being optimized.", "", "", "", "", "", "HOW DOES THE OPTIMIZATION OF A PROBLEM WORK? ", "From the description of the problem provided by the user, the platform uses certain algorithms than may or may not be given by him to solve the problem. Afterwords, the software studies the performance and quality of the algorithms utilized. Last but not least, this analysis is shown on the screen displaying the algorithms that succeeded the most. ", "", "", "", "", "", "ASKING FOR HELP TO A SOFTWARE ADMIN? ", "On the menu window select the problem button and then press help. A new window will pop up containing all necessary fields to submit an email. Fill all the areas, including the one with your question, and then press send. An email will be sent to us and your question will be answered in the shortest amount of time possible.", "", "", "", "MAXTIME BUTTON, WHAT IS IT FOR?", "With this button the user can set the maximum amount of time he is willing to wait for the optimization results.", "", "", "", "VARIABLEQNT BUTTON, WHAT IS IT FOR?", "With this button the user defines how many variables should be used in the optimization process.", "", "", "", "VARIABLETYPE BUTTON, WHAT IS IT FOR?", "This button is used to define which type of variables (f.e int, bin, dec, …) shall be used in the optimization. The adjacent buttons are related to the interval in which those variables should vary in between.", "", "", ""};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		scrollPane.setViewportView(list);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton.setBounds(0, 403, 72, 29);
		contentPane.add(btnNewButton);
	}
}
