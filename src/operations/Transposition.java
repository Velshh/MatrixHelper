package operations;

import object.Matrix;
import operations.interfaces.SingleMatrixComputation;

public class Transposition implements SingleMatrixComputation {
    @Override
    public Matrix compute(Matrix mat1) {
        Matrix result = new Matrix(mat1.getColumns(), mat1.getRows());

        for(int i = 0; i < mat1.getRows(); i++) {
            for(int j = 0; j < mat1.getColumns(); j++){
                result.getMatrix()[j][i] = mat1.getMatrix()[i][j];
            }
        }
        return result;
    }
}
