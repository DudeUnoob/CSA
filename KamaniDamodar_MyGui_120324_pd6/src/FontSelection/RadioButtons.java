package KamaniDamodar_MyGui_120324_pd6.src.FontSelection;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RadioButtons implements ActionListener {
    private JFrame window;
    private JRadioButton timesNewRomanBtn;
    private JRadioButton arialBtn;
    private JRadioButton comicSansBtn;
    private JTextArea sampleText;
    private ButtonGroup fontGroup;
    
    public RadioButtons(int w, int h) {
        window = new JFrame();
        window.setSize(w, h);
        window.setTitle("Font Selection");
        window.setLocation(200, 300);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel contentPane = (JPanel) window.getContentPane();
        contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
        contentPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        timesNewRomanBtn = new JRadioButton("Times New Roman");
        arialBtn = new JRadioButton("Arial");
        comicSansBtn = new JRadioButton("Comic Sans MS");
        
        fontGroup = new ButtonGroup();
        fontGroup.add(timesNewRomanBtn);
        fontGroup.add(arialBtn);
        fontGroup.add(comicSansBtn);
        
        timesNewRomanBtn.addActionListener(this);
        arialBtn.addActionListener(this);
        comicSansBtn.addActionListener(this);
        
        sampleText = new JTextArea("The quick brown fox jumps over the lazy dog.", 5, 30);
        sampleText.setLineWrap(true);
        sampleText.setWrapStyleWord(true);
        sampleText.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        
        JPanel radioPanel = new JPanel();
        radioPanel.setLayout(new BoxLayout(radioPanel, BoxLayout.Y_AXIS));
        radioPanel.add(new JLabel("Select Font:"));
        radioPanel.add(Box.createVerticalStrut(10));
        radioPanel.add(timesNewRomanBtn);
        radioPanel.add(arialBtn);
        radioPanel.add(comicSansBtn);
        
        contentPane.add(radioPanel);
        contentPane.add(Box.createVerticalStrut(20));
        contentPane.add(new JScrollPane(sampleText));
        
        timesNewRomanBtn.setSelected(true);
        
        window.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent event) {
        Object source = event.getSource();
        
        if (source == timesNewRomanBtn) {
            sampleText.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        }
        else if (source == arialBtn) {
            sampleText.setFont(new Font("Arial", Font.PLAIN, 14));
        }
        else if (source == comicSansBtn) {
            sampleText.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
        }
    }
} 