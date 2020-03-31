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
@Table(name = "t_condition", indexes = @Index(name = "idx_userId_account_type", columnList = "userId,account_type"))
@Entity
@Data
@DynamicInsert(true)
@DynamicUpdate(true)
@Accessors(chain = true)
@ToString(callSuper = true)
public class Condition extends BaseEntity {

    @ApiModelProperty("描表达式")
    @Column(name = "expression", nullable = true, columnDefinition = BaseEntity.VARCHAR_DEFAULT_0)
    private String expression = null;

    @ApiModelProperty("备注")
    @Column(name = "remark", nullable = true, columnDefinition = BaseEntity.VARCHAR_DEFAULT_0)
    private String remark = null;

}
