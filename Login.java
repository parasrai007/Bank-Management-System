package bank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {
	// Instance variable 
	JLabel lblwelcome,lblcardnumber,lblpinNumber;
	JTextField tfcardnumber;
	JPasswordField  pfpinnumber;
	JButton btnlogin,btnclear,btnsignup;
	
	//NON Param constructor 

	public Login  () {
		setTitle ("Bank Management System");
		//TO DISABLE THE DEFAULT LAYOUT OF FRAME
		
		setLayout(null);
		lblwelcome=new JLabel("Welcome To Bank System");
		lblwelcome.setFont(new Font ("Arial",Font.BOLD,35));
		lblwelcome.setBounds(200,40,530,40);
		add(lblwelcome);
		
		lblcardnumber=new JLabel("Enter Card No:");
		lblcardnumber.setFont(new Font ("Tahoma",Font.BOLD,25));
		lblcardnumber.setBounds(120,150,400,30);
		add(lblcardnumber);
		
		tfcardnumber=new JTextField(20);
		tfcardnumber.setBounds(350,150,230,30);
		tfcardnumber.setFont(new Font("Tahoma",Font.BOLD,15));
		add(tfcardnumber);
		
		lblpinNumber=new JLabel("Enter Pin No:");
		lblpinNumber.setFont(new Font ("Tahoma",Font.BOLD,25));
		lblpinNumber.setBounds(120,250,400,30);
		add(lblpinNumber);

		pfpinnumber=new JPasswordField(20);
		pfpinnumber.setBounds(350,250,230,30);
		pfpinnumber.setFont(new Font("Tahoma",Font.BOLD,15));
		add(pfpinnumber);
		// FOR LOGIN
		btnlogin=new JButton("Login.");
		btnlogin.setBackground(Color.black);
		btnlogin.setForeground(Color.white);
		// FOR CLEAR
		btnclear=new JButton("Clear");
		btnclear.setBackground(Color.black);
		btnclear.setForeground(Color.white);
		//FOR SIGNUP
		btnsignup=new JButton("Sign Up.");
		btnsignup.setBackground(Color.black);
		btnsignup.setForeground(Color.white);
		
		btnlogin.setFont(new Font("Tahoma",Font.BOLD,15));
		btnlogin.setBounds(300,300,100,40);
		add(btnlogin);
		
		btnclear.setFont(new Font("Tahoma",Font.BOLD,15));
		btnclear.setBounds(400,300,100,40);
		add(btnclear);
		
		btnsignup.setFont(new Font("Tahoma",Font.BOLD,15));
		btnsignup.setBounds(500,300,100,40);
		add(btnsignup);
		
		btnlogin.addActionListener(this);
		btnclear.addActionListener(this);
		btnsignup.addActionListener(this);
		
		
		
		//changing the bg colour of frame
		
		getContentPane().setBackground(Color.WHITE);
		setVisible (true);
		setSize(800,500);
		setLocation(400,300);
	
	}

	public static void main(String[] args) {
		// creating login class Object
		Login obj =new Login();
		
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		try {
			if(ae.getSource()==btnlogin) {
				//THIS IS FOR LOGIN
			
		}
			else if(ae.getSource()==btnclear)  {
				tfcardnumber.setText("");
				pfpinnumber.setText("");
			
				//THIS IS FOR SIGN UP PURPOSE 444444444444444444444444444 
			}
			
			else if (ae.getSource ()==btnsignup) {
				this.setVisible(false);
				new Signup();
				
				}
			}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		// TODO Auto-generated method stub
		
	}

}
