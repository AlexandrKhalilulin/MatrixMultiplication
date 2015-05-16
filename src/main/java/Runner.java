/**
 * Created by Александр on 13.05.2015.
 */
public class Runner {
    public static void main(String[] args) {
        int n = 4, m = 9, l =5;
        Matrix matrixA = MatrixFactory.createRandomized(n,m);
        Matrix matrixB = MatrixFactory.createRandomized(m,l);
        System.out.println("Matrix A is " + matrixA);
        System.out.println("Matrix B is " + matrixB);

        try {
            Matrix result = Multiplicator.multiply(matrixA, matrixB);
            System.out.println("Matrix result is " + result);
        } catch (Multiplicator.MultipleException e) {
            System.err.println("Matrices could not be multiplied");
        }

    }









}
