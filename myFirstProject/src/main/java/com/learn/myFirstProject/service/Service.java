package com.learn.myFirstProject.service;


import com.learn.myFirstProject.model.Model;
import com.learn.myFirstProject.repo.Repo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    private Repo repo ;

    public List<Model> getAllModels (){
        return repo.findAll();
    }

    public String addModel(Model model){
        repo.insert(model);
        return "Added Successful";
    }

    public String deleteModel(String id){
        repo.deleteById(id);
        return "deleted Successfully";
    }


    public String updateModal(Model model){
        if(repo.existsById(model.getId())){
            repo.save(model);
            return "Updated Successfully";
        } else {
            return "given ID not exists";
        }
    }



}
