package bank;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;


public class SignupTwo extends JFrame implements ActionListener{
	// INSTANCE VARIABLE
	JLabel lblAdditionalDetails,lblReligion,lblCategory,lblIncome,lblCitizen,lblOccupation,lblExisitingaccount,lblPANNUMBER,lblAadharnumber,lblpincode,lblstate,l13,l14,l15;
	JTextField tfReligion, tfCategory, tfIncome, tfOccupation, tfPannumber, tfAadharnumber, tfEducationalQualification;
	JRadioButton rbnyes,rbnNo,rbnyes2,rbnno2,rbnother2;
	JComboBox jcbReligion,jcbCategory,jcbIncome,jcbEducationalQualification,jcbOccupation;
	JButton 	btnnext;
	String formno="";
	/*Random r=new  Random();
	long randNum=r.nextLong() %900+100;
	String  number=""+Math.abs(randNum);      //MATH CLASS FOR DO N.O IN +VE N.O
	*/
	
	
	//NON PARAM CONSTRUCTOR//now change into parameterized constructor because add  formno
	public SignupTwo(String formno) {
        this.formno=formno;
		setTitle ("New Account Application Form page-2:");
		setLayout(null);
		
		lblAdditionalDetails=new JLabel("Page 2: Additional Details of Costomer");
		lblAdditionalDetails.setFont(new Font("Raleway" ,Font.BOLD,25 ));
		lblAdditionalDetails.setBounds(170,80,600,40);
		add(lblAdditionalDetails);
		
		lblReligion=new JLabel("Religion:");
		lblReligion.setFont(new Font("Raleway" ,Font.BOLD,22 ));
		lblReligion.setBounds(100,140,200,30);
		add(lblReligion);
		
		String[] Religion = {"Hindu","Muslim", "Sikh","Chritian", "Other"};
		jcbReligion=new JComboBox(Religion);jcbReligion.setBackground(Color.WHITE);
		jcbReligion.setFont(new Font ("Arial",Font.BOLD,20));
		jcbReligion.setBounds(305,130,300,30);
		add(jcbReligion);
			
			
		lblCategory=new JLabel("Category :");
		lblCategory.setFont(new Font("Raleway" ,Font.BOLD,22 ));
		lblCategory.setBounds(100,180,200,30);
		add(lblCategory);
		
		String[] Category = {"General","OBC", "SC","ST", "Other"};
		jcbCategory=new JComboBox(Category);jcbCategory.setBackground(Color.WHITE);	
		jcbCategory.setFont(new Font ("Arial",Font.BOLD,20));
		jcbCategory.setBounds(305,180,300,30);
		add(jcbCategory);
					
		lblIncome=new JLabel("Income:");
		lblIncome.setFont(new Font("Raleway" ,Font.BOLD,22 ));
		lblIncome.setBounds(100,220,200,30);
		add(lblIncome);
		
		String[] Income = {"Null","<1,50,000>", "<2,50,000>","<5,00,000>", "Upto  10,00,000"};
		jcbIncome=new JComboBox(Income);jcbIncome.setBackground(Color.WHITE);	
	    jcbIncome.setFont(new Font ("Arial",Font.BOLD,20));
	    jcbIncome.setBounds(305,220,300,30);
		add(jcbIncome);

		lblCitizen=new JLabel("Senior citizen:");
		lblCitizen.setFont(new Font("Raleway" ,Font.BOLD,22 ));
		lblCitizen.setBounds(100,260,200,30);
		add(lblCitizen);
		
		//RADIO BUTTON ADDED MALE FEMALE OTHER
		rbnyes=new JRadioButton("Yes");
		rbnyes.setFont(new Font("Tahoma",Font.BOLD,14));
		rbnyes.setBackground(Color.white);
		rbnyes.setBounds(305,260,100,30);
		add(rbnyes);
		
		rbnNo=new JRadioButton("No");
		rbnNo.setFont(new Font("Tahoma",Font.BOLD,14));
		rbnNo.setBackground(Color.white);
		rbnNo.setBounds(405,260,100,30);
		add(rbnNo);
		
		ButtonGroup bgCitezen=new ButtonGroup();
		bgCitezen.add(rbnyes);
		bgCitezen.add(rbnNo);
		
		lblOccupation=new JLabel("Occupation :");
		lblOccupation.setFont(new Font("Raleway" ,Font.BOLD,22 ));
		lblOccupation.setBounds(100,300,200,30);
		add(lblOccupation);
				
		String[] Occupation = {"Salaried","Self-Employed", "Business","Student","Retired", "Other"};
		jcbOccupation=new JComboBox(Occupation);jcbOccupation.setBackground(Color.WHITE);
		jcbOccupation.setFont(new Font ("Arial",Font.BOLD,20));
		jcbOccupation.setBounds(305,300,300,30);
		add(jcbOccupation);
			
		lblExisitingaccount=new JLabel("Exisiting account:");
		lblExisitingaccount.setFont(new Font("Raleway" ,Font.BOLD,22 ));
		lblExisitingaccount.setBounds(100,340,200,30);
		add(lblExisitingaccount);
		
		rbnyes2=new JRadioButton("Yes");
		rbnyes2.setFont(new Font("Tahoma",Font.BOLD,14));
		rbnyes2.setBackground(Color.white);
		rbnyes2.setBounds(305,340,100,30);
		add(rbnyes2);
		
		rbnno2=new JRadioButton("No");
		rbnno2.setFont(new Font("Tahoma",Font.BOLD,14));
		rbnno2.setBackground(Color.white);
		rbnno2.setBounds(410,340,120,30);
		add(rbnno2);
		
		ButtonGroup bgMaritalStatus =new ButtonGroup();
		bgMaritalStatus.add(rbnyes2);
		bgMaritalStatus.add(rbnno2);
		
		lblPANNUMBER=new JLabel("Pan Number:");
		lblPANNUMBER.setFont(new Font("Raleway" ,Font.BOLD,22 ));
		lblPANNUMBER.setBounds(100,380,200,30);
		add(lblPANNUMBER);
		
		tfPannumber=new JTextField(15);
		tfPannumber.setFont(new Font ("Arial",Font.BOLD,20));
		tfPannumber.setBounds(305,380,300,30);
		add(tfPannumber);
			
		
		lblAadharnumber=new JLabel("Aadhar Number:");
		lblAadharnumber.setFont(new Font("Raleway" ,Font.BOLD,22 ));
		lblAadharnumber.setBounds(100,420,200,30);
		add(lblAadharnumber);
		
		tfAadharnumber=new JTextField(15);
		tfAadharnumber.setFont(new Font ("Arial",Font.BOLD,20));
		tfAadharnumber.setBounds(305,420,300,30);
		add(tfAadharnumber);
			
		
		lblpincode=new JLabel("Educational");
		lblpincode.setFont(new Font("Raleway" ,Font.BOLD,22 ));
		lblpincode.setBounds(100,460,400,30);
		add(lblpincode);
		
		
		String[] EducationalQualification = {"Null","Non-Graduate", "Graduate","post-Graduate", "Other"};
		jcbEducationalQualification=new JComboBox(EducationalQualification);jcbEducationalQualification.setBackground(Color.WHITE);	
		jcbEducationalQualification.setFont(new Font ("Arial",Font.BOLD,20));
		jcbEducationalQualification.setBounds(305,480,300,40);
		add(jcbEducationalQualification);
			
		
		lblstate=new JLabel("Qualification:");
		lblstate.setFont(new Font("Raleway" ,Font.BOLD,22 ));
		lblstate.setBounds(100,490,150,20);
		add(lblstate);
		
		btnnext=new JButton ("Next");
		btnnext.setFont(new Font ("Arial",Font.BOLD,20));
		btnnext.setBackground(Color.BLACK);
		btnnext.setForeground(Color.WHITE);
		btnnext.setBounds(600,600,80,30);
		add(btnnext);
		btnnext.addActionListener(this);
		
		getContentPane().setBackground(Color.WHITE);
		setVisible(true);
		setSize (800,700);
		setLocation (400,100);
		
	}

	public static void main(String[] args) {
		SignupTwo obj=new SignupTwo("");
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		String religion=(String) jcbReligion.getSelectedItem();
		String category=(String) jcbCategory.getSelectedItem();
		String income=(String) jcbIncome.getSelectedItem();
		String occupation =(String) jcbOccupation.getSelectedItem();
		String pannumber=(String) tfPannumber.getSelectedText();
		String aadharnumber=(String) tfAadharnumber.getSelectedText();
		String educationalqlification=(String) jcbEducationalQualification.getSelectedItem();
		String seniorcitizen="";
		if(rbnyes.isSelected()) {
			seniorcitizen="Yes";
		}
		else if (rbnNo.isSelected()) {
			seniorcitizen="No";
		}
		String existingaccount="";
		if(rbnyes2.isSelected()) {
			existingaccount="Yes";
		}
		else if (rbnno2.isSelected()) {
			existingaccount="No";
		}
		
		try {
			ConnectionFactory cf=new ConnectionFactory();
			String query="insert into Signuptwo values('"+formno+"','"+religion+"','"+category+"','"+income+"','"+occupation+"','"+pannumber+"','"+aadharnumber+"','"+educationalqlification+"','"+seniorcitizen+"','"+existingaccount+"')";
			cf.stmt.executeUpdate(query);
			JOptionPane.showMessageDialog(null,"Congrates" );
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
