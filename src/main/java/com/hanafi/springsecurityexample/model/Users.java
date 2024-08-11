package com.hanafi.springsecurityexample.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.ToString;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;

@Data
@ToString
@Entity
public class Users  {
    @Id
    private int id;
    private String username;
    private String password;

}
