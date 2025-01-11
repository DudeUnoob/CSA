package Calculate;

import java.util.*;
import java.util.regex.*;

public class Calculate {
    public static double evaluatePoly(String poly, double x) {
        poly = poly.replaceAll("\\s+", ""); 
        double result = 0;
        int index = 0;

        while (index < poly.length()) {
            int nextSign = findNextSign(poly, index);
            String term = nextSign == -1 ? poly.substring(index) : poly.substring(index, nextSign);
            result += evaluateTerm(term, x);
            index = nextSign == -1 ? poly.length() : nextSign;
        }

        return result;
    }

    private static int findNextSign(String poly, int startIndex) {
        for (int i = startIndex + 1; i < poly.length(); i++) {
            if (poly.charAt(i) == '+' || poly.charAt(i) == '-') {
                return i;
            }
        }
        return -1;
    }

    private static double evaluateTerm(String term, double x) {
        Pattern pattern = Pattern.compile("([-+]?\\d*\\.?\\d*)x?\\^?(\\d*)");
        Matcher matcher = pattern.matcher(term);

        if (matcher.find()) {
            String coeffStr = matcher.group(1);
            String expStr = matcher.group(2);

            double coeff = coeffStr.isEmpty() ? 1 : (coeffStr.equals("-") ? -1 : Double.parseDouble(coeffStr));
            int exp = expStr.isEmpty() ? (term.contains("x") ? 1 : 0) : Integer.parseInt(expStr);

            return coeff * Math.pow(x, exp);
        }

        return 0;
    }

    public static double trapezoidSumPoly(String poly, double a, double b, int numDivision) {
        double h = (b - a) / numDivision;
        double sum = 0.5 * (evaluatePoly(poly, a) + evaluatePoly(poly, b));

        for (int i = 1; i < numDivision; i++) {
            double x = a + i * h;
            sum += evaluatePoly(poly, x);
        }

        return h * sum;
    }
}