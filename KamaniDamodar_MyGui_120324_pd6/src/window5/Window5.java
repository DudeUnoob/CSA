package KamaniDamodar_MyGui_120324_pd6.src.window5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Window5 implements ActionListener {
    private JFrame window;
    private JButton texasBtn;
    private JButton californiaBtn;
    private JButton newYorkBtn;
    
    public Window5(int w, int h) {
        window = new JFrame();
        window.setSize(w, h);
        window.setTitle("Window5");
        window.setLocation(200, 300);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel contentPane = (JPanel) window.getContentPane();
        
        BoxLayout layout = new BoxLayout(contentPane, BoxLayout.Y_AXIS);
        contentPane.setLayout(layout);
        
        texasBtn = new JButton("Texas");
        californiaBtn = new JButton("California");
        newYorkBtn = new JButton("New York");
        
        texasBtn.setAlignmentX(Component.CENTER_ALIGNMENT);
        californiaBtn.setAlignmentX(Component.CENTER_ALIGNMENT);
        newYorkBtn.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        texasBtn.addActionListener(this);
        californiaBtn.addActionListener(this);
        newYorkBtn.addActionListener(this);
        
        contentPane.add(Box.createVerticalStrut(20));
        contentPane.add(texasBtn);
        contentPane.add(Box.createVerticalStrut(20));
        contentPane.add(californiaBtn);
        contentPane.add(Box.createVerticalStrut(20));
        contentPane.add(newYorkBtn);
        
        contentPane.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        
        window.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent event) {
        Object source = event.getSource();
        
        if(source == texasBtn) {
            JOptionPane.showMessageDialog(window,
                "State Capital: Austin\nPopular City: Houston\n" +
                "Houston is the most populous city in Texas and the fourth most populous in the US!",
                "Texas Information",
                JOptionPane.INFORMATION_MESSAGE);
        }
        else if(source == californiaBtn) {
            JOptionPane.showMessageDialog(window,
                "State Capital: Sacramento\nPopular City: Los Angeles\n" +
                "LA is the entertainment capital of the world!",
                "California Information",
                JOptionPane.INFORMATION_MESSAGE);
        }
        else if(source == newYorkBtn) {
            JOptionPane.showMessageDialog(window,
                "State Capital: Albany\nPopular City: New York City\n" +
                "NYC is home to over 8.8 million people!",
                "New York Information",
                JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
