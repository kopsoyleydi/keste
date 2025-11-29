package com.keste.notification.service;

import com.keste.notification.model.NotificationDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SmsNotificationHandler {

  private final NotificationSender smsNotificationSender;

  public void sendSms(NotificationDto notification) {

  }
}
