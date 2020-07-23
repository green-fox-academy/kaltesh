import javax.swing.*;

import java.awt.*;


import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps {
  public static void mainDraw(Graphics graphics) {
    // Reproduce this:
    // [https://github.com/green-fox-academy/teaching-materials/blob/master/workshop/drawing/assets/r4.png]
//    for (int i = 1; i < WIDTH / 2; i *= 2) {
//      int[] coordinatesX = {i, i, 2 * i, 2 * i};
//      int[] coordinatesY = {i, 2 * i, 2 * i, i};
//      graphics.setColor( new Color(128,0,128));
//      graphics.fillPolygon(coordinatesX, coordinatesY, coordinatesX.length);
//      System.out.println(i);



        for (int i = 1; i < WIDTH; i += 20) {
      int[] coordinatesX = {i, i, 20 + i, 20 + i};
      int[] coordinatesY = {i, 20 + i, 20 + i, i};
      graphics.setColor( new Color(128,0,128));
      graphics.fillPolygon(coordinatesX, coordinatesY, coordinatesX.length);
      System.out.println(i);
    }

  }

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