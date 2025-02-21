package MDArrays_KamaniDamodar_02052025_pd6.src.image;
import java.awt.image.BufferedImage;

public class ImageCVHS {
    private int[][] imageBits;
    
    public ImageCVHS(BufferedImage img) {
        int wid = img.getWidth();
        int hgt = img.getHeight();
        imageBits = new int[wid][hgt];
        
        for (int row = 0; row < wid; row++) {
            for (int col = 0; col < hgt; col++) {
                imageBits[row][col] = img.getRGB(row, col);
            }
        }
    }

    public int[][] horizontalFlip() {
        int wid = imageBits.length;
        int hgt = imageBits[0].length;
        int[][] out = new int[wid][hgt];
        
        for (int row = 0; row < wid; row++) {
            for (int col = 0; col < hgt; col++) {
                out[row][col] = imageBits[row][hgt - 1 - col];
            }
        }
        return out;
    }
    
    public int[][] verticalFlip() {
        int wid = imageBits.length;
        int hgt = imageBits[0].length;
        int[][] out = new int[wid][hgt];
        
        for (int row = 0; row < wid; row++) {
            for (int col = 0; col < hgt; col++) {
                out[row][col] = imageBits[wid - 1 - row][col];
            }
        }
        return out;
    }
    
    public int[][] transpose() {
        int wid = imageBits.length;
        int hgt = imageBits[0].length;
        int[][] out = new int[hgt][wid];
        
        for (int row = 0; row < wid; row++) {
            for (int col = 0; col < hgt; col++) {
                out[col][row] = imageBits[row][col];
            }
        }
        return out;
    }

    public BufferedImage arrayToBufferedImage(int[][] arr) {
        int wid = arr.length;
        int hgt = arr[0].length;
        BufferedImage img = new BufferedImage(wid, hgt, BufferedImage.TYPE_INT_ARGB);

        for (int row = 0; row < wid; row++) {
            for (int col = 0; col < hgt; col++) {
                img.setRGB(row, col, arr[row][col]);
            }
        }
        return img;
    }

    public int[][] setBrightness(BufferedImage img, int lvl) {
        int wid = img.getWidth();
        int hgt = img.getHeight();
        int[][] out = new int[wid][hgt];
        
        for (int row = 0; row < wid; row++) {
            for (int col = 0; col < hgt; col++) {
                int rgb = img.getRGB(row, col);
                
                int red = (rgb >> 16) & 0xFF;
                int grn = (rgb >> 8) & 0xFF;
                int blu = rgb & 0xFF;
                
                red = Math.min(255, Math.max(0, red + lvl));
                grn = Math.min(255, Math.max(0, grn + lvl));
                blu = Math.min(255, Math.max(0, blu + lvl));
                
                out[row][col] = (rgb & 0xFF000000) | (red << 16) | (grn << 8) | blu;
            }
        }
        return out;
    }

    public int[][] setBrightness(int lvl) {
        int wid = imageBits.length;
        int hgt = imageBits[0].length;
        int[][] out = new int[wid][hgt];
        
        for (int row = 0; row < wid; row++) {
            for (int col = 0; col < hgt; col++) {
                int rgb = imageBits[row][col];
                
                int red = (rgb >> 16) & 0xFF;
                int grn = (rgb >> 8) & 0xFF;
                int blu = rgb & 0xFF;
                
                red = Math.min(255, Math.max(0, red + lvl));
                grn = Math.min(255, Math.max(0, grn + lvl));
                blu = Math.min(255, Math.max(0, blu + lvl));
                
                out[row][col] = (rgb & 0xFF000000) | (red << 16) | (grn << 8) | blu;
            }
        }
        return out;
    }
} 