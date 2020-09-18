package com.bankofsimba.bank.controllers;

import com.bankofsimba.bank.models.BankAccount;
import com.sun.org.apache.xpath.internal.operations.Mod;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BankController {
  private List<BankAccount> bankAccounts;

  public BankController() {
    bankAccounts = new ArrayList<>();
    fillTheBankWithAnimals();
  }

  private void fillTheBankWithAnimals() {
    bankAccounts.addAll(Arrays.asList(
        new BankAccount("Simba", 2000, "lion", true, true),
        new BankAccount("Timon", 2, "meerkat", false, true),
        new BankAccount("Pumbaa", 65, "warthog", false, true),
        new BankAccount("Ed", 200, "hyena", false, false),
        new BankAccount("Rafiki", 355, "mandrill", false, false)));
  }

  private void raiseBalance(String name) {
    bankAccounts.stream()
        .filter(account -> account.getName().equalsIgnoreCase(name))
        .findFirst()
        .ifPresent(BankAccount::raiseBalance);
  }

  @RequestMapping(value = "/simba", method = RequestMethod.GET)
  public String getItems(Model model) {
    model.addAttribute("bankAccounts", new BankAccount("Simba", 2000, "lion", true, true));
    return "index";
  }

  @RequestMapping(value = "/main", method = RequestMethod.GET)
  public String HTMLception(Model model) {
    String stringToDisplay = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
    model.addAttribute("sentence", stringToDisplay);
    model.addAttribute("bankAccounts", bankAccounts);
    return "index";
  }

  @RequestMapping(value = "/list", method = RequestMethod.GET)
  public String animalKingdom(Model model) {
    model.addAttribute("bankAccounts", bankAccounts);
    String color = "color:gold";
    return "index";
  }

  @RequestMapping(value = "/raisebalance", method = RequestMethod.GET)
  public String getRaiseBalance(Model model) {
    model.addAttribute("bankAccounts", bankAccounts);
    return "raisebalance";
  }

  @RequestMapping(value = "/raisebalance", method = RequestMethod.POST)
    public String postRaiseBalance(@RequestParam String name) {
    raiseBalance(name);
    return "redirect:/list";
  }


  @RequestMapping(value = "/newaccount", method = RequestMethod.GET)
  public String getNewAccount() {
    return "newaccount";
  }

  @RequestMapping(value = "/newaccount", method = RequestMethod.POST)
  public String postNewAccount(@ModelAttribute BankAccount bankAccount) {
    bankAccounts.add(bankAccount);
    return "redirect:/list";
  }






}

//  Add a new column to your template where you show us #
//  with the help of switch conditions that the owner of the
//  BankAccount is a Bad Guy, or a Good One
//  Add a new column to your template
//  where you show us that the owner of the BankAccount is a King
//  If he is a King, make the text look shiny:
//  add some design according to your taste :)



