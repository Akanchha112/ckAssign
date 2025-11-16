package org.example;

class SharedBuffer {
    private int[] arr = new int[5];
    private int count = 0;

    public synchronized void produce(int x) {
        while (count == 5) {
            try {
                wait();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        arr[count] = x;
        count++;
        notify();
    }

    public synchronized int consume() {
        while (count == 0) {
            try {
                wait();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        count--;
        int val = arr[count];
        notify();
        return val;
    }
}

class Producer extends Thread {
    SharedBuffer buf;

    Producer(SharedBuffer b) {
        this.buf = b;
    }

    public void run() {
        for (int i = 1; i <= 50; i++) {
            buf.produce(i);
            System.out.println("Produced: " + i);
            try {
                Thread.sleep(50);
            } catch (Exception e) {}
        }
    }
}

class Consumer extends Thread {
    SharedBuffer buf;

    Consumer(SharedBuffer b) {
        this.buf = b;
    }

    public void run() {
        for (int i = 1; i <= 50; i++) {
            int x = buf.consume();
            System.out.println("Consumed: " + x);
            try {
                Thread.sleep(70);
            } catch (Exception e) {}
        }
    }
}

public class Main {
    public static void main(String[] args) {
        SharedBuffer sb = new SharedBuffer();
        Producer p = new Producer(sb);
        Consumer c = new Consumer(sb);

        p.start();
        c.start();
    }
}
