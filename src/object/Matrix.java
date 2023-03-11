package object;

public class Matrix {
    private final int rows;
    private final int columns;

    private final double [][] matrix;

    public Matrix(int rows, int columns, double [][] mat) {
        this.rows = rows;
        this.columns = columns;
        this.matrix = mat;
    }

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.matrix = new double[rows][columns];
    }
    public static void printMatrix(Matrix matrix) {
        for(int i = 0; i < matrix.getRows(); i++) {
            for(int j = 0; j < matrix.getColumns(); j++) {
                System.out.print(matrix.getMatrix()[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static int[] calculateResultMatrixSize(Matrix matrix1, Matrix matrix2) {
        return new int[]{matrix1.getRows(), matrix2.getColumns()};
    }
    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public double[][] getMatrix() {
        return matrix;
    }

}
