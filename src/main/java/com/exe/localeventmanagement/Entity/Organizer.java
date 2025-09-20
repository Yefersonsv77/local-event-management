package com.exe.localeventmanagement.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table (name = "organizers")
@Data

public class Organizer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "organizer_id", nullable = false, unique = true, updatable = false)
    private Long organizerId;

    @Column (name = "email", nullable = false, length = 100, unique = true)
    private String email;

    @Column (name = "name", nullable = false, length = 100)
    private String name;

    @Column (name = "phone", nullable = false, length = 15)
    private String phone;

    @OneToMany(mappedBy = "organizer")
    private List<EventOrganizer> eventOrganizers;
}
