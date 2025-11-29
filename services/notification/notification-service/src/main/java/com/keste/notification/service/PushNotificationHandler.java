package com.keste.notification.service;

import com.keste.notification.model.NotificationDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PushNotificationHandler {

  private final NotificationSender pushNotificationSender;

  public void pushNotification(NotificationDto notification) {

  }
}
