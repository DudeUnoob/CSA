package MDArrays_LastFirst_02052025_pd6.src.image;
//import as class needed

public class ImageCVHS {
     private int[][] imageBits;
    
     public ImageCVHS(BufferedImage bufImage){
        //get buffered image width and height to intialize attribute

        //Using loop, fill in attribute with bits from buffered image using getRGB(r,c)

     }

     //Each method returns an array; however, the attribute must NOT be changed!
     //method 1: horizontal flip
     
     //method 2: vertical flip

     //method 3: transpose
     

    public BufferedImage arrayToBufferedImage(int[][] abc) {
        int width = abc.length;
        int height = abc[0].length;
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);

        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                image.setRGB(x, y, abc[x][y]);
            }
        }

        return image;
    }

}