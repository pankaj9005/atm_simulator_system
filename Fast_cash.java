
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Date;
import java.sql.*;

public class Fast_cash extends JFrame implements ActionListener{
    
    JButton withdrawl,back;
    JTextField amount;
    String pinnumber;
    
    Fast_cash(String pinnumber){
        
        this.pinnumber=pinnumber;
        
        setLayout(null);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(900, 830, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0, 0, 900, 830);
        add(image);
        
        JLabel text=new JLabel("Select  Withdrawl Amount");
        text.setForeground(Color.white);
        text.setFont(new Font("Arial",Font.BOLD,15));
        text.setBounds(250,280,400,20);
        image.add(text);
        
        
         withdrawl=new JButton("Rs. 100");
        withdrawl.setBounds(160, 360, 150, 30);
        withdrawl.addActionListener(this);
        image.add(withdrawl);
        
         back=new JButton("Rs. 500");
        back.setBounds(160, 400, 150, 30);
        back.addActionListener(this);
        image.add(back);
        
        back=new JButton("Rs. 1000");
        back.setBounds(160, 440, 150, 30);
        back.addActionListener(this);
        image.add(back);
        
        back=new JButton("Rs. 2000");
        back.setBounds(360, 360, 150, 30);
        back.addActionListener(this);
        image.add(back);
        
        back=new JButton("Rs. 5000");
        back.setBounds(360, 400, 150, 30);
        back.addActionListener(this);
        image.add(back);
        
        back=new JButton("Rs. 10000");
        back.setBounds(360, 440, 150, 30);
        back.addActionListener(this);
        image.add(back);
        
         back=new JButton("Back");
        back.setBounds(360, 475, 150, 30);
        back.addActionListener(this);
        image.add(back);
        
        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==back){
            setVisible(false);
            new Transition(pinnumber).setVisible(true);
        } else {
            String amount=((JButton)ae.getSource()).getText().substring(4);
             Conn c=new Conn();
            try{
                ResultSet rs=c.s.executeQuery("Select * from bank where pinnumber = '"+pinnumber+"'");
            int balance=0;
            while(rs.next()){
                if(rs.getString("type").equals("deposit")){
                    balance+=Integer.parseInt(rs.getString("amount"));
                } else{
                    balance-=Integer.parseInt(rs.getString("amount"));
                }
            }
            
            if(ae.getSource()!=back && balance<Integer.parseInt(amount)){
                JOptionPane.showMessageDialog(null, "Insufficient Balance");
                return;
            }
            
            Date date=new Date();
            String query="insert into bank values('"+pinnumber+"','"+date+"','"+withdrawl+"','"+amount+"')";
             c.s.executeUpdate(query);
             
             JOptionPane.showMessageDialog(null, "Rs. "+amount+" Debited Successfully");
            setVisible(false);
            new Transition(pinnumber).setVisible(true);
            
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
    
    public static void main(String args[]){
        new Fast_cash("");
        
    }  
}

