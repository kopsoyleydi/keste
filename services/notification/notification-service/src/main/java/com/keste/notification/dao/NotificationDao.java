package com.keste.notification.dao;

import jakarta.persistence.Entity;

@Entity
public class NotificationDao extends EventDao {

  private String recipient;

  private String request;

  private String sender;
}
