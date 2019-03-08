/*
 * CS 440 - AutoDiagScan Project: MainMenu.java
 * Name: Allen Breyer III
 * Net ID: abreye2
 */

import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Image;

import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


import java.net.URL;
import java.util.ResourceBundle;


import java.net.MalformedURLException;

import javafx.application.Application;
import javafx.embed.swing.JFXPanel;
import javafx.geometry.HPos;
import javafx.geometry.VPos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import javax.swing.JPanel;


public class MainMenu
{

	private JFrame frmAutodiagscan;
	
	
	
	/*JButtons*/

	private JButton btnScan;
	private JButton btnNearbyAutoShops;
	private JButton btnPreviousReport;
	private JButton btnOptions;
	private JButton btnBack;
	private JButton btnExit;
	private JButton btnLogin;
	private JButton btnRegister;
	private JButton btnUpdate;

	private JTextPane scanText1,scanText2,scanText3;

	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					MainMenu window = new MainMenu();
					window.frmAutodiagscan.setVisible(true);
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainMenu()
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize()
	{
		frmAutodiagscan = new JFrame();
		frmAutodiagscan.setTitle("AutoDiagScan");
		
		/*
		 * Resolution is half of a sub-HD smartphone (half of 720x1280)
		 */
		frmAutodiagscan.setBounds(540, 70, 360, 640);
		frmAutodiagscan.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAutodiagscan.getContentPane().setLayout(null);
		
		
		
		
		
		
		
		
		
		
		
		
		

		/*
		 * BUTTONS
		 */
		
		/*
		 * Run auto diagnostics
		 */
		Image img3 = new ImageIcon(this.getClass().getResource("/Button_RunDiagnostics.png")).getImage();
		btnScan = new JButton("");
		btnScan.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				// TODO: Read from hardcoded text file (for now), go to scanning page
				ArrayList<String> Stringval = new ArrayList<String>();
				ArrayList<String> Stringval2 = new ArrayList<String>();

					// TODO: Read from hardcoded text file (for now), go to scanning page
					
					read_file file_info = null;
					try {
						file_info = new read_file();
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					Stringval = file_info.getdata();
					Database error_info = new Database(Stringval.get(4));
					Stringval2 = error_info.getvalue();
					
					btnScan.setVisible(false);
					btnNearbyAutoShops.setVisible(false);
					btnPreviousReport.setVisible(false);
					btnOptions.setVisible(false);
					btnBack.setVisible(true);
					
					Font newFieldFont = new Font ("Arial", Font.BOLD, 18);
					
					scanText1 = new JTextPane();
					scanText1.setEditable(false);
					scanText1.setBounds(54, 120, 242, 100);
					scanText1.setText("Make: " 
										+Stringval.get(0)+"\n"+
									  "Type: "
										+Stringval.get(1)+"\n"+
									  "Year: "
										+Stringval.get(2)+"\n"+
									  "VIN: "
										+Stringval.get(3));
					scanText1.setBorder(new LineBorder(Color.BLACK,2));
					scanText1.setFont(newFieldFont);
					
					scanText2 = new JTextPane();
					scanText2.setEditable(false);
					scanText2.setBounds(54, 240, 242, 180);
					scanText2.setText(Stringval2.get(0)+"\n"+
									  Stringval2.get(1)+"\n"+
									  Stringval2.get(2));
					scanText2.setBorder(new LineBorder(Color.BLACK,2));
					scanText2.setFont(newFieldFont);
									
					frmAutodiagscan.getContentPane().add(scanText1);
					frmAutodiagscan.getContentPane().add(scanText2);

				btnScan.setVisible(false);
				btnNearbyAutoShops.setVisible(false);
				btnPreviousReport.setVisible(false);
				btnOptions.setVisible(false);
				btnBack.setVisible(true);
			}
		});
		
		
		
		/*
		 * "Nearby Auto Repair Shop"
		 */
		Image img4 = new ImageIcon(this.getClass().getResource("/Button_NearbyAutoShops.png")).getImage();

		
		
		/*
		 * LABELS
		 */
		Image img_title = new ImageIcon(this.getClass().getResource("/AutoDiagScanTitle.png")).getImage();

		
		
		JLabel label_title = new JLabel("");
		label_title.setBounds(54, 48, 255, 93);
		label_title.setIcon(new ImageIcon(img_title));
		frmAutodiagscan.getContentPane().add(label_title);
		
		
		
		btnScan.setBackground(SystemColor.menu);
		btnScan.setFont(new Font("Arial", Font.PLAIN, 14));
		btnScan.setBounds(75, 152, 194, 50);
		btnScan.setIcon(new ImageIcon(img3));
		btnScan.setOpaque(false);
		btnScan.setBorderPainted(false);
		btnScan.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		frmAutodiagscan.getContentPane().add(btnScan);
		btnNearbyAutoShops = new JButton("");
		btnNearbyAutoShops.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				// TODO: Read from hardcoded text file (for now), go to finding shops
				btnScan.setVisible(false);
				btnNearbyAutoShops.setVisible(false);
				btnPreviousReport.setVisible(false);
				btnOptions.setVisible(false);
				btnBack.setVisible(true);
				
				
				
				
				
				/*final WebView browser = new WebView();
			    final WebEngine webEngine = browser.getEngine();
			    webEngine.load("http://www.oracle.com/products/index.html");*/
				
				
				
				WebViewSample.main(null);
				
				
				
				
				
			}
		});
		btnNearbyAutoShops.setBackground(SystemColor.menu);
		btnNearbyAutoShops.setFont(new Font("Arial", Font.PLAIN, 14));
		btnNearbyAutoShops.setBounds(75, 233, 194, 50);
		btnNearbyAutoShops.setBounds(75, 222, 194, 50);
		
				btnNearbyAutoShops.setIcon(new ImageIcon(img4));
				btnNearbyAutoShops.setOpaque(false);
				btnNearbyAutoShops.setBorderPainted(false);
				btnNearbyAutoShops.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				frmAutodiagscan.getContentPane().add(btnNearbyAutoShops);

		
		
		
				
		/*
		 * "Previous Scanned Reports"
		 */
		btnPreviousReport = new JButton("");
		btnPreviousReport.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				// TODO: Read from hardcoded text file (for now), go to finding shops
				btnScan.setVisible(false);
				btnNearbyAutoShops.setVisible(false);
				btnPreviousReport.setVisible(false);
				btnOptions.setVisible(false);
				btnBack.setVisible(true);
			}
		});
		btnPreviousReport.setBackground(SystemColor.menu);
		Image img5 = new ImageIcon(this.getClass().getResource("/Button_OpenReport.png")).getImage();
		btnPreviousReport.setFont(new Font("Arial", Font.PLAIN, 14));
		btnPreviousReport.setBounds(75, 314, 194, 50);
		btnPreviousReport.setBounds(75, 292, 194, 50);
		btnPreviousReport.setIcon(new ImageIcon(img5));
		btnPreviousReport.setOpaque(false);
		btnPreviousReport.setBorderPainted(false);
		btnPreviousReport.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		frmAutodiagscan.getContentPane().add(btnPreviousReport);
		
		/*
		 * Access options
		 */
		btnOptions = new JButton("");
		btnOptions.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				// TODO: Go to options page
				btnScan.setVisible(false);
				btnNearbyAutoShops.setVisible(false);
				btnPreviousReport.setVisible(false);
				btnOptions.setVisible(false);
				btnLogin.setVisible(true);
				btnRegister.setVisible(true);
				btnUpdate.setVisible(true);
				btnBack.setVisible(true);
			}
		});
		btnOptions.setBackground(SystemColor.menu);
		Image img6 = new ImageIcon(this.getClass().getResource("/Button_Options.png")).getImage();
		btnOptions.setFont(new Font("Arial", Font.PLAIN, 14));
		btnOptions.setBounds(75, 395, 194, 50);
		btnOptions.setBounds(75, 362, 194, 50);
		btnOptions.setIcon(new ImageIcon(img6));
		btnOptions.setOpaque(false);
		btnOptions.setBorderPainted(false);
		btnOptions.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		frmAutodiagscan.getContentPane().add(btnOptions);
		
		/*
		 * Back Button
		 */
		btnBack = new JButton("");
		btnBack.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				//TODO: Have a window popup confirming if user wants to exit
				btnScan.setVisible(true);
				btnNearbyAutoShops.setVisible(true);
				btnPreviousReport.setVisible(true);
				btnOptions.setVisible(true);
				btnBack.setVisible(false);
				
				if (btnLogin.isVisible() == true) {
					btnLogin.setVisible(false);
				}
				
				if (btnRegister.isVisible() == true) {
					btnRegister.setVisible(false);
				}
				
				if (btnUpdate.isVisible() == true) {
					btnUpdate.setVisible(false);
				}
				
			}
		});
		btnBack.setBackground(SystemColor.menu);
		Image img7 = new ImageIcon(this.getClass().getResource("/Button_Back.png")).getImage();
		btnBack.setFont(new Font("Arial", Font.PLAIN, 14));
		btnBack.setBounds(75, 480, 194, 50);
		btnBack.setBounds(75, 479, 97, 50);
		btnBack.setIcon(new ImageIcon(img7));
		btnBack.setOpaque(false);
		btnBack.setBorderPainted(false);
		btnBack.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		frmAutodiagscan.getContentPane().add(btnBack);
		btnBack.setVisible(false);
		
		/*
		 * Login button
		 */
		btnLogin = new JButton("");
		btnLogin.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				//TODO: Have a window popup confirming if user wants to exit
				
				
			}
		});
		btnLogin.setBackground(SystemColor.menu);
		Image img8 = new ImageIcon(this.getClass().getResource("/Button_Login.png")).getImage();
		btnLogin.setFont(new Font("Arial", Font.PLAIN, 14));
		btnLogin.setBounds(75, 152, 194, 50);
		btnLogin.setIcon(new ImageIcon(img8));
		btnLogin.setOpaque(false);
		btnLogin.setBorderPainted(false);
		btnLogin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		frmAutodiagscan.getContentPane().add(btnLogin);
		btnLogin.setVisible(false);
		
		/*
		 * Register button
		 */
		btnRegister = new JButton("");
		btnRegister.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				//TODO: Have a window popup confirming if user wants to exit
				
				
			}
		});
		btnRegister.setBackground(SystemColor.menu);
		Image img9 = new ImageIcon(this.getClass().getResource("/Button_Register.png")).getImage();
		btnRegister.setFont(new Font("Arial", Font.PLAIN, 14));
		btnRegister.setBounds(75, 233, 194, 50);
		btnRegister.setIcon(new ImageIcon(img9));
		btnRegister.setOpaque(false);
		btnRegister.setBorderPainted(false);
		btnRegister.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		frmAutodiagscan.getContentPane().add(btnRegister);
		btnRegister.setVisible(false);
		
		/*
		 * Update button
		 */
		btnUpdate = new JButton("");
		btnUpdate.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				//TODO: Have a window popup confirming if user wants to exit
				
				
			}
		});
		btnUpdate.setBackground(SystemColor.menu);
		Image img10 = new ImageIcon(this.getClass().getResource("/Button_Update.png")).getImage();
		btnUpdate.setFont(new Font("Arial", Font.PLAIN, 14));
		btnUpdate.setBounds(75, 314, 194, 50);
		btnUpdate.setIcon(new ImageIcon(img10));
		btnUpdate.setOpaque(false);
		btnUpdate.setBorderPainted(false);
		btnUpdate.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		frmAutodiagscan.getContentPane().add(btnUpdate);
		btnUpdate.setVisible(false);
		
		/*
		 * Exit program
		 */
		btnExit = new JButton("");
		btnExit.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				//TODO: Have a window popup confirming if user wants to exit
				System.exit(0);
			}
		});
		btnExit.setBackground(SystemColor.menu);
		Image img11 = new ImageIcon(this.getClass().getResource("/Button_Exit.png")).getImage();
		btnExit.setFont(new Font("Arial", Font.PLAIN, 14));
		btnExit.setBounds(75, 540, 194, 50);
		btnExit.setIcon(new ImageIcon(img11));
		btnExit.setOpaque(false);
		btnExit.setBorderPainted(false);
		btnExit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		frmAutodiagscan.getContentPane().add(btnExit);
		
		JFXPanel panel = new JFXPanel();
		panel.setBounds(10, 48, 324, 302);
		frmAutodiagscan.getContentPane().add(panel);
		panel.setLayout(null);
		
		
		
		//WebView webView = new WebView();
		//WebViewSample.
		
		
		JLabel label_background = new JLabel("");
		label_background.setFont(new Font("Tahoma", Font.PLAIN, 11));
		label_background.setBackground(SystemColor.activeCaptionText);
		Image img_background = new ImageIcon(this.getClass().getResource("/OrangeBackground.png")).getImage();
		label_background.setBounds(0, 0, 344, 601);
		label_background.setIcon(new ImageIcon(img_background));
		frmAutodiagscan.getContentPane().add(label_background);
	}
	
	
	
	
	
}
