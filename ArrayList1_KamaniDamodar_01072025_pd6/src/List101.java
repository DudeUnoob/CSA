import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List101 {
    public static void main(String[] args) {
        int[] x = {24, -25, 26, 27};
        List<Integer> list1 = new ArrayList<>();
        for (int value : x) {
            list1.add(value);
        }
        
        double[] y = {-3.5, 7, 19.25, 2.75};
        List<Double> list2 = new ArrayList<>();
        for (double value : y) {
            list2.add(value);
        }
        
        String[] name = {"Melvin", "Hope", "Lashonda"};
        List<String> list3 = new ArrayList<>(Arrays.asList(name));
        
        Student s1 = new Student(10, "Myla Estabillo");
        Student[] students = {
            new Student(7, "Meg Domingo"),
            new Student("Danny Holtz", 11),
            new Student("Shawn Tan", 8),
            s1
        };
        List<Student> list4 = new ArrayList<>(Arrays.asList(students));
        
        List<List<?>> list5 = new ArrayList<>();
        list5.add(list1);
        list5.add(list2);
        list5.add(list3);
        list5.add(list4);
        
        System.out.println("list1: " + list1);
        System.out.println("list2: " + list2);
        System.out.println("list3: " + list3);
        System.out.println("list4: " + list4);
        System.out.println("list5: " + list5);
    }
}