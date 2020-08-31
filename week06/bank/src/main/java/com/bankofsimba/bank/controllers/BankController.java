package com.bankofsimba.bank.controllers;

import com.bankofsimba.bank.models.BankAccount;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BankController {
  private List<BankAccount> bankAccounts;

  public BankController() {
    bankAccounts = new ArrayList<>();
    bankAccounts.add(new BankAccount("Simba", 2000, "lion"));

    @GetMapping("/")


  }
}
