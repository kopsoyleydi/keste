package com.keste.notification.service;

import com.keste.notification.model.NotificationDto;

public interface NotificationSender {

  void send(NotificationDto notification);
}
