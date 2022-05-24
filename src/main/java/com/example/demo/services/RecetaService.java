package com.example.demo.services;

import com.example.demo.models.RecetaModel;
import com.example.demo.repositories.RecetaRepositorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class RecetaService {

    @Autowired
    RecetaRepositorie recetaRepositorie;

    public ArrayList<RecetaModel> GetRecetas(){
        return (ArrayList<RecetaModel>) recetaRepositorie.findAll();
    }

    public Optional<RecetaModel> GetById(Long id){
        return recetaRepositorie.findById(id);
    }

    public RecetaModel SaveReceta(RecetaModel recetaModel){
        return recetaRepositorie.save(recetaModel);
    }
    public boolean DeleteReceta(Long id){
        try{
            recetaRepositorie.deleteById(id);
            return true;
        }catch (Exception e){
            System.out.println("Error al eliminar: "+e.getMessage());
            return false;
        }
    }



}
