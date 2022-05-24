package com.example.demo.services;

import com.example.demo.models.CategoriaModel;
import com.example.demo.repositories.CategoriaRepositorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    CategoriaRepositorie categoriaRepositorie;

    public ArrayList<CategoriaModel> GetCategorias(){
        return (ArrayList<CategoriaModel>) categoriaRepositorie.findAll();
    }

    public Optional<CategoriaModel> GetById(Long id){
        return categoriaRepositorie.findById(id);
    }

    public CategoriaModel SaveCategoria(CategoriaModel categoriaModel){
        return categoriaRepositorie.save(categoriaModel);
    }
    public boolean DeleteCategoria(Long id){
        try{
            categoriaRepositorie.deleteById(id);
            return true;
        }catch (Exception e){
            System.out.println("Error al eliminar: "+e.getMessage());
            return false;
        }
    }



}
