package com.keste.schedule.mapper;

import com.keste.schedule.model.Lesson;
import com.keste.schedule.model.dictiniory.ScheduleDto;
import java.util.List;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ScheduleMapper {

  ScheduleDto toDto(Lesson lesson);

  Lesson toEntity(ScheduleDto dto);

  List<ScheduleDto> toDtoList(List<Lesson> lessons);

  List<Lesson> toEntityList(List<ScheduleDto> dtos);
}
