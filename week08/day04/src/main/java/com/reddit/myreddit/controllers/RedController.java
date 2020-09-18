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

  private final RedService redService;

//  @RequestMapping(value = "/setup", method = RequestMethod.GET)
//  public String addSomRedsForTesting() {
//    Red red1 = new Red("post", "url");
//    Red red2 = new Red("post", "url");
//    Red red3 = new Red("post", "url");
//    Red red4 = new Red("post", "url");
//    Red red5 = new Red("post", "url");
//    redService.add(red1);
//    redService.add(red2);
//    redService.add(red3);
//    redService.add(red4);
//    redService.add(red5);
//    return "redirect:";
//  }

  @RequestMapping(value = "/", method = RequestMethod.GET)
  public String renderLandingPage(Model model) {
    model.addAttribute("reddits", redService.getAllTheReds());
    return "index";
  }

  @RequestMapping(value = "/submit", method = RequestMethod.GET)
  public String renderSubmitPage() {
    return "submit";
  }

  @RequestMapping(value = "/submit", method = RequestMethod.POST)
  public String addNewRed(@ModelAttribute Red red) {
    redService.add(red);
    return "redirect:";
  }

  @RequestMapping(value = "/upvote", method = RequestMethod.POST)
  public String increaseVoteCountByOne(@RequestParam(name = "id") long id) {
    redService.increaseVoteCount(id);
    return "redirect:/";
  }

  @RequestMapping(value = "/downvote", method = RequestMethod.POST)
  public String decreaseVoteCountByOne(@RequestParam(name = "id") long id) {
    redService.decreaseVoteCount(id);
    return "redirect:/";
  }

  @RequestMapping(value = "/cheat", method = RequestMethod.GET)
  public String renderChangeScorePage(@RequestParam(name = "id") long id, Model model) {
    model.addAttribute("reddit", redService.findRedById(id));
    return "cheat";
  }

  @RequestMapping(value = "/cheat", method = RequestMethod.POST)
  public String changeScoreOfARed(@RequestParam(name = "id") long id,
                                  int amountToChangeTheScoreWith, String vote) {
    redService.changeScore(id, amountToChangeTheScoreWith, vote);
    return "redirect:";
  }

}
