package it.hervoda.multithreading.java.memory.model;

public class SharedSynchronizedCounter {

    private static   int  counter ;

    public static void  increment(){
        System.out.println("No need of locks ...");
        synchronized (SharedSynchronizedCounter.class){
            counter++;
        }

    }

    public  int getCounter(){
        return counter;
    }

}
