package Delimiters_LastFirst_01242025_pd6.src.Delimiters;
import java.util.ArrayList;

public class Delimiters {
    
    private String openDel;
    private String closeDel;

   
    public Delimiters(String op, String cl) {
        openDel = op;
        closeDel = cl;
    }

    public ArrayList<String> getDelimitersList(String[] tok) {
        ArrayList<String> delList = new ArrayList<String>();
        
        for (String str : tok) {
            if (str.equals(openDel) || str.equals(closeDel)) {
                delList.add(str);
            }
        }
        
        return delList;
    }


    public boolean isBalanced(ArrayList<String> del) {
        int count = 0;
        
        for (String str : del) {
            if (str.equals(openDel)) {
                count++;
            }
            else {
                count--;
            }
            
            if (count < 0) {
                return false;
            }
        }
        
        return count == 0;
    }

    public String toString() {
        return "Delimiters_{ " +
               "openDel: " + openDel + "\n" +
               "closeDel: " + closeDel + "\n" +
               "}";
    }
} 