package com.keste.common.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserAccountDto {

  private Long userId;

  private String userName;

  private String email;
}
