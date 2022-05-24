package com.example.demo.repositories;

import com.example.demo.models.UserModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface UserRepositorie extends CrudRepository<UserModel, Long> {

    public abstract List<UserModel> findAll();

}
