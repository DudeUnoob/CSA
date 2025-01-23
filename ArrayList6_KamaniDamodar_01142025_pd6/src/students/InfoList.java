package students;

import java.util.ArrayList;
import java.util.List;

public class InfoList {
    private List<Student> classInfoList;
    
    public InfoList(List<Student> l) {
        classInfoList = l;
    }
    
    public int countEmailProvider(String provider) {
        int count = 0;
        for (Student s : classInfoList) {
            if (s.getEmail().contains("@" + provider)) {
                count++;
            }
        }
        return count;
    }
    
    public List<String> findPhoneOwner(List<String> phoneList) {
        List<String> names = new ArrayList<>();
        
        for (String p : phoneList) {
            boolean found = false;
            for (Student s : classInfoList) {
                if (s.getTelephone().equals(p)) {
                    names.add(s.getName());
                    found = true;
                }
            }
            if (!found) {
                names.add("none");
            }
        }
        
        return names;
    }
    
    public String replace(String stuName, String newTel) {
        for (Student stu : classInfoList) {
            if (stu.getName().equals(stuName)) {
                for (Student other : classInfoList) {
                    if (other.getTelephone().equals(newTel)) {
                        return "This " + newTel + " is already used!";
                    }
                }
                String oldTel = stu.getTelephone();
                stu.setTelephone(newTel);
                return oldTel;
            }
        }
        return null;
    }
    
    public boolean addStudent(Student stuData) {
        for (Student stu : classInfoList) {
            if (stu.getName().equals(stuData.getName()) &&
                stu.getAge() == stuData.getAge() &&
                stu.getEmail().equals(stuData.getEmail()) &&
                stu.getTelephone().equals(stuData.getTelephone())) {
                return false;
            }
        }
        classInfoList.add(stuData);
        return true;
    }
    
    public String toString() {
        String result = "";
        for (Student s : classInfoList) {
            result += s.toString() + "\n";
        }
        return result;
    }
} 