package modules;


//import JDBC;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.*;
import comparision.Algo_comparision;
import signature.client.User1;
import signature.client.Verifier;
import signature.server.IssuingManager;
import signature.server.OpeningManager;
import signature.server.RevocationManager;
import signature.signature.Signature;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.applet.*;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.net.URI;
import java.net.URISyntaxException;
public class mainpage extends JApplet
{
	mainpage()
	{
	JFrame jfrm=new JFrame("main page");
	jfrm.setSize(1200,650);
	jfrm.setLayout(new GridLayout(3,0));
	jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	jfrm.setBackground(Color.black);
    //JLabel jl4=new JLabel("FOLLOW THE THREE STEPS --->");
	//jl4.setAlignmentY(TOP_ALIGNMENT);
	jfrm.setVisible(true);
	JSplitPane splitPane=new JSplitPane();
	splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
	splitPane.setDividerLocation(200);
	JPanel p=new JPanel(new GridBagLayout());
	JPanel topPanel;
	JPanel bottomPanel;
	topPanel = new JPanel();
	bottomPanel = new JPanel();
	topPanel.setBackground(Color.yellow);
	bottomPanel.setBackground(Color.yellow);
	splitPane.setTopComponent(topPanel); 
	splitPane.setBottomComponent(bottomPanel);
	JLabel jl6=new JLabel("COST EFFECTIVE AUTHENTIC AND ANONYMOUS DATA SHARING WITH RING SIGNATURE");
	jl6.setFont(new Font("Times New Roman", Font.BOLD, 25));
	jl6.setForeground(Color.blue);
	topPanel.add(jl6);
	JLabel link = new JLabel("   CLICK HERE TO CONNECT TO ORACLE FIRST    ",JLabel.CENTER);
	link.setFont(new Font("Serif", Font.BOLD, 14));
	link.setForeground(Color.red);
	 link.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	 link.addMouseListener(new MouseAdapter() {
	   public void mouseClicked(MouseEvent e) {
	      if (e.getClickCount() > 0) {
	          if (Desktop.isDesktopSupported()) {
	                Desktop desktop = Desktop.getDesktop();
	                try {
	                    URI uri = new URI("http://127.0.0.1:8080/apex/");
	                    desktop.browse(uri);
	                } catch (IOException ex) {
	                    ex.printStackTrace();
	                } catch (URISyntaxException ex) {
	                    ex.printStackTrace();
	                }
	        }
	      }
	   }
	});
	 topPanel.add(link);
	 //JButton site = new JButton("Site");
	 //site.addActionListener(new ActionListener() {
		//    public void actionPerformed(ActionEvent e) {
		  //  	new LinkTest();
		    //    }
		//});
	 //topPanel.add(site);
	
	//JButton b0=new JButton("Login to Oracle");
	//topPanel.add(b0);
	
	//URI uri = new URI("http://java.sun.com");

	//b0.addActionListener(new ActionListener(){
		//public void actionPerformed(ActionEvent ae){
			
			//open(uri);
		
		//}
	//});
	JLabel jl4=new JLabel("NOW FOLLOW THE THREE STEPS BELOW");
	jl4.setFont(new Font("Times New Roman", Font.BOLD, 25));
	topPanel.add(jl4);
	JLabel jl5=new JLabel("SAMBHRAM INSTITUTE OF TECHNOLOGY");
	jl5.setFont(new Font("Times New Roman", Font.BOLD, 25));
	
	//JLabel jl7=new JLabel("Bangalore-560097");
	//jl7.setFont(new Font("Times New Roman", Font.BOLD, 25));
	bottomPanel.add(jl5);
	//bottomPanel.add(jl7);
	//JLabel wIcon = new JLabel(new ImageIcon("images/sait.jpg"));
	//bottomPanel.add(wIcon);
	JButton b1=new JButton("Cloud Server");
	JButton b2=new JButton("Get your access key");
	JButton b3=new JButton("Sign-in/Sign-up");
	JLabel jl=new JLabel("Step 1");
	JLabel jl2=new JLabel("Step 2");
	JLabel jl3=new JLabel("Step 3");
	JLabel j4=new JLabel("Efficiency Analysis");
	b1.setBackground(Color.green);
	b2.setBackground(Color.green);
	b3.setBackground(Color.green);
	JLabel jlab=new JLabel(new ImageIcon("images/mainp.jpg"));
	jlab.setBounds(0,0,350,350);
	GridBagConstraints c=new GridBagConstraints();
	JButton b4=new JButton("Algorithm Comparision");
	b4.setBackground(Color.green);
	b4.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ae){
			new Algo_comparision();
			}
	});
	
	
	b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ae){
			new cloud_server();
			}
	});
	b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ae){
			
			Access_key_generater obj1=new Access_key_generater();
			obj1.start();
		}
	});
	b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ae){
		
		new sign_in();
		}
	});	
	c.gridx=1;c.gridy=3;topPanel.add(jl4,c);
	c.gridx=1;c.gridy=-1;bottomPanel.add(jl5,c);
	//c.gridx=0;c.gridy=2;topPanel.add(link,c);
	
	
	c.insets=new Insets(10,10,10,10);
	c.gridx=1;c.gridy=1;p.add(b1,c);
	c.gridx=2;c.gridy=1;p.add(b2,c);
	c.gridx=3;c.gridy=1;p.add(b3,c);
	c.gridx=1;c.gridy=2;p.add(jl,c);
	c.gridx=2;c.gridy=2;p.add(jl2,c);
	c.gridx=3;c.gridy=2;p.add(jl3,c);
	c.gridx=4;c.gridy=3;p.add(b4,c);
	c.gridx=4;c.gridy=4;p.add(j4,c);
	jfrm.add(topPanel);
	jfrm.add(p);
	jfrm.add(bottomPanel);
	}
	public static void main(String args[])
	{
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				new mainpage();
			}
		});
	}
}

			