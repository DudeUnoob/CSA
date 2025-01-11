package FindLargest;

import java.util.Scanner;

public class LargestDigitRunner {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        System.out.println(" ======== Finding Maximum Digit in a Number ========");

        System.out.println("\nType in a number...");

        double num = kb.nextDouble();


        LargestDigit abc = new LargestDigit(num);

        abc.findLargest();


        System.out.println(abc);
    }
}
