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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class ChatDemo implements ActionListener, WindowListener {
    private JFrame f1;
    private JPanel lb, lb1;
    private JTextArea ta;
    private JTextField tf;
    private JButton submit, reset;
    
    public ChatDemo() {
        f1 = new JFrame();
        ta = new JTextArea(20, 45);
        ta.setEditable(false);
        f1.setLayout(new BorderLayout());
        f1.add(ta, BorderLayout.CENTER);
        
        lb = new JPanel();
        tf = new JTextField(45);
        submit = new JButton("Submit");     reset = new JButton("Reset");
        submit.addActionListener(this);       reset.addActionListener(this);
        lb1 = new JPanel();
        lb1.setLayout(new GridLayout(2, 1));
        lb1.add(tf);        lb1.add(lb);
        f1.add(lb1, BorderLayout.SOUTH);
        
        lb.setLayout(new FlowLayout());
        lb.add(submit);    lb.add(reset);   lb1.add(lb);
        
        loadFile();
        f1.addWindowListener(this);
        
        f1.pack();
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setVisible(true);
        
    }
    
    private void loadFile() {
        File file = new File("ChatDemo.dat");
        if (file.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
                String chatHistory = (String) ois.readObject();
                ta.setText(chatHistory);
            } catch (IOException | ClassNotFoundException ex) {
                ex.printStackTrace();
            }
        }
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == submit){
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            System.out.print(dtf.format(LocalDateTime.now()));
            
            String time = dtf.format(LocalDateTime.now());
            ta.append(time + " : " + tf.getText() + "\n");
            tf.setText("");
            }
        else if (e.getSource() == reset) {
            ta.setText("");
            tf.setText("");
        }
    }
    @Override
    public void windowClosing(WindowEvent e) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("ChatDemo.dat"))) {
            oos.writeObject(ta.getText());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        System.exit(0);
    }
    @Override
    public void windowOpened(WindowEvent e) {}

    @Override
    public void windowClosed(WindowEvent e) {}

    @Override
    public void windowIconified(WindowEvent e) {}

    @Override
    public void windowDeiconified(WindowEvent e) {}

    @Override
    public void windowActivated(WindowEvent e) {}

    @Override
    public void windowDeactivated(WindowEvent e) {}

}