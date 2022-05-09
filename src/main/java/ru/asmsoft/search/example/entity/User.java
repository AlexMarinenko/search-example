package ru.asmsoft.search.example.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "example_user")
public class User {

    @Id
    private long id;

    @Column
    private String username;

    @Column
    private String password;

}
