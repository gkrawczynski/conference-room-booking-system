package com.betse.entity;

import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.Type;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Data
@ToString
@Table(name = "Rooms")
public class Room {
    @Column(columnDefinition="TEXT", nullable = false, unique = true)
    @Length(max=50)
    private String name;
    @Column(columnDefinition="TEXT")
    @Length(max=256)
    private String locationDescription;
    @Column(nullable = false)
    @Size(max=100)
    private Integer numberOfSeats;
    @Column
    @Type(type="yes_no, default = no")
    private boolean projector;
    @Column(columnDefinition = "TEXT")
    @Length(max=100)
    private String phoneNumber;

}
