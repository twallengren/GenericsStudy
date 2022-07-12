package org.example.covariance.producer;

import org.example.covariance.producible.Entertainment;
import org.example.covariance.producible.Music;

public class Musician extends Entertainer {

    public Music produce() {
        return new Music();
    }
}
