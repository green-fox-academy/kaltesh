import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SquareFractal {


  public static void drawTriangle(Graphics graphics){
    int x1 = 0;
    int x2 = 200;
    int y1 = 0;
    int y2 = 300;
//    int side = 100;
//
    int side = WIDTH/9;
//    graphics.drawLine(x1, y1, x2, y2);
//    graphics.drawLine(x1 + ((x2 - x1) / 2), (int) (y1 -(side * (Math.sqrt(3)/2))), x1, y1);
//    graphics.drawLine(x1 + ((x2 - x1) / 2), (int) (y1 -(side * (Math.sqrt(3)/2))), x2, y2);
  graphics.drawRect(x1, y1, side, side);



  }

//  public static void drawHexagon(Graphics graphics){
//    int x = 100;
//    int y = 150;
//    int x0 = 200;
//    int y0 = 150;
//    int side = x0 - x;
//    graphics.drawLine(x, y, x0, y0);
//
//
//    for (int i = 0, angle = 60; i < 4; i++, angle += 60) {
//
//      int x1 = (int)(x0 + ((Math.cos(Math.toRadians(angle))) * side));
//      int y1 = (int)(y0 + ((Math.sin(Math.toRadians(angle))) * side));
//      graphics.drawLine(x0, y0, x1, y1);
//
//      x0 = x1;
//      y0 = y1;
//    }
//
//    graphics.drawLine(x0, y0, x, y);
//  }

  public static void mainDraw(Graphics graphics){
    drawTriangle(graphics);
//    drawHexagon(graphics);
  }
//
  // Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 320;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    ImagePanel panel = new ImagePanel();
    panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
    jFrame.add(panel);
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
    jFrame.pack();
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
}