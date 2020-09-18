package com.postman.postman.controllers;

import com.postman.postman.models.Append;
import com.postman.postman.models.ErrorMessage;
import com.postman.postman.models.Greeting;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreeterController {


  @RequestMapping(value = "/greeter", method = RequestMethod.GET)

  public ResponseEntity greet(@RequestParam(required = false) String name,
                              @RequestParam(required = false) String title) {
    if ((name == null) && (title == null)) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST)
          .body(new ErrorMessage("Please provide a name and a title!"));
    }
    if (name == null) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST)
          .body(new ErrorMessage("Please provide a name!"));
    }
    if (title == null) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST)
          .body(new ErrorMessage("Please provide a title!"));
    }
    return ResponseEntity.status(HttpStatus.OK).body(new Greeting(name, title));
  }

  @RequestMapping(value = "/appenda/{appendable}", method = RequestMethod.GET)
  public ResponseEntity getGreeting(@PathVariable String appendable) {
    return ResponseEntity.status(HttpStatus.OK).body(new Append(appendable));
  }
}
