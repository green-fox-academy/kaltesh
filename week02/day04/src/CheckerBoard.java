import java.lang.reflect.WildcardType;
import javax.swing.*;

import java.awt.*;


import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CheckerBoard {
  public static void mainDraw(Graphics graphics) {
    int checkAmount = 8;
    int widthCheck = WIDTH / checkAmount;
    for (int j = 0; j < HEIGHT; j += widthCheck * 2) {
      for (int i = 0; i < WIDTH; i += widthCheck * 2) {
        drawSquares(graphics, j, i, widthCheck);
      }
    }
  }

  private static void drawSquares(Graphics graphics, int j, int i, int widthCheck) {
//    widthCheck = WIDTH / widthCheck;
//    int twoBox = WIDTH / 4;
    int[] coordinatesX = {i, i, widthCheck + i, widthCheck + i};
    int[] coordinatesY = {j, widthCheck + j, widthCheck + j, j};
    int[] coordinatesX2 =
        {widthCheck + i, widthCheck + i, 2 * widthCheck + i, 2 * widthCheck + i};
    int[] coordinatesY2 =
        {widthCheck + j, 2 * widthCheck + j, 2 * widthCheck + j, widthCheck + j};
//    if (((j == 0) | (j % twoBox == 0)) && (i % twoBox == 0)) {
//      graphics.setColor(Color.BLACK);
//    } else if (((j == 0) | (j % twoBox == 0)) && (i % twoBox != 0)) {
//      graphics.setColor(Color.WHITE);
//    } else if ((j % twoBox != 0) && (i % twoBox != 0)) {
//      graphics.setColor(Color.BLACK);
//    } else {
//      graphics.setColor(Color.WHITE);
//    }
    graphics.setColor(Color.BLACK);
    graphics.fillPolygon(coordinatesX, coordinatesY, coordinatesX.length);
    graphics.setColor(Color.BLACK);
    graphics.fillPolygon(coordinatesX2, coordinatesY2, coordinatesX.length);
//    System.out.println(i);
  }

  //region stuff

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
  // endregion

}
