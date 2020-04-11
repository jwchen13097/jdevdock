package org.firefly.provider.spring.boot.infrastructure.service;

import org.firefly.provider.spring.boot.domain.model.Person;
import org.firefly.provider.spring.boot.domain.service.PersonService;
import org.firefly.provider.spring.boot.domain.util.DateTimeUtil;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static org.firefly.provider.spring.boot.domain.model.Person.Gender.FEMALE;
import static org.firefly.provider.spring.boot.domain.model.Person.Gender.MALE;

@Service
public class PersonServiceImpl implements PersonService {
    @Override
    public Person findById(Long id) {
        return Person.builder()
                .id(id)
                .name("Firefly")
                .gender(MALE)
                .age(54)
                .createTime(DateTimeUtil.parse("2019-07-14 12:01:56"))
                .updateTime(DateTimeUtil.parse("2019-07-14 12:01:56"))
                .build();
    }

    @Override
    public List<Person> findAll() {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person(1L, "Jack", MALE, 56,
                DateTimeUtil.parse("2019-08-14 12:01:56"), DateTimeUtil.parse("2019-08-14 12:01:56")));
        personList.add(new Person(1L, "Anna", FEMALE, 36,
                DateTimeUtil.parse("2019-08-15 12:01:56"), DateTimeUtil.parse("2019-08-15 12:01:56")));
        return personList;
    }
}
