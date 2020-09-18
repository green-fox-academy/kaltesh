package com.dependencies.deppy.usefulutilities;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UsefulUtilities {
  private UtilityService utilityService;

  @Autowired
  UsefulUtilities(UtilityService utilityService) {
    this.utilityService = utilityService;
  }

  @RequestMapping(value = "/useful/colored", method = RequestMethod.GET)
  public String setBackgroundColor(Model model) {
    model.addAttribute("color", utilityService.randomColor());
    return "colored";
  }
}

// ## Colored Background
// - Have an endpoint `/useful/colored`
//     - should display an empty page with a random color background
// - Have a link at the main page to reach this endpoint
