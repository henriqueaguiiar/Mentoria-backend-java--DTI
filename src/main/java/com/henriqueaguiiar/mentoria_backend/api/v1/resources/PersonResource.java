package com.henriqueaguiiar.mentoria_backend.api.v1.resources;


import com.henriqueaguiiar.mentoria_backend.api.v1.model.input.PersonInput;
import com.henriqueaguiiar.mentoria_backend.api.v1.model.output.PersonOutput;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/person")
public class PersonResource {


    @GetMapping
    public String teste(){
        return "teste";
    }

    @PostMapping
    public PersonOutput create(PersonInput person){
        return new PersonOutput();
    }

}
