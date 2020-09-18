package com.postman.postman.controllers;

import com.postman.postman.models.ArrayInput;
import com.postman.postman.models.ErrorMessage;
import com.postman.postman.services.PostmanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArrayController {
  private PostmanService postmanService;

  @Autowired
  public ArrayController(PostmanService postmanService) {
    this.postmanService = postmanService;
  }

  @RequestMapping(value = "/arrays", method = RequestMethod.POST)
  public ResponseEntity<Object> getArrayResults(@RequestBody ArrayInput input) {
    if (input.getWhat().equals("sum")) {
      return ResponseEntity.status(HttpStatus.OK).body(postmanService.sumArray(input.getNumbers()));
    } else if (input.getWhat().equals("multiply")) {
      return ResponseEntity.status(HttpStatus.OK)
          .body(postmanService.multiplyArray(input.getNumbers()));
    } else if (input.getWhat().equals("double")) {
      return ResponseEntity.status(HttpStatus.OK)
          .body(postmanService.doubleArray(input.getNumbers()));
    } else {
      return ResponseEntity.status(HttpStatus.OK)
          .body(new ErrorMessage("Provide a number, or an action I don't care"));
    }
  }

//
//  @RequestMapping(value = "/log", method = RequestMethod.GET)
//  public LogData getLogs() {
//    return logService.fillLogEntries(new LogData());


}