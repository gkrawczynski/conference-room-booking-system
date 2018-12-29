package com.betse.entity;

import lombok.Data;
import lombok.ToString;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import javax.persistence.*;
import java.util.List;

@Entity
@Data
@ToString
@Table(name = "Users")
public class User {
    @Id
    @Column(unique = true)
    @Length(max=100)
    private String login;

    @NotEmpty
    @Length(max=50)
    private String name;

    @NotEmpty
    @Length(max=100)
    private String surname;

    @NotEmpty
    @Length(min=6, max=100)
    private String password;

}

/*
@OneToMany
    @JoinColumn(name = "room_name")
    private List<Room> rooms;
 */