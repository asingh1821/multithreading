package org.multithreading.practice.interrupted;

public class Test extends Thread{

    public void run(){
        try {
            System.out.println(Thread.currentThread().getName());
            for (int i=1; i<=5; i++){
                System.out.println(i);
                Thread.sleep(1000);
            }
        }catch (Exception e){
            System.out.println("Thread Interrupted "+ e);
        }
    }
    public static void main(String[] args){
        System.out.println(Thread.currentThread().getName());
        Test t = new Test();
        t.start();
        t.interrupt();
    }
}
