package com.es.task.domain;

public interface Condition {

    boolean satisfy(Fact fact);

    void reverse();
}
