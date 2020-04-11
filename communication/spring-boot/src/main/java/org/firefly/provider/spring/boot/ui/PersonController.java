package org.firefly.provider.spring.boot.ui;

import org.firefly.provider.spring.boot.domain.service.PersonService;
import org.firefly.provider.spring.boot.ui.dto.PersonGetResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    private PersonService personService;

    @GetMapping("/{id}")
    public Response<PersonGetResponseDTO> getById(@PathVariable Long id) {
        return Response.success(PersonGetResponseDTO.from(personService.findById(id)));
    }

    @GetMapping
    public Response<List<PersonGetResponseDTO>> getAll() {
        return Response.success(PersonGetResponseDTO.from(personService.findAll()));
    }
}
