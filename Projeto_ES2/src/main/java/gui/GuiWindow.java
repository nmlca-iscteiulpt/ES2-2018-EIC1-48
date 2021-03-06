package gui;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import java.awt.Label;
import java.awt.BorderLayout;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JTable;
import javax.swing.JToggleButton;
import javax.swing.JComboBox;
import javax.swing.JList;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import java.awt.Button;
import java.awt.SystemColor;
import java.awt.Panel;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;

public class GuiWindow {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiWindow window = new GuiWindow();
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
	public GuiWindow() {
		
		frame = new JFrame("Problem Optimization Software");
		frame.setBackground(Color.WHITE);
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setLayout(null);
		
		JToggleButton tglbtnButton = new JToggleButton("Help");
		tglbtnButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Help nw = new Help();
				nw.help();
			}
		});
		tglbtnButton.setBounds(254, 311, 186, 53);
		frame.getContentPane().add(tglbtnButton);
		
		JToggleButton tglbtnButton_1 = new JToggleButton("Login");
		tglbtnButton_1.setBackground(Color.GRAY);
		tglbtnButton_1.setBounds(254, 74, 186, 55);
		tglbtnButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				
				Login nw = new Login();
				nw.login();
			}});
		frame.getContentPane().add(tglbtnButton_1);
		
		JToggleButton tglbtnButton_2 = new JToggleButton("Problem");
		tglbtnButton_2.setBounds(254, 195, 186, 53);
		tglbtnButton_2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) { 
			
			Problems nw = new Problems();
			nw.Problems();
		}});
		frame.getContentPane().add(tglbtnButton_2);
		
		JLabel label = new JLabel("");
		label.setBounds(-5, -2, 689, 434);
		frame.getContentPane().add(label);
		label.setIcon(new ImageIcon(GuiWindow.class.getResource("/images/123.jpg")));
		frame.setBounds(100, 100, 684, 454);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setLocationRelativeTo(null);
	    frame.setVisible(true);
	    //frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
	    frame.setResizable(false);
	    
		
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}


