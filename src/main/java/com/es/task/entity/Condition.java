package com.es.task.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;


@ApiModel(description = "用户交易")
@Table(name = "t_condition", indexes = @Index(name = "idx_key", columnList = "key"))
@Entity
@Data
@DynamicInsert(true)
@DynamicUpdate(true)
@Accessors(chain = true)
@ToString(callSuper = true)
public class Condition extends BaseEntity {

    @ApiModelProperty("条件名")
    @Column(name = "name", nullable = true, columnDefinition = BaseEntity.VARCHAR_DEFAULT_0)
    private String name = null;

    @ApiModelProperty("关键字")
    @Column(name = "key", nullable = true, columnDefinition = BaseEntity.VARCHAR_DEFAULT_0)
    private String key = null;

    @ApiModelProperty("值")
    @Column(name = "value", nullable = true, columnDefinition = BaseEntity.VARCHAR_DEFAULT_0)
    private String value = null;

    @ApiModelProperty("是否反转")
    @Column(name = "is_reverse", nullable = true, columnDefinition = BaseEntity.INT_DEFAULT_0)
    private boolean isReverse = false;

    @ApiModelProperty("备注")
    @Column(name = "remark", nullable = true, columnDefinition = BaseEntity.VARCHAR_DEFAULT_0)
    private String remark = null;

}
