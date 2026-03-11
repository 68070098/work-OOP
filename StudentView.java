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
import java.io.*;
public class StudentView extends WindowAdapter implements ActionListener {
    private JFrame fr;
    private JPanel jp_data, jp2, jp_for_bt;
    private JLabel lb_id, lb_name, lb_money;
    private JTextField tf_id, tf_name, tf_money;
    private JButton bt_deposit, bt_withdraw;
    
    public StudentView(){
        //frame
        fr = new JFrame();
        jp2 = new JPanel();
        jp2.setLayout(new BorderLayout());
        
        //data
        jp_data = new JPanel();
        jp_data.setLayout(new GridLayout(3, 2));
        lb_id = new JLabel("   ID :");
        lb_name = new JLabel("   Name :");
        lb_money = new JLabel("   Money :");
        tf_id = new JTextField();
        tf_name = new JTextField();
        tf_money = new JTextField("0");
        tf_money.setEditable(false);
        jp_data.add(lb_id);
        jp_data.add(tf_id);
        jp_data.add(lb_name);
        jp_data.add(tf_name);
        jp_data.add(lb_money);
        jp_data.add(tf_money);
        
        //button
        jp_for_bt = new JPanel();
        jp_for_bt.setLayout(new FlowLayout());
        bt_deposit = new JButton("Deposit");
        bt_deposit.addActionListener(this);
        bt_withdraw = new JButton("Withdraw");
        bt_withdraw.addActionListener(this);
        jp_for_bt.add(bt_deposit);
        jp_for_bt.add(bt_withdraw);
        
        //file
        File f = new File("StudentM.dat");
        if (f.exists()){
            try (FileInputStream fis = new FileInputStream(f); ObjectInputStream ois = new ObjectInputStream(fis)){
                Student s = (Student) ois.readObject();
                tf_id.setText(String.valueOf(s.getID()));
                tf_name.setText(s.getName());
                tf_money.setText(String.valueOf(s.getMoney()));
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        
        //add to frame
        jp2.add(jp_data, BorderLayout.CENTER);
        jp2.add(jp_for_bt, BorderLayout.SOUTH);
        fr.add(jp2);
        
        fr.addWindowListener(this);
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
        fr.pack();
    }
    @Override
    public void actionPerformed(ActionEvent e){
        int cur_mo = Integer.parseInt(tf_money.getText());
        if (e.getSource() == bt_deposit){
            tf_money.setText(String.valueOf(cur_mo + 100));
        }
        else if (e.getSource() == bt_withdraw){
            tf_money.setText(String.valueOf(cur_mo - 100));
        }
    }
    public void windowClosing(WindowEvent e){
        try (FileOutputStream fos = new FileOutputStream("StudentM.dat");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            String name = tf_name.getText();
            int id = tf_id.getText().isEmpty() ? 0 : Integer.parseInt(tf_id.getText());
            int money = Integer.parseInt(tf_money.getText());
            
            Student s = new Student(name, id, money);
            oos.writeObject(s);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}