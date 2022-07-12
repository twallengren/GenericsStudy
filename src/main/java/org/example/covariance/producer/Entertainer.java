package org.example.covariance.producer;

import org.example.covariance.producible.Entertainment;

public class Entertainer<T extends Entertainment<T>> {

    public Entertainment<T> produce() {
        return new Entertainment<>();
    }
}
