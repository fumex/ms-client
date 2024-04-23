package com.sgcan.msclient.controller;

import com.sgcan.msclient.business.PersonBusiness;
import com.sgcan.msclient.dto.PersonDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/person")
public class PersonController {

   @Autowired
    private PersonBusiness personBusiness;

    @PostMapping
    public PersonDto create(@RequestBody PersonDto personDto) {
        return personBusiness.create(personDto);
    }

    @PutMapping
    public PersonDto update(@RequestBody PersonDto personDto) {
        return personBusiness.update(personDto);
    }

    @GetMapping
    public List<PersonDto> findAll() {
        return personBusiness.findAll();
    }
    @GetMapping("/{id}")
    public PersonDto findById(@RequestParam String id) {
        return personBusiness.finById(id);
    }
}
