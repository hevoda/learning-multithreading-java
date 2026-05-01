package it.hervoda.multithreading.java.memory.model;


public class Atomic {

    public static void main(String[] args) {


        SharedAtomicCounter sharedAtomicCounter = new SharedAtomicCounter();

        new Thread(()->{
            System.out.println("Thread 1 started ...");
            System.out.println("Thread 1 : "+ sharedAtomicCounter.getCounter());
            for(int i=0; i<50000; i++){
                sharedAtomicCounter.increment();
            }
            System.out.println("Final count  in  Thread 1: "+ sharedAtomicCounter.getCounter());
            System.out.println("Thread 1  ended ...");
        }).start();

        new Thread(()->{
            System.out.println("Thread 2 started ...");
            System.out.println("Thread 2: "+ sharedAtomicCounter.getCounter());
            for(int i=0; i<50000; i++){
                sharedAtomicCounter.increment();
            }
            System.out.println("Final count  in  Thread 2: "+ sharedAtomicCounter.getCounter());
            System.out.println("Thread 2 ended ...");
        }).start();


    }
}
