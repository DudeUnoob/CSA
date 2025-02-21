package MDArrays_KamaniDamodar_02052025_pd6.src.mdarrays6;

public class MDArraysRunner {
    public static void main(String[] args) {
        int[][] xyz = {{3, 4, 5}, {7, 2, 1}, {1, 0, 2}};
        int[][] bcd = {{10, 13, 12, 11}, {6, 8, 7, 9}, {15, 17, 16, 14}, {5, 4, 6, 7}};
        int[][] matrix = {
            {1, 1, 3, 4, 0, 6, 2, 1, 5},
            {9, 1, 1, 6, 0, 4, 5, 2, 1},
            {5, 1, 2, 1, 0, 2, 4, 6, 1},
            {0, 2, 1, 2, 0, 8, 6, 4, 2},
            {1, 2, 1, 2, 5, 8, 1, 4, 7},
            {2, 0, 2, 1, 5, 2, 2, 0, 3},
            {4, 1, 2, 1, 0, 4, 8, 2, 3},
            {0, 3, 2, 2, 2, 6, 2, 3, 4},
            {5, 0, 5, 2, 5, 0, 3, 4, 5}
        };
        
        System.out.println("xyz matrix:");
        System.out.println("Upper triangular form:");
        printMatrix(MDArrays.upperTriangular(xyz));
        System.out.println("Determinant: " + MDArrays.determinant(xyz));
        
        System.out.println("\nbcd matrix:");
        System.out.println("Upper triangular form:");
        printMatrix(MDArrays.upperTriangular(bcd));
        System.out.println("Determinant: " + MDArrays.determinant(bcd));
        
        System.out.println("\n9x9 matrix:");
        System.out.println("Determinant: " + MDArrays.determinant(matrix));
    }
    
    private static void printMatrix(double[][] mat) {
        for (int r = 0; r < mat.length; r++) {
            for (int c = 0; c < mat[0].length; c++) {
                System.out.printf("%8.2f ", mat[r][c]);
            }
            System.out.println();
        }
    }
} 