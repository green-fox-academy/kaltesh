import java.util.ArrayList;
import javax.swing.*;

import java.awt.*;


import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {
  public static void mainDraw(Graphics graphics) {
    // Create a function that draws a single line and takes 3 parameters:
    // The x and y coordinates of the line's starting point and the graphics
    // and draws a line from that point to the center of the canvas.
    // Fill the canvas with lines from the edges, every 20 px, to the center.


    for (int i = 0; i < WIDTH / 20; i++) {
      int widthLines = WIDTH / 20;
      int heightLines = HEIGHT / 20;
      int widthMid = WIDTH / 2;
      int heihtMid = HEIGHT / 2;
      graphics.drawLine((WIDTH - (i * 20)), 0, widthMid, heihtMid);
      graphics.drawLine(0, HEIGHT - (i * 20), WIDTH / 2, HEIGHT / 2);
      graphics.drawLine(WIDTH , HEIGHT - (i * 20), WIDTH / 2, HEIGHT / 2);
      graphics.drawLine((WIDTH - (i * 20)), HEIGHT, WIDTH / 2, HEIGHT / 2);
    }
  }
  // Don't touch the code below
  static int WIDTH = 800;
  static int HEIGHT = 800;

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