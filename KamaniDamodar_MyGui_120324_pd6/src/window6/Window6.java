package KamaniDamodar_MyGui_120324_pd6.src.window6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Window6 implements ActionListener {
    private JFrame window;
    private JButton turkeyBtn;
    private JButton pumpkinPieBtn;
    private JButton stuffingBtn;
    
    public Window6(int w, int h) {
        window = new JFrame();
        window.setSize(w, h);
        window.setTitle("Window6");
        window.setLocation(200, 300);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel contentPane = (JPanel) window.getContentPane();
        BorderLayout layout = new BorderLayout(10, 10);  // 10px horizontal and vertical gaps
        contentPane.setLayout(layout);
        
        turkeyBtn = new JButton("Turkey");
        pumpkinPieBtn = new JButton("Pumpkin Pie");
        stuffingBtn = new JButton("Stuffing");
        
        turkeyBtn.addActionListener(this);
        pumpkinPieBtn.addActionListener(this);
        stuffingBtn.addActionListener(this);
        
        contentPane.add(turkeyBtn, BorderLayout.PAGE_START);
        contentPane.add(pumpkinPieBtn, BorderLayout.CENTER);
        contentPane.add(stuffingBtn, BorderLayout.PAGE_END);
        
        contentPane.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        
        window.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent event) {
        Object source = event.getSource();
        
        if(source == turkeyBtn) {
            JOptionPane.showMessageDialog(window,
                "Traditional Turkey\n" +
                "Calories per serving: 190 calories (3 oz)\n" +
                "Fun fact: Wild turkeys can run up to 25 mph!",
                "Turkey Information",
                JOptionPane.INFORMATION_MESSAGE);
        }
        else if(source == pumpkinPieBtn) {
            JOptionPane.showMessageDialog(window,
                "Pumpkin Pie\n" +
                "Calories per slice: 323 calories\n" +
                "Fun fact: The largest pumpkin pie ever made weighed 3,699 pounds!",
                "Pumpkin Pie Information",
                JOptionPane.INFORMATION_MESSAGE);
        }
        else if(source == stuffingBtn) {
            JOptionPane.showMessageDialog(window,
                "Traditional Stuffing\n" +
                "Calories per serving: 175 calories (1 cup)\n" +
                "Fun fact: Stuffing was served at the first Thanksgiving in 1621!",
                "Stuffing Information",
                JOptionPane.INFORMATION_MESSAGE);
        }
    }
}