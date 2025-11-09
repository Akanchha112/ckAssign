package org.example;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Q1. What is the Java Collections Framework? Explain its advantages.
//        A ready made set of data structures(like dynamic arrays, linked lists, hash tables, sets and maps) that help programmers store, search, and organize data easily.
//        In other words it is a set of classes and intergace that are designed to store and manage data efficiently in different ways like list, set map, Arraylist.


//        Q2. List the differences between Vector, ArrayList, LinkedList, and HashSet.
//            Vector- Stores same types of data in continuous maaner that makes retrieval and addition very time efficient.
//                It is synchronised meaning the retrival and addition is synchronised which let only one read or write operation at a time. which makes it slower Arraylist.
//          Arraylist- Same as Vector but its not synchronized which makes it faster than vector.
//                It is preferred nowdays mostly.
//          LinkedList- Stores data in the format of nodes. Each node has data and a link which stores address of next or previous node. It is slower to access elements since for each element you need to go through each element to access it.
//          HashSet- It is a collection that stores unique elements. It doesn't store element in order.


//        3. Find the First Non-Repeating Character
        String str = "abacddebeck";
        char[] arr = str.toCharArray();

        // Using LinkedHashMap to maintain insertion order
        Map<Character, Integer> map = new LinkedHashMap<>();

        // Count frequency of each character
        for (char c : arr) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        boolean flag=false;
        // Find first character with frequency = 1
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                flag=true;
                System.out.println("First non-repeating character: " + entry.getKey());
                break;
            }
        }
        if(!flag){
            System.out.println("No non-repeating character found.");
        }



//        4. Given an array of integers and a target sum, return the indices of the two numbers that add up to the target
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        Map<Integer, Integer> numMap = new HashMap<>();
        boolean found = false;

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                System.out.println("Indices of numbers that add up to " + target + " are: " +
                        numMap.get(complement) + " and " + i);
                found = true;
                break;
            }
            numMap.put(nums[i], i);
        }
        if (!found) {
            System.out.println("No pair found for the given target.");
        }


//        5. You are given two sorted ArrayLists<Integer>. Merge them into a single sorted list.
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 3, 5, 7));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(2, 4, 6, 8));

        ArrayList<Integer> mergedList = new ArrayList<>(list1);
        mergedList.addAll(list2);
        Collections.sort(mergedList);

        System.out.println("Merged Sorted List: " + mergedList);


//        6. Write a Java program with two threads: Thread 1 prints table of number 2. Thread 2 prints table of number 4.
//        Threads should be synced to print output one by one.
        System.out.println("\nQ6. Thread Synchronization Example:");

        final Object lock = new Object();

        Thread t1 = new Thread(() -> {
            synchronized (lock) {
                for (int i = 1; i <= 10; i++) {
                    System.out.println("2 x " + i + " = " + (2 * i));
                    lock.notify();
                    try { lock.wait(); } catch (InterruptedException e) { e.printStackTrace(); }
                }
                lock.notify();
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (lock) {
                for (int i = 1; i <= 10; i++) {
                    System.out.println("4 x " + i + " = " + (4 * i));
                    lock.notify();
                    try { lock.wait(); } catch (InterruptedException e) { e.printStackTrace(); }
                }
                lock.notify();
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }




//        7. Write above program using ExecutorService
        System.out.println("\nQ7. Using ExecutorService:");

        ExecutorService executor = Executors.newFixedThreadPool(2);

        Runnable table2 = () -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println("2 x " + i + " = " + (2 * i));
                try { Thread.sleep(100); } catch (InterruptedException e) { e.printStackTrace(); }
            }
        };

        Runnable table4 = () -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println("4 x " + i + " = " + (4 * i));
                try { Thread.sleep(100); } catch (InterruptedException e) { e.printStackTrace(); }
            }
        };

        executor.execute(table2);
        executor.execute(table4);
        executor.shutdown();

    }
}