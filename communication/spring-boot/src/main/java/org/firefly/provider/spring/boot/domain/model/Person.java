package org.firefly.provider.spring.boot.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Person {
    private Long id;

    private String name;
    private Gender gender;
    private Integer age;

    private LocalDateTime createTime;
    private LocalDateTime updateTime;

    public enum Gender {
        FEMALE, MALE
    }
}
