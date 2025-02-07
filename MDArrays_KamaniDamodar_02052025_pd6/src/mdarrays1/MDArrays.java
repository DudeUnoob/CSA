package MDArrays_KamaniDamodar_02052025_pd6.src.mdarrays1;

public class MDArrays {
    public static void main(String[] args) {
      
        int[][] sevens = new int[72][7];
        
        int val = 10;
        for (int row = 0; row < sevens.length; row++) {
            for (int col = 0; col < sevens[0].length; col++) {
                if (val <= 2500) {
                    sevens[row][col] = val;
                    val += 5;
                }
            }
        }
        
        
        int[][][] fours = new int[4][4][4];
        
        int num = 15;
        for (int i = 0; i < fours.length; i++) {
            for (int j = 0; j < fours[0].length; j++) {
                for (int k = 0; k < fours[0][0].length; k++) {
                    if (num <= 1536) {
                        fours[i][j][k] = num;
                        num += 3;
                    }
                }
            }
        }
    
        System.out.println("Sevens array:");
        for (int row = 0; row < sevens.length; row++) {
            for (int col = 0; col < sevens[0].length; col++) {
                if (sevens[row][col] <= 2500) {
                    System.out.print(sevens[row][col] + "   ");
                }
            }
            System.out.println();
        }
        
       
        System.out.println("\nFours array:");
        for (int i = 0; i < fours.length; i++) {
            System.out.println("Layer " + i + ":");
            for (int j = 0; j < fours[0].length; j++) {
                for (int k = 0; k < fours[0][0].length; k++) {
                    if (fours[i][j][k] <= 1536) {
                        System.out.print(fours[i][j][k] + "   ");
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
    }
} 