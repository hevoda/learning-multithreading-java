package it.hervoda.multithreading.java.memory.model;

public class Synchronized {

    public static void main(String[] args) {


        SharedSynchronizedCounter sharedSynchronizedCounter = new SharedSynchronizedCounter();

        new Thread(()->{
            System.out.println("Thread 1 started ...");
            System.out.println("Thread 1 : "+ sharedSynchronizedCounter.getCounter());
            for(int i=0; i<50000; i++){
                SharedSynchronizedCounter.increment();
            }
            System.out.println("Final count  in  Thread 1: "+ sharedSynchronizedCounter.getCounter());
            System.out.println("Thread 1  ended ...");
        }).start();

        new Thread(()->{
            System.out.println("Thread 2 started ...");
            System.out.println("Thread 2: "+ sharedSynchronizedCounter.getCounter());
            for(int i=0; i<50000; i++){
                SharedSynchronizedCounter.increment();
            }
            System.out.println("Final count  in  Thread 2: "+ sharedSynchronizedCounter.getCounter());
            System.out.println("Thread 2 ended ...");
        }).start();


    }
}
