package com.keste.schedule.model.dictiniory;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class SubjectDto {

  private String name;

  private String audienceNumber;

  private Long lecturerId;

  private TeacherDto teacher;
}
