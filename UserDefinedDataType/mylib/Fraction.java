package mylib;

public class Fraction {
    private int numerator;
    private int denominator;

    // Constructor
    public Fraction(int numerator, int denominator) {
        if(denominator == 0) {
            throw new ArithmeticException("Denominator can not be 0!");
        }
        this.numerator = numerator;
        this.denominator = denominator;
        simplify();
    }

    // Simplify the fraction
    private void simplify() {
        int gcd = gcd(Math.abs(numerator), Math.abs(denominator));
        numerator /= gcd;
        denominator /= gcd;

        if(denominator < 0) {
            numerator *= -1;
            denominator *= -1;
        }
    }

    // GCD helper
    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    // HERE ARE THE OPERATIONS
    // ADDITION
    public Fraction add(Fraction other) {
        int newNum = (this.numerator * other.denominator) + (other.numerator * this.denominator);
        int newDen = this.denominator * other.denominator;

        /* creating a 'new Fraction object' with the result of the operation.
        It allows you to reuse fractions (f1, f2) safely in multiple operations.*/
        return new Fraction(newNum, newDen);
    }

    // SUBTRACTION
    public Fraction sub(Fraction other) {
        int newNum = (this.numerator * other.denominator) - (other.numerator * this.denominator);
        int newDen = this.denominator * other.denominator;

        return new Fraction(newNum, newDen);
    }

    // MULTIPLICATION
    public Fraction mul(Fraction other) {
        int newNum = this.numerator * other.numerator;
        int newDen = this.denominator * other.denominator;

        return new Fraction(newNum, newDen);
    }

    // DIVISION
    public Fraction div(Fraction other) {
        int newNum = this.numerator * other.denominator;
        int newDen = this.denominator * other.numerator;

        return new Fraction(newNum, newDen);
    }

    // How to print the fractions?
    // you're overriding the toString() method from the Object class — which is the parent of all classes in Java.
    @ Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}
