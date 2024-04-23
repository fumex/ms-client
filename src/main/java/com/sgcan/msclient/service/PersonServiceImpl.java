package com.sgcan.msclient.service;

import com.sgcan.msclient.entity.Person;

import com.sgcan.msclient.respository.IPersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements IPersonService{

    @Autowired
    IPersonRepository iPersonRepository;
    @Override
    public Person save(Person person) {
        return iPersonRepository.save(person);
    }

    @Override
    public void deleteById(String id) {
        iPersonRepository.deleteById(id);
    }

    @Override
    public Person findById(String id) {
        return iPersonRepository.findById(id).get();
    }

    @Override
    public List<Person> findAll() {
        return iPersonRepository.findAll();
    }
}
