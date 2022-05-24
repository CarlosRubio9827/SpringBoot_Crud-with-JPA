package com.example.demo.controllers;

import com.example.demo.models.YogurtModel;
import com.example.demo.services.YogurtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/yogures")
public class YogurtController {
    @Autowired
    YogurtService yogurtService;

    @GetMapping
    public ArrayList<YogurtModel> GetAllYogurt(){
        return yogurtService.GetAllYogurt();
    }

    @GetMapping(path = "{id}")
    public Optional<YogurtModel> GetYougurtById(@PathVariable("id") Long id){
        return yogurtService.GetYogurtById(id);
    }

    @PostMapping
    public YogurtModel SaveYogurt(@RequestBody YogurtModel yogurtModel){
        return yogurtService.SaveYogurt(yogurtModel);
    }

    @DeleteMapping(path = "{id}")
    public boolean DeleteYougurtById(@PathVariable("id") Long id){
        return yogurtService.DeleteYogurtById(id);
    }

}
