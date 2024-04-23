package com.sgcan.msclient.business;

import com.sgcan.msclient.dto.PersonDto;
import com.sgcan.msclient.entity.Person;

import com.sgcan.msclient.service.IPersonService;
import com.sgcan.msclient.service.PersonServiceImpl;
import com.sgcan.msclient.util.MapperUtil;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;


@Service
public class PersonBusiness  extends MapperUtil {

    @Autowired
    private IPersonService iPersonService;
    public PersonDto create(PersonDto personDto) {

        Person person =map(personDto,Person.class);
        person.setId(new ObjectId().toString());
        person.setCreateAt(LocalDateTime.now());

        return map(iPersonService.save(person),PersonDto.class);
    }

    public List<PersonDto> findAll(){
        return mapAll(iPersonService.findAll(),PersonDto.class);
    }

    public PersonDto update(PersonDto personDto) {
        Person person = iPersonService.findById(personDto.getId());
        return map(person,PersonDto.class);
    }

    public PersonDto finById(String id){
         Person person = iPersonService.findById(id);
         return map(person,PersonDto.class);
    }

    public void delete(String id){
        iPersonService.deleteById(id);
    }
}
