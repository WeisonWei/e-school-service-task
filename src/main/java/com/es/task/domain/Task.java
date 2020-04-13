package com.es.task.domain;

public interface Task<T extends Fact> {

    String getName();

    boolean evaluate(T fact);

    void doAction(T fact);

}
