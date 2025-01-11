package FindLargest;

public class LargestDigit {
    
    private int largestDigit;
    private double number;

    public LargestDigit() {
        
    }

    public LargestDigit(double number) {
        this.number = number;
    }

    public void findLargest() {
        String numberStr = String.valueOf(number);
        int i = 0;
    
        while (i < numberStr.length()) {
            char current = numberStr.charAt(i);
    
                int digit = current - '0';
    
                if (digit > largestDigit) {
                    largestDigit = digit;
                }
    
            i++;
        }
    }
    

    public String toString() {
        return String.format("The largest digit in \"%s\" is %d.", number, largestDigit);
    }
}
