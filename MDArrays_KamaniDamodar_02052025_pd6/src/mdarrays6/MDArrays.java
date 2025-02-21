package MDArrays_KamaniDamodar_02052025_pd6.src.mdarrays6;

public class MDArrays {
    
    public static double[][] upperTriangular(int[][] mat) {
        int len = mat.length;
        double[][] out = new double[len][len];
        
        for (int r = 0; r < len; r++) {
            for (int c = 0; c < len; c++) {
                out[r][c] = mat[r][c];
            }
        }
        
        for (int c = 0; c < len - 1; c++) {
            for (int r = c + 1; r < len; r++) {
                if (out[c][c] != 0) {
                    double rat = out[r][c] / out[c][c];
                    for (int k = c; k < len; k++) {
                        out[r][k] = out[r][k] - rat * out[c][k];
                    }
                }
            }
        }
        
        return out;
    }
    
    public static double determinant(int[][] mat) {
        double[][] tri = upperTriangular(mat);
        double det = 1.0;
        
        for (int i = 0; i < mat.length; i++) {
            det *= tri[i][i];
        }
        
        return det;
    }
} 