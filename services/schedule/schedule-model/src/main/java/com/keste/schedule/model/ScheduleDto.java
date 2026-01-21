package com.keste.schedule.model;

import com.keste.common.model.WeekDays;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ScheduleDto {

  private Long id;

  private Long subjectId;

  private String startTime;

  private String endTime;

  private String audienceNumber;

  private String addressId;

  private WeekDays dayOfWeek;
}
