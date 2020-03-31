package com.es.task.entity;

import com.es.task.repository.TaskAuditListener;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.experimental.Accessors;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;


@ApiModel(description = "任务")
@Table(name = "t_task", indexes = @Index(name = "idx_tag", columnList = "tag"))
@Data
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@DynamicUpdate(true)
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
@EntityListeners({AuditingEntityListener.class, TaskAuditListener.class})
public class Task extends BaseEntity {
    @ApiModelProperty("任务名称")
    @Column(name = "name", nullable = true, columnDefinition = BaseEntity.VARCHAR_DEFAULT_0)
    private String name = null;

    @ApiModelProperty("任务描述")
    @Column(name = "describe", nullable = true, columnDefinition = BaseEntity.VARCHAR_DEFAULT_0)
    private String describe = null;

    @ApiModelProperty("任务类型")
    @Column(name = "type", nullable = true, columnDefinition = BaseEntity.INT_DEFAULT_0)
    private Type type = null;

    @ApiModelProperty("任务标签")
    @Column(name = "tag", nullable = true, columnDefinition = BaseEntity.INT_DEFAULT_0)
    private Tag tag = null;

    @ApiModelProperty("任务状态")
    @Column(name = "status", nullable = true, columnDefinition = BaseEntity.INT_DEFAULT_0)
    private STATUS status = null;

    @ApiModelProperty("备注")
    @Column(name = "remark", nullable = true, columnDefinition = BaseEntity.VARCHAR_DEFAULT_0)
    private String remark = null;

    @ApiModel(description = "任务类型")
    public enum Type {
        /**
         * 默认
         */
        DEFAULT,
        /**
         * 购买
         */
        BUY,
        /**
         * 签到打卡
         */
        SIGN
    }

    @ApiModel(description = "任务标签")
    public enum Tag {
        /**
         * 默认
         */
        DEFAULT,
        /**
         * 签到
         */
        SIGN,
        /**
         * 购买
         */
        BUY
    }
}
