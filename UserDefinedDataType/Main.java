import mylib.Fraction;
import mylib.Matrix2D;
public class Main {
    public static void main(String[] args) {
// FRACTION OPERATIONS
        Fraction f1 = new Fraction(3, 4);
        Fraction f2 = new Fraction(5, 6);

        System.out.println("Addition: " + f1.add(f2));
        System.out.println("Subtraction: " + f1.sub(f2));
        System.out.println("Multiplication: " + f1.mul(f2));
        System.out.println("Division: " + f1.div(f2));

// MATRIX OPERATIONS
        double[][] data1 = {{1, 2}, {3, 4}, {6, 2}};
        double[][] data2 = {{5, 6}, {7, 8}, {7, 5}};

        Matrix2D m1 = new Matrix2D(data1);
        Matrix2D m2 = new Matrix2D(data2);

        System.out.println("m1:\n" + m1);
        System.out.println("m2:\n" + m2);

        System.out.println("Addition:\n" + m1.add(m2));
        System.out.println("Subtraction:\n" + m1.sub(m2));
        System.out.println("Multiplication:\n" + m1.mul(m2));
        try {
            System.out.println("Determinant of m1: " + m1.deter());
        }
        catch (UnsupportedOperationException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
