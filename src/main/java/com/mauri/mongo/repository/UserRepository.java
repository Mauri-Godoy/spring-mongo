package com.mauri.mongo.repository;

import java.io.Serializable;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mauri.mongo.document.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
