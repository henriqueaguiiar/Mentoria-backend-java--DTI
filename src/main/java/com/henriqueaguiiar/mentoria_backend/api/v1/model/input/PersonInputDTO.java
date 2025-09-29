package com.henriqueaguiiar.mentoria_backend.api.v1.model.input;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;
import java.util.List;
import java.util.Objects;


/**
 * @author Henrique Aguiar Pacheco
 * Classe DTO para input de dados com POST
 */

@AllArgsConstructor
@Data
public class PersonInputDTO {
    private String name;
    private String surname;
    private Date bornDate;
    private List<String> stack;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        PersonInputDTO that = (PersonInputDTO) o;
        return Objects.equals(name, that.name) && Objects.equals(surname, that.surname) && Objects.equals(bornDate, that.bornDate) && Objects.equals(stack, that.stack);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, bornDate, stack);
    }
}
