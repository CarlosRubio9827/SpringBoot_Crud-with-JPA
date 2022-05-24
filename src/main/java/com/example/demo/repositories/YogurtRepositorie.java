package com.example.demo.repositories;

import com.example.demo.models.YogurtModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface YogurtRepositorie extends CrudRepository<YogurtModel, Long> {


}
