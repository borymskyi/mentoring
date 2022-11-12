package com.borymskyi.patterns.creational.builder4;

import lombok.Builder;
import lombok.ToString;

/**
 * @author Dmitrii Borymskyi
 * @version 1.0
 */

@Builder
@ToString
public class Person {
    private String firstName;
    private String middleName;
    private String lastName;
    private String city;

    @Builder.Default
    private String jobTitle = "Java Developer";
}

class Runner {
    public static void main(String[] args) {
        Person p = Person.builder().firstName("Dmytrii").middleName("Borymskyi").lastName("Edwardovich")
                .city("Kyiv").build();

        System.out.println(p);
    }
}
