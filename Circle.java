import java.awt.Graphics;
import java.awt.Color;
public class Circle{

    int x;
    int y;
    int radius = 100;

    public Circle(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void moveCircle(int deltaX, int deltaY){
        x += deltaX;
        y += deltaY;
    }

    public void paint(Graphics g){
        g.setColor(Color.BLACK);
        g.fillOval(x,y, radius, radius);
    }

    public String getCenter(){
        return x + "," +y;
    }
}