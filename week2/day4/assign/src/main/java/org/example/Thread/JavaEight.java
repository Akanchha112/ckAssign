package org.example.Thread;

import java.util.*;
import java.util.stream.*;

@FunctionalInterface
interface NumberRule {
    boolean apply(int n);
}

public class JavaEight {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(3, 10, 15, 8, 21, 14, 7);

        // Lambda rules
        NumberRule isEven = n -> n % 2 == 0;

        NumberRule isPrime = n -> {
            if (n < 2) return false;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) return false;
            }
            return true;
        };

        // Stream operations
        List<Integer> result = nums.stream()
                .filter(n -> isEven.apply(n) && isPrime.apply(n))
                .map(n -> n * n)
                .collect(Collectors.toList());

        // Optional handling
        Optional<Integer> firstSquare = result.stream().findFirst();

        firstSquare.ifPresentOrElse(
                val -> System.out.println("First squared number: " + val),
                () -> System.out.println("No matching number found")
        );
    }
}
