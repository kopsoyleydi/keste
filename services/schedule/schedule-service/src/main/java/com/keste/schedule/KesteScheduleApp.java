package com.keste.schedule;

import com.keste.common.config.JacksonConfig;
import com.keste.schedule.config.ServiceConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({
    ServiceConfig.class,
    JacksonAutoConfiguration.class,
    JacksonConfig.class
})
public class KesteScheduleApp {

  public static void main(String[] args) {
    SpringApplication.run(KesteScheduleApp.class, args);
  }
}
