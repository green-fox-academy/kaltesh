package com.reddit.myreddit.controllers;

import com.reddit.myreddit.models.Red;
import com.reddit.myreddit.services.RedService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RequiredArgsConstructor
@Controller
public class RedController {

  //  private final RedRepository redRepository;
  private final RedService redService;

  @RequestMapping(value = "/", method = RequestMethod.GET)
  public String renderLandingPage(Model model) {
    model.addAttribute("reddits", redService.getAllTheReds());
    return "index";
  }

  @RequestMapping(value = "/submit", method = RequestMethod.GET)
  public String renderSubmitPage() {
    return "submit";
  }

//  @RequestMapping(value = "/submit", method = RequestMethod.POST)
//  public String addNewRed(@RequestParam(name = "newpost") String newpost) {
//    redService.add(newpost);
//    return "redirect:";
//  }

  @RequestMapping(value = "/submit", method = RequestMethod.POST)
  public String addNewRed(@ModelAttribute Red red) {
    redService.add(red);
    return "redirect:";
  }

  @RequestMapping(value = "/upvote", method = RequestMethod.POST)
  public String increaseVoteCountByOne(@RequestParam(name = "id") long id) {
    redService.increaseVoteCount(id);
    return "redirect:";
  }

  @RequestMapping(value = "/downvote", method = RequestMethod.POST)
  public String decreaseVoteCountByOne(@RequestParam(name = "id") long id) {
    redService.decreaseVoteCount(id);
    return "redirect:";
  }

}
