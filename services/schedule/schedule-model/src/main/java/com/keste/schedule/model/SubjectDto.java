package com.keste.schedule.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class SubjectDto {

  private Long id;

  private String name;

  private Long lecturerId;

  private Long practiceTeacherId;

  private PracticeTeacherDto teacher;
}
