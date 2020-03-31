package com.es.task;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CommonTest {

    @Test
    public void test() {

        List<Object> objects = Arrays.asList(null);
        Stream<Object> stream = objects.stream();
        System.out.println();
    }
}
