package bank.management.system;

import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;


public class SignUpOne extends JFrame implements ActionListener {
    
    long random;
    
    JTextField nameTextField,fathernameTextField,mothernameTextField,addressTextField,emailTextField,pinTextField,cityTextField,stateTextField;
    JRadioButton male,female,other,martial,nonmartial;
    JButton next;
    JDateChooser dateChooser;
    
    SignUpOne(){
        
        setLayout(null);
        
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 1");
        Random ran=new Random();
        random=Math.abs((ran.nextLong()%9000L)+1000L);
        
        JLabel formno=new JLabel("APPLICATION FORM NO."+random);
        formno.setFont(new Font("Raleway",Font.BOLD,38));
        formno.setBounds(150, 20, 600, 40);
        add(formno);
        
        
        JLabel personalDetails=new JLabel("Page 1: Personal Details");
        personalDetails.setFont(new Font("Raleway",Font.BOLD,22));
        personalDetails.setBounds(280,80,350,40);
        add(personalDetails);
        
        JLabel name=new JLabel("Name :");
        name.setFont(new Font("Raleway",Font.BOLD,20));
        name.setBounds(100, 140, 100, 30);
        add(name);
        
        nameTextField=new JTextField();
        nameTextField.setFont(new Font("Arial",Font.BOLD,14));
        nameTextField.setBounds(300,140,400,30);
        add(nameTextField);
        
        JLabel fathername=new JLabel("Father's Name :");
        fathername.setFont(new Font("Raleway",Font.BOLD,20));
        fathername.setBounds(100, 180, 150, 30);
        add(fathername);
        
        fathernameTextField=new JTextField();
        fathernameTextField.setFont(new Font("Arial",Font.BOLD,14));
        fathernameTextField.setBounds(300,180,400,30);
        add(fathernameTextField);
        
        JLabel mothername=new JLabel("Mother's Name :");
        mothername.setFont(new Font("Raleway",Font.BOLD,20));
        mothername.setBounds(100, 220, 155, 30);
        add(mothername);
        
        mothernameTextField=new JTextField();
        mothernameTextField.setFont(new Font("Arial",Font.BOLD,14));
        mothernameTextField.setBounds(300,220,400,30);
        add(mothernameTextField);
        
        JLabel dob=new JLabel("Date of Birth :");
        dob.setFont(new Font("Raleway",Font.BOLD,20));
        dob.setBounds(100, 260, 150, 30);
        add(dob);
        
        dateChooser=new JDateChooser();
        dateChooser.setFont(new Font("Arial",Font.BOLD,14));
        dateChooser.setBounds(300,260,400,30);
        add(dateChooser);
        
        JLabel gender=new JLabel("Gender :");
        gender.setFont(new Font("Raleway",Font.BOLD,20));
        gender.setBounds(100, 300, 100, 30);
        add(gender);
        
        male=new JRadioButton("Male");
        male.setFont(new Font("Arial",Font.BOLD,14));
        male.setBackground(Color.WHITE);
        male.setBounds(300,300,100,30);
        add(male);
        
        female=new JRadioButton("Female");
        female.setFont(new Font("Arial",Font.BOLD,14));
        female.setBackground(Color.WHITE);
        female.setBounds(500,300,100,30);
        add(female);
        
        ButtonGroup gendergroup=new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
        
        JLabel email=new JLabel("Email Adderss :");
        email.setFont(new Font("Raleway",Font.BOLD,20));
        email.setBounds(100,340, 150, 30);
        add(email);
        
        emailTextField=new JTextField();
        emailTextField.setFont(new Font("Arial",Font.BOLD,14));
        emailTextField.setBounds(300,340,400,30);
        add(emailTextField);
        
        JLabel mstatus=new JLabel("Martial Status :");
        mstatus.setFont(new Font("Raleway",Font.BOLD,20));
        mstatus.setBounds(100, 380,150, 30);
        add(mstatus);
        
         martial=new JRadioButton("Married");
        martial.setFont(new Font("Arial",Font.BOLD,14));
        martial.setBackground(Color.WHITE);
        martial.setBounds(300,380,100,30);
        add(martial);
        
         nonmartial=new JRadioButton("Unmarried");
        nonmartial.setFont(new Font("Arial",Font.BOLD,14));
        nonmartial.setBackground(Color.WHITE);
        nonmartial.setBounds(450,380,100,30);
        add(nonmartial);
        
         other=new JRadioButton("Other");
        other.setFont(new Font("Arial",Font.BOLD,14));
        other.setBackground(Color.WHITE);
        other.setBounds(600,380,100,30);
        add(other);
        
        ButtonGroup martialgroup=new ButtonGroup();
        martialgroup.add(martial);
        martialgroup.add(nonmartial);
        martialgroup.add(other);
        
        JLabel address=new JLabel("Address :");
        address.setFont(new Font("Raleway",Font.BOLD,20));
        address.setBounds(100, 420, 100, 30);
        add(address);
        
        addressTextField=new JTextField();
        addressTextField.setFont(new Font("Arial",Font.BOLD,14));
        addressTextField.setBounds(300,420,400,30);
        add(addressTextField);
        
        JLabel city=new JLabel("City :");
        city.setFont(new Font("Raleway",Font.BOLD,20));
        city.setBounds(100, 460, 100, 30);
        add(city);
        
        cityTextField=new JTextField();
        cityTextField.setFont(new Font("Arial",Font.BOLD,14));
        cityTextField.setBounds(300,460,400,30);
        add(cityTextField);
        
        JLabel state=new JLabel("State :");
        state.setFont(new Font("Raleway",Font.BOLD,20));
        state.setBounds(100, 500, 100, 30);
        add(state);
        
        stateTextField=new JTextField();
        stateTextField.setFont(new Font("Arial",Font.BOLD,14));
        stateTextField.setBounds(300,500,400,30);
        add(stateTextField);
        
        JLabel pincode=new JLabel("Pin Code :");
        pincode.setFont(new Font("Raleway",Font.BOLD,20));
        pincode.setBounds(100,540,150,30);
        add(pincode);
        
        pinTextField=new JTextField();
        pinTextField.setFont(new Font("Arial",Font.BOLD,14));
        pinTextField.setBounds(300,540,400,30);
        add(pinTextField);
        
        next=new JButton("Next");
        next.setFont(new Font("Arial",Font.BOLD,14));
        next.setBounds(600,600,100,30);
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
          String formno=""+random;  //long value
          String name=nameTextField.getText();// settext
          String fathername=fathernameTextField.getText();
          String mothername=mothernameTextField.getText();
          String dob=((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
          String gender=null;
          if(male.isSelected()){
              gender="Male";
          } else if(female.isSelected()){
              gender=":Female";
          }
          String email=emailTextField.getText();
          String mstatus=null;
          if(martial.isSelected()){
              mstatus="Married";
          } else if(nonmartial.isSelected()){
              mstatus="Unmarried";
          } else if(other.isSelected()){
              mstatus="Other";
          }
          String address=addressTextField.getText();
          String pin=pinTextField.getText();
          String city=cityTextField.getText();
          String state=stateTextField.getText();
          
          try{
              if(name.equals("")){
                  JOptionPane.showMessageDialog(null, "Name is required");
              }
              if(fathername.equals("")){
                  JOptionPane.showMessageDialog(null, "Father's Name is required");
              }
              if(mothername.equals("")){
                  JOptionPane.showMessageDialog(null, "Mother's Name is required");
              }
              if(dob.equals("")){
                  JOptionPane.showMessageDialog(null, "Date of Birth is required");
              }
              if(state.equals("")){
                  JOptionPane.showMessageDialog(null, "State is required");
              }
              if(city.equals("")){
                  JOptionPane.showMessageDialog(null, "City is required");
              }
              if(pin.equals("")){
                  JOptionPane.showMessageDialog(null, "Pin is required");
              } else {
                  Conn c=new Conn();
                  String query="insert into signup values('"+formno+"','"+name+"','"+fathername+"','"+mothername+"','"+dob+"','"+gender+"','"+email+"','"+mstatus+"','"+address+"','"+city+"','"+state+"','"+pin+"')";
                  c.s.executeUpdate(query);
                  
                  setVisible(false);
                  new SignUpTwo(formno).setVisible(true);
              }
          }catch(Exception e){ 
              System.out.println(e);
          }
    }
    
    
   public static void main(String args[]){
       
       new SignUpOne();
   }
    
}
