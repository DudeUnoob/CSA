package KamaniDamodar_MyGui_120324_pd6.src.window1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Window1 {
    private JFrame window;
    
    public Window1(int w, int h) {
        window = new JFrame();
        window.setSize(w, h);
        window.setTitle("Window1");
        window.setLocation(200, 300);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        FlowLayout layout = new FlowLayout();
        window.setLayout(layout);
        
        JButton redButton = new JButton("Red");
        JButton greenButton = new JButton("Green");
        window.add(redButton);
        window.add(greenButton);
        
        window.setVisible(true);
    }
} 