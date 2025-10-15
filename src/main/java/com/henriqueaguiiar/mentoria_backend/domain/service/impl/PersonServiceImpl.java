package com.henriqueaguiiar.mentoria_backend.domain.service.impl;

import ch.qos.logback.core.util.StringUtil;
import com.henriqueaguiiar.mentoria_backend.api.v1.model.input.PersonInputDTO;
import com.henriqueaguiiar.mentoria_backend.api.v1.model.output.PersonOutputDTO;
import com.henriqueaguiiar.mentoria_backend.domain.repository.PersonRepository;


import com.henriqueaguiiar.mentoria_backend.domain.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepository;

    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");


    @Override
    public PersonOutputDTO create(PersonInputDTO personInputDTO) {
       validateInput(personInputDTO);
       return new PersonOutputDTO();
    }

    private void validateInput(PersonInputDTO person) {

        if (!StringUtils.hasText(person.getSurname()) || person.getSurname().length() > 32) {
            throw new IllegalArgumentException("Apelido é obrigatório e deve conter até 32 caracteres.");
        }

        if (!StringUtils.hasText(person.getName()) || person.getName().length() > 100) {
            throw new IllegalArgumentException("Nome é obrigatório e deve conter no máximo 100 caracteres.");
        }

        if (person.getBornDate() != null) {
            try {

                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                LocalDate.parse(person.getBornDate().toString(), formatter);
            } catch (DateTimeException e) {
                throw new IllegalArgumentException("A data deve estar no formato yyyy-MM-dd.");
            }
        }

        List<String> stack = person.getStack();
        if (stack != null && !stack.isEmpty()) {
            boolean temItemInvalido = stack.stream().anyMatch(item -> item == null || item.length() > 32);
            if (temItemInvalido) {
                throw new IllegalArgumentException("Cada item da stack deve ter no máximo 32 caracteres.");
            }
        }
    }
}
