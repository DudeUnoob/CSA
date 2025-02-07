package MDArrays_KamaniDamodar_02052025_pd6.src.mdarrays3;

public class MDArraysRunner {
    public static void main(String[] args) {
        int[][] bcd = {
            {2, 4, 6, 8},
            {3, 5, 7, 9},
            {10, 12, 14, 16},
            {11, 13, 15, 17}
        };
        
        int[][] bcd2 = {
            {12, 14, 16, 18},
            {13, 15, 17, 19},
            {20, 22, 24, 26},
            {21, 23, 25, 27}
        };
        
        System.out.println("sumMainDiagonal:");
        System.out.println("Sum of main diagonal in bcd: " + MDArrays.sumMainDiagonal(bcd));
        
        System.out.println("\nsumMinorDiagonal:");
        System.out.println("Sum of minor diagonal in bcd2: " + MDArrays.sumMinorDiagonal(bcd2));
        
        System.out.println("\nsumDiagonal:");
        int[][] diagResult = MDArrays.sumDiagonal(bcd2);
        System.out.println("Diagonal sums of upper triangular matrix:");
        for (int i = 0; i < diagResult.length; i++) {
            for (int j = 0; j < diagResult[i].length; j++) {
                System.out.print(diagResult[i][j] + " ");
            }
            System.out.println();
        }
        
        int[][] xyz = new int[50][50];
        int val = 30;
        for (int i = 0; i < xyz.length; i++) {
            for (int j = 0; j < xyz[0].length; j++) {
                xyz[i][j] = val;
                val += 3;
            }
        }
        
        System.out.println("\nXyz matrix:");
        System.out.println("Sum of main diagonal: " + MDArrays.sumMainDiagonal(xyz));
        System.out.println("Sum of minor diagonal: " + MDArrays.sumMinorDiagonal(xyz));
    }
} 