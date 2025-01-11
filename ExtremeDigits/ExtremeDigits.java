package ExtremeDigits;

public class ExtremeDigits {
    
    private int leastDigit, largestDigit;
    private String number; 

    public ExtremeDigits() {
    }

    public ExtremeDigits(double number) {
        this.number = String.valueOf((long) number);  
       this.leastDigit = Integer.MAX_VALUE;  
        this.largestDigit = Integer.MIN_VALUE; 
    }

    public void findLargest() {
        int i = 0;
    
        while (i < number.length()) {
            char current = number.charAt(i);
            if (Character.isDigit(current)) {  
                int digit = current - '0';
                if (digit > largestDigit) {
                    largestDigit = digit;
                }
            }
            i++;
        }
    }

    public void findLeast() {
        int i = 0;
    
        while (i < number.length()) {
            char current = number.charAt(i);
            if (Character.isDigit(current)) { 
                int digit = current - '0';
                if (digit < leastDigit) {
                    leastDigit = digit;
                }
            }
            i++;
        }
    }

    public void findExtrema() {
        findLeast();
        findLargest();
    }

    @Override
    public String toString() {
        return String.format("The least digit in \"%s\" is %d.\nThe largest digit in \"%s\" is %d.", 
                number, leastDigit, number, largestDigit);
    }
}
