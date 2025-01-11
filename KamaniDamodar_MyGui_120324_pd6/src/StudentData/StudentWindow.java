package KamaniDamodar_MyGui_120324_pd6.src.StudentData;

import javax.swing.*;

public class StudentWindow {
    public Student getStudentInput() {
        String name = JOptionPane.showInputDialog("Enter student name:");
        if (name == null) return null;
        
        String ageStr = JOptionPane.showInputDialog("Enter student age:");
        if (ageStr == null) return null;
        int age = Integer.parseInt(ageStr);
        
        int drivesOption = JOptionPane.showConfirmDialog(null, 
            "Does the student drive to school?",
            "Driving Status",
            JOptionPane.YES_NO_OPTION);
        
        boolean drivesToSchool = (drivesOption == JOptionPane.YES_OPTION);
        
        return new Student(name, age, drivesToSchool);
    }
} 