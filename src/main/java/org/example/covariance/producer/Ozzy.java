package org.example.covariance.producer;

import org.example.covariance.producible.Entertainment;
import org.example.covariance.producible.Metal;
import org.example.covariance.producible.Music;

public class Ozzy extends Musician {

    public Metal produce() {
        return new Metal();
    }
}
