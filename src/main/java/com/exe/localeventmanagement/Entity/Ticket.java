package com.exe.localeventmanagement.Entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tickets")
@Data

public class Ticket {

    //identificador unico del ticket
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ticket_id", nullable = false, unique = true)
    private Long ticketId;

    //foreign key del evento
    @ManyToOne
    @JoinColumn(name = "event_id", nullable = false, foreignKey = @ForeignKey(name = "FK_Event_Ticket"))
    private Event event;

    //Codigo del ticket
    @Column(name = "ticket_code", nullable = false, unique = true, length = 100)
    private String ticketCode;

    //Estado del ticket (disponible, vendido, cancelado)
    @Column(name = "status", nullable = false, length = 50)
    private String status;


}
