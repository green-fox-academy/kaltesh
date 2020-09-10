package com.todo.list.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "todos")
@NoArgsConstructor

public class Todo {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String title;
  private boolean isUrgent;
  private boolean isDone;
//
//  public Todo(String title) {
//    this.title = title;
//    this.isDone = false;
//    this.isUrgent = false;
//  }

  public Todo(String title, boolean isDone, boolean isUrgent) {
    this.title = title;
    this.isDone = isDone;
    this.isUrgent = isUrgent;
  }

}



