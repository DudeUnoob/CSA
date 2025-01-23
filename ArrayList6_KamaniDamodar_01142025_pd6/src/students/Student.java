package students;

import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = 110924L;
    private String name;
    private int age;
    private String email;
    private String telephone;
    
    public Student(String n, int a, String e, String t) {
        name = n;
        age = a;
        email = e;
        telephone = t;
    }
    
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getTelephone() { return telephone; }
    public int getAge() { return age; }
    
    public void setTelephone(String tel) {
        telephone = tel;
    }
    
    public String toString() {
        return "Student::            name: " + name + "\n" +
               "                      age: " + age + "\n" +
               "                    email: " + email + "\n" +
               "                telephone: \"" + telephone + "\"\n";
    }
} 