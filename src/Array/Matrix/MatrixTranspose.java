package Array.Matrix;

public class MatrixTranspose {
    public static void main(String[] args) {
        int[][] matrix =  new int[][] {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println("Actual matrix: ");
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        for(int i=0; i<matrix.length; i++){
            for (int j = i + 1; j < matrix[i].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        System.out.println("Transpose of matrix: ");
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
