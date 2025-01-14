package students;

import java.io.*;
import java.util.*;

public class InfoListRunner {
    private static List<Student> infoList;
    
   
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(
                new BufferedInputStream(
                    new FileInputStream("student.cvhs")))) {
            infoList = (List<Student>) ois.readObject();
            
            if (infoList == null) {
                System.err.println("Error: No data read from file");
                return;
            }
            
            InfoList studentInfo = new InfoList(infoList);
            
            System.out.println("All Students:");
            System.out.println(studentInfo);
            
          
            System.out.println("Gmail users: " + 
                studentInfo.countEmailProvider("gmail.com"));
            System.out.println("Hotmail users: " + 
                studentInfo.countEmailProvider("hotmail.com"));
            
            
            String[] phoneNum = {
                "7137827850", "7133946285", "2101342329", "2109503352",
                "7139621362", "8328222473", "2105235393", "2104437160"
            };
            List<String> phoneNumbers = Arrays.asList(phoneNum);
            
            System.out.println("\nPhone Owners:");
            List<String> owners = studentInfo.findPhoneOwner(phoneNumbers);
            for (int i = 0; i < phoneNumbers.size(); i++) {
                System.out.println(phoneNumbers.get(i) + ": " + owners.get(i));
            }
            
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error reading file: " + e.getMessage());
            e.printStackTrace();
        }
    }
} 