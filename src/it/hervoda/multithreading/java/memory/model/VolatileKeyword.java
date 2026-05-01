package it.hervoda.multithreading.java.memory.model;

public class VolatileKeyword {

    public static void main(String[] args) {

        SharedResource sharedObject = new SharedResource();

        new Thread (() ->{
            System.out.println("Thread 1 started ...");
            try {
                System.out.println("Thread 1 logic started ...");
                Thread.sleep(1000);
                System.out.println("Thread 1 logic ended ...");
                sharedObject.setFlag(true);
                System.out.println("Flag set by thread 1 : "+sharedObject.isFlag());
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }).start();

        new Thread (() ->{
            System.out.println("Thread 2 started ...");
            while(!sharedObject.isFlag()){
                System.out.println("Shared object value in Thread 2 : "+sharedObject.isFlag());
            }
            System.out.println("Thread 2 logic ended : " +sharedObject.isFlag());
        }).start();
    }
}
