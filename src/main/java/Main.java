/**
 * Created by Александр on 13.05.2015.
 */



public class Main {



    public static void main(String[] args) {

    }

    public double[][] matrixMultiplication (double[][] X, double[][] Y) {
        if (X[0].length != Y.length) {
            throw new IllegalArgumentException("inner dimensions must agree.");
        }
        int xl = X.length, xc = X[0].length, yl = Y.length, yc = Y[0].length;
        double[][] Z = new double[xl][yc]; //initialize the final matrix
        double[] col = new double[xc]; //initialize array for columns
        for (int i = 0; i < yc; i++) {
            for (int k = 0; k < xc; k++)
            {
                col[k] = Y[k][i]; // assign values to an array of column
            }
            for (int j = 0; j < xl; j++) {
                double[] line = new double[xc]; //initialize array for lines
                double s = 0;
                for (int k = 0; k < xc; k++)
                {
                    line[k]=X[j][k]; //assign values to an array of lines
                    s = s + line[k] * col[k];
                }
                Z[j][i] = s; //assign a value to element a final matrix
            }
        }
        return Z;
    }

}
