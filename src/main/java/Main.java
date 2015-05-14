/**
 * Created by Александр on 13.05.2015.
 */
public class Main {



    public static void main(String[] args)
    {





    }

    public double[][] matrixMultiplication (double[][] X, double[][] Y) {
        if (X[0].length != Y.length) {
            throw new IllegalArgumentException("inner dimensions must agree.");
        }
        int xl = X.length, xc = X[0].length, yl = Y.length, yc = Y[0].length;
        double[][] Z = new double[xl][yc];
        double[] col = new double[xc];
        for (int i = 0; i < yc; i++)
        {

            for (int k = 0; k < xc; k++)
            {
                col[k] = X[k][i];
            }


            for (int j = 0; j < xl; j++)
            {
                double s = 0;
                double[] line = new double[j];
                for (int l = 0; i < yc; l++) {
                    line[l]=Y[j][l];
                    s = s + line[l]*col[l];
                }
               Z[j][i] = s;
            }

        }


        return Z;

    }
}
