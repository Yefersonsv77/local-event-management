package com.exe.localeventmanagement.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "headquarters")
@Data
public class Headquarter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "headquarter_id", nullable = false, unique = true)
    private Long headquarterId;

    // Nombre de la sede
    @Column(name = "name", nullable = false, unique = true, length = 100)
    private String name;

    // Direccion de la sede
    @Column(name = "Address", nullable = false, length = 200)
    private String address;

    // Capacidad (aforo) de personas dentro de la sede
    @Column(name = "capacity", nullable = false)
    private Integer capacity;

}
