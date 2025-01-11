package KamaniDamodar_MyGui_120324_pd6.src.StudentData;

public class Student {
    private String name;
    private int age;
    private boolean drivesToSchool;
    
    public Student(String name, int age, boolean drivesToSchool) {
        this.name = name;
        this.age = age;
        this.drivesToSchool = drivesToSchool;
    }
    
    public String getName() { return name; }
    public int getAge() { return age; }
    public boolean getDrivesToSchool() { return drivesToSchool; }
    
    @Override
    public String toString() {
        return "Student: " + name + ", Age: " + age + 
               ", Drives to school: " + (drivesToSchool ? "Yes" : "No");
    }
} 