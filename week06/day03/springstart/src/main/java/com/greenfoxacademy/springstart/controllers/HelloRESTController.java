package com.greenfoxacademy.springstart.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController

public class HelloRESTController {
  @RequestMapping(value = "/greeting")

  public Greeting greeting() {
//    Greeting greeting = new Greeting(1, "happy");
    return new Greeting(1, "happy");
  }
}


