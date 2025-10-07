package com.keste.schedule.repository;

import com.keste.schedule.model.Lesson;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScheduleRepository extends JpaRepository<Lesson, Long> {

  List<Lesson> findAllByUserId(Long userId);
}
