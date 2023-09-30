package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.*;
import java.awt.event.*;
import java.sql.ResultSet;


public class Balance_enquiry extends JFrame implements ActionListener{
    
    JButton back;
    String pinnumber;
    
    Balance_enquiry(String pinnumber){
        this.pinnumber=pinnumber;
        setLayout(null);
        
     ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
     Image i2=i1.getImage().getScaledInstance(900,830,Image.SCALE_DEFAULT);
    ImageIcon i3=new ImageIcon(i2);
    JLabel image=new JLabel(i3);
    image.setBounds(0, 0, 900, 830);
    add(image);
    
    back=new JButton("Back");
    back.setBounds(400, 470, 100, 30);
    back.addActionListener(this);
    image.add(back);
    
     Conn c=new Conn();
     int balance=0;
            try{
                ResultSet rs=c.s.executeQuery("Select * from bank where pin = '"+pinnumber+"'");
            
            while(rs.next()){
                if(rs.getString("type").equals("deposit")){
                    balance+=Integer.parseInt(rs.getString("amount"));
                } else{
                    balance-=Integer.parseInt(rs.getString("amount"));
                }
            }
            } catch(Exception e){
                System.out.println(e);
            }
            JLabel text=new JLabel("Your account current balance is");
            text.setBounds(190, 300, 400, 30);
            text.setFont(new Font("Ralyway",Font.BOLD,18));
            text.setForeground(Color.white);
            image.add(text);
            
            JLabel text1=new JLabel("Rs. "+balance);
            text1.setBounds(220, 330, 400, 30);
            text1.setFont(new Font("Ralyway",Font.BOLD,18));
            text1.setForeground(Color.white);
            image.add(text1);
            
        setSize(900,830);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
        
    }

    Balance_enquiry(JButton pinchange) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Transition(pinnumber).setVisible(true);
    }
    
    
    
    public static void main(String args[]){
        new  Balance_enquiry("");
    }
   
}
