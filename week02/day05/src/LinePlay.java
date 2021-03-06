import java.util.Random;
import java.util.Scanner;
import javax.swing.*;

import java.awt.*;


import static javax.swing.JFrame.EXIT_ON_CLOSE;
// Draw the night sky:
//  - The background should be black
//  - The stars can be small squares
//  - The stars should have random positions on the canvas
//  - The stars should have random color (some shade of grey)


public class LinePlay {


  public static void mainDraw(Graphics graphics) {
    int segment = WIDTH / 15;
    for (int i = 0; i < 15; i++) {
      drawPrettyLines(graphics, segment, i);
    }
  }

  private static void drawPrettyLines(Graphics graphics, int segment, int i) {
    int[] xCoordinates1 = new int[segment];
    int[] yCoordinates1 = new int[segment];
    int[] xCoordinates2 = new int[segment];
    int[] yCoordinates2 = new int[segment];
    xCoordinates1[i] = 0;
    yCoordinates1[i] = i * segment;
    xCoordinates2[i] = i * segment;
    yCoordinates2[i] = HEIGHT;
    System.out.println(i);
    graphics.setColor(Color.GREEN);
    graphics.drawLine(xCoordinates1[i], yCoordinates1[i], xCoordinates2[i], yCoordinates2[i]);
    int[] xCoordinates3 = new int[segment];
    int[] yCoordinates3 = new int[segment];
    int[] xCoordinates4 = new int[segment];
    int[] yCoordinates4 = new int[segment];
    xCoordinates3[i] = i * segment;
    yCoordinates3[i] = 0;
    xCoordinates4[i] = WIDTH;
    yCoordinates4[i] = i * segment;
    System.out.println(i);
    graphics.setColor(Color.MAGENTA);
    graphics.drawLine(xCoordinates3[i], yCoordinates3[i], xCoordinates4[i], yCoordinates4[i]);
  }




  //region usualStuff
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
      this.setBackground(Color.BLACK);

    }
  }
//  endregion
}