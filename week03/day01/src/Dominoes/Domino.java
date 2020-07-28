package Dominoes;

import java.util.Arrays;

public class Domino {
  private final int left;
  private final int right;
  private boolean swapper;

  public Domino(int left, int right) {
    this.left = left;
    this.right = right;
    this.swapper = true;
  }

  public int getLeftSide() {
    return left;
  }

  public int getRightSide() {
    return right;
  }

  public boolean getSwapper() {
    return swapper;
  }


  public void setSwapper() {
    swapper = false;
  }


  @Override
  public String toString() {
    return "[" + left + ", " + right + "]";

  }

}