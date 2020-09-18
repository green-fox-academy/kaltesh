package com.postman.postman.controllers;

import com.postman.postman.models.Log;
import com.postman.postman.services.PostmanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {
  private PostmanService postmanService;

  @Autowired
  public LogController(PostmanService postmanService) {
    this.postmanService = postmanService;
  }


  @RequestMapping(value = "/log", method = RequestMethod.GET)
  public ResponseEntity getLogMessage() {
    return ResponseEntity.status(HttpStatus.OK).body(new Log());

  }

}
