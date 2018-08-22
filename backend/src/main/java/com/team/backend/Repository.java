package com.team.backend;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface Repository extends MongoRepository<Screen, String> {
    Screen findBy_id(ObjectId _id);
}
