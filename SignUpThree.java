package bank.management.system;

import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;



public class SignUpThree extends JFrame  implements ActionListener {
    
    JRadioButton save,fixed,recc,current;
    JCheckBox mobile,emails,es,atm,internet,check,declare;
    JButton submit,cancel;
    String formno;
    
    
    SignUpThree(String formno){
        this.formno=formno;
        
        setLayout(null);
        
        setTitle("NEW ACCOUNT APPLICATION FORM PAGE -3");
        
        JLabel l1=new JLabel("Page 3: Account Details");
        l1.setFont(new Font("Ralyway",Font.BOLD,22));
        l1.setBounds(280, 80, 350, 40);
        add(l1);
        
        JLabel type=new JLabel("Account Type: ");
        type.setFont(new Font("Ralyway",Font.BOLD,22));
        type.setBounds(100, 140, 200, 30);
        add(type);
        
         save=new JRadioButton("Saving Account");
        save.setFont(new Font("Arial",Font.BOLD,18));
        save.setBackground(Color.white);
        save.setBounds(100, 180, 200, 30);
        add(save);
        
         fixed=new JRadioButton("Fixed Deposit Account");
        fixed.setFont(new Font("Arial",Font.BOLD,18));
        fixed.setBackground(Color.white);
        fixed.setBounds(400, 180, 250, 30);
        add(fixed);
        
         current=new JRadioButton("Current Account");
        current.setFont(new Font("Arial",Font.BOLD,18));
        current.setBackground(Color.white);
        current.setBounds(100, 220, 200, 30);
        add(current);
        
         recc=new JRadioButton("Recurring Deposit Account");
        recc.setFont(new Font("Arial",Font.BOLD,18));
        recc.setBackground(Color.white);
        recc.setBounds(400, 220, 260, 30);
        add(recc);
        
        ButtonGroup bankgroup=new ButtonGroup();
        bankgroup.add(save);
        bankgroup.add(current);
        bankgroup.add(fixed);
        bankgroup.add(recc);
        
        JLabel card=new JLabel("Card Number:");
        card.setFont(new Font("Ralyway",Font.BOLD,22));
        card.setBounds(100, 300, 200, 30);
        add(card);
        
        JLabel number=new JLabel("XXXX-XXXX-XXXX-1234");
        number.setFont(new Font("Ralyway",Font.BOLD,22));
        number.setBounds(330, 300, 300, 30);
        add(number);
        
        JLabel inform=new JLabel("(Your 16-Digit Card Number)");
        inform.setFont(new Font("Ralyway",Font.BOLD,12));
        inform.setBounds(100, 330, 300, 20);
        add(inform);
        
        JLabel pin=new JLabel("PIN:");
        pin.setFont(new Font("Ralyway",Font.BOLD,22));
        pin.setBounds(100, 370, 200, 30);
        add(pin);
        
        JLabel pinno=new JLabel("(Your 4-Digit Password)");
        pinno.setFont(new Font("Ralyway",Font.BOLD,12));
        pinno.setBounds(100, 400, 200, 20);
        add(pinno);
        
        JLabel number1=new JLabel("XXXX");
        number1.setFont(new Font("Ralyway",Font.BOLD,22));
        number1.setBounds(330, 370, 300, 30);
        add(number1);
        
        
       JLabel service=new JLabel("Services Required:");
        service.setFont(new Font("Ralyway",Font.BOLD,22));
        service.setBounds(100, 450, 300, 30);
        add(service);
        
         atm=new JCheckBox("ATM");
        atm.setFont(new Font("Ralyway",Font.BOLD,15));
        atm.setBounds(130,490,200,30);
        atm.setBackground(Color.WHITE);
        add(atm);
        
         internet=new JCheckBox("Internet Banking");
        internet.setFont(new Font("Ralyway",Font.BOLD,15));
        internet.setBounds(400,490,200,30);
        internet.setBackground(Color.WHITE);
        add(internet);
        
         mobile=new JCheckBox("Mobile Banking");
        mobile.setFont(new Font("Ralyway",Font.BOLD,15));
        mobile.setBounds(130,520,200,30);
        mobile.setBackground(Color.WHITE);
        add(mobile);
        
         emails=new JCheckBox("Email & SMS Alert");
        emails.setFont(new Font("Ralyway",Font.BOLD,15));
        emails.setBounds(400,520,200,30);
        emails.setBackground(Color.WHITE);
        add(emails);
        
         check=new JCheckBox("Cheque Book");
        check.setFont(new Font("Ralyway",Font.BOLD,15));
        check.setBounds(130,550,200,30);
        check.setBackground(Color.WHITE);
        add(check);
        
         es=new JCheckBox("E-Statement");
        es.setFont(new Font("Ralyway",Font.BOLD,15));
        es.setBounds(400,550,200,30);
        es.setBackground(Color.WHITE);
        add(es);
        
         declare=new JCheckBox("I hereby declare that the above entered details are correct to the best of my khowledge.");
        declare.setFont(new Font("Ralyway",Font.BOLD,15));
        declare.setBounds(100,600,650,30);
        declare.setBackground(Color.WHITE);
        add(declare);
        
         submit=new JButton("Submit");
        submit.setFont(new Font("Ralyway",Font.BOLD,18));
        submit.setBackground(Color.black);
        submit.setForeground(Color.white);
        submit.setBounds(250, 650, 100, 30);
        submit.addActionListener(this);
        add(submit);
        
         cancel=new JButton("Cancel");
        cancel.setFont(new Font("Ralyway",Font.BOLD,18));
        cancel.setBackground(Color.black);
        cancel.setForeground(Color.white);
        cancel.setBounds(450, 650, 100, 30);
        cancel.addActionListener(this);
        add(cancel);
        
    getContentPane().setBackground(Color.WHITE);
        
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==submit){
            String accounttype=null;
            if(save.isSelected()){
                accounttype="Saving Account";
            } else if(fixed.isSelected()){
                accounttype="Fixed Deposit Account";
            } else if(current.isSelected()){
                accounttype="Current Account";
            }  else if(recc.isSelected()){
                accounttype="Recurring Deposit Account";
            }
            
            Random random=new Random();
            String cardnumber=""+Math.abs((random.nextLong()%90000000L)+5040936000000000L);
            
            String pinnumber=""+Math.abs((random.nextLong()%9000L)+1000L);
            
            
            String facility="";
            if(atm.isSelected()){
                facility=facility+"ATM";
            } else if(mobile.isSelected()){
                facility=facility+"Mobile Banking";
            } else if(emails.isSelected()){
                facility=facility+"Email & SMS Alert";
            } else if(internet.isSelected()){
                facility=facility+"Internet Banking";
            } else if(es.isSelected()){
                facility=facility+"E-Statement";
            } else if(check.isSelected()){
                facility=facility+"Cheque Book";
            } 
             
            try{
                if(accounttype.equals("")){
                    JOptionPane.showMessageDialog(null,"Account Type is Required");     
                } else {
                    Conn c=new Conn();
                    String query="insert into signupthree values('"+formno+"','"+accounttype+"','"+cardnumber+"','"+pinnumber+"','"+facility+"')";
                    String query1="insert into login values('"+formno+"','"+cardnumber+"','"+pinnumber+"')";
                    
                    c.s.executeUpdate(query);
                    c.s.executeUpdate(query1);
                    
                    JOptionPane.showMessageDialog(null,"Card Number: "+cardnumber+"\n Pin: "+pinnumber);
                
                    
                        setVisible(false);
                        new Deposit(pinnumber).setVisible(false);
                    
                }
                
            }catch(Exception e){
                System.out.println(e);
            }
            
        } else if(ae.getSource()==cancel){
            setVisible(false);
            new Login().setVisible(true);
        }
    }
     public static void main(String args[]){
         new SignUpThree("");
     }
     }

