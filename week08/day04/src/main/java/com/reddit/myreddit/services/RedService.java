package com.reddit.myreddit.services;

import com.reddit.myreddit.models.Red;
import com.reddit.myreddit.repositories.RedRepository;
import com.sun.jndi.toolkit.url.Uri;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class RedService {
  private final RedRepository redRepository;

  public List<Red> getAllTheReds() {
    return redRepository.findAll();
  }

  public void add(Red red) {
    redRepository.save(red);
  }

  public Red findRedById(long id) {
    return redRepository.findById(id).orElse(null);
  }

  public void increaseVoteCount(long id) {
    Red red = findRedById(id);
    red.setAmountOfVotes(red.getAmountOfVotes() + 1);
    redRepository.save(red);
  }

  public void decreaseVoteCount(long id) {
    Red red = findRedById(id);
    red.setAmountOfVotes(red.getAmountOfVotes() - 1);
    redRepository.save(red);
  }

  public Red changeScore(long id, int amount, String giveortake) {
    Red red = findRedById(id);
    int theActualAmountWithNegativePossible =
        (giveortake.equals("+")) ? amount : (giveortake.equals("-")) ? -amount : 0;
    red.setAmountOfVotes(red.getAmountOfVotes() + theActualAmountWithNegativePossible);
    redRepository.save(red);
    return red;
  }
}

