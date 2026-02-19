/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.oop.pkg01;

/**
 *
 * @author ADMIN
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TellerGUI extends Account implements ActionListener{
    private JFrame fr;
    private JPanel p1, p2, p3, p4;
    private JLabel balance, amount;
    private JTextField showBalance, putAmount;
    private JButton btn1, btn2, btn3;
    
    public TellerGUI() {
        super(6000.0, "wachi_164");
        
        //creat JFrame
        fr = new JFrame("Teller GUI");
        fr.setLayout(new GridLayout(4, 1));
        
        //Balance
        p1 = new JPanel(new GridLayout(1, 2));
        balance = new JLabel("   Balance");
        showBalance = new JTextField(String.valueOf((int) getBalance()));
        showBalance.setEditable(false);
        fr.add(p1);
        p1.add(balance);
        p1.add(showBalance);
        
        //Amount
        p2 = new JPanel(new GridLayout(1, 2));
        amount = new JLabel("   Amount");
        putAmount = new JTextField();
        fr.add(p2);
        p2.add(amount);
        p2.add(putAmount);
        
        //Buttton
        p3 = new JPanel(new FlowLayout());
        btn1 = new JButton("Deposit");
        btn2 = new JButton("Withdraw");
        btn3 = new JButton("Exit");
        fr.add(p3);
        p3.add(btn1);
        p3.add(btn2);
        p3.add(btn3);
        
        //add listerner
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        
        //set JFrame Property
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(300, 200);
        fr.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(btn1)) {
            this.deposit(Double.parseDouble(putAmount.getText()));
            showBalance.setText(String.valueOf(this.getBalance()));
        } else if (e.getSource().equals(btn2)) {
            this.withdraw(Double.parseDouble(putAmount.getText()));
            showBalance.setText(String.valueOf(this.getBalance()));
        } else if (e.getSource().equals(btn3)) {
            System.exit(JFrame.EXIT_ON_CLOSE);
        }
    }
}