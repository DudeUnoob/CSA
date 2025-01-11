package KamaniDamodar_Drawings_120424_pd6.src.polygon;
import java.awt.Color;
import java.awt.Graphics;
import KamaniDamodar_Drawings_120424_pd6.src.polygon.DrawingPanel;

public class RegularPolygon {
    

    public static void regularPolygon(Graphics g, int x, int y, int radius, int sides) {
        int[] xPoints = new int[sides];
        int[] yPoints = new int[sides];
        
        for (int i = 0; i < sides; i++) {
            double angle = 2 * Math.PI * i / sides - Math.PI / 2; 
            xPoints[i] = (int) (x + radius * Math.cos(angle));
            yPoints[i] = (int) (y + radius * Math.sin(angle));
        }
        
        g.drawPolygon(xPoints, yPoints, sides);
    }

    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(800, 500);
        Graphics g = panel.getGraphics();
        
        panel.setBackground(Color.WHITE);
        
        g.setColor(Color.RED);
        regularPolygon(g, 200, 150, 80, 5);  
        
        g.setColor(Color.BLUE);
        regularPolygon(g, 400, 150, 80, 6);  
        
        g.setColor(Color.GREEN);
        regularPolygon(g, 200, 350, 80, 7);  
        
        g.setColor(Color.ORANGE);
        regularPolygon(g, 400, 350, 80, 10); 
    }
}

