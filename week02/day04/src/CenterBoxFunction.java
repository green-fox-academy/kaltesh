import java.util.Random;
import javax.swing.*;

import java.awt.*;


import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CenterBoxFunction {

  public static void mainDraw(Graphics graphics) {
    // create a function that draws one square and takes 2 parameters:
    // the square size and the graphics
    // and draws a square of that size to the center of the canvas.
    // draw 3 squares with that function.
    // avoid code duplication.
    int squareSize = 300;
    int drawTimes = 50;
    for (int i = 0; i < drawTimes; i++) {
      squareSize -= (squareSize / drawTimes);
      int halfWidth = WIDTH / 2;
      int halfHeight = HEIGHT / 2;
      int halfSize = squareSize / 2;
      int[] xCoordinates =
          {halfWidth - halfSize, halfWidth + halfSize, halfWidth + halfSize, halfWidth - halfSize};
      int[] yCoordinates =
          {halfHeight - halfSize, halfHeight - halfSize, halfHeight + halfSize,
              halfHeight + halfSize};

      graphics.setColor(getRandomColor());
      graphics.fillPolygon(xCoordinates, yCoordinates, xCoordinates.length);
    }
  }

  public static Color getRandomColor() {
    Random random = new Random();
    return new Color(random.nextInt(256), (random.nextInt(256)), (random.nextInt(256)));
  }


  //region theStuffWeAlwaysNeed
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
//  endregion
}