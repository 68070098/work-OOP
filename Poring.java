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
import java.awt.event.*;
import javax.swing.*;
public class Poring implements Runnable{
    private JFrame fr;
    private JLabel jl;
    private JLabel countLabel;
    private ImageIcon img;
    private Image scaled;
    private static int count;
    
    public Poring() {
        fr = new JFrame("");

        img = new ImageIcon("src/Lab13_1/poring.png");
        scaled = img.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        jl = new JLabel(new ImageIcon(scaled));
        jl.setBounds(0, 0, 200, 200);

        count++;
        countLabel = new JLabel(String.valueOf(count));
        countLabel.setFont(new Font("Arial", Font.BOLD, 20));
        countLabel.setForeground(Color.BLACK);
        countLabel.setBounds(160, 10, 40, 30);

        JLayeredPane pane = new JLayeredPane();
        pane.setPreferredSize(new Dimension(200, 200));
        pane.add(jl, Integer.valueOf(0));
        pane.add(countLabel, Integer.valueOf(1));

        jl.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                fr.dispose();
            }
        });
        
        Thread t = new Thread(this);
        t.start();

        fr.add(pane);
        fr.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        fr.pack();
        fr.setResizable(false);
        fr.setVisible(true);
    }

    @Override
    public void run() {
        try {
            while (true) {
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}