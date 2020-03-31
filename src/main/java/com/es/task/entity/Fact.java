package com.es.task.entity;

import com.es.task.repository.TaskAuditListener;
import io.swagger.annotations.ApiModel;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Index;
import javax.persistence.Table;


@ApiModel(description = "用户账户")
@Table(name = "t_fact", indexes = @Index(name = "idx_user_id_account_type", columnList = "user_id,account_type"))
@Data
@ToString
@Builder
@Entity
@DynamicUpdate(true)
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
@EntityListeners({AuditingEntityListener.class, TaskAuditListener.class})
public class Fact extends BaseEntity {



}
