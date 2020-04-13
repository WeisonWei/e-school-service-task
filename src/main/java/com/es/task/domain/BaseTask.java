package com.es.task.domain;

import lombok.Data;

@Data
public class BaseTask<T extends Fact> implements Task<T> {

    private String name;

    private ConditionGroup conditionGroup;

    private Action<T> action;

    @Override
    public boolean evaluate(T fact) {
        return conditionGroup.satisfy(fact);
    }

    @Override
    public void doAction(T fact) {

    }
}
