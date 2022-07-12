package org.example.covariance.producer;

import org.example.covariance.producible.Entertainment;
import org.example.covariance.producible.Music;

public class Musician<T extends Music<T>> extends Entertainer<Music<T>> {

    public Entertainment<Music<T>> produce() {
        return new Music<>();
    }
}
