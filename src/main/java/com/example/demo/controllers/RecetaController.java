package com.example.demo.controllers;

import com.example.demo.models.RecetaModel;
import com.example.demo.services.RecetaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/receta")
public class RecetaController {

    @Autowired
    RecetaService recetaService;

    @GetMapping()
    public ArrayList<RecetaModel> getRecetas(){
        return recetaService.GetRecetas();
    }

    @PostMapping()
    public RecetaModel saveReceta(@RequestBody RecetaModel recetaModel){
        return recetaService.SaveReceta(recetaModel);
    }

    @GetMapping(path = "/{id}")
    public Optional<RecetaModel> GetRecetaById(@PathVariable("id") Long id){
        return recetaService.GetById(id);
    }
    @DeleteMapping(path = "/{id}")
    public boolean DeleteRecetaById(@PathVariable("id") Long id){
        boolean res =  recetaService.DeleteReceta(id);
        if(res){
            return true;
        }else{
            return false;
        }
    }

}
