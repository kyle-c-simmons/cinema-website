package com.qa.QACinema.Repositories;

import org.bson.types.ObjectId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.qa.QACinema.Entities.Screen;

@Repository
public interface ScreenRepository extends JpaRepository<Screen, Long> {
    
}
