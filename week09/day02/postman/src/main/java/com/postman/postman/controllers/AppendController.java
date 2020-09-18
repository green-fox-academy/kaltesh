package com.postman.postman.controllers;

import com.postman.postman.models.Append;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppendController {

//
//  @RequestMapping(value = "/appenda/{appendable}", method = RequestMethod.GET)
//  public ResponseEntity getGreeting(@PathVariable String appendable) {
//    return ResponseEntity.status(HttpStatus.OK).body(new Append(appendable));
//  }
}
