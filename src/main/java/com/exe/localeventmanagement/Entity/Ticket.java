package com.exe.localeventmanagement.Entity;


import com.exe.localeventmanagement.Enum.TicketStatus;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tickets")
@Data

public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "ticket_id", nullable = false, unique = true, updatable = false)
    private Long ticketId;

    @Enumerated (EnumType.STRING)
    @Column (name = "status", nullable = false, length = 50)
    private TicketStatus status;

    @Column (name = "ticket_code", nullable = false, length = 100, unique = true)
    private String ticketCode;

    @Column (name = "price", nullable = false, precision = 10, scale = 2)
    private Double price;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;


}
