package com.keste.notification.model;

import java.util.Map;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NotificationDto {
  Long userId;
  String message;
  Map<String, Object> params;
  Enum<?> notificationType;
}
