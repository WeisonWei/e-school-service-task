package com.es.task.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class TaskMessageHandler {

    @Autowired
    TaskService taskService;

    @StreamListener(value = Sink.INPUT, condition = "headers['type'] == 'Message'")
    public void processMessage(String message) {

    }

}
