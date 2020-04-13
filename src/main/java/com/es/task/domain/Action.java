package com.es.task.domain;

public interface Action<T extends Fact> {

    void doAction(T fact);

}
