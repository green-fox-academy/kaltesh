package com.dependencies.deppy;

import com.dependencies.deppy.helloDI.Printer;
import com.dependencies.deppy.coloring.MyColor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DeppyApplication implements CommandLineRunner {

  public static void main(String[] args) {
    SpringApplication.run(DeppyApplication.class, args);
  }

  MyColor color;
  //  private Printer printer;

  @Autowired
  public DeppyApplication(MyColor color) {
    this.color = color;
  }

//  public void run(String... args) throws Exception {
//    printer.log("hello");
//  }

  @Override
  public void run(String... args) throws Exception {
    color.printColor();
  }


  //  @Autowired
//  DeppyApplication(Printer printer) {
//    this.printer = printer;
}


