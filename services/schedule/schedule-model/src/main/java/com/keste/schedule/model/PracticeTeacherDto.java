package com.keste.schedule.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class PracticeTeacherDto {

  private Long id;
  private Long userId;
  private String firstName;
  private String lastName;
  private String email;
}
