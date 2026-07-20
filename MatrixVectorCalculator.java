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

    public static void main(String[] args) {
        
        int[] a = {2, 0, 4};
        int[] b = {1, 4, 3};
        
        int dotProductResult = dotProduct(a, b);
        System.out.println("Dot Product (Vector x Vector): " + dotProductResult); 
    }
}