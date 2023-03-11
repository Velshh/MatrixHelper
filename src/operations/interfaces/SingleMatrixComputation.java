package operations.interfaces;

import exceptions.ImpossibleOperationException;
import object.Matrix;

public interface SingleMatrixComputation {
    Matrix compute (Matrix mat1) throws ImpossibleOperationException;
}
