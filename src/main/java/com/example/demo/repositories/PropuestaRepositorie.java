package com.example.demo.repositories;

import com.example.demo.models.PropuestaModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PropuestaRepositorie extends CrudRepository<PropuestaModel, Long> {

}
