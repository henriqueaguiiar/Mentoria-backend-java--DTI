package com.henriqueaguiiar.mentoria_backend.api.v1.model.output;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
public class PersonOutputDTO {
    private UUID id;
    private String name;
    private String surname;
    private Date bornDate;
    private List<String> stack;


    /**
     *
     * @param name
     * @param surname
     * @param bornDate
     * @param stack
     * Construtor responsavel por instanciar um objeto com UUID.
     */

    public PersonOutputDTO(String name, String surname, Date bornDate, List<String> stack) {
        this.id = id = UUID.randomUUID();
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

    @Override
    public String toString() {
        return "PersonOutputDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", bornDate=" + bornDate +
                ", stack=" + stack +
                '}';
    }
}


