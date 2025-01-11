package Calculate;

public class CalculateRunner {
    public static void main(String[] args) {
        String poly = "3/5x^3 + 2x^2 -2x + 1";
        
        double x = 2;
        double a = -2;
        double b = 2;
        int numDivision = 1000;

        System.out.println("Testing evaluatePoly method:");
        System.out.println("f(x) = " + poly);
        System.out.println("x = " + x);
        System.out.println("f(" + x + ") = " + Calculate.evaluatePoly(poly, x));

        System.out.println("\nTesting trapezoidSumPoly method:");
        System.out.println("Integral of f(x) from " + a + " to " + b + " with " + numDivision + " divisions:");
        System.out.println("Result: " + Calculate.trapezoidSumPoly(poly, a, b, numDivision));
    }
}