package operations.interfaces;

import exceptions.ImpossibleOperationException;
import object.Matrix;

public interface MultiMatrixComputation {
    Matrix compute(Matrix matrix1, Matrix matrix2) throws ImpossibleOperationException;
}
