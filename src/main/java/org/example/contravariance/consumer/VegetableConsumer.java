package org.example.contravariance.consumer;

import org.example.contravariance.consumable.Vegetable;

import java.util.ArrayList;
import java.util.List;

public class VegetableConsumer<T> extends CarrotConsumer {

    List<Vegetable<?>> vegetablesConsumed = new ArrayList<>();

    public void consume(Vegetable<T> vegetable) {
        vegetablesConsumed.add(vegetable);
    }
}
