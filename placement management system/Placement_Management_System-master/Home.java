import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

import java.awt.event.*;
import static javax.swing.JOptionPane.showMessageDialog;
import java.util.*;
import java.io.*;

public class Home extends JFrame implements ActionListener
{
	JLabel welcome, heading;
    private  JButton insert, delete, display, search, ledger, eligible,search1;


	Home()
	{
		super("Placement Management System");
		Container con = getContentPane();
		con.setLayout(null);
		Color  lightBlue = new Color(0,0,0);
        con.setBackground(lightBlue);    
        con.setVisible(true);

		heading = new JLabel("CAMPUS PLACEMENTS");
        heading.setBounds(450,0, 400,150);
		con.add(heading);

		Font fonth = new Font("Verdana", Font.BOLD, 24);
        heading.setFont(fonth);
        heading.setForeground(Color.WHITE);

		welcome = new JLabel("CHOOSE YOUR OPTION");
		welcome.setBounds(480,30, 400,150);
		con.add(welcome);

		Font fontw = new Font("Verdana", Font.BOLD, 16);
        welcome.setFont(fontw);
        welcome.setForeground(Color.WHITE);

		Color blue = new Color(148,0,211);
		insert = new JButton("Insert Details");
		insert.addActionListener(this);
		insert.setBounds(295,165,230, 240);
		Font font1 = new Font("Verdana", Font.BOLD, 16);
		insert.setOpaque(false);
        insert.setFont(font1);
        Color pul = new Color(75,0,130);
        Border bored = BorderFactory.createLineBorder(pul,5);
        insert.setBorder(bored);
        insert.setBorder(new RoundBtn(20));
        insert.setForeground(Color.WHITE);
        insert.setBackground(blue);
        insert.setContentAreaFilled(false);
        insert.setBorderPainted(false);
		ImageIcon icon = new ImageIcon("C:/Users/mayoo/Desktop/placement management system/placement management system by mayoori and nischith/Placement_Management_System-master/insert d.jpg");
        Image img1 = icon.getImage().getScaledInstance(230, 250, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(img1);
        insert.setIcon(scaledIcon);

		delete = new JButton("Delete Record");
		delete.addActionListener(this);
		delete.setBounds(590,175, 230, 245);
		Font font2 = new Font("Verdana", Font.BOLD, 16);
        delete.setFont(font2);
        delete.setBorder(bored);
        delete.setForeground(Color.WHITE);
        delete.setBackground(blue);
		delete.setContentAreaFilled(false);
        delete.setBorderPainted(false);
		delete.setOpaque(false);
		ImageIcon icon2 = new ImageIcon("C:/Users/mayoo/Desktop/placement management system/placement management system by mayoori and nischith/Placement_Management_System-master/delete1.jpg");
        Image img2 = icon2.getImage().getScaledInstance(230, 255, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon2 = new ImageIcon(img2);
        delete.setIcon(scaledIcon2);

		display = new JButton("Display Record");
		display.addActionListener(this);
		display.setBounds(945,185, 175, 245);
		Font font3 = new Font("Verdana", Font.BOLD, 16);
        display.setFont(font3);
        display.setBorder(bored);
        display.setForeground(Color.WHITE);
        display.setBackground(blue);
		display.setContentAreaFilled(false);
        display.setBorderPainted(false);
		display.setOpaque(false);
		ImageIcon icon3 = new ImageIcon("C:/Users/mayoo/Desktop/placement management system/placement management system by mayoori and nischith/Placement_Management_System-master/display1.jpg");
        Image img3 = icon3.getImage().getScaledInstance(230, 255, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon3 = new ImageIcon(img3);
        display.setIcon(scaledIcon3);
        
        search1 = new JButton("Search");
		search1.addActionListener(this);
		search1.setBounds(290,475, 175, 240);
		Font font7 = new Font("Verdana", Font.BOLD, 16);
        search1.setFont(font7);
        search1.setBorder(bored);
        search1.setForeground(Color.WHITE);
        search1.setBackground(blue);
		search1.setContentAreaFilled(false);
        search1.setBorderPainted(false);
		search1.setOpaque(false);
		ImageIcon icon4 = new ImageIcon("C:/Users/mayoo/Desktop/placement management system/placement management system by mayoori and nischith/Placement_Management_System-master/search2.jpg");
        Image img4 = icon4.getImage().getScaledInstance(230, 250, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon4 = new ImageIcon(img4);
        search1.setIcon(scaledIcon4);

		// ledger = new JButton("View changes");
		// ledger.addActionListener(this);
		// ledger.setBounds(500,475, 175, 50);
		// Font font5 = new Font("Verdana", Font.BOLD, 16);
        // ledger.setFont(font5);
        // ledger.setBorder(bored);
        // ledger.setForeground(Color.WHITE);
        // ledger.setBackground(blue);

		eligible = new JButton("Placement Eligibility");
		eligible.addActionListener(this);
		eligible.setBounds(935,475, 250, 250);
		Font font6 = new Font("Verdana", Font.BOLD, 16);
        eligible.setFont(font6);
        eligible.setBorder(bored);
        eligible.setForeground(Color.WHITE);
       	eligible.setBackground(blue);
		eligible.setContentAreaFilled(false);
        eligible.setBorderPainted(false);
		eligible.setOpaque(false);
		ImageIcon icon5 = new ImageIcon("C:/Users/mayoo/Desktop/placement management system/placement management system by mayoori and nischith/Placement_Management_System-master/place1.jpg");
        Image img5 = icon5.getImage().getScaledInstance(230, 260, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon5 = new ImageIcon(img5);
        eligible.setIcon(scaledIcon5);
       	
       	

		con.add(insert);
		con.add(delete);
		con.add(display);
		con.add(search1);
		// con.add(ledger);
		con.add(eligible);
		
		JLabel background;
		con.setSize(1200,700);
		con.setLayout(null);
		ImageIcon img = new ImageIcon("C:/Users/mayoo/Desktop/placement management system/placement management system by mayoori and nischith/Placement_Management_System-master/bg2.jpg");
		background = new JLabel("",img,JLabel.CENTER);
        background.setBounds(150,130,1200,600);
        add(background);
        
		
		
	}

	public void actionPerformed(ActionEvent ae)
	{

		if(ae.getSource()==insert)
		{
			this.dispose();
			Insert in=new Insert();
			in.setSize(2300,790);
			in.setVisible(true);
		}

		if(ae.getSource()==delete)
		{
			this.dispose();
			Delete del=new Delete();
			del.setSize(2300,790);
			del.setVisible(true);
		}

		if(ae.getSource()==display)
		{
			this.dispose();
			Display dis=new Display();
			dis.setSize(2300,790);
			dis.setVisible(true);
		}
		
		if(ae.getSource()==search1)
		{
			this.dispose();
			Search1 ser=new Search1();
			ser.setSize(2300,790);
			ser.setVisible(true);
		}

		// if(ae.getSource()==ledger)
		// {
		// 	this.dispose();
		// 	Ledger led=new Ledger();
		// 	led.setSize(2300,790);
		// 	led.setVisible(true);
		// }

		if(ae.getSource()==eligible)
		{
			this.dispose();
			Eligible eli=new Eligible();
			eli.setSize(2300,790);
			eli.setVisible(true);
		}
		

	}
	
	class RoundBtn implements Border 
	{
	    private int r;
	    RoundBtn(int r) {
	        this.r = r;
	    }
	    public Insets getBorderInsets(Component c) {
	        return new Insets(this.r+1, this.r+1, this.r+2, this.r);
	    }
	    public boolean isBorderOpaque() {
	        return true;
	    }
	    public void paintBorder(Component c, Graphics g, int x, int y, 
	    int width, int height) {
	        g.drawRoundRect(x, y, width-1, height-1, r, r);
	    }
	}

	public static void main(String args[])
	{
        Home h=new Home();
		h.setSize(2300,790);
		h.setVisible(true);
	}
} 