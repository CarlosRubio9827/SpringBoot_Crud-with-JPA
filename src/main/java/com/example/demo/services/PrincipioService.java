package com.example.demo.services;

import ch.qos.logback.core.encoder.EchoEncoder;
import com.example.demo.models.PrincipioModel;
import com.example.demo.repositories.PrincipioRepositorie;
import com.example.demo.repositories.PropuestaRepositorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class PrincipioService {
    @Autowired
    PrincipioRepositorie principioRepositorie;

    public ArrayList<PrincipioModel> GetAllPrincipios(){
        return (ArrayList<PrincipioModel>)principioRepositorie.findAll();
    }

    public Optional<PrincipioModel> GetPrincipioById(Long id){
        return principioRepositorie.findById(id);
    }

    public PrincipioModel SavePrincipio(PrincipioModel principioModel){
        return principioRepositorie.save(principioModel);
    }

    public boolean DeletePrincipioById(Long id){
        try{
            principioRepositorie.deleteById(id);
            return true;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }

}
