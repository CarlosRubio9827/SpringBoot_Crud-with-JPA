package com.example.demo.repositories;

import com.example.demo.models.RecetaModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecetaRepositorie extends CrudRepository<RecetaModel, Long> {


}
