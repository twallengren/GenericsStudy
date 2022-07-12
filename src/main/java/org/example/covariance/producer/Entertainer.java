package org.example.covariance.producer;

import org.example.covariance.producible.Entertainment;

public class Entertainer {

    public Entertainment produce() {
        return new Entertainment();
    }
}
