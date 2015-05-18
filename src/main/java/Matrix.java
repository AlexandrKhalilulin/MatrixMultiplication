/**
 * Created by Александр on 16.05.2015.
 */
public class Matrix {
    private int[][] a;
    public Matrix(int n, int m) {
        a = new int[n][m];
    }
    public int getRowsSize() {
        return a.length;
    }
    public int getColumnSize() {
        return a[0].length;
    }
    public int getValue(int i, int j) {
        return a[i][j];
    }
    public void setValue(int i, int j, int value) {
        a[i][j] = value;
    }
    public String toString() {
        String s = "\nMatrix : " + a.length + "x" + a[0].length + "\n";
        for (int[] vector : a) {
            for (int value : vector)
                s += value + " ";
        s += "\n";
        }
    return s;
    }
}
