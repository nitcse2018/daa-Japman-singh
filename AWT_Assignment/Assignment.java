package swingdemo;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class Assignment implements ActionListener
{
//Declaring the objects
JFrame f;
JPanel p1,p2,p3,p4;
JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22,l23,l24;
JLabel l25,l26,l27,l28,l29,l30;
JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17,t18,t19,t20,t21,t22,t23,t24;
JTextField t25,t26,t27,t28,t29,t30,t31,t32;
JButton j1;
    //Defining a constructor of the class
    public Assignment()
    {  //Making a new frame
    	f=new JFrame("Resume Builder");
    	
       //Designing the panel 1-which includes personal details and objectives
    	p1 = new JPanel(); // sub-panel 
    	p1.setBackground(Color.cyan);
    	p1.setLayout(null);
        l1 = new JLabel("Resume");
    	l1.setBounds(570,0,150,50);
    	l1.setFont(new Font("Tahoma", Font.BOLD, 26));
    	p1.add(l1);
    	l2= new JLabel("Personal Details");
    	l2.setBounds(250,35,200,20);
       	l2.setFont(new Font("Tahoma", Font.BOLD, 16));
    	p1.add(l2);
    	l3= new JLabel("Full Name");
     	l3.setBounds(10, 70,70,25);
    	l3.setFont(new Font("Tahoma", Font.BOLD, 14));
     	p1.add(l3);
     	t1=new JTextField();
     	t1.setBounds(150, 70, 250, 25);
     	p1.add(t1);
     	l4= new JLabel("Contact No.");
     	l4.setBounds(10, 110,100,25);
    	l4.setFont(new Font("Tahoma", Font.BOLD, 14));
     	p1.add(l4);
     	t2=new JTextField();
     	t2.setBounds(150, 110, 250, 25);
     	p1.add(t2);
     	l5= new JLabel("Address");
     	l5.setBounds(10, 150,100,25);
    	l5.setFont(new Font("Tahoma", Font.BOLD, 14));
     	p1.add(l5);
     	t3=new JTextField();
     	t3.setBounds(150, 150, 250, 25);
     	p1.add(t3);
     	l6= new JLabel("E-Mail ID");
     	l6.setBounds(10, 190,100,25);
    	l6.setFont(new Font("Tahoma", Font.BOLD, 14));
     	p1.add(l6);
     	t4=new JTextField();
     	t4.setBounds(150,190, 250, 25);
     	p1.add(t4);
     	l7= new JLabel("Objective");
     	l7.setBounds(10, 230,100,25);
    	l7.setFont(new Font("Tahoma", Font.BOLD, 14));
     	p1.add(l7);
     	t32=new JTextField();
       	t32.setBounds(150,230,350,60);
       	p1.add(t32);

    	//Designing panel 3 which includes educational qualifications
    	p3 = new JPanel(); // sub-panel 2
        p3.setBackground(Color.cyan);
    	p3.add(new JLabel("Panel Two", SwingConstants.CENTER));
    	p3.setLayout(null);
        l8= new JLabel("Educational Qualifications");
        l8.setFont(new Font("Tahoma", Font.BOLD, 16));
    	l8.setBounds(215,0,300,20);
    	p3.add(l8);
    	l9= new JLabel("Secondary ");
     	l9.setBounds(10, 35,135,25);
    	l9.setFont(new Font("Tahoma", Font.BOLD, 14));
     	p3.add(l9);
     	t5=new JTextField();
     	t5.setBounds(150, 35, 250, 25);
     	p3.add(t5);
     	l10= new JLabel("Passing Year");
     	l10.setBounds(10, 70,135,25);
    	l10.setFont(new Font("Tahoma", Font.BOLD, 14));
     	p3.add(l10);
     	t6=new JTextField();
     	t6.setBounds(150, 70, 100, 25);
     	p3.add(t6);
     	l11= new JLabel("Percent/CGPA");
     	l11.setBounds(10, 105,135,25);
    	l11.setFont(new Font("Tahoma", Font.BOLD, 14));
     	p3.add(l11);
     	t7=new JTextField();
     	t7.setBounds(150, 105, 100, 25);
     	p3.add(t7);
     	l12= new JLabel("Senior Secondary");
     	l12.setBounds(10, 140,135,25);
    	l12.setFont(new Font("Tahoma", Font.BOLD, 14));
     	p3.add(l12);
     	t8=new JTextField();
     	t8.setBounds(150, 140, 250, 25);
     	p3.add(t8);
     	l13= new JLabel("Passing Year");
     	l13.setBounds(10, 175,135,25);
    	l13.setFont(new Font("Tahoma", Font.BOLD, 14));
     	p3.add(l13);
     	t9=new JTextField();
     	t9.setBounds(150, 175, 100, 25);
     	p3.add(t9);
     	l14= new JLabel("Percent/CGPA");
     	l14.setBounds(10, 210,135,25);
    	l14.setFont(new Font("Tahoma", Font.BOLD, 14));
     	p3.add(l14);
     	t10=new JTextField();
     	t10.setBounds(150, 210, 100, 25);
     	p3.add(t10);
     	l15= new JLabel("College");
     	l15.setBounds(10, 245,135,25);
    	l15.setFont(new Font("Tahoma", Font.BOLD, 14));
     	p3.add(l15);
     	t11=new JTextField();
     	t11.setBounds(150, 245, 250, 25);
     	p3.add(t11);
     	l16= new JLabel("Passing Year");
     	l16.setBounds(10, 280,135,25);
    	l16.setFont(new Font("Tahoma", Font.BOLD, 14));
     	p3.add(l16);
     	t12=new JTextField();
     	t12.setBounds(150, 280, 100, 25);
     	p3.add(t12);
     	l17= new JLabel("Percent/CGPA");
     	l17.setBounds(10, 315,135,25);
    	l17.setFont(new Font("Tahoma", Font.BOLD, 14));
     	p3.add(l17);
     	t13=new JTextField();
     	t13.setBounds(150, 315, 100, 25);
     	p3.add(t13);
    	
    // Designing the panel 2 which contains the details of project and work experience
    	p2 = new JPanel(); // sub-panel 2
    	p2.setBackground(Color.cyan);
    	p2.add(new JLabel("Panel Two", SwingConstants.CENTER));
    	p2.setLayout(null);
        l18= new JLabel("Builder");
        l18.setFont(new Font("Tahoma", Font.BOLD, 26));
    	l18.setBounds(5, 0,150,50);
    	p2.add(l18);
    	l19= new JLabel("Projects and Work Experience");
    	l19.setBounds(200,35,250,20);
       	l19.setFont(new Font("Tahoma", Font.BOLD, 16));
    	p2.add(l19);
    	l20= new JLabel("Project 1");
     	l20.setBounds(10, 70,70,25);
    	l20.setFont(new Font("Tahoma", Font.BOLD, 14));
     	p2.add(l20);
     	t14=new JTextField("Enter Title");
     	t14.setBounds(150, 70, 250, 25);
     	p2.add(t14);
     	l21= new JLabel("Description");
     	l21.setBounds(10, 100,100,25);
    	l21.setFont(new Font("Tahoma", Font.BOLD, 14));
     	p2.add(l21);
     	t15=new JTextField("Enter Description");
     	t15.setBounds(150, 100, 250, 50);
     	p2.add(t15);
     	l22= new JLabel("Project 2");
     	l22.setBounds(10, 155,70,25);
    	l22.setFont(new Font("Tahoma", Font.BOLD, 14));
     	p2.add(l22);
     	t16=new JTextField("Enter Title");
     	t16.setBounds(150, 155, 250, 25);
     	p2.add(t16);
     	l23= new JLabel("Description");
     	l23.setBounds(10,185,100,25);
    	l23.setFont(new Font("Tahoma", Font.BOLD, 14));
     	p2.add(l23);
     	t17=new JTextField("Enter Description");
     	t17.setBounds(150, 185, 250, 50);
     	p2.add(t17);
     	l24= new JLabel("Project 3");
     	l24.setBounds(10, 240,70,25);
    	l24.setFont(new Font("Tahoma", Font.BOLD, 14));
     	p2.add(l24);
     	t18=new JTextField("Enter Title");
     	t18.setBounds(150, 240, 250, 25);
     	p2.add(t18);
     	l25= new JLabel("Description");
     	l25.setBounds(10,270,100,25);
    	l25.setFont(new Font("Tahoma", Font.BOLD, 14));
     	p2.add(l25);
     	t19=new JTextField("Enter Description");
     	t19.setBounds(150, 270,250, 50);
     	p2.add(t19);
    	
     // Designing panel 4 which includes skills,activities,achievements and a button to generate
     // text file
    	p4 = new JPanel(); 
    	p4.setBackground(Color.cyan);
    	p4.setLayout(null);
        l26= new JLabel("Skills");
        l26.setFont(new Font("Tahoma", Font.BOLD, 16));
    	l26.setBounds(80, 0,80,25);
    	p4.add(l26);
    	t20=new JTextField("Skill 1");
     	t20.setBounds(10, 35, 225, 25);
     	p4.add(t20);
     	t21=new JTextField("Skill 2");
     	t21.setBounds(10, 65, 225, 25);
     	p4.add(t21);
     	t22=new JTextField("Skill 3");
     	t22.setBounds(10, 95, 225, 25);
     	p4.add(t22);
     	t23=new JTextField("Skill 4");
     	t23.setBounds(10, 125, 225, 25);
     	p4.add(t23);
     	l27= new JLabel("Achievements");
        l27.setFont(new Font("Tahoma", Font.BOLD, 16));
     	l27.setBounds(50, 160,120,25);
     	p4.add(l27);
     	t24=new JTextField("Achievement 1");
      	t24.setBounds(10, 195, 225, 25);
      	p4.add(t24);
      	t25=new JTextField("Achievement 2");
      	t25.setBounds(10, 225, 225, 25);
      	p4.add(t25);
      	t26=new JTextField("Achievement 3");
      	t26.setBounds(10, 255, 225, 25);
      	p4.add(t26);
      	t27=new JTextField("Achievement 4");
      	t27.setBounds(10, 285, 225, 25);
      	p4.add(t27);
      	 l28= new JLabel("Co-Curricular Activities");
         l28.setFont(new Font("Tahoma", Font.BOLD, 16));
     	l28.setBounds(350, 0,200,25);
     	p4.add(l28);
     	t28=new JTextField("Activity 1");
      	t28.setBounds(340, 35, 225, 25);
      	p4.add(t28);
      	t29=new JTextField("Activity 2");
      	t29.setBounds(340, 65, 225, 25);
      	p4.add(t29);
      	t30=new JTextField("Activity 3");
      	t30.setBounds(340, 95, 225, 25);
      	p4.add(t30);
      	t31=new JTextField("Activity 4");
      	t31.setBounds(340, 125, 225, 25);
      	p4.add(t31);
    	j1=new JButton("Generate Resume");
    	j1.setBounds(340,230,150,50);
    	j1.addActionListener(this);
    	p4.add(j1);
    	
   // Adding the panels in the frame
    	f.add(p1);
    	f.add(p2);
    	f.add(p3);
    	f.add(p4);
    // Setting the layout to grid layout 
        f.setLayout(new GridLayout(2,2)); 
    // Setting the default size of the frame to screen size
        Toolkit tk = Toolkit.getDefaultToolkit();
        int xSize = ((int) tk.getScreenSize().getWidth());
        int ySize = ((int) tk.getScreenSize().getHeight());
    	f.setSize(xSize,ySize);
    //Setting the visibility on and default closing operation
        f.setVisible(true); 
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
   //Defining a subclass which defines action of the button
    public void actionPerformed(ActionEvent ae)
    {
    // Get the text from text fields
      String st1=t1.getText();
      String st=st1+".txt";
      String st2=t2.getText();
      String st3=t3.getText();
      String st4=t4.getText();
      String st5=t5.getText();
      String st6=t6.getText();
      String st7=t7.getText();
      String st8=t8.getText();
      String st9=t9.getText();
      String st10=t10.getText();
      String st11=t11.getText();
      String st12=t12.getText();
      String st13=t13.getText();
      String st14=t14.getText();
      String st15=t15.getText();
      String st16=t16.getText();
      String st17=t17.getText();
      String st18=t18.getText();
      String st19=t19.getText();
      String st20=t20.getText();
      String st21=t21.getText();
      String st22=t22.getText();
      String st23=t23.getText();
      String st24=t24.getText();
      String st25=t25.getText();
      String st26=t26.getText();
      String st27=t27.getText();
      String st28=t28.getText();
      String st29=t29.getText();
      String st30=t30.getText();
      String st31=t31.getText();
      String st32=t32.getText();      
      
    	try {
    		//Creating a new file
    	      File myObj = new File(st);
    	      if (myObj.createNewFile()) {
    	        System.out.println("File created: " + myObj.getName());
    	      } else {
    	        System.out.println("File already exists.");
    	      }
    	      try {
    	    //Writing into the created file in defined format
    	          FileWriter w = new FileWriter(st);
    	          w.write("\t\t\t\t\t\t\tRESUME\n\n");
    	          w.write("Name:\t"+st1+"\n");
    	          w.write("Contact No.:\t"+st2+"\n");
    	          w.write("Address:\t"+st3+"\n");
    	          w.write("Email-ID:\t"+st4+"\n\n");
    	          w.write("\tOBJECTIVE\n");
    	          w.write(st32+"\n\n");
    	          w.write("\tEDUCATIONAL QUALIFICATIONS\n");
    	          w.write("• Secondary School:\t"+st5+"\n");
    	          w.write("  Passing Year:\t"+st6+"\n");
    	          w.write("  Percentage/CGPA:\t"+st7+"\n");
    	          w.write("• Senior Secondary School:\t"+st8+"\n");
    	          w.write("  Passing Year:\t"+st9+"\n");
    	          w.write("  Percentage/CGPA:\t"+st10+"\n");
    	          w.write("• College:\t"+st11+"\n");
    	          w.write("  Passing Year:\t"+st12+"\n");
    	          w.write("  Percentage/CGPA:\t"+st13+"\n\n");
    	          w.write("\tSKILLS\n");
    	          w.write("•"+st20+"\n");
    	          w.write("•"+st21+"\n");
    	          w.write("•"+st22+"\n");
    	          w.write("•"+st23+"\n\n");
    	          w.write("\tPROJECTS AND WORK EXPERIENCE\n");
    	          w.write("• "+st14+"\n");
    	          w.write("  Description-"+st15+"\n");
    	          w.write("• "+st16+"\n");
    	          w.write("  Description-"+st17+"\n");
    	          w.write("• "+st18+"\n");
    	          w.write("  Description-"+st19+"\n\n");
    	          w.write("\tACHIEVEMENTS\n");
    	          w.write("•"+st24+"\n");
    	          w.write("•"+st25+"\n");
    	          w.write("•"+st26+"\n");
    	          w.write("•"+st27+"\n\n");
    	          w.write("\tCO-CURRICULAR ACTIVITIES\n");
    	          w.write("•"+st28+"\n");
    	          w.write("•"+st29+"\n");
    	          w.write("•"+st30+"\n");
    	          w.write("•"+st31+"\n\n");   
    	          
    	          w.close();
    	          System.out.println("Successfully wrote to the file.");
    	          
    	        //Code to open the text file on clicking the button
    	          ProcessBuilder pb = new ProcessBuilder("Notepad.exe", st);
    	          pb.start();
    	          
    	        } catch (IOException e) {
    	          System.out.println("An error occurred.");
    	          e.printStackTrace();
    	        }
    	    } catch (IOException e) {
    	      System.out.println("An error occurred.");
    	      e.printStackTrace();
    	    }
    	
    }
   
}




