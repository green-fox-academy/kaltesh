package com.postman.postman.repositories;

import com.postman.postman.models.Log;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
//import org.springframework.data.repository.CrudRepository;



@Repository
public interface LogRepository extends CrudRepository<Log, Integer> {

  @Override
  List<Log> findAll();
}
