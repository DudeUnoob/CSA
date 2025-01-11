package ExtremeDigits;
import java.util.Scanner;

public class ExtremeDigitsRunner {
    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.println(" ======== Finding Extreme Digits in a Number ========");
       
        System.out.println("\nType in a number...");
       
        double num = kb.nextDouble() ;
       
        
       
        
       
        //process:
       
        ExtremeDigits xyz = new ExtremeDigits(num);
       
        xyz.findExtrema();
       
        
       
        //output:
       
        System.out.println(xyz);
    }
}
