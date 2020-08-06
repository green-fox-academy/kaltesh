package pirates;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import pirates.exceptions.ShipIsEmptyException;

public class Ship {
  // region name lists
  private static final List<String> captainNames = Arrays.asList(
      "Hawkins 'Shady' Eldon",
      "Stepney 'Insanity' Balo",
      "Holbrook 'Three-Teeth' Garrick",
      "Rutherford 'Evil Grin' Stevenson",
      "Wesley 'Twitching' Godwin",
      "Whitfield 'Boatswain' Ward",
      "Wadsworth 'Devil's Charm' Draegan",
      "Johnson 'The Brave' Nibley",
      "Dale 'Weasel' Richmond",
      "Oxford 'Merciless' Brandon",
      "Sammie 'Temptation' Stevens",
      "Darlene 'Salty' Satan",
      "Linnie 'Foul' Law",
      "Harriet 'Cunning' Gartside",
      "Clovis 'Splinter' Blade",
      "Bailey 'Medusa' Shelby",
      "Pearl 'Foul' Hallewell",
      "Arie 'Fierce' Nottley",
      "India 'Shark Bait' Atterton",
      "Delia 'Swashbuckler' Marlowe"
  );
  private static final List<String> shipNames = Arrays.asList(
      "Mangy Dragon",
      "Pillaging Swashbucklers",
      "Bloody Swashbucklers",
      "Greed of the Lightning",
      "Deceit of Grail",
      "Hell-born Terror",
      "Golden Seven Seas",
      "Greed of the Saber",
      "White Sea Rovers",
      "Pillaging Tortuga"
  );
  // endregion
  private static int idCounter = 0;

  private final int id;
  private final String name;
  private Pirate captain;
  private List<Pirate> crew;
  private int originalCrew;

  public Ship() {
    this.id = idCounter++;
    this.name = shipNames.get(new Random().nextInt(shipNames.size())) + " (id:" + this.id + ")";
  }

  public void fillShip() {
    this.captain = new Pirate(captainNames.get(new Random().nextInt(captainNames.size())));
    this.crew = new ArrayList<>();
    for (int i = 0; i < new Random().nextInt(5) + 5; i++) {
      this.crew.add(new Pirate());
    }
    this.originalCrew = countAllPirates();
  }

  public boolean battle(Ship otherShip) {
    System.out.println("[START BATTLE]\nBattle between: \n\t" + this.name + "\n\t" + otherShip.name);
    if (this.calculateBattleScore() > otherShip.calculateBattleScore()) {
      this.throwParty();
      otherShip.loseCrew();
      System.out.println("Winner of the battle:\n\t" + this.name + "\n[END BATTLE]");
      return true;
    } else {
      otherShip.throwParty();
      this.loseCrew();
      System.out.println("Winner of the battle: " + otherShip.name + "\n[END BATTLE]");
      return false;
    }
  }

  private void loseCrew() {
    int numberOfLosses = new Random().nextInt(this.countPiratesAlive()) + 1;
    System.out.println(this.name + ": losing " + numberOfLosses + " crew members...");
    boolean[] lossIndexes = getLossIndexes(numberOfLosses);
    this.loseCrewMembers(lossIndexes);
  }

  private boolean[] getLossIndexes(int numberOfLosses) {
    boolean[] lossIndexes = new boolean[this.countAllPirates()];

    for (int i = 0; i < numberOfLosses; i++) {
      boolean removed = false;
      while (!removed) {
        int removeIndex = new Random().nextInt(countAllPirates());
        if (removeIndex == this.crew.size() && !lossIndexes[removeIndex]) {
          lossIndexes[removeIndex] = true;
          removed = true;
        } else if (!lossIndexes[removeIndex] && this.crew.get(removeIndex).isAlive()) {
          lossIndexes[removeIndex] = true;
          removed = true;
        }
      }
    }

    return lossIndexes;
  }

  private void loseCrewMembers(boolean[] indexes) {
    for (int i = 0; i < indexes.length; i++) {
      if (indexes[i]) {
        if (i < indexes.length - 1) {
          this.crew.get(i).die();
        } else {
          this.captain.die();
        }
      }
    }
  }

  private void throwParty() {
    int rumCount = new Random().nextInt(this.countPiratesAlive() * 5);
    System.out.println(this.name + ": throwing a party with " + rumCount + " bottles of rum...");
    while (rumCount > 0) {
      int index = getRandomIndexFromAllPirates();
      if (index == countAllPirates() - 1) {
        if (this.captain.isAlive()) {
          this.captain.drinkSomeRum();
          rumCount--;
        }
      } else if (this.crew.get(index).isAlive() && this.crew.get(index).isAwake()) {
        this.crew.get(index).drinkSomeRum();
        rumCount--;
      }
    }
  }

  private int getRandomIndexFromAllPirates() {
    return new Random().nextInt(countAllPirates());
  }

  private int calculateBattleScore() {
    return this.countPiratesAlive() - this.captain.getRumConsumed();
  }

  private int countPiratesAlive() {
    checkForEmptyShip();
    int count = 0;
    count += this.captain.isAlive() ? 1 : 0;
    for (Pirate p : this.crew) {
      count += p.isAlive() ? 1 : 0;
    }
    return count;
  }

  private int countAllPirates() {
    checkForEmptyShip();
    return this.crew.size() + 1;
  }

  private void checkForEmptyShip() {
    if (this.name == null || this.captain == null || this.crew == null) {
      throw new ShipIsEmptyException();
    }
  }

  @Override
  public String toString() throws ShipIsEmptyException {
    checkForEmptyShip();
    String delimiter = "\n~~~~~~~~~~~~~~~~~~~~~~~~~\n";
    return delimiter + this.name + "\nCaptain:\n" + this.captain +
        "Crew:\n\tNumber of living pirates: " + countPiratesAlive() + " (" + this.originalCrew +
        ")" + delimiter;

  }
}