package operations.interfaces;

import exceptions.ImpossibleOperationException;
import object.Matrix;

public interface NumberComputation {
    double computeValue (Matrix mat1) throws ImpossibleOperationException;
}
