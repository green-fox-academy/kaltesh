package com.postman.postman.controllers;

import com.postman.postman.models.Doubling;
import com.postman.postman.models.ErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoublingController {

  @RequestMapping(value = "/doubling", method = RequestMethod.GET)
  public ResponseEntity getDoubling(@RequestParam(required = false) Integer input) {
    if (input == null) {
      return ResponseEntity.status(HttpStatus.OK).body(new ErrorMessage("Please provide an input!"));
    } else {
      return ResponseEntity.status(HttpStatus.OK).body(new Doubling(input));

    }
  }
}