import java.lang.reflect.GenericArrayType;
import java.util.HashMap;
import java.util.Map;
import javax.naming.InitialContext;
import javax.swing.JApplet;

public class ShoppingList2 {
  public static void main(String[] args) {


    HashMap<String, Double> shopList = new HashMap<>();
    shopList.put("Milk", 1.07);
    shopList.put("Rice", 1.59);
    shopList.put("Eggs", 3.14);
    shopList.put("Cheese", 12.60);
    shopList.put("Chicken Breasts", 9.40);
    shopList.put("Apples", 2.31);
    shopList.put("Tomato", 2.58);
    shopList.put("Potato", 1.75);
    shopList.put("Onion", 1.10);

    HashMap<String, Double> bobsList = new HashMap<>();
    bobsList.put("Milk", 3.0);
    bobsList.put("Rice", 2.0);
    bobsList.put("Eggs", 2.0);
    bobsList.put("Cheese", 1.0);
    bobsList.put("Chicken Breasts", 4.0);
    bobsList.put("Apples", 1.0);
    bobsList.put("Tomato", 2.0);
    bobsList.put("Potato", 1.0);

    HashMap<String, Double> alicesList = new HashMap<>();
    alicesList.put("Rice", 1.0);
    alicesList.put("Eggs", 5.0);
    alicesList.put("Chicken Breasts", 2.0);
    alicesList.put("Apples", 1.0);
    alicesList.put("Tomato", 10.0);

    System.out.println("bobpays  " + (countHowMuchToPay(shopList, bobsList)));
    System.out.println("alicepays  " + countHowMuchToPay(shopList, alicesList));
    System.out.println("This much: " + countIndividualItems(alicesList, "Rice"));
    System.out
        .println(
            "the one who has more rice is: " + whoHasMoreOfAKind(bobsList, alicesList, "Rice"));
    whoHasMoreItems(bobsList, alicesList);
    countTheNumberOfItemsOnTheirList(bobsList);
  }

  public static double countHowMuchToPay(HashMap<String, Double> shopPrices,
                                         HashMap<String, Double> bobList) {
    double sum = 0;
    for (Map.Entry<String, Double> entry : bobList.entrySet()) {
      sum += (shopPrices.get(entry.getKey()) * entry.getValue());
    }
    return sum;
  }

  public static double countIndividualItems(HashMap<String, Double> shoppingList,
                                            String item) {
    return shoppingList.get(item);
  }

  public static String whoHasMoreOfAKind(HashMap<String, Double> bobList,
                                         HashMap<String, Double> aliceList, String item) {
    if ((countIndividualItems(bobList, item)) > ((countIndividualItems(aliceList, item)))) {
      return "Bob";
    } else if ((countIndividualItems(bobList, item)) < ((countIndividualItems(aliceList, item)))) {
      return "Alice";
    }
    return "none";
  }

  public static void whoHasMoreItems(HashMap<String, Double> bobList,
                                     HashMap<String, Double> aliceList) {
    if (bobList.size() > aliceList.size()) {
      System.out.println("bob has moar shit cos he has this much: " + bobList.size());
    } else {
      System.out.println("alice has moar shit cos she has this much " + aliceList.size());
    }
  }

  public static void countTheNumberOfItemsOnTheirList(HashMap<String, Double> shoppingList) {
    double amount = 0;
    for (Map.Entry<String, Double> entry : shoppingList.entrySet()) {
      amount += (shoppingList.get(entry.getKey()));
    }
    System.out.println("all the shit on the list: " + amount);
  }
}


//    How much does Bob pay?
//    How much does Alice pay?
//    Who buys more Rice?
//    Who buys more Potato?
//    Who buys more different products?
//        Who buys more products? (piece)

