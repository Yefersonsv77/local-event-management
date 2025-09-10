package com.exe.localeventmanagement.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "events")
@Data

public class Event {

    //Identificador unico del evento
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "event_id", nullable = false, unique = true)
    private Long eventId;

    //Nombre del evento
    @Column (name = "event_name", nullable = false, length = 50)
    private String eventName;

    //Fecha del evento
    @Column (name = "event_date", nullable = false, length = 50)
    private String eventDate;

    //Clave foranea de la sede donde se hara el evento
    @ManyToOne
    @JoinColumn(name = "headquarter_id", nullable = false, foreignKey = @ForeignKey(name = "FK_Event_Heardquarter"))
    private Headquarter headquarter;

    //Cuota del evento
    @Column (name = "event_quota", nullable = false, length = 10)
    private Double eventQuota;

}
