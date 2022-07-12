package org.example.contravariance.consumer;

import org.example.contravariance.consumable.Carrot;

import java.util.ArrayList;
import java.util.List;

public class CarrotConsumer {

    List<Carrot> carrotsConsumed = new ArrayList<>();

    public void consume(Carrot carrot) {
        carrotsConsumed.add(carrot);
    }
}
