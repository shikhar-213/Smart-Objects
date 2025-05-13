package mylib;

public class Matrix2D {
    private int rows;
    private int cols;
    private double[][] data;

    // Constructor
    public Matrix2D(double[][] data) {
        this.rows = data.length;
        this.cols = data[0].length;
        this.data = data;
    }

    // Operations
    // Addition
    public Matrix2D add(Matrix2D other) {
        double[][] result = new double[rows][cols];

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                result[i][j] = this.data[i][j] + other.data[i][j];
            }
        }
        return new Matrix2D(result);
    }

    // Subtraction
    public Matrix2D sub(Matrix2D other) {
        double[][] result = new double[rows][cols];

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                result[i][j] = this.data[i][j] - other.data[i][j];
            }
        }
        return new Matrix2D(result);
    }

    // Multiplication
    public Matrix2D mul(Matrix2D other) {
        double[][] result = new double[rows][other.cols];

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < other.cols; j++) {
                for(int k = 0; k < cols; k++) {
                    result[i][j] = this.data[i][k] * other.data[k][j];
                }
            }
        }
        return new Matrix2D(result);
    }

//    // Transpose
//    public Matrix2D transpose() {
//        if ((rows == 2 && cols == 2) || (rows == 3 && cols == 3)) {
//            double[][] result = new double[rows][cols];
//
//            if (rows == 2) {
//                result[0][0] = data[0][0];
//                result[0][1] = data[1][0];
//                result[1][0] = data[0][1];
//                result[1][1] = data[1][1];
//            } else {
//                result[0][0] = data[0][0];
//                result[0][1] = data[1][0];
//                result[0][2] = data[2][0];
//
//                result[1][0] = data[0][1];
//                result[1][1] = data[1][1];
//                result[1][2] = data[2][1];
//
//                result[2][0] = data[0][2];
//                result[2][1] = data[1][2];
//                result[2][2] = data[2][2];
//            }
//
//            return new Matrix2D(result);
//        }
//        else {
//            throw new UnsupportedOperationException("Only for 2x2 and 3x3 matrices!");
//        }
//    }

    public double deter() {
        if (rows != 2 || cols != 2) {
            throw new UnsupportedOperationException("Determinant only for 2x2 matrix!");
        }

        return data[0][0] * data[1][1] * data[0][1] * data[1][0];
    }

    @ Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
         for(double[] row : data) {
             for(double val : row) {
                 sb.append(val).append(" ");
             }
             sb.append("\n");
         }

         return sb.toString();
    }
}
