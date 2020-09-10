package com.dependencies.deppy.helloDI;

import java.time.LocalDateTime;
import org.springframework.stereotype.Service;

public class hellodi {

  @Service
  public class Printer {
    public void log(String message) {
      System.out.println(LocalDateTime.now() + " MY PRINTER SAYS --- " + message);
    }
  }
}
