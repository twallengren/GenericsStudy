package org.example.contravariance.consumer;

import org.example.contravariance.consumable.EnergySource;

import java.util.ArrayList;
import java.util.List;

public class EnergyConsumer extends VegetableConsumer {

    List<EnergySource<?>> sourcesConsumed = new ArrayList<>();

    public void consume(EnergySource<?> energySource) {
        sourcesConsumed.add(energySource);
    }
}
