package it.hervoda.multithreading.thread.creation;


public class CreateThreadFirstExample {

    public static Object sharedObject = new Object();

    public static void main(String[] args) {

        System.out.println("Main Thread started!");

        Runnable objRunnable1 = () -> {
            System.out.println("Thread 1 started");
            runningTask();
            System.out.println("Thread 1 completed");

        };

        Runnable objRunnable2 = () -> {
            System.out.println("Thread 2 started");
            runningTask();
            System.out.println("Thread 2 completed");

        };

        Thread objThread1 = new Thread(objRunnable1 , "Runnable Thread 1");
        objThread1.start();

        Thread objThread2 = new Thread(objRunnable2 , "Runnable Thread 2");
        //objThread2.setDaemon(true);
        objThread2.start();

        System.out.println("Main Thread ended!");

    }

    private static void runningTask() {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getState());
        System.out.println(sharedObject.hashCode());
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            throw  new RuntimeException(e);
        }
    }
}
