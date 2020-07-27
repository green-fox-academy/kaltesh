package practice_1;

import java.awt.Color;

public class Main {
  public static void main(String[] args) {

    PostIt newPost = new PostIt(Color.ORANGE, "Idea01", Color.BLUE);
    PostIt newpost2 = new PostIt(Color.PINK, "Awesome", Color.BLACK);
    PostIt newpost3 = new PostIt(Color.YELLOW, "Superb", Color.GREEN);

    System.out.println(newpost3.getBackgroundColor());
    System.out.println(newpost3.getTheString());
    System.out.println(newpost3.getTextColor());


  }
}

//  Create a PostIt class that has
//      a backgroundColor
//      a text on it
//      a textColor
//      Create a few example post-it objects:
//  an orange with blue text: "Idea 1"
//  a pink with black text: "Awesome"
//  a yellow with green text: "Superb!"



