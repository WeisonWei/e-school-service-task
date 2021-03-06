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


@ApiModel(description = "条件规则表")
@Table(name = "t_rule", indexes = @Index(name = "idx_taskId", columnList = "taskId"))
@Entity
@Data
@DynamicInsert(true)
@DynamicUpdate(true)
@Accessors(chain = true)
@ToString(callSuper = true)
public class Rule extends BaseEntity {

    private String ruleName;
    private Long taskId;
    private Long conditionId;


}
