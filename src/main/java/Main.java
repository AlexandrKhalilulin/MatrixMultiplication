/**
 * Created by Александр on 13.05.2015.
 */
public class Main {
    public static void main(String[] args) {

    }

    public double[][] matrixMultiplacation (double[][] X, double[][] Y) {
        if (X[0].length != Y.length) {
            throw new IllegalArgumentException("inner dimensions must agree.");
        }
        int xl = X.length, xc = X[0].length, yl = Y.length, yc = Y[0].length;
        double[][] Z = new double[xl][yc]; //инициализируем конечную матрицу
        double[] col = new double[xc]; //инициализируем массив для столбцов
        for (int i = 0; i < yc; i++) {
            for (int k = 0; k < xc; k++)
            {
                col[k] = Y[k][i]; // забиваем столбец из второй матрицы в массив
            }
            for (int j = 0; j < xl; j++) {
                double[] line = new double[xc]; //инициализируем массив для строк
                double s = 0;
                for (int k = 0; k < xc; k++)
                {
                    line[k]=X[j][k]; //забиваем строку из первой матрицы в массив
                    s = s+ line[k] * col[k];
                }
                Z[j][i] = s; //присваиваем значение элементу конечной матрицу
            }
        }
        return Z;
    }

}
