package com.exe.localeventmanagement.Dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class OrganizerDTO {

    private Long organizerId;
    private String name;
    private String email;
    private String phone;
}
