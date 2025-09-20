package com.exe.localeventmanagement.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "headquarters")
@Data
public class Headquarter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "headquarter_id", nullable = false, unique = true, updatable = false)
    private Long headquarterId;

    @Column (name = "name", nullable = false, length = 100)
    private String name;

    @Column (name = "address", nullable = false, length = 150)
    private String address;

    @Column (name = "capacity", nullable = false)
    private Integer capacity;



    @OneToMany(mappedBy = "headquarter")
    private List<Event> events;
}