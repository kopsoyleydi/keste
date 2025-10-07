package com.keste.notification.dao;

import com.keste.common.model.WeekDays;
import jakarta.persistence.Entity;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
public class PushDao extends EventDao {

  private Integer notifyBeforeMinutes;

  private LocalDateTime pushTime;

  private Set<WeekDays> repeatDays;
}
