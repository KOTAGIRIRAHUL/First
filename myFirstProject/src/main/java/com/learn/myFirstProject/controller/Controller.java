package com.learn.myFirstProject.controller;

import com.learn.myFirstProject.model.Model;
import com.learn.myFirstProject.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/first")
@CrossOrigin(origins = "*")
public class Controller {
    @Autowired
    private Service service;

    @GetMapping("/get")
    public List<Model> getAllModels (){
        return service.getAllModels();
    }

    @PostMapping("/add")
    public String addModel(@RequestBody Model model){
        return service.addModel(model);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteModel(@PathVariable String id){
        return service.deleteModel(id);
    }

    @PutMapping("/update")
    public String updateModal(@RequestBody Model model){
        return service.updateModal(model);
    }
}
