package BinaryMultiplication;

public class BinaryRunner {
    public static void main(String[] args) {
        Binary binary = new Binary();

        
        System.out.println(Binary.getSum("00001011", "00010110")); 
        System.out.println(Binary.getSum("101", "11011"));
        System.out.println(Binary.getSum("00", "1001")); 
        
        System.out.println(Binary.getProduct("11011", "101")); 
        System.out.println(Binary.getProduct("111011", "111")); 
        System.out.println(Binary.getProduct("10111", "0")); 
    }
}
