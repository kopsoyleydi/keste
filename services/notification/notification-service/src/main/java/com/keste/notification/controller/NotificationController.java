package com.keste.notification.controller;

import com.keste.notification.model.NotificationDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/notification")
@RequiredArgsConstructor
public class NotificationController {

  @PostMapping("/send")
  public void sendNotification(@RequestBody NotificationDto notification) {

  }
}
