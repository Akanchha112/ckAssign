package org.example;

import java.util.*;
import java.util.stream.*;

@FunctionalInterface
interface NumberRule {
    boolean apply(int n);
}



public class FunctionalInterfaceDemo {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(3, 10, 15, 8, 21, 14, 7,2);

        // lambda for even rule
        NumberRule isEven = (n) -> n % 2 == 0;

        // lambda for prime rule
        NumberRule isPrime = (n) -> {
            if (n <= 1) return false;
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) return false;
            }
            return true;
        };

        // stream pipeline
        List<Integer> result = nums.stream()
                .filter(n -> isEven.apply(n) && isPrime.apply(n))
                .map(n -> n * n)
                .collect(Collectors.toList());

        // get first value using Optional
        Optional<Integer> firstValue = result.stream().findFirst();

        if (firstValue.isPresent()) {
            System.out.println("First squared number: " + firstValue.get());
        } else {
            System.out.println("No matching number found");
        }
    }
}

