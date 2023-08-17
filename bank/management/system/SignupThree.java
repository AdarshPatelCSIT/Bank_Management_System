package bank.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class SignupThree extends JFrame implements ActionListener{
    
    JRadioButton r1 ,r2 ,r3 ,r4;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton submit , cancil;
    String formno;

    SignupThree(String formno) {
         this.formno =formno;
        setLayout(null);  

        JLabel l1 = new JLabel("Page 3: Account Details");
        l1.setFont(new Font("Raleway", Font.BOLD, 22));
        l1.setBounds(250, 20, 400, 40);
        add(l1);

        JLabel type = new JLabel("Account Type");
        type.setFont(new Font("Raleway", Font.BOLD, 22));
        type.setBounds(100, 100, 200, 30);
        add(type);

         r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway", Font.BOLD, 16));
        r1.setBackground(Color.WHITE);
        r1.setBounds(100, 140, 180, 20);
        add(r1);
        
         r2 = new JRadioButton("Deposit Account");
        r2.setFont(new Font("Raleway", Font.BOLD, 16));
        r2.setBackground(Color.WHITE);
        r2.setBounds(350, 140, 180, 20);
        add(r2);
        
         r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway", Font.BOLD, 16));
        r3.setBackground(Color.WHITE);
        r3.setBounds(100, 180, 180, 20);
        add(r3);
        
        
         r4 = new JRadioButton("Recurring Account");
        r4.setFont(new Font("Raleway", Font.BOLD, 16));
        r4.setBackground(Color.WHITE);
        r4.setBounds(350, 180, 180, 20);
        add(r4);
        
        ButtonGroup groupaccount = new ButtonGroup();
        groupaccount.add(r1);
        groupaccount.add(r2);
        groupaccount.add(r3);
        groupaccount.add(r4);
        
        JLabel card = new JLabel("Card Number");
        card.setFont(new Font("Raleway" ,Font.BOLD,22));
        card.setBounds(100,260,200,30);
        card.setBackground(Color.WHITE);
        add(card);
        
         JLabel number = new JLabel("XXXX-XXXX-XXXX-3795");
        number.setFont(new Font("Raleway" ,Font.BOLD,22));
        number.setBounds(330,260,300,30);
        number.setBackground(Color.WHITE);
        add(number);
        
        JLabel carddetail = new JLabel("(Your 16 digit Card Number!)");
        carddetail.setFont(new Font("Raleway" ,Font.BOLD,12));
        carddetail.setBounds(100,290,300,17);
        carddetail.setBackground(Color.WHITE);
        add(carddetail);
        
        JLabel pin= new JLabel("PIN ");
        pin.setFont(new Font("Raleway" ,Font.BOLD,22));
        pin.setBounds(100,330,200,30);
        pin.setBackground(Color.WHITE);
        add(pin);
        
        JLabel pindetail = new JLabel("(Your 4 digit PIN Number!)");
        pindetail.setFont(new Font("Raleway" ,Font.BOLD,12));
        pindetail.setBounds(100,360,300,17);
        pindetail.setBackground(Color.WHITE);
        add(pindetail);
        
         JLabel pnumber = new JLabel("XXXX");
        pnumber.setFont(new Font("Raleway" ,Font.BOLD,22));
        pnumber.setBounds(330,330,300,30);
        pnumber.setBackground(Color.WHITE);
        add(pnumber);
        
         JLabel services= new JLabel("Services Required ");
        services.setFont(new Font("Raleway" ,Font.BOLD,18));
        services.setBounds(100,410,250,30);
        services.setBackground(Color.WHITE);
        add(services);
        
        c1 = new JCheckBox("ATM CARD");
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Raleway",Font.BOLD,16));
        c1.setBounds(100 , 460 , 200 , 20);
        add(c1);
        
         c2 = new JCheckBox("Internet Banking");
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Raleway",Font.BOLD,16));
        c2.setBounds(350 , 460 , 200 , 20);
        add(c2);
        
         c3 = new JCheckBox("Mobile Banking");
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Raleway",Font.BOLD,16));
        c3.setBounds(100 , 510 , 200 , 20);
        add(c3);
        
         c4 = new JCheckBox("Email & SMS Alerts!");
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Raleway",Font.BOLD,16));
        c4.setBounds(350 , 510 , 200 , 20);
        add(c4);
        
         c5 = new JCheckBox("Cheque Book");
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Raleway",Font.BOLD,16));
        c5.setBounds(100 , 560 , 200 , 20);
        add(c5);
        
         c6 = new JCheckBox("E-Statement");
        c6.setBackground(Color.WHITE);
        c6.setFont(new Font("Raleway",Font.BOLD,16));
        c6.setBounds(350 , 560 , 200 , 20);
        add(c6);
        
         c7 = new JCheckBox("I hereby declare that the above entered details are correct to the best of my knowledge.");
        c7.setBackground(Color.WHITE);
        c7.setFont(new Font("Raleway",Font.BOLD,12));
        c7.setBounds(100 , 630 , 600 , 20);
        add(c7);
        
        submit = new JButton("Submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Raleway",Font.BOLD,14));
        submit.setBounds(250 , 680 , 100 , 30);
        submit.addActionListener(this);
        add(submit);
        
        cancil = new JButton("Cancil");
        cancil.setBackground(Color.BLACK);
        cancil.setForeground(Color.WHITE);
        cancil.setFont(new Font("Raleway",Font.BOLD,14));
        cancil.setBounds(420 , 680 , 100 , 30);
        cancil.addActionListener(this);
        add(cancil);
        
        getContentPane().setBackground(Color.WHITE);
        
        
        
        

        setSize(850, 820);
        setLocation(350, 0);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == submit){
            String accountType = null;
            if(r1.isSelected()){
                accountType = "Saving Account";
            }
            
            else if(r2.isSelected()){
                                accountType = "Fixed Deposit Account";

            }
             else if(r3.isSelected()){
                                accountType = "Current Account";
            }
            
             else if(r4.isSelected()){
                                accountType = "Recurring Deposit Account";

            }
            
            Random random = new Random();
            String cardnumber = ""+ Math.abs((random.nextLong()% 90000000L) + 6594020000000000L);
            
            String pinnumber = "" + Math.abs((random.nextLong()% 9000L) + 1000L);
            
            String facility = "";
            if(c1.isSelected()){
                facility += "ATM Card";
            }
            else if(c2.isSelected()){
                facility += "Internet Banking";
            }
            else if(c3.isSelected()){
                facility += "Moblile Banking";
            }
            
            else if(c4.isSelected()){
                facility += "Email & SMS Alerts!";
            }
            else if(c5.isSelected()){
                facility += "Cheque Book";
            }
            else if(c6.isSelected()){
                facility += "E-Statement";
            }
            
            try{
                if(accountType.equals("")){
                    JOptionPane.showMessageDialog(null , "Account Type is Required");
                }
                else {
                    Conn conn = new Conn();
                    String query1 = "insert into signupthree values('"+formno+"','"+accountType+"','"+cardnumber+"','"+pinnumber+"','"+facility+"')";
                String query2 = "insert into login values('"+formno+"','"+cardnumber+"','"+pinnumber+"')";
                    conn.s.executeUpdate(query1);
                    conn.s.executeUpdate(query2);
                    JOptionPane.showMessageDialog(null,"Card Number:" + cardnumber + "\n Pin: " + pinnumber);
                  
                    setVisible(false);
                    new Deposit(pinnumber).setVisible(true);
                }
            } catch(Exception e){
                System.out.println(e);
            }
        }
        else if(ae.getSource()== cancil){
            setVisible(false);
            new Login().setVisible(true);
        }
    }
public static void main(String[] args){
    new SignupThree("");
}}