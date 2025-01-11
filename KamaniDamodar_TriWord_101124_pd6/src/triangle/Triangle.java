package KamaniDamodar_TriWord_101124_pd6.src.triangle;

public class Triangle {
    private String word;

    public Triangle(String word) {
        this.word = word;
    }

    public String reverse(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }

    @Override
    public String toString() {
        String result = "";
        int length = word.length();

        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                result += "   ";
            }
            result += word.charAt(i);
            for (int j = 0; j < 4 * i + 1; j++) {
                result += " ";
            }
            if (i > 0) {
                result += word.charAt(i);
            }
            result += "\n";
        }

        result += word + " " + reverse(word);

        return result;
    }
}