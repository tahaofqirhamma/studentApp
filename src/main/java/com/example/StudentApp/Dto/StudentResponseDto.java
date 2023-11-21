package com.example.StudentApp.Dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Data
public class StudentResponseDto {
    private Integer studentId;
    private String firstName;
    private String lastName;
    private String level;
}
