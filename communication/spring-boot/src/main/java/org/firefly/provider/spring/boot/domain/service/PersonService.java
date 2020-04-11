package org.firefly.provider.spring.boot.domain.service;

import org.firefly.provider.spring.boot.domain.model.Person;

import java.util.List;

public interface PersonService {
    Person findById(Long id);

    List<Person> findAll();
}
