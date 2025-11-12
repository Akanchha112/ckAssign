package org.example.Thread;
class Shared {
    int num;
    boolean hasValue = false;

    synchronized void produce(int n) {
        while (hasValue) {  // if value not yet consumed, wait
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        num = n;
        System.out.println("Produced: " + num);
        hasValue = true;
        notify();  // wake up consumer
    }

    synchronized void consume() {
        while (!hasValue) {  // if no value produced, wait
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Consumed: " + num);
        hasValue = false;
        notify();  // wake up producer
    }
}

class Producer extends Thread {
    Shared s;

    Producer(Shared s) {
        this.s = s;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            s.produce(i);
        }
    }
}

class Consumer extends Thread {
    Shared s;

    Consumer(Shared s) {
        this.s = s;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            s.consume();
        }
    }
}

public class ProducerConsumerExample {
    public static void main(String[] args) {
        Shared obj = new Shared();
        Producer p = new Producer(obj);
        Consumer c = new Consumer(obj);

        p.start();
        c.start();
    }
}
