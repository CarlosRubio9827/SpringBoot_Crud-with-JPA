package com.example.demo.services;

import com.example.demo.models.UserModel;
import com.example.demo.repositories.UserRepositorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepositorie usuarioRepositorie;

    public ArrayList<UserModel> GetUSers(){
        return (ArrayList<UserModel>) usuarioRepositorie.findAll();
    }

    public UserModel SaveUser(UserModel user){
        return usuarioRepositorie.save(user);
    }



    public Optional<UserModel> getById(Long id){
        return usuarioRepositorie.findById(id);
    }

    public boolean deleteUSer(Long id){
        try{
            usuarioRepositorie.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
