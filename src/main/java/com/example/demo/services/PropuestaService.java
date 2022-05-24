package com.example.demo.services;

import com.example.demo.models.PropuestaModel;
import com.example.demo.repositories.PropuestaRepositorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;
import java.util.logging.Logger;

@Service
public class PropuestaService {

    @Autowired
    PropuestaRepositorie propuestaRepositorie;

    public ArrayList<PropuestaModel> GetAllPropuestas(){
        return (ArrayList<PropuestaModel>) propuestaRepositorie.findAll();
    }

    public Optional<PropuestaModel> GetPropuestaById(Long id){
        return propuestaRepositorie.findById(id);
    }

    public PropuestaModel SavePropuesta(PropuestaModel propuestaModel){
        return propuestaRepositorie.save(propuestaModel);
    }

    public boolean DeletePropuestaById(Long id){
        try{
            propuestaRepositorie.deleteById(id);
            return true;
        }catch (Exception e){
            System.out.println("Error propuesta: " + e.getMessage());
            return false;
        }
    }

}
