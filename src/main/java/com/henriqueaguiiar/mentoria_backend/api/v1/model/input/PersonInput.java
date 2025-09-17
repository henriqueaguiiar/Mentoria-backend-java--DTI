package com.henriqueaguiiar.mentoria_backend.api.v1.model.input;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Data
public class PersonInput {
    private String name;
    private Integer age;
}
