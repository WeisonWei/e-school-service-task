package com.es.task.domain;

import lombok.Data;

@Data
public abstract class SingleKeyCondition implements Condition {

    private String key;

    private boolean isReverse = false;

    @Override
    public void reverse() {
        setReverse(true);
    }
}
