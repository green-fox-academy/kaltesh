package com.todo.list.controllers;

import com.todo.list.services.TodoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class TodoController {
  TodoService todoService;

  public TodoController(TodoService todoService) {
    this.todoService = todoService;
  }

  @RequestMapping(path = "/todo", method = RequestMethod.GET)
  public String showTodos(Model model) {
    model.addAttribute("todos", todoService.getTodos());
    return "index";
  }

  @RequestMapping(value = "/todo", method = RequestMethod.POST)
  public String addTodo(@RequestParam(name = "newTodo") String todoName) {
    todoService.addTodo(todoName);
    return "redirect:/todo";
  }

  @RequestMapping(value = "/complete", method = RequestMethod.POST)
  public String completeTodo(@RequestParam(name = "id") int id) {
    todoService.completeTodo(id);
    return "redirect:/todo";
  }

  @RequestMapping(value = "/delete", method = RequestMethod.POST)
  public String deleteTodo(@RequestParam(name = "id") int id) {
    todoService.deleteTodo(id);
    return "redirect:/todo";
  }


  @RequestMapping(value = "/urgent", method = RequestMethod.POST)
  public String switchUrgency(@RequestParam(name = "id") int id) {
    todoService.switchUrgentStatus(id);
    return "redirect:/todo";
  }
}