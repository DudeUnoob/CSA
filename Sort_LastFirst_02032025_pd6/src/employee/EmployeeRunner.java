package employee;

import java.io.*;
import java.util.ArrayList;

public class EmployeeRunner {
    public static void main(String[] args) {
        ArrayList<Employee> employeeList = loadEmployees("employee.cvhs");
        
        if (employeeList != null) {
            System.out.println("Original List:");
            printList(employeeList);
            
            ArrayList<Employee> insertionList = new ArrayList<>(employeeList);
            long startTime = System.nanoTime();
            Employee.insertionSort(insertionList);
            long duration = System.nanoTime() - startTime;
            System.out.println("\nInsertion Sort (by age):");
            printList(insertionList);
            System.out.println("Insertion Sort Duration: " + duration + " nanoseconds");
            
            ArrayList<Employee> selectionList = new ArrayList<>(employeeList);
            startTime = System.nanoTime();
            Employee.selectionSort(selectionList);
            duration = System.nanoTime() - startTime;
            System.out.println("\nSelection Sort (by name):");
            printList(selectionList);
            System.out.println("Selection Sort Duration: " + duration + " nanoseconds");
            
            ArrayList<Employee> bubbleList = new ArrayList<>(employeeList);
            startTime = System.nanoTime();
            Employee.bubbleSort(bubbleList);
            duration = System.nanoTime() - startTime;
            System.out.println("\nBubble Sort (by telephone):");
            printList(bubbleList);
            System.out.println("Bubble Sort Duration: " + duration + " nanoseconds");
        }
    }
    
    private static ArrayList<Employee> loadEmployees(String fn) {
        try (ObjectInputStream ois = new ObjectInputStream(
                new BufferedInputStream(
                    new FileInputStream(fn)))) {
            ArrayList<Employee> list = (ArrayList<Employee>) ois.readObject();
            return list;
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error reading file: " + e.getMessage());
            return null;
        }
    }
    
    private static void printList(ArrayList<Employee> lst) {
        for (Employee emp : lst) {
            System.out.println(emp);
            System.out.println();
        }
    }
} 