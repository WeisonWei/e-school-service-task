package com.es.task.repository;

import com.es.task.entity.TaskLog;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskLogRepository extends org.springframework.data.repository.CrudRepository<TaskLog, Long> {

    List<TaskLog> findAllByUserId(long userId);
}
