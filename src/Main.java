import exceptions.ImpossibleOperationException;
import object.Matrix;
import operations.Multiplication;
import operations.Transposition;
import operations.interfaces.MultiMatrixComputation;
import operations.interfaces.SingleMatrixComputation;

public class Main {
    public static void main(String[] args) throws ImpossibleOperationException {
        //test
        MultiMatrixComputation comp = new Multiplication();
        Matrix mat1 = new Matrix(2, 3, new double[][]{{3,4,5},{6,7,8}});
        Matrix mat2 = new Matrix(3, 3, new double[][]{{1,2,3},{4,5,6},{7,8,9}});
        //end of test

        //test
        int resultRows = Matrix.calculateResultMatrixSize(mat1, mat2)[0];
        int resultColumns = Matrix.calculateResultMatrixSize(mat1, mat2)[1];

        Matrix result = new Matrix(resultRows,resultColumns, comp.compute(mat1, mat2).getMatrix());
        //end of test
        Matrix.printMatrix(result);

        System.out.println("------------");
        SingleMatrixComputation singleComputation = new Transposition();
        Matrix.printMatrix(singleComputation.compute(mat1));
    }
}