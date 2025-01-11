package KamaniDamodar_MyGui_120324_pd6.src.StudentData;

import javax.swing.*;

public class StudentWindowRunner {
    private static final int NUM_STUDENTS = 5;
    private static Student[] students = new Student[NUM_STUDENTS];
    
    public static void main(String[] args) {
        StudentWindow window = new StudentWindow();
        
        for (int i = 0; i < NUM_STUDENTS; i++) {
            try {
                students[i] = window.getStudentInput();
                
                if (students[i] == null) {
                    System.exit(0);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, 
                    "Invalid age entered. Please enter a number.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
                i--; 
            }
        }
        
        String output = "Collected Student Data:\n\n";
        for (int i = 0; i < students.length; i++) {
            output = output + students[i].toString() + "\n";
        }
        
        JOptionPane.showMessageDialog(null, 
            output,
            "Student Records",
            JOptionPane.INFORMATION_MESSAGE);
    }
} 