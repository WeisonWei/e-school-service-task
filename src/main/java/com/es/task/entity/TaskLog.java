package com.es.task.entity;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;


@ApiModel(description = "用户交易")
@Table(name = "t_TaskLog", indexes = @Index(name = "idx_userId_taskId", columnList = "userId,taskId"))
@Entity
@Data
@DynamicInsert(true)
@DynamicUpdate(true)
@Accessors(chain = true)
@ToString(callSuper = true)
public class TaskLog extends BaseEntity {


}
