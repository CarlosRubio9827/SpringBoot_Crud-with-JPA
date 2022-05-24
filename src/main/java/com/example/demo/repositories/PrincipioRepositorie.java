package com.example.demo.repositories;

import com.example.demo.models.PrincipioModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrincipioRepositorie extends CrudRepository<PrincipioModel, Long> {

}
