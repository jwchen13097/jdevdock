package org.firefly.provider.spring.boot.ui.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.firefly.provider.spring.boot.domain.model.Person;
import org.firefly.provider.spring.boot.domain.model.Person.Gender;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class PersonGetResponseDTO {
    private Long id;

    private String name;
    private Gender gender;
    private Integer age;

    public static PersonGetResponseDTO from(Person person) {
        return PersonGetResponseDTO.builder()
                .id(person.getId())
                .name(person.getName())
                .gender(person.getGender())
                .age(person.getAge())
                .build();
    }

    public static List<PersonGetResponseDTO> from(List<Person> personList) {
        return personList.stream().map(PersonGetResponseDTO::from).collect(Collectors.toList());
    }
}
