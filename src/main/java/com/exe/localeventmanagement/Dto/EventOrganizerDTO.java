package com.exe.localeventmanagement.Dto;

import com.exe.localeventmanagement.Entity.EventOrganizer;
import com.exe.localeventmanagement.Enum.OrganizerRole;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class EventOrganizerDTO {

    private Long eventOrganizerId;
    private OrganizerRole role;

    private Long eventId;
    private Long organizerId;
}
