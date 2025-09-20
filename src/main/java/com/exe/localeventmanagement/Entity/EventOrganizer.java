package com.exe.localeventmanagement.Entity;

import com.exe.localeventmanagement.Enum.OrganizerRole;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table (name = "eventOrganizers")
@Data

public class EventOrganizer {


    //Identificador unico del organizador del evento
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "event_organizer_id", nullable = false, unique = true, updatable = false)
    private Long eventOrganizerId;

    @Column (name = "role", nullable = false, length = 50)
    @Enumerated (EnumType.STRING)
    private OrganizerRole role;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;

    @ManyToOne
    @JoinColumn(name = "organizer_id")
    private Organizer organizer;


}
