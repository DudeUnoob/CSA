package StringFormatter_KamaniDamodar_01232025_pd6.src.StringFormatter;
import java.util.Arrays;
import java.util.List;

public class StringFormatterRunner {
    public static void main(String[] args) {
       
        List<String> words1 = Arrays.asList("AP", "COMP", "SCI", "ROCKS");
        StringFormatter formatter1 = new StringFormatter(words1);
        
        System.out.println("Test Case 1:");
        System.out.println("Total letters: " + formatter1.totalLetters());
        System.out.println("Basic gap width: " + formatter1.basicGapWidth(20));
        System.out.println("Leftover spaces: " + formatter1.leftoverSpaces(20));
        System.out.println("Formatted string: " + formatter1.format(20));
        System.out.println();
        
    
        List<String> words2 = Arrays.asList("GREEN", "EGGS", "AND", "HAM");
        StringFormatter formatter2 = new StringFormatter(words2);
        
        System.out.println("Test Case 2:");
        System.out.println("Total letters: " + formatter2.totalLetters());
        System.out.println("Basic gap width: " + formatter2.basicGapWidth(20));
        System.out.println("Leftover spaces: " + formatter2.leftoverSpaces(20));
        System.out.println("Formatted string: " + formatter2.format(20));
        System.out.println();
        
        
        List<String> words3 = Arrays.asList("BEACH", "BALL");
        StringFormatter formatter3 = new StringFormatter(words3);
        
        System.out.println("Test Case 3:");
        System.out.println("Total letters: " + formatter3.totalLetters());
        System.out.println("Basic gap width: " + formatter3.basicGapWidth(20));
        System.out.println("Leftover spaces: " + formatter3.leftoverSpaces(20));
        System.out.println("Formatted string: " + formatter3.format(20));
    }
} 