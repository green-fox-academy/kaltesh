package practice_1;

import java.awt.Color;

public class PostIt {

  private Color backgroundColor;
  private String theString;
  private Color textColor;

  public PostIt(Color backgroundColor, String theString, Color textColor) {
    this.backgroundColor = backgroundColor;
    this.theString = theString;
    this.textColor = textColor;

  }

  public Color getBackgroundColor() {
    return backgroundColor;
  }

  public String getTheString() {
    return theString;
  }

  public Color getTextColor() {
    return textColor;
  }

}


//  public PostIt(Color backgroundColor, String leString, Color textColor) {
//    this(backgroundColor, leString, textColor);
//  }
//  Create a PostIt class that has
//      a backgroundColor
//      a text on it
//      a textColor
//      Create a few example post-it objects:
//  an orange with blue text: "Idea 1"
//  a pink with black text: "Awesome"
//  a yellow with green text: "Superb!"



