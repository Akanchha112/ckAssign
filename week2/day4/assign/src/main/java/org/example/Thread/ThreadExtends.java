package org.example.Thread;

public class ThreadExtends implements Runnable{
    static Object lock=new Object();
    @Override
    public void run(){
        System.out.println("Run is called");
        for(int i=0;i<5;i++){
            producer(lock);
        }
        for(int i=0;i<5;i++){
            consumer(lock);
        }
    }

    int count=0;
    void producer(Object lock){
        synchronized (lock){
            count++;
            System.out.println("Producer: "+count);
            lock.notify();

        }
    }
    void consumer(Object lock){
        synchronized (lock){
            while(count<=0){
                try{
                    lock.wait();
                }catch (Exception e){
                    System.out.println(e.getMessage());
                }

            }
            count--;

            System.out.println("Producer: "+count);
        }
    }

    public static void main(String[] args) {
        ThreadExtends demo=new ThreadExtends();
        Thread t1=new Thread(demo);
        Thread t2=new Thread(demo);

        t1.start();
        t2.start();


    }
}
