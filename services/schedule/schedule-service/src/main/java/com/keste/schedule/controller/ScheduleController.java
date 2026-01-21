package com.keste.schedule.controller;

import com.keste.schedule.model.ScheduleDto;
import com.keste.schedule.service.ScheduleService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/schedule")
@RequiredArgsConstructor
public class ScheduleController {

  private final ScheduleService scheduleService;

  @PostMapping
  public void schedule(@RequestBody ScheduleDto schedule) {
    scheduleService.saveSchedule(schedule);
  }

  @PostMapping("/save-list")
  public void schedule(@RequestBody List<ScheduleDto> schedule) {
    scheduleService.saveSchedules(schedule);
  }

  @PutMapping
  public void update(@RequestBody ScheduleDto schedule) {
    scheduleService.updateSchedule(schedule);
  }

  @GetMapping("/find-all-by-user-id/{userId}")
  public List<ScheduleDto> findAll(@PathVariable Long userId) {
    return scheduleService.findAllByUserId(userId);
  }

  @GetMapping("/{id}")
  public ScheduleDto findById(@PathVariable Long id) {
    return scheduleService.findScheduleById(id);
  }
}
