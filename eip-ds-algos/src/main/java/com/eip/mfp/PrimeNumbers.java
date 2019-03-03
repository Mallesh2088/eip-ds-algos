package com.eip.mfp;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {

    // runtime O(n)
    private static boolean isPrime(int number) {
        boolean isprime = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isprime = false;
            }
        }
        return isprime;
    }

    // optimized based on number property
    // that if we have any number that divides n with in root n, then n is not prime
    // else n is prime
    // runtime o(sqrt(n))
    private static boolean isPrimeOpt(int number) {
        boolean isPrime = true;
        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }
        return isPrime;
    }

    // runtime o(n . sqrt(n))
    private static List findAllPrimes(int number) {
        List<Integer> primeNumbers = new ArrayList();
        for (int i = 2; i <= number; i++) {
            if (isPrimeOpt(i)) {
                primeNumbers.add(i);
            }
        }
        return primeNumbers;
    }

    // This method is using sieve of eratosthenes algorithm to find primes
    private static int[] findAllPrimesSOE(int number) {
        int[] primeNumbers = new int[number + 1];
        for (int i = 2; i <= number; i++) {
            primeNumbers[i] = 1;
        }

        for (int i = 2; i <= number; i++) {
            if (isPrimeOpt(i) && primeNumbers[i] == 1) {
                for (int j = 2; i * j < number; j++) {
                    primeNumbers[i * j] = 0;
                }
            }
        }
        return primeNumbers;
    }

    public static void main(String args[]) {
        int[] primes = findAllPrimesSOE(100);
        for (int i = 0; i <= primes.length - 1; i++) {
            if (primes[i] == 1) {
                System.out.println(i);
            }
        }
    }
}