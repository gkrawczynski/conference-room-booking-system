package com.betse.entity;

import lombok.Data;
import lombok.ToString;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;

@Entity
@Data
@ToString
@Table(name="Users")
public class User {
    @Column(columnDefinition="TEXT", nullable = false)
    @Length(max=50)
    private String name;
    @Column(columnDefinition="TEXT", length = 100, nullable = false)
    @Length(max=100)
    private String surname;
    @Id
    @Column(columnDefinition="TEXT", length = 100, nullable = false, unique = true)
    @Length(max=100)
    private String login;
    @Column(columnDefinition="TEXT", length = 100, nullable = false)
    @Length(min=6, max=100)
    private String password;

}
