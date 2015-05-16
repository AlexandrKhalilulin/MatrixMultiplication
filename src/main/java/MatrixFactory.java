/**
 * Created by Александр on 16.05.2015.
 */
public class MatrixFactory {
    public static Matrix createRandomized(int n, int m) {
        Matrix matrix = new Matrix(n,m);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix.setValue(i,j, (int) Math.random());
            }
        }
        return matrix;
    }
}
