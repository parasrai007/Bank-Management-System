package bank;
import java.awt.Color;
import java.awt.Font;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;


public class Signup extends JFrame   {
	// INSTANCE VARIABLE
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15;
	JTextField tf1, tf2, tf3, tf4, tf5, tf6, tf7;
	JRadioButton r1,r2,r3,r4,r5,r6;
	JButton b;
	
	JDateChooser dateChooser;

	
	
	Random r=new  Random();
	long randNum=r.nextLong() %9000+1000;
	String  number=""+Math.abs(randNum);      //MATH CLASS FOR DO N.O IN +VE N.O
	
	
	
	//NON PARAM CONSTRUCTOR
	public Signup() {
		setTitle ("New Account Application Form:");
		setLayout(null);
		
		l1=new JLabel("Application Form: " +number);
		l1.setFont(new Font("Arial" ,Font.BOLD,35 ));
		l1.setBounds(150,20,600,40);
		add(l1);
		
		l2=new JLabel("Personal Details of Costomer");
		l2.setFont(new Font("Raleway" ,Font.BOLD,25 ));
		l2.setBounds(170,80,600,40);
		add(l2);
		
		l3=new JLabel("Your Name:");
		l3.setFont(new Font("Raleway" ,Font.BOLD,22 ));
		l3.setBounds(100,140,200,30);
		add(l3);
		
		tf1=new JTextField(15);
		tf1.setFont(new Font ("Arial",Font.BOLD,20));
		tf1.setBounds(305,130,300,30);
		add(tf1);
			
			
		l4=new JLabel("Father's Name:");
		l4.setFont(new Font("Raleway" ,Font.BOLD,22 ));
		l4.setBounds(100,180,200,30);
		add(l4);
		
		tf2=new JTextField(15);
		tf2.setFont(new Font ("Arial",Font.BOLD,20));
		tf2.setBounds(305,180,300,30);
		add(tf2);
			
		
		l5=new JLabel("Date of Birth:");
		l5.setFont(new Font("Raleway" ,Font.BOLD,22 ));
		l5.setBounds(100,220,200,30);
		add(l5);
		
		dateChooser=new JDateChooser();
		dateChooser.setBounds(305,230,200,30);
		add(dateChooser);

		
		l6=new JLabel("Gender:");
		l6.setFont(new Font("Raleway" ,Font.BOLD,22 ));
		l6.setBounds(100,260,200,30);
		add(l6);
		
		//RADIO BUTTON ADDED MALE FEMALE OTHER
		r1=new JRadioButton("Male");
		r1.setFont(new Font("Tahoma",Font.BOLD,14));
		r1.setBackground(Color.white);
		r1.setBounds(305,260,100,30);
		add(r1);
		
		r2=new JRadioButton("Female");
		r2.setFont(new Font("Tahoma",Font.BOLD,14));
		r2.setBackground(Color.white);
		r2.setBounds(405,260,100,30);
		add(r2);
		
		r3=new JRadioButton("Other");
		r3.setFont(new Font("Tahoma",Font.BOLD,14));
		r3.setBackground(Color.white);
		r3.setBounds(505,260,100,30);
		add(r3);
		
		ButtonGroup bgGender=new ButtonGroup();
		bgGender.add(r1);
		bgGender.add(r2);
		bgGender.add(r3);
		
		
		
		l7=new JLabel("Email Address:");
		l7.setFont(new Font("Raleway" ,Font.BOLD,22 ));
		l7.setBounds(100,300,200,30);
		add(l7);
		
		tf3=new JTextField(15);
		tf3.setFont(new Font ("Arial",Font.BOLD,20));
		tf3.setBounds(305,300,300,30);
		add(tf3);
			
		
		l8=new JLabel("Marital Status:");
		l8.setFont(new Font("Raleway" ,Font.BOLD,22 ));
		l8.setBounds(100,340,200,30);
		add(l8);
		
		r4=new JRadioButton("Married");
		r4.setFont(new Font("Tahoma",Font.BOLD,14));
		r4.setBackground(Color.white);
		r4.setBounds(305,340,100,30);
		add(r4);
		
		r5=new JRadioButton("UnMarried");
		r5.setFont(new Font("Tahoma",Font.BOLD,14));
		r5.setBackground(Color.white);
		r5.setBounds(410,340,120,30);
		add(r5);
		
		r6=new JRadioButton("Other");
		r6.setFont(new Font("Tahoma",Font.BOLD,14));
		r6.setBackground(Color.white);
		r6.setBounds(535,340,120,30);
		add(r6);
		
		
		ButtonGroup bgMaritalStatus =new ButtonGroup();
		bgMaritalStatus.add(r4);
		bgMaritalStatus.add(r5);
		bgMaritalStatus.add(r6);
		
		
		l9=new JLabel("Address:");
		l9.setFont(new Font("Raleway" ,Font.BOLD,22 ));
		l9.setBounds(100,380,200,30);
		add(l9);
		
		tf4=new JTextField(15);
		tf4.setFont(new Font ("Arial",Font.BOLD,20));
		tf4.setBounds(305,380,300,30);
		add(tf4);
			
		
		l10=new JLabel("City:");
		l10.setFont(new Font("Raleway" ,Font.BOLD,22 ));
		l10.setBounds(100,420,200,30);
		add(l10);
		
		tf5=new JTextField(15);
		tf5.setFont(new Font ("Arial",Font.BOLD,20));
		tf5.setBounds(305,420,300,30);
		add(tf5);
			
		
		l11=new JLabel("Pin Code:");
		l11.setFont(new Font("Raleway" ,Font.BOLD,22 ));
		l11.setBounds(100,460,200,30);
		add(l11);
		
		tf7=new JTextField(15);
		tf7.setFont(new Font ("Arial",Font.BOLD,20));
		tf7.setBounds(305,460,300,30);
		add(tf7);
			
		
		l12=new JLabel("State:");
		l12.setFont(new Font("Raleway" ,Font.BOLD,22 ));
		l12.setBounds(100,500,200,30);
		add(l12);
		
		tf6=new JTextField(15);
		tf6.setFont(new Font ("Arial",Font.BOLD,20));
		tf6.setBounds(305,500,300,30);
		add(tf6);
		
		b=new JButton ("Next");
		b.setFont(new Font ("Arial",Font.BOLD,20));
		b.setBackground(Color.BLACK);
		b.setForeground(Color.WHITE);
		b.setBounds(600,600,80,30);
		add(b);
		
			
		/*l13=new JLabel("Date:");
		l13.setFont(new Font("Raleway" ,Font.BOLD,22 ));
		l13.setBounds(100,540,200,30);
		add(l13);
		
		l14=new JLabel("Month:");
		l14.setFont(new Font("Raleway" ,Font.BOLD,22 ));
		l14.setBounds(100,580,200,30);
		add(l14);
		
		l15=new JLabel("Year:");
		l15.setFont(new Font("Raleway" ,Font.BOLD,22 ));
		l15.setBounds(100,620,200,30);
		add(l15);
		*/
		
		getContentPane().setBackground(Color.white);
		setVisible(true);
		setSize (800,700);
		setLocation (400,100);
		
	}

	public static void main(String[] args) {
		Signup obj=new Signup();
		

	}

}
