package bank;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;


public class Signup extends JFrame implements ActionListener{
	// INSTANCE VARIABLE
	JLabel lblApplication,lblPersonalDetails,lblName,lblfather,lbldateofbirth,lblGender,lblEmail,lblMaritalStatus,lblAddress,lblcity,lblpincode,lblstate,l13,l14,l15;
	JTextField tfname, tfFatherName, tfEmailAddress, tfAddress, tfCity, tfPinCode, tfState;
	JRadioButton rbnmale,rbnfemale,rbnother,rbnmarried,rbnunmarried,rbnother2;
	JButton 	btnnext;
	
	
	JDateChooser dateChooser;

	
	
	Random r=new  Random();
	long randNum=r.nextLong() %900+100;
	String  number=""+Math.abs(randNum);      //MATH CLASS FOR DO N.O IN +VE N.O
	
	
	
	//NON PARAM CONSTRUCTOR
	public Signup() {
		setTitle ("New Account Application Form:");
		setLayout(null);
		
		lblApplication=new JLabel("Application Form: " +number);
		lblApplication.setFont(new Font("Arial" ,Font.BOLD,35 ));
		lblApplication.setBounds(150,20,600,40);
		add(lblApplication);
		
		lblPersonalDetails=new JLabel("Personal Details of Costomer");
		lblPersonalDetails.setFont(new Font("Raleway" ,Font.BOLD,25 ));
		lblPersonalDetails.setBounds(170,80,600,40);
		add(lblPersonalDetails);
		
		lblName=new JLabel("Your Name:");
		lblName.setFont(new Font("Raleway" ,Font.BOLD,22 ));
		lblName.setBounds(100,140,200,30);
		add(lblName);
		
		tfname=new JTextField(15);
		tfname.setFont(new Font ("Arial",Font.BOLD,20));
		tfname.setBounds(305,130,300,30);
		add(tfname);
			
			
		lblfather=new JLabel("Father's Name:");
		lblfather.setFont(new Font("Raleway" ,Font.BOLD,22 ));
		lblfather.setBounds(100,180,200,30);
		add(lblfather);
		
		tfFatherName=new JTextField(15);
		tfFatherName.setFont(new Font ("Arial",Font.BOLD,20));
		tfFatherName.setBounds(305,180,300,30);
		add(tfFatherName);
			
		
		lbldateofbirth=new JLabel("Date of Birth:");
		lbldateofbirth.setFont(new Font("Raleway" ,Font.BOLD,22 ));
		lbldateofbirth.setBounds(100,220,200,30);
		add(lbldateofbirth);
		
		dateChooser=new JDateChooser();
		dateChooser.setBounds(305,220,200,30);
		add(dateChooser);

		
		lblGender=new JLabel("Gender:");
		lblGender.setFont(new Font("Raleway" ,Font.BOLD,22 ));
		lblGender.setBounds(100,260,200,30);
		add(lblGender);
		
		//RADIO BUTTON ADDED MALE FEMALE OTHER
		rbnmale=new JRadioButton("Male");
		rbnmale.setFont(new Font("Tahoma",Font.BOLD,14));
		rbnmale.setBackground(Color.white);
		rbnmale.setBounds(305,260,100,30);
		add(rbnmale);
		
		rbnfemale=new JRadioButton("Female");
		rbnfemale.setFont(new Font("Tahoma",Font.BOLD,14));
		rbnfemale.setBackground(Color.white);
		rbnfemale.setBounds(405,260,100,30);
		add(rbnfemale);
		
		rbnother=new JRadioButton("Other");
		rbnother.setFont(new Font("Tahoma",Font.BOLD,14));
		rbnother.setBackground(Color.white);
		rbnother.setBounds(505,260,100,30);
		add(rbnother);
		
		ButtonGroup bgGender=new ButtonGroup();
		bgGender.add(rbnmale);
		bgGender.add(rbnfemale);
		bgGender.add(rbnother);
		
		
		
		lblEmail=new JLabel("Email Address:");
		lblEmail.setFont(new Font("Raleway" ,Font.BOLD,22 ));
		lblEmail.setBounds(100,300,200,30);
		add(lblEmail);
		
		tfEmailAddress=new JTextField(15);
		tfEmailAddress.setFont(new Font ("Arial",Font.BOLD,20));
		tfEmailAddress.setBounds(305,300,300,30);
		add(tfEmailAddress);
			
		
		lblMaritalStatus=new JLabel("Marital Status:");
		lblMaritalStatus.setFont(new Font("Raleway" ,Font.BOLD,22 ));
		lblMaritalStatus.setBounds(100,340,200,30);
		add(lblMaritalStatus);
		
		rbnmarried=new JRadioButton("Married");
		rbnmarried.setFont(new Font("Tahoma",Font.BOLD,14));
		rbnmarried.setBackground(Color.white);
		rbnmarried.setBounds(305,340,100,30);
		add(rbnmarried);
		
		rbnunmarried=new JRadioButton("UnMarried");
		rbnunmarried.setFont(new Font("Tahoma",Font.BOLD,14));
		rbnunmarried.setBackground(Color.white);
		rbnunmarried.setBounds(410,340,120,30);
		add(rbnunmarried);
		
		rbnother2=new JRadioButton("Other");
		rbnother2.setFont(new Font("Tahoma",Font.BOLD,14));
		rbnother2.setBackground(Color.white);
		rbnother2.setBounds(535,340,120,30);
		add(rbnother2);
		
		
		ButtonGroup bgMaritalStatus =new ButtonGroup();
		bgMaritalStatus.add(rbnmarried);
		bgMaritalStatus.add(rbnunmarried);
		bgMaritalStatus.add(rbnother2);
		
		
		lblAddress=new JLabel("Address:");
		lblAddress.setFont(new Font("Raleway" ,Font.BOLD,22 ));
		lblAddress.setBounds(100,380,200,30);
		add(lblAddress);
		
		tfAddress=new JTextField(15);
		tfAddress.setFont(new Font ("Arial",Font.BOLD,20));
		tfAddress.setBounds(305,380,300,30);
		add(tfAddress);
			
		
		lblcity=new JLabel("City:");
		lblcity.setFont(new Font("Raleway" ,Font.BOLD,22 ));
		lblcity.setBounds(100,420,200,30);
		add(lblcity);
		
		tfCity=new JTextField(15);
		tfCity.setFont(new Font ("Arial",Font.BOLD,20));
		tfCity.setBounds(305,420,300,30);
		add(tfCity);
			
		
		lblpincode=new JLabel("Pin Code:");
		lblpincode.setFont(new Font("Raleway" ,Font.BOLD,22 ));
		lblpincode.setBounds(100,460,200,30);
		add(lblpincode);
		
		tfPinCode=new JTextField(15);
		tfPinCode.setFont(new Font ("Arial",Font.BOLD,20));
		tfPinCode.setBounds(305,460,300,30);
		add(tfPinCode);
			
		
		lblstate=new JLabel("State:");
		lblstate.setFont(new Font("Raleway" ,Font.BOLD,22 ));
		lblstate.setBounds(100,500,200,30);
		add(lblstate);
		
		tfState=new JTextField(15);
		tfState.setFont(new Font ("Arial",Font.BOLD,20));
		tfState.setBounds(305,500,300,30);
		add(tfState);
		
		btnnext=new JButton ("Next");
		btnnext.setFont(new Font ("Arial",Font.BOLD,20));
		btnnext.setBackground(Color.BLACK);
		btnnext.setForeground(Color.WHITE);
		btnnext.setBounds(600,600,80,30);
		add(btnnext);
		btnnext.addActionListener(this);
		
		
		
			
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
		
		getContentPane().setBackground(Color.WHITE);
		setVisible(true);
		setSize (800,700);
		setLocation (400,100);
		
	}

	public static void main(String[] args) {
		Signup obj=new Signup();
		

	}
	//tfname, tfFatherName, tfEmailAddress, tfAddress, tfCity, tfPinCode, tfState;
	//rbnmale,rbnfemale,rbnother,rbnmarried,rbnunmarried,rbnother2;

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String formNum=number;
		String name= tfname.getText();
		String fname= tfFatherName.getText();
		String dob=((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
		String email=tfEmailAddress.getText();
		String address=tfAddress.getText();
		String city=tfCity.getText();
		String pincode=tfPinCode.getText();
		String state=tfState.getText();
		String gender=null;
		if(rbnmale.isSelected()) {
			gender="Male";
		}
		else if (rbnfemale.isSelected()) {
			gender="Female";
		}
		String maritalstatus=null;
		if(rbnmarried.isSelected()) {
			maritalstatus="Married";
		}
		else if (rbnunmarried.isSelected()) {
			maritalstatus="UnMarried";
		}
		else if (rbnother.isSelected()) {
			maritalstatus="Other";
		}
		
		
		
		
			try {
				if(tfname.getText().equals("")) {
				JOptionPane.showMessageDialog(null, " PLEASE ENTER YOUR NAME");
				
				}
				else {//cf is connection factory variable
					ConnectionFactory cf=new ConnectionFactory();
					String query="insert into Signup values('"+formNum+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+maritalstatus+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";
					cf.stmt.executeUpdate(query);
					//JOptionPane.showMessageDialog(null,"Congrates" );   //message pass 
					//1st  signup pageis hidden
					setVisible(false);
					new SignupTwo(formNum).setVisible(true);
				}
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
		
}

}