package MDArrays_KamaniDamodar_02052025_pd6.src.mdarrays2;

public class MDArraysRunner {
    public static void main(String[] args) {
        int[] bcd = {4, 5, 6, 7, 8};
        int[][] abc = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {4, 5, 6, 7, 8}};
        int[][] bcd2 = {{4}, {3}};
        
        System.out.println("Testing sumElements:");
        System.out.println("Sum of bcd: " + MDArrays.sumElements(bcd));
        
        System.out.println("\nTesting rowSums:");
        int[] rowSumsAbc = MDArrays.rowSums(abc);
        System.out.print("Row sums of abc: ");
        for (int i = 0; i < rowSumsAbc.length; i++) {
            System.out.print(rowSumsAbc[i]);
            if (i < rowSumsAbc.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        
        int[] rowSumsBcd = MDArrays.rowSums(bcd2);
        System.out.print("Row sums of bcd: ");
        for (int i = 0; i < rowSumsBcd.length; i++) {
            System.out.print(rowSumsBcd[i]);
            if (i < rowSumsBcd.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        
        System.out.println("\ntranspose:");
        System.out.println("Transpose of abc:");
        int[][] transposed = MDArrays.transpose(abc);
        for (int i = 0; i < transposed.length; i++) {
            for (int j = 0; j < transposed[i].length; j++) {
                System.out.print(transposed[i][j]);
                if (j < transposed[i].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
        
        System.out.println("\nTesting colSums:");
        int[] colSumsAbc = MDArrays.colSums(abc);
        System.out.print("Column sums of abc: ");
        for (int i = 0; i < colSumsAbc.length; i++) {
            System.out.print(colSumsAbc[i]);
            if (i < colSumsAbc.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        
        int[] colSumsBcd = MDArrays.colSums(bcd2);
        System.out.print("Column sums of bcd: ");
        for (int i = 0; i < colSumsBcd.length; i++) {
            System.out.print(colSumsBcd[i]);
            if (i < colSumsBcd.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        
        int[][] xyz = new int[50][75];
        int val = 30;
        for (int i = 0; i < xyz.length; i++) {
            for (int j = 0; j < xyz[0].length; j++) {
                xyz[i][j] = val;
                val += 3;
            }
        }
        
        System.out.println("\nTesting with xyz matrix:");
        System.out.println("First row sum: " + MDArrays.sumElements(xyz[0]));
        System.out.print("First few row sums: ");
        int[] firstFewRowSums = MDArrays.rowSums(xyz);
        for (int i = 0; i < 3; i++) {
            System.out.print(firstFewRowSums[i]);
            if (i < 2) {
                System.out.print(", ");
            }
        }
        System.out.println();
        
        System.out.print("First few column sums: ");
        int[] firstFewColSums = MDArrays.colSums(xyz);
        for (int i = 0; i < 3; i++) {
            System.out.print(firstFewColSums[i]);
            if (i < 2) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
} 