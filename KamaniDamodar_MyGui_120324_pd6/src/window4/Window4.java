package KamaniDamodar_MyGui_120324_pd6.src.window4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Window4 implements ActionListener {
    private JFrame window;
    private JButton blueTextBtn;
    private JButton purpleTextBtn;
    private JButton thanksgivingBtn;
    private JButton holidayBtn;
    private JButton[] allButtons;
    
    public Window4(int w, int h) {
        window = new JFrame();
        window.setSize(w, h);
        window.setTitle("Window4");
        window.setLocation(200, 300);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        GridLayout layout = new GridLayout(2, 2, 5, 5);
        window.setLayout(layout);
        
        blueTextBtn = new JButton("Blue Text");
        purpleTextBtn = new JButton("Purple Text");
        thanksgivingBtn = new JButton("Thanksgiving");
        holidayBtn = new JButton("Holiday");
        
        allButtons = new JButton[]{blueTextBtn, purpleTextBtn, thanksgivingBtn, holidayBtn};
        
        for(JButton btn : allButtons) {
            btn.addActionListener(this);
        }
        
        for(JButton btn : allButtons) {
            window.add(btn);
        }
        
        JPanel contentPane = (JPanel) window.getContentPane();
        contentPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        window.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent event) {
        Object source = event.getSource();
        
        if(source == blueTextBtn) {
            for(JButton btn : allButtons) {
                btn.setForeground(Color.BLUE);
            }
        } 
        else if(source == purpleTextBtn) {
            for(JButton btn : allButtons) {
                btn.setForeground(new Color(128, 0, 128));
            }
        }
        else if(source == thanksgivingBtn) {
            JOptionPane.showMessageDialog(window,
                "Happy Thanksgiving!\nEnjoy your time with family and friends!",
                "Thanksgiving Greetings",
                JOptionPane.INFORMATION_MESSAGE);
        }
        else if(source == holidayBtn) {
            JOptionPane.showMessageDialog(window,
                "Happy Holidays!\nEnjoy your winter break!",
                "Holiday Greetings",
                JOptionPane.INFORMATION_MESSAGE);
        }
    }
}