package Dominoes;

import java.util.ArrayList;
import java.util.List;

public class Dominoes {
  public static void main(String[] args) {
    List<Domino> dominoes = initializeDominoes();
    for (int i = 0; i < dominoes.size(); i++) {
      for (int j = 0; j < dominoes.size(); j++) {
        if ((dominoes.get(i).getRightSide() == dominoes.get(j).getLeftSide())
            && (dominoes.get(i)).getSwapper()
            && dominoes.get(j).getSwapper()) {
          dominoes.get(i).setSwapper();
          dominoes.get(j).setSwapper();
          System.out.println(dominoes.get(i));
          System.out.println(dominoes.get(j));
        }
      }
    }
  }
  // You have the list of Dominoes
  // Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
  // eg: [2, 4], [4, 3], [3, 5] ...


  static List<Domino> initializeDominoes() {


    List<Domino> dominoes = new ArrayList<>();
    dominoes.add(new Domino(5, 2));
    dominoes.add(new Domino(4, 6));
    dominoes.add(new Domino(1, 5));
    dominoes.add(new Domino(6, 7));
    dominoes.add(new Domino(2, 4));
    dominoes.add(new Domino(7, 1));
    return dominoes;
  }
}
