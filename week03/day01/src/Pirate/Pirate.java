package Pirate;


public class Pirate {
  private boolean intoxicated;
  private boolean isPassedOut;
  private boolean isAlive;
  private boolean hasAParrot;
  private int intoxicationLevel;


  public boolean isIntoxicated() {
    return intoxicated;
  }

  public boolean isPassedOut() {
    return isPassedOut;
  }

  public boolean isAlive() {
    return isAlive;
  }

  public int getIntoxicationLevel() {
    return intoxicationLevel;
  }

  public Pirate() {
    this.intoxicated = false;
    this.isPassedOut = false;
    this.isAlive = true;
    this.hasAParrot = false;
    this.intoxicationLevel = 0;

  }

  public void drinkSomeRum() {
    this.intoxicationLevel++;
    this.intoxicated = true;

  }

  public void howsItGoingMate() {
    String pirateStatus = "";
    if (this.intoxicationLevel < 4) {
      pirateStatus = "PourMeAnudda";
    } else if (isAlive = true) {
      pirateStatus = "Agggrh how you think its goin";
      this.isPassedOut = true;
    } else if (isAlive = false) {
      pirateStatus = "hes dead";
    }
  }

  public void die() {
    this.isAlive = false;
  }


  public String brawl(Pirate theOtherBrawler) {
    String pirateStatus = "";
    if (theOtherBrawler.isAlive && this.isAlive) {
      if (brawlChance() == 1) {
        this.die();
        pirateStatus = "First pirate is dead";
      } else if (brawlChance() == 2) {
        theOtherBrawler.die();
        pirateStatus = "Second pirate is dead";
      } else {
        this.isPassedOut = true;
        theOtherBrawler.isPassedOut = true;
        pirateStatus = "They both passed out.";
      }
    } else {
      pirateStatus = "One of them are dead";
    }
    return pirateStatus;
  }


  private int brawlChance() {
    return (int) (Math.random() * 4) + 1;

  }

}
