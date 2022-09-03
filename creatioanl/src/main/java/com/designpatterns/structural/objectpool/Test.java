package com.designpatterns.structural.objectpool;

public class Test {

    private static final ObjectPool<Bitmap> pool = new ObjectPool<>(() -> new Bitmap());

    public static void main(String[] args) {
        Bitmap obj1 = pool.get();
        Bitmap obj2 = pool.get();
        Bitmap obj3 = pool.get();
        Bitmap obj4 = pool.get();
        Bitmap obj5 = pool.get();
        //Bitmap obj6 = pool.get(); here program will wait forever because pool size is 5, and no object released yet.

        obj1.draw();
        obj2.draw();
        obj3.draw();
        obj4.draw();
        obj5.draw();

        pool.release(obj1); // now there is a one available object in the queue.

        Bitmap obj6 = pool.get(); // it will reuse the obj1.
        obj6.draw();

    }

}
