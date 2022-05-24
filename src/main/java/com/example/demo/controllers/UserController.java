package com.example.demo.controllers;

import com.example.demo.models.UserModel;
import com.example.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/usuario")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping()
    public ArrayList<UserModel> getUsers(){
        return userService.GetUSers();
    }

    @PostMapping()
    public UserModel saveUser(@RequestBody UserModel usuario){
        return this.userService.SaveUser(usuario);
    }

    @GetMapping(path = "/{id}")
    public Optional<UserModel> GetById(@PathVariable("id") Long id){
        return this.userService.getById(id);
    }


    @DeleteMapping(path = "/{id}")
    public String deleteById(@PathVariable("id") Long id){
        boolean ok = this.userService.deleteUSer(id);
        if(ok){
            return "Sí se eliminó el usuario con id: " + id;
        }else{
            return "No se eliminó el usuaio con id: " + id;
        }
    }


}
