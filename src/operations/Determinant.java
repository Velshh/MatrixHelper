package operations;

import exceptions.ImpossibleOperationException;
import object.Matrix;
import operations.interfaces.NumberComputation;

public class Determinant implements NumberComputation {
    @Override
    public double computeValue(Matrix mat1) throws ImpossibleOperationException {
        double[][] matrix = mat1.getMatrix();
        double result = 0;

        if(mat1.getRows() != mat1.getColumns()) {
            throw new ImpossibleOperationException("Determinant of provided matrix does not exist.");

        }else if(mat1.getRows() == mat1.getColumns()) {

            if(mat1.getRows() == 1 && mat1.getColumns() == 1) {
                return mat1.getMatrix()[0][0];

            }else if(mat1.getRows() == 2 && mat1.getColumns() == 2) {
                return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];

            }else if (mat1.getRows() == 3 && mat1.getColumns() == 3) {

                return matrix[0][0] * matrix[1][1] * matrix[2][2] + matrix[1][0] * matrix[2][1] * matrix[0][2]-
                        matrix[0][2] * matrix[1][1]*matrix[2][0]-matrix[2][1]*matrix[1][2]*matrix[0][0]-
                        matrix[0][1]*matrix[1][0]*matrix[2][2];

            }else {
                //TODO: matrixes bigger than 3x3
            }
        }
        return result;
    }
}
