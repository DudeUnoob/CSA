package Rational;

public class Rational {
    private int numerator;
    private int denominator;

    public Rational(int num, int den) {
        setRational(num, den);
    }

    public void setRational(int num, int den) {
        numerator = num;
        denominator = den;
        reduce();
    }

    private void reduce() {
        if (numerator != 0) {
            int gcd = gcd(Math.abs(numerator), Math.abs(denominator));
            numerator = numerator / gcd;
            denominator = denominator / gcd;
        }
        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }
    }

    private int gcd(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }

    public void add(Rational other) {
        numerator = numerator * other.denominator + other.numerator * denominator;
        denominator = denominator * other.denominator;
        reduce();
    }

    public void subtract(Rational other) {
        numerator = numerator * other.denominator - other.numerator * denominator;
        denominator = denominator * other.denominator;
        reduce();
    }

    public boolean isBigger(Rational other) {
        double thisValue = (double) numerator / denominator;
        double otherValue = (double) other.numerator / other.denominator;
        return thisValue > otherValue;
    }

    public boolean equals(Rational other) {
        return numerator == other.numerator && denominator == other.denominator;
    }

    public String toString() {
        return numerator + " / " + denominator;
    }
}
