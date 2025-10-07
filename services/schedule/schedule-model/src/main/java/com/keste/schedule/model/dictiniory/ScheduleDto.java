package com.keste.schedule.model.dictiniory;

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

  private Long userId;

  private Long subjectId;

  private LocalDateTime startTime;

  private LocalDateTime endTime;

  private WeekDays dayOfWeek;
}
