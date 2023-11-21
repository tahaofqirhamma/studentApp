package com.example.StudentApp.Dto;

import lombok.*;

@Data @AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder

public class StudentRequestDto {
    private String firstName;
    private String lastName;
    private String level;

}
