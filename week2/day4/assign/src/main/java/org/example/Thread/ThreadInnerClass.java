package org.example.Thread;

public class ThreadInnerClass {
    public static void main(String[] args) {
        Thread t=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread is running");
            }
        });
        t.start();
    }
}
