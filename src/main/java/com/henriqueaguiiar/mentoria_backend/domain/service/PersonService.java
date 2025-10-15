package com.henriqueaguiiar.mentoria_backend.domain.service;

import com.henriqueaguiiar.mentoria_backend.api.v1.model.input.PersonInputDTO;
import com.henriqueaguiiar.mentoria_backend.api.v1.model.output.PersonOutputDTO;
import org.springframework.stereotype.Service;

@Service
public interface PersonService {

    PersonOutputDTO create (PersonInputDTO personInputDTO);


}
