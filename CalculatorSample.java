

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.oop.pkg01;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


/**
 *
 * @author ADMIN
 */



public class CalculatorSample implements ActionListener{
    private JFrame f;
    private JPanel m;
    private JPanel numpad;
    private JButton a1,a2,a3,a4,a5,a6,a7,a8,a9,a0,aplus,aminus,amultiply,adivide,ac,aeq;
    private JTextField box;
    private double value = 0;
    private String op;
    public CalculatorSample(){
        f = new JFrame("My Calculator");
        m = new JPanel(new BorderLayout());
        numpad = new JPanel(new GridLayout(4,4));
        box = new JTextField();
        a1 = new JButton("1");
        a2 = new JButton("2");
        a3 = new JButton("3");
        a4 = new JButton("4");
        a5 = new JButton("5");
        a6 = new JButton("6");
        a7 = new JButton("7");
        a8 = new JButton("8");
        a9 = new JButton("9");
        a0 = new JButton("0");
        aplus = new JButton("+");
        aminus = new JButton("-");
        amultiply = new JButton("X");
        adivide = new JButton("/");
        ac = new JButton("c");
        aeq = new JButton("=");
        
        a1.addActionListener(this);
        a2.addActionListener(this);
        a3.addActionListener(this);
        a4.addActionListener(this);
        a5.addActionListener(this);
        a6.addActionListener(this);
        a7.addActionListener(this);
        a8.addActionListener(this);
        a9.addActionListener(this);
        a0.addActionListener(this);
        ac.addActionListener(this);
        aplus.addActionListener(this);
        aminus.addActionListener(this);
        amultiply.addActionListener(this);
        adivide.addActionListener(this);
        aeq.addActionListener(this);
        numpad.add(a7);
        numpad.add(a8);
        numpad.add(a9);
        numpad.add(aplus);
        numpad.add(a4);
        numpad.add(a5);
        numpad.add(a6);
        numpad.add(aminus);
        numpad.add(a1);
        numpad.add(a2);
        numpad.add(a3);
        numpad.add(amultiply);
        numpad.add(a0);
        numpad.add(ac);
        numpad.add(aeq);
        numpad.add(adivide);

        m.add(box,BorderLayout.NORTH);
        m.add(numpad,BorderLayout.CENTER);
        f.add(m);
        f.setSize(400,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().charAt(0) <= '9' & e.getActionCommand().charAt(0) >= '0'){
            box.setText(box.getText() + e.getActionCommand().charAt(0));
        } else if (e.getSource() == ac){
            box.setText("");
            
        } else if(e.getSource() == aeq){
            double secondvalue = Double.parseDouble(box.getText());
            double result = 0;

            switch (op) {
                case "+" -> result = value + secondvalue;
                case "-" -> result = value - secondvalue;
                case "X" -> result = value * secondvalue;
                case "/" -> result = value / secondvalue;
                default -> {
                }
            }
            box.setText(String.valueOf(result));
            op = null;
        } else {
            if (!box.getText().isEmpty()){
                value = Double.parseDouble(box.getText());
                op = e.getActionCommand();
                box.setText("");
            }
        }
    }
    
}