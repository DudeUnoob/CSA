package employee;

import java.io.*;
import java.util.ArrayList;

public class EmployeeRunner {
    public static void main(String[] args) {
        ArrayList<Employee> employeeList1 = loadEmployees("employee.cvhs");
        ArrayList<Employee> employeeList2 = loadEmployees("sortedEmployee.cvhs");
        
        String[] targetNames = {
            "Haliley Garcia",
            "Emily Ward",
            "Lillian Edwards",
            "Jack McDonald",
            "Luis McDonald",
            "Donald Biden"
        };
        
        System.out.println("Linear Search Results (Unsorted Data):");
        for (String name : targetNames) {
            performSearch(employeeList1, name, true);
        }
        
        System.out.println("\nBinary Search Results (Sorted Data):");
        for (String name : targetNames) {
            performSearch(employeeList2, name, false);
        }
    }
    
    private static ArrayList<Employee> loadEmployees(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(
                new BufferedInputStream(
                    new FileInputStream(filename)))) {
            return (ArrayList<Employee>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error reading file: " + e.getMessage());
            return null;
        }
    }
    
    private static void performSearch(ArrayList<Employee> list, String targetName, boolean useLinear) {
        long startTime = System.nanoTime();
        int index = useLinear ? 
            Employee.linearSearch(list, targetName) :
            Employee.binarySearch(list, targetName);
        long duration = System.nanoTime() - startTime;
        
        if (index >= 0) {
            Employee emp = list.get(index);
            System.out.println("\nFound " + index + ": ");
            System.out.println(emp);
            System.out.println("        search duration = " + duration + " nanoseconds");
        } else {
            System.out.println("\n" + targetName + " is NOT found!");
        }
    }
} 