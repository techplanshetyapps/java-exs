public class MatrixVectorCalculator {

    public static int dotProduct(int[] a, int[] b) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i] * b[i];
        }
        return sum;
    }

    
    public static int[] multiplyMatrixVector(int[][] matrix, int[] vector) {
        int[] result = new int[matrix.length];
        
    
        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j] * vector[j];
            }
            result[i] = sum;
        }
        return result;
    }
}