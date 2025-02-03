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
               "                age = " + age + "\n" +
               "            telephone = " + telephone;
    }
    
    public static int linearSearch(ArrayList<Employee> arr, String targetName) {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).getName().equals(targetName)) {
                return i;
            }
        }
        return -1;
    }
    
    public static int binarySearch(ArrayList<Employee> arr, String tN) {
        int left = 0;
        int right = arr.size() - 1;
        
        while (left <= right) {
            int mid = (left + right) / 2;
            String currentName = arr.get(mid).getName();
            
            int comparison = currentName.compareTo(tN);
            
            if (comparison == 0) {
                return mid;
            }
            if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
} 