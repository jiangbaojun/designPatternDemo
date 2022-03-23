package com.test;

class T1 extends Thread {

    public int processingCount = 0;

    T1(int processingCount) {
        this.processingCount = processingCount;
        System.out.println("Thread Created");
    }


    @Override
    public void run() {
        System.out.println("Thread " + this.getName() + " started");
        while (processingCount > 0) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread " + this.getName() + " interrupted");
            }
            processingCount--;
        }

        System.out.println("Thread " + this.getName() + " exiting");
    }
}
public class SampleThread {
    public static void main(String[] args) throws InterruptedException {
        Thread t2 = new T1(3);
        t2.start();
        System.out.println("Invoking join");
        t2.join();
        System.out.println("end from join");
        System.out.println(t2.isAlive());
    }
}