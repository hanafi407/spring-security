package com.hanafi.springsecurityexample.coba;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;

@Setter
@Getter
public class Person {
    @Value("${hanafi}")
    private String name;

}
