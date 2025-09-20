package com.exe.localeventmanagement.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "events")
@Data

public class Event {

    //Identificador unico del evento
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "event_id", nullable = false, unique = true, updatable = false)
    private Long eventId;

    @Column (name = "event_date", nullable = false, length = 50)
    private String eventDate;

    @Column (name = "event_name", nullable = false, length = 100)
    private String eventName;

    @Column (name = "event_quota", nullable = false)
    private Double eventQuota;

    @ManyToOne
    @JoinColumn(name = "headquarter_id")
    private Headquarter headquarter;

    @OneToMany(mappedBy = "event")
    private List<Ticket> tickets;

    @OneToMany(mappedBy = "event")
    private List<EventOrganizer> eventOrganizers;

}
