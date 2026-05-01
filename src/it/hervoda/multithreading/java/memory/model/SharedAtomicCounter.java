package it.hervoda.multithreading.java.memory.model;

import java.util.concurrent.atomic.AtomicInteger;

public class SharedAtomicCounter {

    private final AtomicInteger counter = new AtomicInteger(0);

    public synchronized void increment(){
        counter.incrementAndGet();
    }

    public AtomicInteger getCounter() {
        return counter;
    }
}
