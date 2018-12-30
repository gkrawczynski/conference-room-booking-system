package com.betse.entity;

import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.Type;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Data
@ToString
@Table(name = "Rooms")
public class Room {
    @Id
    @NotEmpty
//    @NotNull
    @Column(name = "room_name", unique = true)
    @Length(max=50)
    private String name;

    @Length(max=256)
    private String location;

    @Length(max=100)
    private String phoneNumber;

//    @Column(columnDefinition="type yes_no default no")
//    @Column(columnDefinition="boolean default false")
//    @Column(insertable = false)
//    @org.hibernate.annotations.ColumnDefault("false")
    @Column(nullable = false)
    private boolean projector = false;

    @NotEmpty
//    @NotNull
    @Size(max=100)
    private Integer seats;

}
