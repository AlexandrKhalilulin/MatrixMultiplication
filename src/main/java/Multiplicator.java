/**
 * Created by Александр on 16.05.2015.
 */
public class Multiplicator {
    public static Matrix multiply(Matrix matrixA, Matrix matrixB) throws MultipleException {
        int r = matrixA.getRowsSize();
        int c = matrixB.getColumnSize();
        int tmp = matrixA.getColumnSize();
        if (tmp != matrixB.getRowsSize()) throw new MultipleException();
        Matrix result = new Matrix(r, c);
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                int value = 0;
                for (int k = 0; k < tmp; k++) {
                    value += matrixA.getValue(i, k) * matrixB.getValue(k, j);
                }
            result.setValue(i, j, value);
            }

        }

            return result;
    }

    public static class MultipleException extends Exception {
    }
}
