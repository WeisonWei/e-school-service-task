package com.es.task.controller;


import com.es.task.entity.Task;
import com.es.task.service.TaskService;
import org.jsondoc.core.annotation.Api;
import org.jsondoc.core.annotation.ApiMethod;
import org.jsondoc.core.annotation.ApiQueryParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Api(name = "TaskController", description = "账户控制器")
public class TaskController {

    @Autowired
    private TaskService TaskService;

    @ApiMethod(description = "获取用户账户信息")
    @GetMapping("/Tasks/{userId}")
    public ResponseEntity<Task> getTask(
            @ApiQueryParam(name = "userId", description = "用户id")
            @PathVariable Long userId,
            @ApiQueryParam(name = "TaskType", description = "账户类型")
            @RequestParam Task TaskType) {
        return null;
    }

    @ApiMethod(description = "获取账户列表")
    @GetMapping("/Tasks/{page}")
    public ResponseEntity<Page<Task>> getTasks(
            @ApiQueryParam(name = "TaskType", description = "账户类型")
            @RequestParam Task TaskType,
            @ApiQueryParam(name = "page", description = "分页页码")
            @PathVariable Integer page) {
        return null;
    }

}
