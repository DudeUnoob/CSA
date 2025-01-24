package Delimiters_LastFirst_01242025_pd6.src.Delimiters;
import java.util.ArrayList;

public class DelimitersRunner {
    public static void main(String[] arg) {

        Delimiters test1 = new Delimiters("(", ")");
        String[] tokens1 = {"(", "x + y", ")", " * 5"};
        ArrayList<String> delList1 = test1.getDelimitersList(tokens1);
        System.out.println("Test 1:");
        System.out.println("Delimiters list: " + delList1);
        System.out.println("Balanced: " + test1.isBalanced(delList1));
        System.out.println();


        Delimiters test2 = new Delimiters("<q>", "</q>");
        String[] tokens2 = {"<q>", "yy", "</q>", "zz", "</q>"};
        ArrayList<String> delList2 = test2.getDelimitersList(tokens2);
        System.out.println("Test 2:");
        System.out.println("Delimiters list: " + delList2);
        System.out.println("Balanced: " + test2.isBalanced(delList2));
        System.out.println();

 
        Delimiters test3 = new Delimiters("<sup>", "</sup>");
        String[] tokens3 = {"<sup>", "<sup>", "</sup>", "<sup>", "</sup>", "</sup>"};
        ArrayList<String> delList3 = test3.getDelimitersList(tokens3);
        System.out.println("Test 3:");
        System.out.println("Delimiters list: " + delList3);
        System.out.println("Balanced: " + test3.isBalanced(delList3));
    }
} 