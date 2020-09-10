package com.reddit.myreddit.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Red {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String post;
  private int amountOfVotes;
  private String url;

  public Red(String post, String url) {
    this.post = post;
    this.post = url;
  }
}
