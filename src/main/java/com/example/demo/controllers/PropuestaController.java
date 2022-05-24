package com.example.demo.controllers;

import com.example.demo.models.PropuestaModel;
import com.example.demo.services.PropuestaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/propuesta")
public class PropuestaController {
    @Autowired
    PropuestaService propuestaService;

    @GetMapping
    public ArrayList<PropuestaModel> GetAll(){
        return propuestaService.GetAllPropuestas();
    }

    @PostMapping
    public PropuestaModel SavePropuesta(@RequestBody PropuestaModel propuestaModel){
        return propuestaService.SavePropuesta(propuestaModel);
    }

    @GetMapping(path = "/{id}")
    public Optional<PropuestaModel> GetPropuestaById(@PathVariable("id") Long id){
        return propuestaService.GetPropuestaById(id);
    }
    @DeleteMapping(path = "/{id}")
    public String DeletePropuestaById(@PathVariable("id") Long id){
        boolean res = propuestaService.DeletePropuestaById(id);
        if(res){
            return "True";
        }else {
            return "False";
        }

    }


}
