package org.example.musicstore;

import org.example.musicstore.consumer.Consumer;
import org.example.musicstore.producer.Producer;
import org.example.musicstore.product.Product;
import org.example.musicstore.product.instrument.guitar.YamahaRevstarStandardRSS20;

import java.util.ArrayList;
import java.util.List;

public class MusicStore {

    List<Product> inventory = new ArrayList<>();

    public void addToInventory(Producer<? extends Product> producer) {
        inventory.addAll(producer.produce());
    }

    public void purchaseYamahaRevstarStandardRSS20(Consumer<? super YamahaRevstarStandardRSS20> consumer) {
        inventory.stream()
                .filter(product -> product instanceof YamahaRevstarStandardRSS20)
                .map(product -> (YamahaRevstarStandardRSS20) product)
                .forEach(product -> consumer.consume(List.of(product)));
    }
}
