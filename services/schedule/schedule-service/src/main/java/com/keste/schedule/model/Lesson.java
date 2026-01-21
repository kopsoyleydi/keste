package com.keste.schedule.model;

import com.keste.common.model.WeekDays;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "lesson")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Lesson {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private Long userId;

  @ManyToOne
  private Subject subject;

  private String audienceNumber;

  private Integer floor;

  private LocalDateTime startTime;

  private LocalDateTime endTime;

  private WeekDays dayOfWeek;

  private LocalDateTime created;

  private LocalDateTime updated;
}
