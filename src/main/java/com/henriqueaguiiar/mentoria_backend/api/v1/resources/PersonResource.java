package com.henriqueaguiiar.mentoria_backend.api.v1.resources;


import com.henriqueaguiiar.mentoria_backend.api.v1.model.input.PersonInputDTO;
import com.henriqueaguiiar.mentoria_backend.api.v1.model.output.PersonOutputDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public ResponseEntity<PersonOutputDTO> create(@RequestBody PersonInputDTO person){
        log.info("Pessoa: {} BornDate: {} ", person.getName(), person.getBornDate());
        return ResponseEntity.ok(new PersonOutputDTO());
    }


    @GetMapping("/api/person/{id}")
    public ResponseEntity<PersonOutputDTO> getPersonbyId(@PathVariable String id){
        return null;
    }

    @GetMapping
    public ResponseEntity<List<PersonOutputDTO>> getPersons(@RequestParam(name = "t", required = false) String termo){

        return null;
    }

    // Falta implementar Endpoint de Contagem.
















}
