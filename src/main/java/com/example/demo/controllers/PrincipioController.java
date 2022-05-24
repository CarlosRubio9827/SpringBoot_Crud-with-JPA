package com.example.demo.controllers;

import com.example.demo.models.PrincipioModel;
import com.example.demo.services.PrincipioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/principios")
public class PrincipioController {
    @Autowired
    PrincipioService principioService;

    @GetMapping
    public ArrayList<PrincipioModel> GetPrincipios(){
        return principioService.GetAllPrincipios();
    }

    @PostMapping
    public PrincipioModel SavePrincipio(@RequestBody PrincipioModel principioModel){
        return principioService.SavePrincipio(principioModel);
    }

    @GetMapping(path = "/{id}")
    public Optional<PrincipioModel> GetPrincipio(@PathVariable("id") Long id){
        return principioService.GetPrincipioById(id);
    }

    @DeleteMapping(path = "{id}")
    public boolean DeletePrincipio(@PathVariable("id") Long id){
        boolean res = principioService.DeletePrincipioById(id);
        if (res){
            return true;
        }else{
            return false;
        }
    }


}
