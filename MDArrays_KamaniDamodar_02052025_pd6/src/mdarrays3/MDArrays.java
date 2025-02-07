package MDArrays_KamaniDamodar_02052025_pd6.src.mdarrays3;

public class MDArrays {
    
    public static int sumMainDiagonal(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
        }
        return sum;
    }
    
    public static int sumMinorDiagonal(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][arr.length - 1 - i];
        }
        return sum;
    }
    
    public static int[][] sumDiagonal(int[][] arr) {
        int[][] result = new int[arr.length][arr.length];
        
        for (int col = 0; col < arr.length; col++) {
            int sum = 0;
            for (int row = 0; row <= col; row++) {
                sum += arr[row][col];
            }
            result[col][col] = sum;
        }
        
        return result;
    }
} 