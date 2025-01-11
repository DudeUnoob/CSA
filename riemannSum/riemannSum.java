package riemannSum;

public class riemannSum {
    
    private double c;
    private double a, b;
    private int numDivisions;
    private double exp;
    private double sum;

    public riemannSum(double c, double a, double b, int numDivisions, double exp) {
        this.c = c;
        this.a = a;
        this.b = b;
        this.numDivisions = numDivisions;
        this.exp = exp;
    }

    public double calculateRiemannSum() {
        double deltaX = (b - a) / numDivisions;
        double finalSum = 0;

        for (int i = 0; i < numDivisions; i++) {
            double x = a + i * deltaX;
            finalSum += c * Math.pow(x, exp) * deltaX;
        }

        sum = finalSum;
        return finalSum;
    }

    public String toString() {
        return String.format("%.6f", sum); 
    }

    public static void main(String[] args) {
        riemannSum mySum = new riemannSum(1.8, 1, 3, 1000, 3);
        mySum.calculateRiemannSum(); 
        System.out.println("The Riemann sum is: " + mySum);
    }
}