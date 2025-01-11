package Stitch;

public class Stitch {

    public static String stitch1(String str1, String str2) {

        String result = "";
        int str2Index = str2.length() - 1;

        for (int i = 0; i < str1.length(); i++) {
            result += str1.charAt(i);
            if (str2Index >= 0) {
                result += str2.charAt(str2Index--);
            }
        }

        return result;
    }

    public static String stitch2(String str1, String str2) {
  

        String result = "";
        int str1Index = 0;
        int str2Index = 0;

        while (str2Index < str2.length()) {
            result += str2.charAt(str2Index++);

            if (str1Index < str1.length() && (result.length() == 1 || result.charAt(result.length() - 2) != str1.charAt(str1Index))) {
                result += str1.charAt(str1Index++);
            }
        }

        return result;
    }
}
