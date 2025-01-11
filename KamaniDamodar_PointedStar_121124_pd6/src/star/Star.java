package KamaniDamodar_PointedStar_121124_pd6.src.star;

import java.awt.*;

public class Star {
    private static DrawingPanel canvas;
    
    public static void pointedStar(int points, int radius, Point center) {
        pointedStar(points, radius, center, 0);
    }
    
    public static void pointedStar(int points, int radius, Point center, double rotation) {
        Graphics g = canvas.getGraphics();
        
        int[] xPoints = new int[points * 2];
        int[] yPoints = new int[points * 2];
        
        double angleStep = Math.PI / points;
        double angle = Math.toRadians(rotation) - Math.PI / 2;
        
        for (int i = 0; i < points * 2; i++) {
            double currentRadius = (i % 2 == 0) ? radius : radius * 0.15;
            
            xPoints[i] = (int) (center.x + currentRadius * Math.cos(angle));
            yPoints[i] = (int) (center.y + currentRadius * Math.sin(angle));
            
            angle += angleStep;
        }
        
       
        g.setColor(getStarColor(points));
        g.fillPolygon(xPoints, yPoints, points * 2);

        g.setColor(Color.BLACK);
        g.drawPolygon(xPoints, yPoints, points * 2);
    }

  
    private static Color getStarColor(int points) {
        switch (points) {
            case 3:
                return new Color(200, 200, 255);  
            case 5:
                return Color.MAGENTA;
            case 6:
                return new Color(255, 255, 200);  
            case 7:
                return new Color(180, 180, 255); 
            case 8:
                return new Color(200, 255, 200); 
            case 11:
                return Color.MAGENTA;
            default:
                return Color.WHITE;
        }
    }

    public static void main(String[] args) {
        canvas = new DrawingPanel(800, 600);
        canvas.setBackground(new Color(225, 225, 240));
        
        pointedStar(5, 100, new Point(110, 180), 20);
        pointedStar(8, 100, new Point(310, 180), 60);
        pointedStar(7, 150, new Point(570, 200), 90);
        pointedStar(11, 150, new Point(180, 440), 70);
        pointedStar(6, 75, new Point(580, 440), 10);
        pointedStar(3, 50, new Point(410, 440));
    }
}
