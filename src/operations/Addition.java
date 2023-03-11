package operations;

import object.Matrix;
import operations.interfaces.MultiMatrixComputation;

public class Addition implements MultiMatrixComputation {
    @Override
    public Matrix compute(Matrix matrix1, Matrix matrix2) {
        int resultRows = matrix1.getRows();
        int resultColumns = matrix1.getColumns();

        Matrix result = new Matrix(resultRows, resultColumns);
        for(int i = 0; i < resultRows; i++) {
            for(int j = 0; j < resultColumns; j++) {
                result.getMatrix()[i][j] = matrix1.getMatrix()[i][j] + matrix2.getMatrix()[i][j];
            }
        }
        return result;
    }
}
