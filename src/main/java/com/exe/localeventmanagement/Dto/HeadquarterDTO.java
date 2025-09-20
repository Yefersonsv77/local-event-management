package com.exe.localeventmanagement.Dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class HeadquarterDTO {

    private Long headquarterId;
    private String Name;
    private String Address;
    private String Capacity;

}
