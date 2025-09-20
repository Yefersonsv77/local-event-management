package com.exe.localeventmanagement.Dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class EventDTO {

    private Long eventId;
    private String eventDate;
    private String eventName;
    private Double eventQuota;

    private Long headquarterId;

}
