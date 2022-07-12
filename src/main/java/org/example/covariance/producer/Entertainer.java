package org.example.covariance.producer;

import org.example.covariance.producible.Entertainment;

import java.util.List;

public class Entertainer<T> {

    List<? extends Entertainment<T>> products = List.of(new Entertainment<>());

    public Entertainment<T> produce() {
        return products.get(0);
    }
}
