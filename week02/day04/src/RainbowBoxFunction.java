import java.util.Random;
import javax.swing.*;

import java.awt.*;


import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
  public static void mainDraw(Graphics graphics) {
    // Create a square drawing function that takes 3 parameters:
    // The square size, the fill color, graphics
    // and draws a square of that size and color to the center of the canvas.
    // Create a loop that fills the canvas with rainbow colored squares (red, orange, yellow, green, blue, indigo, violet).
//    Color indigo = new Color(75, 0, 130);
//    Color violet = new Color(238, 130, 238);
    Color[] theColors =
        new Color[] {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, new Color(75, 0, 130),
            new Color(238, 130, 238), Color.BLUE};
    int squareSize = WIDTH;
    int drawTimes = theColors.length;
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

      graphics.setColor(theColors[i]);
      graphics.fillPolygon(xCoordinates, yCoordinates, xCoordinates.length);
    }
  }

//  (red, orange, yellow, green, blue, indigo, violet)

//  public static Color getRandomColor() {
//    Random random = new Random();
//    return new Color(random.nextInt(256), (random.nextInt(256)), (random.nextInt(256)));


  //  region
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
//endregion
}