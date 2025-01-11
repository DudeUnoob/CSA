package BinaryMultiplication;

public class Binary {
    
    public static String getSum(String bin1, String bin2) {
        int maxLength = bin1.length();
        if (bin2.length() > maxLength) {
            maxLength = bin2.length();
        }
        
        while (bin1.length() < maxLength) {
            bin1 = "0" + bin1;
        }
        while (bin2.length() < maxLength) {
            bin2 = "0" + bin2;
        }
        
        String result = "";
        int carry = 0;
        
        for (int i = maxLength - 1; i >= 0; i--) {
            int bit1 = bin1.charAt(i) - '0';
            int bit2 = bin2.charAt(i) - '0';
            
            int sum = bit1 + bit2 + carry;
            result = (sum % 2) + result;
            carry = sum / 2;
        }
        
        if (carry > 0) {
            result = carry + result;
        }
        
        return result;
    }
    
    public static String getProduct(String bin1, String bin2) {
        if (bin1.equals("0") || bin2.equals("0")) {
            String result = "0";
            while (result.length() < bin1.length() + bin2.length()) {
                result = "0" + result;
            }
            return result;
        }
        
        String result = "0";
        
        for (int i = bin2.length() - 1; i >= 0; i--) {
            if (bin2.charAt(i) == '1') {
                String shifted = bin1;
                for (int j = 0; j < bin2.length() - 1 - i; j++) {
                    shifted = shifted + "0";
                }
                result = getSum(result, shifted);
            }
        }
        
        while (result.length() < bin1.length() + bin2.length()) {
            result = "0" + result;
        }
        
        return result;
    }
}