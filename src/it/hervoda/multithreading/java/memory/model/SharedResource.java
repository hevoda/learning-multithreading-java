package it.hervoda.multithreading.java.memory.model;

public class SharedResource {

    private  volatile boolean flag = false;

    private  int counter;

    public void increment(){
        counter++;
    }

    public int getCounter() {
        return counter;
    }

    public  boolean isFlag() {
        return flag;
    }

    public  void setFlag(boolean flag) {
        this.flag = flag;
    }

}
