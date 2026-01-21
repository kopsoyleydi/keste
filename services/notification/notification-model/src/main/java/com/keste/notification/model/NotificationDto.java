package com.keste.notification.model;

import java.util.Map;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NotificationDto {
  private Long userId;
  private String message;
  private Map<String, Object> params;
  private Enum<?> notificationType;
}
