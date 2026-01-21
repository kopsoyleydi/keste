package com.keste.schedule.service;

import com.keste.schedule.model.ScheduleDto;
import java.util.List;

public interface ScheduleService {

  void saveSchedule(ScheduleDto schedule);

  void updateSchedule(ScheduleDto schedule);

  void deleteSchedule(ScheduleDto schedule);

  void saveSchedules(List<ScheduleDto> schedules);

  ScheduleDto findScheduleById(Long id);

  List<ScheduleDto> findAllByUserId(Long userId);
}
