package com.example.demo.controllers;

import com.example.demo.models.CategoriaModel;
import com.example.demo.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {

    @Autowired
    CategoriaService categoriaService;

    @GetMapping()
    public ArrayList<CategoriaModel> GetRecetas(){
        return categoriaService.GetCategorias();
    }

    @PostMapping()
    public CategoriaModel SaveReceta(@RequestBody CategoriaModel categoriaModel){
        return categoriaService.SaveCategoria(categoriaModel);
    }

    @GetMapping(path = "/{id}")
    public Optional<CategoriaModel> GetRecetaById(@PathVariable("id") Long id){
        return categoriaService.GetById(id);
    }

    @DeleteMapping(path = "/{id}")
    public boolean DeleteRecetaById(@PathVariable("id") Long id){
        boolean res =  categoriaService.DeleteCategoria(id);
        if(res){
            return true;
        }else{
            return false;
        }
    }

}
