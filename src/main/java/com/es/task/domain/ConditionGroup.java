package com.es.task.domain;

import lombok.Data;

import java.util.List;

@Data
public class ConditionGroup {

    List<Condition> conditions;

    public boolean satisfy(Fact fact) {
        boolean isSatisfy = conditions.stream()
                .allMatch(condition -> condition.satisfy(fact));
        return isSatisfy;
    }
}
