package iamgroot.grrotiam.controllers;

import iamgroot.grrotiam.models.Arrow;
import iamgroot.grrotiam.models.ErrorMessage;
import iamgroot.grrotiam.models.TheMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {

  @RequestMapping(value = "/groot", method = RequestMethod.GET)
  public ResponseEntity getGuardiansMessage(@RequestParam(required = false) String message) {
    if (message == null) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ErrorMessage("I am Groot!"));
    }
    return ResponseEntity.ok(new TheMessage(message));
  }

  @RequestMapping(value = "/yondu", method = RequestMethod.GET)
  public ResponseEntity yondu(@RequestParam(required = false) Double distance, @RequestParam(required = false) Double time) {
    if ((distance == null) || (time == null)) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ErrorMessage("Forgot something?"));
    }
    return ResponseEntity.ok(new Arrow(distance, time));
  }

}
