package employee;

import java.io.Serializable;
import java.util.ArrayList;

public class Employee implements Serializable {
    private static final long serialVersionUID = 3496L;
    private String name;
    private int age;
    private String telephone;
    
    public Employee(String n, int a, String t) {
        name = n;
        age = a;
        telephone = t;
    }
    
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getTelephone() { return telephone; }
    
    public String toString() {
        return "Employee:: \n" +
               "                 name = " + name + "\n" +
               "                  age = " + age + "\n" +
               "            telephone = " + telephone;
    }
    
    public static void insertionSort(ArrayList<Employee> arr) {
        for (int i = 1; i < arr.size(); i++) {
            Employee key = arr.get(i);
            int j = i - 1;
            while (j >= 0 && arr.get(j).getAge() > key.getAge()) {
                arr.set(j + 1, arr.get(j));
                j--;
            }
            arr.set(j + 1, key);
        }
    }
    
    public static void selectionSort(ArrayList<Employee> arr) {
        for (int i = 0; i < arr.size() - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.size(); j++) {
                String name1 = arr.get(j).getName();
                String name2 = arr.get(min).getName();
                if (name1.compareTo(name2) < 0) {
                    min = j;
                }
            }
            Employee temp = arr.get(i);
            arr.set(i, arr.get(min));
            arr.set(min, temp);
        }
    }
    
    public static void bubbleSort(ArrayList<Employee> arr) {
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = 0; j < arr.size() - i - 1; j++) {
                if (arr.get(j).getTelephone().compareTo(arr.get(j + 1).getTelephone()) > 0) {
                    Employee temp = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, temp);
                }
            }
        }
    }
} 