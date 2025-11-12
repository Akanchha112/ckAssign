package org.example.Thread;

public class ThreadRunnable implements Runnable{
    @Override
    public void run(){
        System.out.println("Thread is called");
    }

    public static void main(String[] args) {
        ThreadRunnable demo=new ThreadRunnable();
//        new Thread(new ThreadRunnable()).start();
        Thread t = new Thread(demo);
//        demo.start();
        t.start();
    }
}
