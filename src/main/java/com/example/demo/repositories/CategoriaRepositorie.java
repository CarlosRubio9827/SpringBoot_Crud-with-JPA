package com.example.demo.repositories;

import com.example.demo.models.CategoriaModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepositorie extends CrudRepository<CategoriaModel, Long> {



}
