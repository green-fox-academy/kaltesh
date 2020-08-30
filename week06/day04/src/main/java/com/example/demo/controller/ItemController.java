package com.example.demo.controller;

import com.example.demo.model.Item;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ItemController {
  private List<Item> items;

  public ItemController() {
    items = new ArrayList<>();
    items.add(new Item("Running Shoes", "shoes for running", 48, 2));
    items.add(new Item("Walking Shoes", "Shoes for walking", 1213, 4));
    items.add(new Item("Sleeping Shoes", "Shoes for sleep", 45446, 0));
    items.add(new Item("Dancing Shoes", "Shoes for dancing", 321, 6));
  }

  @GetMapping("/")
  public String getItems(Model model) {
    model.addAttribute("items", items);
    return "index";
  }

  @GetMapping("/only-available")
  public String selectAvailable(Model model) {
    List<Item> availableItems = items.stream()
        .filter(item -> item.getStockLevel() > 0)
        .collect(Collectors.toList());
    model.addAttribute("items", availableItems);
    return "index";
  }

  @GetMapping("/cheapest-first")
  public String sortByPrice(Model model) {
    List<Item> sortedList = items.stream()
        .sorted(Comparator.comparingInt(Item::getPrice))
        .collect(Collectors.toList());
    model.addAttribute("items", sortedList);
    return "index";
  }

  @GetMapping("/contains-sleep")
  public String selectSleep(Model model) {
    List<Item> sleepyItems = items.stream()
        .filter(item -> item.getName().contains("Sleep"))
        .collect(Collectors.toList());
    model.addAttribute("items", sleepyItems);
    return "index";
  }

  @GetMapping("/average-stock")
  public String getAverageStock(Model model) {
    double averageStockLevel = items.stream()
        .mapToInt(Item::getStockLevel)
        .average()
        .orElse(0);
    model.addAttribute("averageStockLevel", "The Average Stock is: " + averageStockLevel);
    return "itemfilter";
  }

  @GetMapping("/most-expensive")
  public String getMostExpensive(Model model) {
    String mostExpensiveItem = items.stream()
        .filter(item -> item.getStockLevel() > 0)
        .max(Comparator.comparingInt(Item::getPrice))
//        .isPresent()
        .get()
        .getName();
    model.addAttribute("averageStockLevel", "The Most Expensive Item is: " + mostExpensiveItem);
    return "itemfilter";
  }

  @PostMapping("/search")
  public String searchItemForInput(Model model, String searchBarInput) {
    List<Item> itemsContainingInput = items.stream()
        .filter(item -> item.getName().toLowerCase().contains(searchBarInput.toLowerCase()) ||
            item.getDescription().toLowerCase().contains(searchBarInput.toLowerCase()))
        .collect(Collectors.toList());
    model.addAttribute("items", itemsContainingInput);
    return "index";
  }


//    Create the search bar in both of your templates
//    Set the method to POST and the action to /search
//    Name the input field
//    POST /search
//    Filter only those that are containing the searched k
//    eyword in the name or in the description
//    Display them in the table
}