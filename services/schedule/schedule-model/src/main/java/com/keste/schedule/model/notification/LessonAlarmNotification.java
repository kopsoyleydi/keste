package com.keste.schedule.model.notification;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LessonAlarmNotification {
  private String subjectName;
  private String lessonStartAt;
  private Integer floor;
  private String audienceNumber;
  private String address;
}
