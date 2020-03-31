package com.es.task.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class TaskConfig {

    @Value("${url:www.baidu.com}")
    private String url;

}
