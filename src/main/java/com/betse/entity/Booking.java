package com.betse.entity;

import com.betse.entity.validation.All_ItemValidation;
import com.betse.entity.validation.Many_ItemValidation;
import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@Data
@ToString
@Table(name = "Bookings")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bookingId;

    @NotNull(groups = {All_ItemValidation.class})
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateFrom;

    @NotNull(groups = {All_ItemValidation.class})
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateTo;

    @NotNull(groups = {All_ItemValidation.class})
    private String password;

    @ManyToOne(optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "room_name_other")
    private Room room;

    @NotNull(groups = {All_ItemValidation.class})
    private String roomName;

    @ManyToOne(optional = false)
    @JoinColumn(name = "login_user_other")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private User user;

    @NotNull(groups = {All_ItemValidation.class, Many_ItemValidation.class})
    private String userLogin;











}
