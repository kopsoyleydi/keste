package com.keste.schedule.model.dictiniory;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class TeacherDto {

  private Long userId;
  private String firstName;
  private String lastName;
  private String email;
}
