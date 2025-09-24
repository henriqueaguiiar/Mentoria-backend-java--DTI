package com.henriqueaguiiar.mentoria_backend.api.v1.resources;


import com.henriqueaguiiar.mentoria_backend.api.v1.model.input.PersonInputDTO;
import com.henriqueaguiiar.mentoria_backend.api.v1.model.output.PersonOutputDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/person")
@Slf4j
public class PersonResource {


    @GetMapping
    public String teste(){
        log.info("Sucesso");
        return "teste-API";
    }

    @PostMapping
    public PersonOutputDTO create(@RequestBody PersonInputDTO person){
        log.info("Pessoa: {} Idade: {} ", person.getName(), person.getAge());
        return new PersonOutputDTO();
    }

}
