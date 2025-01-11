package KamaniDamodar_MyGui_120324_pd6.src.window2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Window2 implements ActionListener {
    private JFrame window;
    private JButton redButton;
    private JButton greenButton;
    private JButton blueButton;
    private JButton messageButton;
    
    public Window2(int w, int h) {
        window = new JFrame();
        window.setSize(w, h);
        window.setTitle("Window2");
        window.setLocation(200, 300);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        FlowLayout layout = new FlowLayout();
        window.setLayout(layout);
        
        redButton = new JButton("Red");
        greenButton = new JButton("Green");
        blueButton = new JButton("Blue");
        messageButton = new JButton("Message");
        
        redButton.addActionListener(this);
        greenButton.addActionListener(this);
        blueButton.addActionListener(this);
        messageButton.addActionListener(thisx);
        
        window.add(redButton);
        window.add(greenButton);
        window.add(blueButton);
        window.add(messageButton);
        
        window.setVisible(true);
    }
    
 
    public void actionPerformed(ActionEvent event) {
        Object control = event.getSource();
        
        if (control == redButton) {
            window.getContentPane().setBackground(Color.red);
        } else if (control == greenButton) {
            window.getContentPane().setBackground(Color.green);
        } else if (control == blueButton) {
            window.getContentPane().setBackground(Color.blue);
        } else if (control == messageButton) {
            JOptionPane.showMessageDialog(window,
                "This is a popup message!",
                "Message",
                JOptionPane.QUESTION_MESSAGE);
        }
    }
} 