package org.example.Thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableThread implements Callable<Integer> {
    int n;
    CallableThread(int n) {
        this.n = n;
    }
    @Override
    public Integer call() throws Exception{
        System.out.println(n);
        return n/2;
    }

    public static void main(String[] args) {
        ExecutorService executorService= Executors.newFixedThreadPool(1);
        CallableThread call1=new CallableThread(10);
        Future<Integer> f1=executorService.submit(call1);
        try{
            System.out.println("REsult: "+f1.get());
        }catch (Exception e){
            System.out.println("Exception: "+e.getMessage());
        }
        executorService.shutdown();
    }
}
