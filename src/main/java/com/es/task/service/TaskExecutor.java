package com.es.task.service;

import com.es.task.domain.ExecuteResult;
import com.es.task.domain.Task;

public interface TaskExecutor {

    ExecuteResult execute(Task task);

}
