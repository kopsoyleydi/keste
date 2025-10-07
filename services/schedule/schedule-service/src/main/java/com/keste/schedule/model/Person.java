package com.keste.schedule.model;

import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public class Person {

  private String firstName;
  private String lastName;
  private String email;
}
