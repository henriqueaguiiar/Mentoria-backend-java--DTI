package com.henriqueaguiiar.mentoria_backend.api.v1.resources;


import com.henriqueaguiiar.mentoria_backend.api.v1.model.input.PersonInputDTO;
import com.henriqueaguiiar.mentoria_backend.api.v1.model.output.PersonOutputDTO;
import com.henriqueaguiiar.mentoria_backend.domain.service.PersonService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/person")
@Slf4j
public class PersonResource {

    private final PersonService personService;

    /**
     * Injeção de dependencia correspondente a anotation do lombok @RequiredArgsConstructor
     */
    @Autowired
    public PersonResource(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    public ResponseEntity<PersonOutputDTO> create(@RequestBody PersonInputDTO person){
        log.info("Pessoa: {} BornDate: {} ", person.getName(), person.getBornDate());
        PersonOutputDTO personOutputDTO = personService.create(person);
        return ResponseEntity.ok(personOutputDTO);
    }

    @GetMapping("/api/person/{id}")
    public ResponseEntity<PersonOutputDTO> getPersonbyId(@PathVariable String id){
        return null;
    }


    @GetMapping
    public ResponseEntity<List<PersonOutputDTO>> getPersons(@RequestParam(name = "t", required = false) String termo){

        return null;
    }

    @GetMapping("/count")
    public String count(){
        return "";
    }


}
