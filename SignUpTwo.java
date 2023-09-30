package bank.management.system;

import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;


public class SignUpTwo extends JFrame implements ActionListener{
    
   
    
    JTextField adhar1TextField,pannoTextField;
    JComboBox religion1,income1,occupt,quali,category1;
    JRadioButton yes,no,yes1,no1;
    String formno;
    JButton next;
    
    SignUpTwo(String formno){
        this.formno=formno;
        setLayout(null);
        
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        
        JLabel additionalDetails=new JLabel("Page 2: Additional Details");
        additionalDetails.setFont(new Font("Raleway",Font.BOLD,22));
        additionalDetails.setBounds(280,80,350,40);
        add(additionalDetails);
        
        JLabel religion=new JLabel("Religion: ");
        religion.setFont(new Font("Arial",Font.BOLD,22));
        religion.setBounds(100, 140, 100, 30);
        add(religion);
        
        String valReligion[]={"Select","Hindu","Muslim","Christian","Sikh","Other"};
        religion1=new JComboBox(valReligion);
        religion1.setBounds(300,140,400,30);
        religion1.setBackground(Color.WHITE);
        add(religion1);
        
        JLabel category=new JLabel("Category");
        category.setFont(new Font("Arial",Font.BOLD,22));
        category.setBounds(100, 190, 100, 30);
        add(category);
        
        String valcategory[]={"Select","General","OBC","SC","ST","Others"};
        category1=new JComboBox(valcategory);
        category1.setBounds(300,190,400,30);
        category1.setBackground(Color.WHITE);
        add(category1);
        
        JLabel income=new JLabel("Income");
        income.setFont(new Font("Arial",Font.BOLD,22));
        income.setBounds(100, 240, 100, 30);
        add(income);
        
        String valincome[]={"Select","Null","< 100000","100001 - 500000","500001 - 1000000","> 1000000"};
        income1=new JComboBox(valincome);
        income1.setBounds(300, 240, 400, 30);
        income.setBackground(Color.WHITE);
        add(income1);
        
        JLabel education=new JLabel("Educational");
        education.setFont(new Font("Arial",Font.BOLD,22));
        education.setBounds(100,290,150,30);
        add(education);
        
        JLabel qualification=new JLabel("Qualification: ");
        qualification.setFont(new Font("Arial",Font.BOLD,22));
        qualification.setBounds(100, 320, 150, 30);
        add(qualification);
        
        String valqualification[]={"Select","10th","12th","Bachlor Degree","Master Degree","Phd","Other"};
        quali=new JComboBox(valqualification);
        quali.setBackground(Color.white);
        quali.setBounds(300, 300, 400, 30);
        add(quali);
        
        JLabel occupation=new JLabel("Occuption: ");
        occupation.setFont(new Font("Arial",Font.BOLD,22));
        occupation.setBounds(100,370,150,30);
        add(occupation);
        
        String valoccupation[]={"Select","Business","Farmer","Housewife","Owner","Employee"};
        occupt=new JComboBox(valoccupation);
        occupt.setBackground(Color.white);
        occupt.setBounds(300, 370, 400, 30);
        add(occupt);
        
        JLabel pan=new JLabel("PAN Number: ");
        pan.setFont(new Font("Arial",Font.BOLD,22));
        pan.setBounds(100,420,150,30);
        add(pan);
        
        pannoTextField=new JTextField();
        pannoTextField.setBounds(300, 420, 400, 30);
        pannoTextField.setFont(new Font("Arial",Font.BOLD,18));
        add(pannoTextField);
        
        JLabel adhar=new JLabel("Aadhar Number: ");
        adhar.setFont(new Font("Arial",Font.BOLD,22));
        adhar.setBounds(100, 470, 200, 30);
        add(adhar);
        
        adhar1TextField=new JTextField();
        adhar1TextField.setFont(new Font("Arial",Font.BOLD,18));
        adhar1TextField.setBounds(300, 470, 400, 30);
        add(adhar1TextField);
        
        JLabel senior=new JLabel("Senior Citizen: ");
        senior.setFont(new Font("Arial",Font.BOLD,22));
        senior.setBounds(100,520,180,30);
        add(senior);
        
        yes=new JRadioButton("Yes");
        yes.setFont(new Font("Arial",Font.BOLD,18));
        yes.setBounds(300, 520, 100, 30);
        yes.setBackground(Color.white);
        add(yes);
        
        no=new JRadioButton("No");
        no.setFont(new Font("Arial",Font.BOLD,18));
        no.setBounds(450, 520, 100, 30);
        no.setBackground(Color.white);
        add(no);
        
        ButtonGroup seniorgroup=new ButtonGroup();
        seniorgroup.add(yes);
        seniorgroup.add(no);
        
        JLabel exiting=new JLabel("Existing Account: ");
        exiting.setFont(new Font("Arial",Font.BOLD,22));
        exiting.setBounds(100,570,200,30);
        add(exiting);
        
        yes1=new JRadioButton("Yes");
        yes1.setFont(new Font("Arial",Font.BOLD,18));
        yes1.setBounds(300, 570, 100, 30);
        yes1.setBackground(Color.white);
        add(yes1);
        
        no1=new JRadioButton("No");
        no1.setFont(new Font("Arial",Font.BOLD,18));
        no1.setBounds(450, 570, 100, 30);
        no1.setBackground(Color.white);
        add(no1);
        
        ButtonGroup exitinggroup=new ButtonGroup();
        exitinggroup.add(yes1);
        exitinggroup.add(no1);
        
        next=new JButton("Next");
        next.setFont(new Font("Arial",Font.BOLD,22));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(600, 620, 100, 30);
        next.addActionListener(this);
        add(next);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }
       
    public void actionPerformed(ActionEvent ae){
       
      
        String sreligion=(String)religion1.getSelectedItem();
        String scategory=(String)category1.getSelectedItem();
        String sincome=(String)income1.getSelectedItem();
        String squali=(String)quali.getSelectedItem();
        String soccupt=(String)occupt.getSelectedItem();
        String senior=null;
        if(yes.isSelected()){
            senior="Yes";
        } else if(no.isSelected()){
            senior="No";
        }
        String exiting=null;
        if(yes.isSelected()){
            exiting="Yes";
        } else if(no.isSelected()){
            exiting="No";
        }
        
        String panno=pannoTextField.getText();
        String adhar=adhar1TextField.getText();
        
        try{
                
            Conn c=new Conn();
            String query="insert into signuptwo values('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+panno+"','"+adhar+"','"+squali+"','"+senior+"','"+exiting+"','"+soccupt+"')";
            c.s.executeUpdate(query);
            
       
            
            //signup3 object
            setVisible(false);
            new SignUpThree(formno).setVisible(true);
            
            
        } catch(Exception e){
            System.out.println(e);
        }
    }
    public static void main(String args[]){
        new SignUpTwo("");
    }
}
