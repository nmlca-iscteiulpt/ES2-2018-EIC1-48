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
			String[] values = new String[] {"MENU BUTTONS:", "", "\t\tLOGIN:", "\t\tIn order to proceed to your problem optimization, you will have to previously Log In into to the platform.", "", "\t\tPROBLEM:", "\t\tThis area of the platform allows you to work on your problem solving/optimization.", "", "\t\tHELP:", "\t\tHelp is the window that is currently being displayed. Here you can find all faq’s and functionalities of the platform itself.", "", "", "", "HOW DOES THE OPTIMIZATION OF A PROBLEM WORK?", "By default, the last used shipping address will be saved into to your Sample Store account. When you are checking out your order, the default shipping address will be displayed and you have the option to amend it if you need to.", "", "", "ASKING FOR HELP TO A ADMIN OF THE SOFTWARE?", "The instructions to activate your account will be sent to your email once you have submitted the registration form. If you did not receive this email, your email service provider’s mailing software may be blocking it. You can try checking your junk / spam folder or contact us at help@samplestore.com", "", "", "MAXTIME BUTTON, WHAT IS IT FOR?", "Because you are important to us, we want to know what you think about the products. As an added value, every time you rate the products you earn points which go straight to your account. 1 point are added to your account for every review that you give. You will need those points in order to redeem the sample products. So keep rating the products to keep earning points!", "", "VARIABLEQNT BUTTON, WHAT IS IT FOR?", "The instructions to activate your account will be sent to your email once you have submitted the registration form. ", "", "HOW DOES THE OPTIMIZATION OF A PROBLEM WORK?", "By default, the last used shipping address will be saved into to your Sample Store account. When you are checking out your order, the default shipping address will be displayed and you have the option to amend it if you need to.", "", "HOW DOES THE OPTIMIZATION OF A PROBLEM WORK?", "By default, the last used shipping address will be saved into to your Sample Store account. When you are checking out your order, the default shipping address will be displayed and you have the option to amend it if you need to.", "", "HOW DOES THE OPTIMIZATION OF A PROBLEM WORK?", "By default, the last used shipping address will be saved into to your Sample Store account. When you are checking out your order, the default shipping address will be displayed and you have the option to amend it if you need to.", ""};
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
