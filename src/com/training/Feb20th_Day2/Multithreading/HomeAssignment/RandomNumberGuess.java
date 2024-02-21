package com.training.Feb20th_Day2.Multithreading.HomeAssignment;

import java.util.Random;

public class RandomNumberGuess {

    private static final int MAX_ATTEMPTS = 1000;

    public static void main(String[] args) {
        Random random = new Random();
        int targetNumber = random.nextInt(9) + 1;
        System.out.println("The target number is: " + targetNumber);

        Counter counter = new Counter();
        for (int i = 0; i < 10; i++) {
            new Thread(new NumberGuessTask(targetNumber, counter)).start();
        }
    }

    static class Counter {
        private int count;

        public synchronized void increment() {
            count++;
        }

        public int getCount() {
            return count;
        }
    }

    static class NumberGuessTask implements Runnable {
        private final int targetNumber;
        private final Counter counter;

        public NumberGuessTask(int targetNumber, Counter counter) {
            this.targetNumber = targetNumber;
            this.counter = counter;
        }

        @Override
        public void run() {
            Random random = new Random();
            int attempts = 0;
            int guess;
            do {
                guess = random.nextInt(9) + 1;
                attempts++;
            } while (guess != targetNumber && attempts < MAX_ATTEMPTS);

            if (guess == targetNumber) {
                System.out.println("Thread " + Thread.currentThread().getName() + " guessed the correct number in " + attempts + " attempts.");
                counter.increment();
            } else {
                System.out.println("Thread " + Thread.currentThread().getName() + " reached maximum attempts without guessing the correct number.");
            }

            System.out.println("Total attempts for correct guess so far: " + counter.getCount());
        }
    }
}
