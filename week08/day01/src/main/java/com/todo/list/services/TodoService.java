package com.todo.list.services;

import org.springframework.stereotype.Service;
import com.todo.list.models.Todo;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class TodoService {
  private List<Todo> todos;
  private int nextId;

  public TodoService() {
    this.todos = new ArrayList<>();
    this.nextId = 1;
  }

  public List<Todo> getTodos() {
    return todos;
  }

  public void addTodo(String name) {
    todos.add(new Todo(name, nextId));
    nextId++;
  }

  public void completeTodo(int id) {
    findTodo(id).setComplete(true);
  }

  public void deleteTodo(int id) {
    if (todos.size() != 0 && findTodo(id) != null) {
      todos.remove(findTodo(id));
    }
  }

  public void switchUrgentStatus(int id) {
    if (findTodo(id).isUrgent()) {
      findTodo(id).setUrgent(false);
    } else {
      findTodo(id).setUrgent(true);
    }
//    findTodo(id).isUrgent() ? findTodo(id).setUrgent(false) : findTodo(id).setUrgent(true);
  }

  public Todo findTodo(int id) {
    for (Todo todo : todos) {
      if (todo.getId() == (id)) {
        return todo;
      }
    }
    return null;


//    todos.stream()
//        .filter(todo -> todo.getId() == id)
//        .findFirst()
//        .get()
//    return todo;
  }
}
