import javax.swing.JPanel;
import javax.swing.JWindow;
import java.util.Scanner;
import java.awt.Canvas;
import java.awt.Color;

import javax.swing.JFrame;
import java.awt.Graphics;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Circle c = new Circle(200,200);
        JFrame jf = new JFrame();
        JPanel jp = new JPanel();
        
        jf.setSize(500,500);
        jf.setVisible(true);
        jp.setVisible(true);
        jf.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        System.out.println(c.getCenter());
        Graphics g = jf.getGraphics();
        g.setColor(Color.BLACK);
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            //TODO: handle exception
        }
        c.paint(g);
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            //TODO: handle exception
        }
        c.moveCircle(200,100);
        g.setColor(Color.WHITE);
        g.fillRect(0,0,jf.getWidth(),jf.getHeight());
        c.paint(g);
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            //TODO: handle exception
        }
        /*Scanner sc = new Scanner(System.in);
        String s = sc.next();

        c.moveCircle(50,80);
        System.out.println(c.getCenter());
        c.paint(jp.getGraphics());*/
    }
}