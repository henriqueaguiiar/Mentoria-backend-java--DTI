package com.henriqueaguiiar.mentoria_backend.api.v1.model.input;


import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class PersonInputDTO {
    private String name;
    private Integer age;
}
