package com.exe.localeventmanagement.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table (name = "organizers")
@Data

public class Organizer {

    //Identificador unico del organizador
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "organizer_id", nullable = false, unique = true)
    private Long organizerId;

    //Nombre del organizador
    @Column(name = "name", nullable = false, length = 100)
    private String name;

    //Email del organizador
    @Column(name = "email", nullable = false, unique = true, length = 150)
    private String email;
}
