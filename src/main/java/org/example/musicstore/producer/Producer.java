package org.example.musicstore.producer;

import org.example.musicstore.product.Product;

import java.util.List;

public interface Producer<T extends Product> {

    List<T> produce();
}
