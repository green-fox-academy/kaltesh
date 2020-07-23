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


public class StarryNight {


  public static void mainDraw(Graphics graphics) {
//    Scanner scanner = new Scanner(System.in);
//    System.out.println("How many number you wanna see");
//    int drawTimes = scanner.nextInt();
    int drawTimes = 500;
    for (int i = 0; i < drawTimes; i++) {
//      Random randomPos1 = new Random();
//      randomPos1.nextInt(320);
//      Random randomSize1 = new Random();
//      randomSize1.nextInt(320);
      int randomWidth = getRandomPos();
      int randomHeight = getRandomPos();
      int randomSize = getRandomSize();
//      int halfWidth = WIDTH / 2;
//      int halfHeight = HEIGHT / 2;
      int halfSize = randomSize / 2;
      int[] xCoordinates =
          {randomWidth - halfSize, randomWidth + halfSize, randomWidth + halfSize,
              randomWidth - halfSize};
      int[] yCoordinates =
          {randomHeight - halfSize, randomHeight - halfSize, randomHeight + halfSize,
              randomHeight + halfSize};
      int grey = getRandomGrey();
      graphics.setColor(new Color(grey, grey, grey));
      graphics.fillPolygon(xCoordinates, yCoordinates, xCoordinates.length);
    }
  }

//  public  void paintComponent(Graphics g) {
//  }

  public static int getRandomGrey() {
    Random random = new Random();
    int randomGrey = random.nextInt(256);
    return randomGrey;
  }

  public static int getRandomPos() {
    Random random = new Random();
    int randomPos = random.nextInt(WIDTH);
    return randomPos;
  }

  public static int getRandomSize() {
    Random random = new Random();
    int randomSize = random.nextInt(20);
    return randomSize;
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