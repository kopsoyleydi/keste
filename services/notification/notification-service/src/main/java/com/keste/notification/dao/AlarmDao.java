package com.keste.notification.dao;

import jakarta.persistence.Entity;
import java.time.LocalDateTime;

@Entity
public class AlarmDao extends EventDao {

  private Integer notifyBeforeMinutes;

  private LocalDateTime alarmTime;
}
