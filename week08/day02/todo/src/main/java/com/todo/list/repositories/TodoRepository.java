package com.todo.list.repositories;

import com.todo.list.models.Todo;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {

  @Override
  List<Todo> findAll();

}
