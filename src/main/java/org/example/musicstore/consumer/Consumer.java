package org.example.musicstore.consumer;

import java.util.List;

public interface Consumer<T> {

    void consume(List<T> products);
}
