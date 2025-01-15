import java.util.ArrayList;
import java.util.Arrays; 
import java.util.List;

public class Student {
    private int age;
    private String name;
    
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
    
    public Student(String name, int age) {
        this.age = age;
        this.name = name;
    }
    
    public String toString() {
        return "Student[name=" + name + ", age=" + age + "]";
    }
}

