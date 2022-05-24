package com.example.demo.services;

import com.example.demo.models.YogurtModel;
import com.example.demo.repositories.YogurtRepositorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class YogurtService {
    @Autowired
    YogurtRepositorie yogurtRepositorie;

    public ArrayList<YogurtModel> GetAllYogurt(){
        return (ArrayList<YogurtModel>) yogurtRepositorie.findAll();
    }

    public Optional<YogurtModel> GetYogurtById(Long id){
        return yogurtRepositorie.findById(id);
    }

    public YogurtModel SaveYogurt(YogurtModel yogurtModel){
        return yogurtRepositorie.save(yogurtModel);
    }


    public boolean DeleteYogurtById(Long id){
        try {
            yogurtRepositorie.deleteById(id);
            return true;
        }catch (Exception e){
            System.out.println("No se pudo eliminar el yogurt: " + e.getMessage());
            return false;
        }
    }

}
