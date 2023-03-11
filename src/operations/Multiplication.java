package operations;

import exceptions.ImpossibleOperationException;
import object.Matrix;
import operations.interfaces.MultiMatrixComputation;

//z pierwszej wiersze z drugiej kolumny elo
public class Multiplication implements MultiMatrixComputation {
    @Override
    public Matrix compute(Matrix matrix1, Matrix matrix2) throws ImpossibleOperationException {

        if(matrix1.getColumns() != matrix2.getRows()) {
            throw new ImpossibleOperationException("Multiplication of those matrixes is impossible");
        }
        Matrix result = new Matrix(matrix1.getRows(), matrix2.getColumns());

        for (int i = 0; i < matrix1.getRows(); i++) {
            for (int j = 0; j < matrix2.getColumns(); j++) {
                for (int k = 0; k < matrix2.getRows(); k++)
                    result.getMatrix()[i][j] += matrix1.getMatrix()[i][k] * matrix2.getMatrix()[k][j];
            }
        }
        return result;
    }
}
