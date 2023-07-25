package com.learn.myFirstProject.repo;

import com.learn.myFirstProject.model.Model;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface Repo extends MongoRepository<Model, String> {
}
