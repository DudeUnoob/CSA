package KamaniDamodar_MyGui_120324_pd6.src.PizzaPlace;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PizzaPlace implements ActionListener {
    private JFrame window;
    private JTextField customerNameField;
    private JRadioButton smallBtn, mediumBtn, largeBtn;
    private JComboBox crustCombo;
    private JList toppingsList;
    private JCheckBox breadSticksBox, saladBox, sodaBox;
    private JTextArea commentsArea;
    private JButton placeOrderBtn, resetBtn;
    
    public PizzaPlace() {
        
        window = new JFrame();
        window.setTitle("Pizza Place");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel mainPanel = (JPanel)window.getContentPane();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        JPanel namePanel = new JPanel();
        namePanel.add(new JLabel("Customer Name:"));
        customerNameField = new JTextField(20);
        namePanel.add(customerNameField);
        mainPanel.add(namePanel);
        
        JPanel sizePanel = new JPanel();
        sizePanel.add(new JLabel("Pizza Size:"));
        smallBtn = new JRadioButton("Small");
        mediumBtn = new JRadioButton("Medium");
        largeBtn = new JRadioButton("Large");
        
        ButtonGroup sizeGroup = new ButtonGroup();
        sizeGroup.add(smallBtn);
        sizeGroup.add(mediumBtn);
        sizeGroup.add(largeBtn);
        
        sizePanel.add(smallBtn);
        sizePanel.add(mediumBtn);
        sizePanel.add(largeBtn);
        mainPanel.add(sizePanel);
        
        JPanel crustPanel = new JPanel();
        crustPanel.add(new JLabel("Crust Type:"));
        crustCombo = new JComboBox(new String[]{"Thin", "Thick", "Deep Dish"});
        crustPanel.add(crustCombo);
        mainPanel.add(crustPanel);
        
        JPanel toppingsPanel = new JPanel();
        toppingsPanel.add(new JLabel("Toppings:"));
        String[] toppings = {"Pepperoni", "Sausage", "Green Peppers", "Onions", 
                            "Tomatoes", "Anchovies", "Bacon", "Chicken", "Beef", 
                            "Olives", "Mushrooms"};
        toppingsList = new JList(toppings);
        toppingsList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        toppingsPanel.add(new JScrollPane(toppingsList));
        mainPanel.add(toppingsPanel);
        
        JPanel extrasPanel = new JPanel();
        extrasPanel.add(new JLabel("Extras:"));
        breadSticksBox = new JCheckBox("BreadSticks");
        saladBox = new JCheckBox("Salad");
        sodaBox = new JCheckBox("Soda");
        extrasPanel.add(breadSticksBox);
        extrasPanel.add(saladBox);
        extrasPanel.add(sodaBox);
        mainPanel.add(extrasPanel);
        
        JPanel commentsPanel = new JPanel();
        commentsPanel.add(new JLabel("Order Comments:"));
        commentsArea = new JTextArea(5, 20);
        commentsPanel.add(new JScrollPane(commentsArea));
        mainPanel.add(commentsPanel);
        
        JPanel buttonsPanel = new JPanel();
        placeOrderBtn = new JButton("Place Order");
        resetBtn = new JButton("Reset Values");
        placeOrderBtn.addActionListener(this);
        resetBtn.addActionListener(this);
        buttonsPanel.add(placeOrderBtn);
        buttonsPanel.add(resetBtn);
        mainPanel.add(buttonsPanel);
        
        smallBtn.setSelected(true);
        
        window.pack();
        window.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == placeOrderBtn) {
            String orderSummary = "Customer Name: " + customerNameField.getText() + "\n\n";
            
            orderSummary += "Pizza Size: ";
            if (smallBtn.isSelected()) orderSummary += "Small";
            else if (mediumBtn.isSelected()) orderSummary += "Medium";
            else if (largeBtn.isSelected()) orderSummary += "Large";
            orderSummary += "\n\n";
            
            orderSummary += "Crust Type: " + crustCombo.getSelectedItem() + "\n\n";
            
            orderSummary += "Selected Toppings:\n";
            Object[] selectedToppings = toppingsList.getSelectedValues();
            for (Object topping : selectedToppings) {
                orderSummary += "- " + topping + "\n";
            }
            orderSummary += "\n";
            
            orderSummary += "Extras:\n";
            if (breadSticksBox.isSelected()) orderSummary += "- BreadSticks\n";
            if (saladBox.isSelected()) orderSummary += "- Salad\n";
            if (sodaBox.isSelected()) orderSummary += "- Soda\n";
            orderSummary += "\n";
            
            orderSummary += "Comments:\n" + commentsArea.getText();
            
            JOptionPane.showMessageDialog(window, orderSummary, "Order Summary", 
                                        JOptionPane.INFORMATION_MESSAGE);
        }
        else if (event.getSource() == resetBtn) {
            customerNameField.setText("");
            smallBtn.setSelected(true);
            crustCombo.setSelectedIndex(0);
            toppingsList.clearSelection();
            breadSticksBox.setSelected(false);
            saladBox.setSelected(false);
            sodaBox.setSelected(false);
            commentsArea.setText("");
        }
    }
}