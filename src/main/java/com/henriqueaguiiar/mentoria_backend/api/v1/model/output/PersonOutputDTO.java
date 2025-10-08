package com.henriqueaguiiar.mentoria_backend.api.v1.model.output;


import com.github.f4b6a3.uuid.UuidCreator;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/**
 * @author Henrique Aguiar Pacheco
 * Classe DTO para output de dados nos demais Endpoints
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PersonOutputDTO {

    @Setter(AccessLevel.PRIVATE)
    private String id;
    private String name;
    private String surname;
    private LocalDate bornDate;
    private List<String> stack;


    /**
     *
     * @param name
     * @param surname
     * @param bornDate
     * @param stack
     * Construtor responsavel por instanciar um objeto com UUID.
     */

    @Autowired
    public PersonOutputDTO(String name, String surname, LocalDate bornDate, List<String> stack) {
        this.id = id = UuidCreator.getTimeOrderedEpoch().toString();
        this.name = name;
        this.surname = surname;
        this.bornDate = bornDate;
        this.stack = stack;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        PersonOutputDTO that = (PersonOutputDTO) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(surname, that.surname) && Objects.equals(bornDate, that.bornDate) && Objects.equals(stack, that.stack);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, bornDate, stack);
    }

}


