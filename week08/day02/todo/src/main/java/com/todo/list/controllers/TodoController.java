package com.todo.list.controllers;

import com.todo.list.models.Todo;
import com.todo.list.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TodoController {

  public TodoRepository todoRepository;

  @Autowired
  public TodoController(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  @RequestMapping(value = {"/", "/list"}, method = RequestMethod.GET)
  public String list(Model model) {
    model.addAttribute("todos", todoRepository.findAll());
    return "todo";
  }

  @RequestMapping(value = "/newtodo", method = RequestMethod.GET)
  public String renderAdd() {
    return "newtodo";
  }

  @RequestMapping(value = "/newtodo", method = RequestMethod.POST)
  private String addTodo(String title, boolean isDone, boolean isUrgent) {
    todoRepository.save(new Todo(title, isDone, isUrgent));
    return "redirect:/";
  }


}