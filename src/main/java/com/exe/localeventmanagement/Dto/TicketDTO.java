package com.exe.localeventmanagement.Dto;

import com.exe.localeventmanagement.Enum.TicketStatus;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class TicketDTO {

    private Long ticketId;
    private TicketStatus status;
    private String ticketCode;
    private Double price;

    private Long eventId;
}
