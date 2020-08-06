import java.util.HashMap;

public class  ShoppingList2 {
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

    HashMap<String, Double> bobList = new HashMap<>();
    bobList.put("Milk", 3.0);
    bobList.put("Rice", 2.0);
    bobList.put("Eggs", 2.0);
    bobList.put("Cheese", 1.0);
    bobList.put("Chicken Breasts", 4.0);
    bobList.put("Apples", 1.0);
    bobList.put("Tomato", 2.0);
    bobList.put("Potato", 1.0);

    HashMap<String, Double> aliceList = new HashMap<>();
    aliceList.put("Rice", 1.0);
    aliceList.put("Eggs", 5.0);
    aliceList.put("Chicken Breasts", 2.0);
    aliceList.put("Apples", 1.0);
    aliceList.put("Tomato", 10.0);
  }
}
//    How much does Bob pay?
//    How much does Alice pay?
//    Who buys more Rice?
//    Who buys more Potato?
//    Who buys more different products?
//        Who buys more products? (piece)

