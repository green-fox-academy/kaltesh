import javax.swing.*;

import java.awt.*;


import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CheckerBoard {
  public static void mainDraw(Graphics graphics) {

    for (int j = 0; j < WIDTH; j += WIDTH / 4) {
      for (int i = 1; i < WIDTH; i += WIDTH / 4) {
        int widthCheck = WIDTH / 8;
        int[] coordinatesX = {i, i, widthCheck + i, widthCheck + i};
        int[] coordinatesY = {j, widthCheck + j, widthCheck + j, j};
        int[] coordinatesX2 =
            {widthCheck + i, widthCheck + i, 2 * widthCheck + i, 2 * widthCheck + i};
        int[] coordinatesY2 =
            {widthCheck + j, 2 * widthCheck + j, 2 * widthCheck + j, widthCheck + j};
        graphics.setColor(new Color(128, 0, 128));
        graphics.fillPolygon(coordinatesX, coordinatesY, coordinatesX.length);
        graphics.fillPolygon(coordinatesX2, coordinatesY2, coordinatesX.length);
        System.out.println(i);
      }
    }
  }

  // Don't touch the code below
  static int WIDTH = 640;
  static int HEIGHT = 640;

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

