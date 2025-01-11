package KamaniDamodar_MyGui_120324_pd6.src.PlayerOneGear;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.List;

public class PlayerOneGear implements ActionListener {
    private String playerName;
    private JFrame myFrame;
    private JTextField teamTextField;
    private JSpinner numLivesSpinner;
    private JList equipmentList;
    private JComboBox vehicleCombo;
    private JButton startButton;
    private JTextArea outputTextArea;

    public PlayerOneGear() {
        playerName = JOptionPane.showInputDialog("Enter player name: ");
        
        myFrame = new JFrame();
        myFrame.setTitle("Player One Gear");
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel mainPanel = (JPanel)myFrame.getContentPane();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));

        JPanel teamPanel = new JPanel();
        teamPanel.setLayout(new BoxLayout(teamPanel, BoxLayout.Y_AXIS));
        teamPanel.add(new JLabel("Welcome " + playerName + ", enter team name:"));
        teamTextField = new JTextField(20);
        teamPanel.add(teamTextField);
        
        mainPanel.add(teamPanel);
        mainPanel.add(new JLabel(" "));

        JPanel livesPanel = new JPanel();
        livesPanel.setLayout(new FlowLayout());
        livesPanel.add(new JLabel("Select number of lives:"));
        numLivesSpinner = new JSpinner(new SpinnerNumberModel(3,1,5,1));
        livesPanel.add(numLivesSpinner);
        
        mainPanel.add(livesPanel);
        mainPanel.add(new JLabel(" "));

        JPanel equipPanel = new JPanel();
        equipPanel.setLayout(new FlowLayout());
        equipPanel.add(new JLabel("Select starting equipment: "));
        String[] equipment = {"Utility Belt", "Rocket Boots", "Hover Pack", "Shield Generator"};
        equipmentList = new JList(equipment);
        equipmentList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        JScrollPane equipScroll = new JScrollPane(equipmentList,
            JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
            JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        equipPanel.add(equipScroll);
        
        mainPanel.add(equipPanel);
        mainPanel.add(new JLabel(" "));

        JPanel vehiclePanel = new JPanel();
        vehiclePanel.setLayout(new FlowLayout());
        vehiclePanel.add(new JLabel("Select your starting vehicle: "));
        String[] vehicles = {"Turbo Car", "Space Plane", "Stealth Bike", "Hover Tank"};
        vehicleCombo = new JComboBox(vehicles);
        vehiclePanel.add(vehicleCombo);
        
        mainPanel.add(vehiclePanel);
        mainPanel.add(new JLabel(" "));

        JPanel startPanel = new JPanel();
        startPanel.setLayout(new BoxLayout(startPanel, BoxLayout.Y_AXIS));
        startButton = new JButton("Start");
        startButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        startButton.addActionListener(this);
        startPanel.add(startButton);
        startPanel.add(new JLabel(" "));
        outputTextArea = new JTextArea(5,20);
        outputTextArea.setLineWrap(true);
        startPanel.add(outputTextArea);
        
        mainPanel.add(startPanel);

        myFrame.pack();
        myFrame.setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == startButton) {
            String teamName = teamTextField.getText();
            int numLives = (Integer)numLivesSpinner.getValue();
            
            List equipment = equipmentList.getSelectedValuesList();
            String chosen = "";
            for (int i = 0; i < equipment.size(); i++) {
                chosen = chosen + (String)equipment.get(i);
                if (i < equipment.size() - 1) {
                    chosen += ", ";
                }
            }
            
            String vehicle = (String)vehicleCombo.getSelectedItem();
            
            String output = "Welcome " + playerName + " of team " + teamName + 
                          ". You are starting with " + numLives + " lives!\n";
            output += "You have chosen the following starting equipment: " + chosen + "\n";
            output += "You have selected the following starting vehicle: " + vehicle;
            
            outputTextArea.setText(output);
        }
    }
}