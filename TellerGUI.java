/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.oop.pkg01;

/**
 *
 * @author ADMIN
 */
import java.awt.*;
import javax.swing.*;
public class TellerGUI {
    private JFrame fr;
    private JPanel pn1;
    private JPanel pn2;
    private JLabel labelBalance;
    private JLabel labelAmount;
    private JTextField tfBalance;
    private JTextField tfAmount;
    private JButton bDeposit;
    private JButton bWithdraw;
    private JButton bExit;
    
    public TellerGUI(){
        fr = new JFrame("Teller GUI");
        pn1 = new JPanel();
        pn2 = new JPanel();
        labelBalance = new JLabel(" Balance");
        labelAmount = new JLabel(" Amount");
        tfBalance = new JTextField("6000");
        tfBalance.setEditable(false);
        tfAmount = new JTextField();
        bDeposit = new JButton("Deposit");
        bWithdraw = new JButton("Withdraw");
        bExit = new JButton("Exit");
        
        pn1.setLayout(new GridLayout(2, 2));
        pn1.add(labelBalance);
        pn1.add(tfBalance);
        pn1.add(labelAmount);
        pn1.add(tfAmount);
        
        pn2.setLayout(new FlowLayout());
        pn2.add(bDeposit);
        pn2.add(bWithdraw);
        pn2.add(bExit);
        
        
        fr.setLayout(new GridLayout(2, 1));
        fr.add(pn1);
        fr.add(pn2);
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(300, 200);
        fr.setVisible(true);
    }
}
