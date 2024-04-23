package com.sgcan.msclient.respository;

import com.sgcan.msclient.entity.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonRepository extends MongoRepository<Person, String> {
}
