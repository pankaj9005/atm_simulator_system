package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Transition extends JFrame implements ActionListener{
    
    JButton  deposit,cash,transfer,exit,fast,bal,pinchange,statement;
     String pinnumber;
    
    Transition(String pinnumber){
        
        setLayout(null);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(900, 830, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0, 0, 900, 830);
        add(image);
        
        JLabel text=new JLabel("Please select your Transaction");
        text.setBounds(200, 300, 700, 35);
        text.setFont(new Font("Ralyway",Font.BOLD,18));
        text.setForeground(Color.white);
        image.add(text);
        
        
         deposit=new JButton("Deposit");
        deposit.setBounds(160, 350, 150, 30);
        deposit.addActionListener(this);
        image.add(deposit);
       
          cash=new JButton("Cash Withdrawl");
        cash.setBounds(160, 390, 150, 30);
        cash.addActionListener(this);
        image.add(cash);
        
          statement=new JButton("Mini Statement");
        statement.setBounds(360, 350, 150, 30);
        statement.addActionListener(this);
        image.add(statement);
        
          fast=new JButton("Fast Cash");
        fast.setBounds(360, 390, 150, 30);
        fast.addActionListener(this);
        image.add(fast);
        
          pinchange=new JButton("PIN Change");
        pinchange.setBounds(160, 430, 150, 30);
        pinchange.addActionListener(this);
        image.add(pinchange);
        
          bal=new JButton("Balance Enquiry");
        bal.setBounds(360, 430, 150, 30);
        bal.addActionListener(this);
        image.add(bal);
        
        
        
         exit=new JButton("Exit ");
        exit.setBounds(360, 470, 150, 30);
        exit.addActionListener(this);
        image.add(exit);
        
        
        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==exit){
            System.exit(0);
        } else if(ae.getSource()==deposit){
            setVisible(false);
            new Deposit(pinnumber).setVisible(true);
        } else if(ae.getSource()==cash){
            setVisible(false);
            new Withdrawl(pinnumber).setVisible(true);
        } else if(ae.getSource()==fast){
            setVisible(false);
            new Fast_cash(pinnumber).setVisible(true);
        } else if(ae.getSource()==pinchange){
            setVisible(false);
            new Pinchange(pinnumber).setVisible(true);
        } else if(ae.getSource()==bal){
            setVisible(false);
            new Balance_enquiry(pinnumber).setVisible(true);
        } else if(ae.getSource()==statement){
            try {
                new Mini_statement(pinnumber).setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(Transition.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        }
        
    
    
    public static void main(String args[]){
        new Transition("");
    }
}
