package com.keste.schedule.service.schedule;

import com.keste.schedule.mapper.ScheduleMapper;
import com.keste.schedule.model.Lesson;
import com.keste.schedule.model.ScheduleDto;
import com.keste.schedule.repository.ScheduleRepository;
import com.keste.schedule.service.ScheduleService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DefaultScheduleService implements ScheduleService {

  private final ScheduleRepository scheduleRepository;
  private final ScheduleMapper scheduleMapper;

  @Override
  public void saveSchedule(ScheduleDto schedule) {
    scheduleRepository.save(scheduleMapper.toEntity(schedule));
  }

  @Override
  public void updateSchedule(ScheduleDto schedule) {
    scheduleRepository.save(scheduleMapper.toEntity(schedule));
  }

  @Override
  public void deleteSchedule(ScheduleDto schedule) {
    scheduleRepository.delete(scheduleMapper.toEntity(schedule));
  }

  @Override
  public void saveSchedules(List<ScheduleDto> schedules) {
    scheduleRepository.saveAll(scheduleMapper.toEntityList(schedules));
  }

  @Override
  public ScheduleDto findScheduleById(Long id) {
    return scheduleMapper.toDto(scheduleRepository.findById(id)
        .orElseGet(Lesson::new));
  }

  @Override
  public List<ScheduleDto> findAllByUserId(Long userId) {
    return scheduleMapper.toDtoList(scheduleRepository.findAllByUserId(userId));
  }
}
