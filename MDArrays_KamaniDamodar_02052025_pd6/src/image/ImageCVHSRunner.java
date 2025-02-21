package MDArrays_KamaniDamodar_02052025_pd6.src.image;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.event.*;

public class ImageCVHSRunner {
    private static ImageCVHS imageProcessor;
    private static BufferedImage originalImage;
    private static JLabel processedImageLabel;
    private static JLabel originalImageLabel;
    private static JLabel alphaLabel;
    private static JLabel buttonLabel;
    private static JPanel mainPanel;
    private static int currentBrightness = 0;
    private static float currentAlpha = 1.0f;
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Window");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        
        try {
            originalImage = ImageIO.read(new File("Images/RhinoHTown.jpg"));
            imageProcessor = new ImageCVHS(originalImage);
        } catch (Exception e) {
        
            return;
        }

        
        mainPanel = new JPanel(new GridLayout(2, 2, 10, 10));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
       
        JPanel originalPanel = new JPanel(new BorderLayout());
        originalPanel.setBorder(BorderFactory.createTitledBorder("original"));
        originalImageLabel = new JLabel();
        originalImageLabel.setHorizontalAlignment(JLabel.CENTER);
        originalPanel.add(originalImageLabel, BorderLayout.CENTER);
        

        JPanel brightnessPanel = new JPanel(new BorderLayout());
        brightnessPanel.setBorder(BorderFactory.createTitledBorder("Brightness"));
        processedImageLabel = new JLabel();
        processedImageLabel.setHorizontalAlignment(JLabel.CENTER);
        brightnessPanel.add(processedImageLabel, BorderLayout.CENTER);
        
        JSlider brightnessSlider = new JSlider(JSlider.HORIZONTAL, -100, 100, 0);
        brightnessSlider.setMajorTickSpacing(50);
        brightnessSlider.setPaintTicks(true);
        brightnessSlider.setPaintLabels(true);
        brightnessPanel.add(brightnessSlider, BorderLayout.SOUTH);
        
        
        JPanel alphaPanel = new JPanel(new BorderLayout());
        alphaPanel.setBorder(BorderFactory.createTitledBorder("alpha"));
        alphaLabel = new JLabel();
        alphaPanel.add(alphaLabel, BorderLayout.CENTER);
        JSlider alphaSlider = new JSlider(JSlider.HORIZONTAL, 0, 100, 100);
        alphaSlider.setMajorTickSpacing(50);
        alphaSlider.setPaintTicks(true);
        alphaSlider.setPaintLabels(true);
        alphaPanel.add(alphaSlider, BorderLayout.SOUTH);
        
       
        
        JPanel buttonsPanel = new JPanel(new BorderLayout());
        buttonLabel = new JLabel();
        buttonLabel.setHorizontalAlignment(JLabel.CENTER);
        buttonsPanel.add(buttonLabel, BorderLayout.CENTER);
        
        
        JPanel buttonControls = new JPanel();
        buttonControls.setLayout(new GridLayout(1, 3)); 
        JButton btnA = new JButton("A - Transpose");
        JButton btnB = new JButton("B - Vertical Flip");
        JButton btnC = new JButton("C - Horizontal");
        
 
        buttonControls.add(btnA);
        buttonControls.add(btnB);
        buttonControls.add(btnC);
        
        
        buttonsPanel.add(buttonControls, BorderLayout.SOUTH);
        
        btnA.addActionListener(e -> {
            int[][] result = imageProcessor.transpose();
            BufferedImage img = imageProcessor.arrayToBufferedImage(result);
            buttonLabel.setIcon(new ImageIcon(img));
        });
        
        btnB.addActionListener(e -> {
            int[][] result = imageProcessor.verticalFlip();
            BufferedImage img = imageProcessor.arrayToBufferedImage(result);
            buttonLabel.setIcon(new ImageIcon(img));
        });
        
        btnC.addActionListener(e -> {
            int[][] result = imageProcessor.horizontalFlip();
            BufferedImage img = imageProcessor.arrayToBufferedImage(result);
            buttonLabel.setIcon(new ImageIcon(img));
        });
        
        brightnessSlider.addChangeListener(e -> {
            currentBrightness = brightnessSlider.getValue();
            int[][] result = imageProcessor.setBrightness(currentBrightness);
            BufferedImage img = imageProcessor.arrayToBufferedImage(result);
            processedImageLabel.setIcon(new ImageIcon(img));
        });
        
        alphaSlider.addChangeListener(e -> {
            currentAlpha = alphaSlider.getValue() / 100.0f;
            updateAlphaImage(originalImage);
        });
        
       
        mainPanel.add(originalPanel);
        mainPanel.add(brightnessPanel);
        mainPanel.add(alphaPanel);
        mainPanel.add(buttonsPanel);
        
        frame.add(mainPanel);
        
        updateOriginalImage();
        
        processedImageLabel.setIcon(new ImageIcon(originalImage));
        alphaLabel.setIcon(new ImageIcon(originalImage));
        buttonLabel.setIcon(new ImageIcon(originalImage));
        
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    
    private static void updateOriginalImage() {
        ImageIcon icon = new ImageIcon(originalImage);
        originalImageLabel.setIcon(icon);
    }
    
    private static void updateAlphaImage(BufferedImage img) {
        if (currentAlpha < 1.0f) {
            BufferedImage alphaImage = new BufferedImage(
                img.getWidth(), img.getHeight(), BufferedImage.TYPE_INT_ARGB);
            Graphics2D g2d = alphaImage.createGraphics();
            g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, currentAlpha));
            g2d.drawImage(img, 0, 0, null);
            g2d.dispose();
            img = alphaImage;
        }
        alphaLabel.setIcon(new ImageIcon(img));
    }
}