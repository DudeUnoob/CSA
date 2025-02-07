package MDArrays_KamaniDamodar_02052025_pd6.src.mdarrays2;

public class MDArrays {
    
    public static int sumElements(int[] arr1D) {
        int sum = 0;
        for (int val : arr1D) {
            sum += val;
        }
        return sum;
    }
    
    public static int[] rowSums(int[][] arr2D) {
        int[] sums = new int[arr2D.length];
        for (int i = 0; i < arr2D.length; i++) {
            sums[i] = sumElements(arr2D[i]);
        }
        return sums;
    }
    
    public static int[][] transpose(int[][] arr2D) {
        int rows = arr2D[0].length;
        int cols = arr2D.length;
        int[][] result = new int[rows][cols];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = arr2D[j][i];
            }
        }
        return result;
    }
    
    public static int[] colSums(int[][] arr2D) {
        int[][] transposed = transpose(arr2D);
        return rowSums(transposed);
    }
} 