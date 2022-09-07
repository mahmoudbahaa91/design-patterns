package com.designpatterns.creational.objectpool;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.function.Supplier;

/**
 * This class represents a cache of objects, it is a fixed size pool, it doesn't create a new object if the queue is empty.
 * therefore objects must be released after usage.
 *
 * @param <T>
 */
public class ObjectPool<T extends Poolable> {

    private BlockingQueue<T> pool;

    public ObjectPool(Supplier<T> creator) {
        pool = new LinkedBlockingQueue<>();

        //create some objects for testing.
        for (int i = 0; i < 5; i++) {
            pool.offer(creator.get()); //offer: insert without waiting
        }
    }

    // get will wait if no objects are available in the pool.
    public T get() {
        try {
            return pool.take();
        } catch (InterruptedException ex) {
            System.out.println("take has been interrupted while waiting");
        }
        return null;
    }

    public void release(T obj) {
        obj.reset();
        try {
            pool.put(obj); //put: insert but wait until there is a space.
        } catch (InterruptedException ex) {
            System.out.println("take has been interrupted while waiting");
        }
    }

}
