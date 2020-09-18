package com.postman.postman.controllers;

import com.postman.postman.models.DoUntilNumber;
import com.postman.postman.models.ErrorMessage;
import com.postman.postman.services.PostmanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoUntilController {
  private PostmanService postmanService;

  @Autowired
  public DoUntilController(PostmanService postmanService) {
    this.postmanService = postmanService;
  }

  @RequestMapping(value = "/dountil/{action}", method = RequestMethod.POST)
  public ResponseEntity<Object> getResult(@PathVariable String action,
                                          @RequestBody DoUntilNumber doUntil) {
    if (doUntil == null) {
      return ResponseEntity.status(HttpStatus.OK)
          .body(new ErrorMessage("Please provide a number!"));
    } else {
      return ResponseEntity.status(HttpStatus.OK)
          .body(postmanService.calculateNumber(action, doUntil));
    }
  }
}
