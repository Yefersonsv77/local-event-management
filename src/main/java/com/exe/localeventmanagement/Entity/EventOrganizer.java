package com.exe.localeventmanagement.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table (name = "eventOrganizers")
@Data

public class EventOrganizer {


    //Identificador unico del organizador del evento
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "event_organizer_id", nullable = false, unique = true)
    private Long eventOrganizerId;

    //Clave foranea del evento
    @ManyToOne
    @JoinColumn(name = "event_id", nullable = false, foreignKey = @ForeignKey(name = "FK_Event_EventOrganizer"))
    private Event event;

    //Clave foranea del organizador
    @ManyToOne
    @JoinColumn(name = "organizer_id", nullable = false, foreignKey = @ForeignKey(name = "FK_Organizer_EventOrganizer"))
    private Organizer organizer;

    //Rol del organizador en el evento (principal, co-organizador)
    @Column(name = "role", nullable = false, length = 50)
    private String role;


}
