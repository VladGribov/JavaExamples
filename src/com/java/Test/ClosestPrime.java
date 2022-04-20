package com.java.Test;

public class ClosestPrime {
    static int closestPrime(int n) {
        int closest = 0;
        //return 1 if n <= 1
        if (n <= 1) {
            return 1;
        }

        //check if n is prime
        boolean nPrime = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                //nPrime = false if n % i ==0
                nPrime = false;
                break;
            }
        }
        //if nPrime is true return n
        if (nPrime) {
            return n;
        }

        //check lower prime
        int lowerP = -1;
        for (int i = n - 1; i >= 3; i--) {
            //check if i is prime
            boolean lPrime = true;
            for (int x = 2; x < i; x++) {
                if (i % x == 0) {
                    lPrime = false;
                    break;
                }
            }
            if (lPrime) {
                lowerP = i;
                break;
            }
        }

        //check upper prime
        int upperP = Integer.MAX_VALUE; //2147483647 is a prime number but upperP can be anything here.
        for (int i = n + 1; i < Integer.MAX_VALUE; i++) {
            //check if i is prime
            boolean uPrime = true;
            for (int x = 2; x < i; x++) {
                if (i % x == 0) {
                    uPrime = false;
                    break;
                }
            }
            if (uPrime) {
                upperP = i;
                break;
            }
        }
        //Math.abs() is the absolute value which is always even
        int diffL = Math.abs(n - lowerP);
        int diffU = Math.abs(n - upperP);
        if (diffL > diffU) {
            closest = upperP;
        } else if (diffL < diffU) {
            closest = lowerP;
        } else if (lowerP == -1) {
            closest = upperP;
        } else { //upperP == lowerP
            System.out.println(n + " is the same distance away from " + lowerP + " and " + upperP);
            closest = upperP; //returns the higher value
        }
        return closest;
    }

    //main
    public static void main(String[] args) {
        System.out.println(closestPrime(278355));
        System.out.println(closestPrime(12345124));
        System.out.println(closestPrime(-100));
        System.out.println(closestPrime(Integer.MAX_VALUE));
    }
}

