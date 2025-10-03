package com.henriqueaguiiar.mentoria_backend.domain.service.impl;

import com.henriqueaguiiar.mentoria_backend.api.v1.model.input.PersonInputDTO;
import com.henriqueaguiiar.mentoria_backend.domain.repository.PersonRepository;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@RequiredArgsConstructor
public class PersonServiceImpl {

    private final PersonRepository personRepository;


    public void validateInput(PersonInputDTO person){

        Boolean control = true;

        String surName = person.getSurname();
        String name = person.getName();
        Date bornDate = person.getBornDate();
        String[] stack = person.getStack().toArray(new String[0]);
        
        if(surName.trim().length() >= 32){
            control = false;
        }
        if()

    }

}
