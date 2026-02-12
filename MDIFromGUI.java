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
public class MDIFromGUI {
    private JFrame fr;
    private JMenuBar mb;
    private JMenu mFile, mEdit, mView, miNew;
    private JMenuItem miOpen, miSave, miExit, msiWindow, msiMessage;
    private JDesktopPane desktopPane;
    private JInternalFrame frame1, frame2, frame3;
    
    public MDIFromGUI(){
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        desktopPane = new JDesktopPane();
        desktopPane.setBackground(Color.BLACK);
        frame1 = new JInternalFrame("Application 01", true, true, true, true);
        frame2 = new JInternalFrame("Application 02", true, true, true, true);
        frame3 = new JInternalFrame("Application 03", true, true, true, true);
        fr = new JFrame("SubMenuItem Demo");
        mb = new JMenuBar();
        mFile = new JMenu("File");
        mEdit = new JMenu("Edit");
        mView = new JMenu("View");
        miNew = new JMenu("New");
        miOpen = new JMenuItem("Open");
        miSave = new JMenuItem("Save");
        miExit = new JMenuItem("Exit");
        msiWindow = new JMenuItem("Window");
        msiMessage = new JMenuItem("Message");
        
        fr.setJMenuBar(mb);
        mb.add(mFile);
        mFile.add(miNew);
        miNew.add(msiWindow);
        miNew.addSeparator();
        miNew.add(msiMessage);
        mFile.add(miOpen);
        mFile.addSeparator();
        mFile.add(miSave);
        mFile.addSeparator();
        mFile.add(miExit);
        mb.add(mEdit);
        mb.add(mView);
        
        
        frame1.getContentPane();
        frame1.pack();
        frame1.setSize(300, 200);
        frame1.setLocation(50, 400);
        frame1.setVisible(true);
        
        frame2.getContentPane();
        frame2.pack();
        frame2.setSize(300, 200);
        frame2.setLocation(300, 100);
        frame2.setVisible(true);
        
        frame3.getContentPane();
        frame3.pack();
        frame3.setSize(300, 200);
        frame3.setLocation(650, 200);
        frame3.setVisible(true);
        desktopPane.add(frame1);
        desktopPane.add(frame2);
        desktopPane.add(frame3);
        fr.add(desktopPane, BorderLayout.CENTER);
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(1000, 700);
        fr.setVisible(true);
    }
}
