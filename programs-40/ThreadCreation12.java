package com.shivangani;
//method 1: By extending Thread Class
public class ThreadCreation12 extends Thread{
    public void run() {
        System.out.println("thread is running...");

    }

    public static void main(String args[]){
        Thread2 m1=new Thread2();
        Thread t1 =new Thread(m1);   // Using the constructor Thread(Runnable r)
        t1.start();
    }

}
// methd 2 : By implementing Runnable Interface
class Thread2 implements Runnable{
    public void run(){
        System.out.println("thread is running...");
    }
}