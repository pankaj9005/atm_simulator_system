package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Pinchange extends JFrame implements ActionListener{
    
    JPasswordField pin,reenter;
    JButton change,back;
    String pinnumber;
    
    Pinchange(String pinnumber){
        this.pinnumber=pinnumber;
        setLayout(null);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
     Image i2=i1.getImage().getScaledInstance(900,830,Image.SCALE_DEFAULT);
    ImageIcon i3=new ImageIcon(i2);
    JLabel image=new JLabel(i3);
    image.setBounds(0, 0, 900, 830);
    add(image);
    
    JLabel text =new JLabel("Change your PIN");
    text.setForeground(Color.white);
    text.setBounds(250, 280, 400, 30);
    text.setFont(new Font("Arial",Font.BOLD,22));
    image.add(text);
    
    JLabel pintext =new JLabel("New PIN");
    pintext.setForeground(Color.white);
    pintext.setBounds(165, 350, 150, 25);
    pintext.setFont(new Font("Arial",Font.BOLD,22));
    image.add(pintext);
    
     pin=new JPasswordField();
    pin.setFont(new Font("Ralyway",Font.BOLD,22));
    pin.setBounds(400, 350, 100, 25);
    image.add(pin);
    
     reenter=new JPasswordField();
    reenter.setFont(new Font("Ralyway",Font.BOLD,22));
    reenter.setBounds(400, 390, 100, 30);
    image.add(reenter);
    
    
    JLabel repintext =new JLabel("Re-Enter New PIN");
    repintext.setForeground(Color.white);
    repintext.setBounds(165, 390, 400, 30);
    repintext.setFont(new Font("Arial",Font.BOLD,22));
    image.add(repintext);
    
    
     change=new JButton("Change");
    change.setBounds(390,470,125,30);
    change.addActionListener(this);
    image.add(change);
    
     back=new JButton("Back");
    back.setBounds(160,470,125,30);
    back.addActionListener(this);
    image.add(back);
    
    
    setSize(900,830);
    setLocation(300,0);
    setUndecorated(true); 
    setVisible(true);
    
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==change){
        try{
           String  npin=pin.getText();
           String repin=reenter.getText();
           
           
           if(!npin.equals(repin)){
               JOptionPane.showMessageDialog(null, "Entered PIN does not match");
               return;
           }
           if(npin.equals("")){
               JOptionPane.showMessageDialog(null, "Please enter new PIN");
           return ;
           }
           if(repin.equals("")){
               JOptionPane.showMessageDialog(null, "Please re-enter new PIN");
               return;
           }
        
           
           Conn c=new Conn();
           String query1="update bank set pinnumber='"+repin+"' where pinnumber='"+pinnumber+"'";
           String query2="update login set pinnumber='"+repin+"' where pinnumber='"+pinnumber+"'";
           String query3="update signupthree set pin_number='"+repin+"' where pin_number='"+pinnumber+"'";
        
            c.s.executeUpdate(query1);
            c.s.executeUpdate(query2);
            c.s.executeUpdate(query3);
            
            JOptionPane.showMessageDialog(null, "PIN changed successfully");
            setVisible(false);
            new Transition(repin).setVisible(true);
           
        }catch(Exception e){
            System.out.println(e);
        
    }
    } else{
    setVisible(false);
    new Transition(pinnumber).setVisible(true);
}
    }
    
    public static void main(String args[]){
        new Pinchange("").setVisible(true);
    }
}
