package com.reddit.myreddit.repositories;

import com.reddit.myreddit.models.Red;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface RedRepository extends CrudRepository<Red, Long> {
  List<Red> findAll();
}



