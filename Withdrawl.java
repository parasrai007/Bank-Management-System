package bank;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Withdrawl extends JFrame implements ActionListener {
	//instance variable
	JTextField tf1,tf2;
	JButton b1,b2,b3;
	JLabel l1,l2,l3,l4;
	String pin;
	
	// param constructor
	
	public Withdrawl (String pin) {
		this.pin=pin;
		setSize(960,1080);
		setLocation(300,0);
		setUndecorated(true);
		setVisible(true);
		setLayout(null);
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/3923.jpg"));
		Image i2=i1.getImage().getScaledInstance(1000, 1180, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		l3=new JLabel(i3);
		l3.setBounds(0,0,960,1080);
		add(l3);
		
		l1=new JLabel("MAXIMUM WITHDRAWL IS RS.10,000");
		l1.setForeground(Color.WHITE);
		l1.setFont(new Font("System",Font.BOLD,16));
		l1.setBounds(190,350,400,20);
		l3.add(l1);
		
		
		l2=new JLabel("PLEASE ENTER YOUR AMOUNT");
		l2.setForeground(Color.WHITE);
		l2.setFont(new Font("System",Font.BOLD,16));
		l2.setBounds(190,400,400,20);
		l3.add(l2);
		
		tf1=new JTextField();
		tf1.setFont(new Font("Raleway",Font.BOLD,25));
		tf1.setBounds(190,450,330,30);
		l3.add(tf1);
		
		b1= new JButton("WITHDRAWL");
		b2=new JButton("BACK");
		
		b1.setBounds(390,588,150,35);
		l3.add(b1);
		
		b2.setBounds(390,633,150,35);
		l3.add(b2);
		
		
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		  try { 
			   String amount=tf1.getText();
			   Date date= new Date();
			   if(ae.getSource()==b1) {
				   if(tf1.getText().equals("")) {
					   JOptionPane.showMessageDialog(null,"Please Enter the Amount You Want To Withwrawl");
				   } else {
					   ConnectionFactory cf=new ConnectionFactory();
					   ResultSet rs = cf.stmt.executeQuery("select * from bank where pin = '"+pin+"'");
					  int balance = 0;
					  while(rs.next()) {
			if(rs.getString("type").equals("Deposit")) {
				balance += Integer.parseInt(rs.getString("amount"));
			}else {
				balance -= Integer.parseInt(rs.getString("amount"));
			}
			 }
				 if(balance < Integer.parseInt(amount)) {
						  JOptionPane.showMessageDialog(null,"Insufficient Balance");
						  return;
				   }
					  cf.stmt.executeUpdate("insert into bank values('"+pin+"','"+date+"','withdrawl','"+amount+"')");
					  JOptionPane.showMessageDialog(null, "RS."+amount+" Debited  Successfully");
					  setVisible(false);
					  new Transactions(pin).setVisible(true);
					  
			   }
				   
		  }else if (ae.getSource()==b2) {
			  setVisible(false);
			  new Transactions(pin).setVisible(true);
		  }
			   
		  }  
		   catch(Exception e) {
			   e.printStackTrace();
			   System.out.println("error:"+e);
		   }
		

	   }

		
	public static void main(String[] args) {
		new Withdrawl ("").setVisible(true);
	}

}
