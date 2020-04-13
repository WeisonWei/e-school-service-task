package com.es.task.entity;

import com.es.task.domain.Fact;
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
@Table(name = "t_action", indexes = @Index(name = "idx_userId_account_type", columnList = "userId,account_type"))
@Entity
@Data
@DynamicInsert(true)
@DynamicUpdate(true)
@Accessors(chain = true)
@ToString(callSuper = true)
public class Action extends BaseEntity implements com.es.task.domain.Action {

    @ApiModelProperty("行为名称")
    @Column(name = "name", nullable = true, columnDefinition = BaseEntity.VARCHAR_DEFAULT_0)
    private String name = null;

    @ApiModelProperty("行为类型")
    @Column(name = "type", nullable = true, columnDefinition = BaseEntity.INT_DEFAULT_0)
    private TYPE type = null;

    @Override
    public void doAction(Fact fact) {
        Object type = fact.getFact("type");
        Object amount = fact.getFact("amount");

    }

    enum TYPE {
        NONE,
        ACCOUNT;
    }
}
