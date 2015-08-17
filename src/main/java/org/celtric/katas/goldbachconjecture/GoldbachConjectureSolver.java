package org.celtric.katas.goldbachconjecture;

import java.util.ArrayList;
import java.util.List;

public class GoldbachConjectureSolver {

    private static final int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};

    public int[] partitionOf(int ofNumber) {
        List<Integer> primesInContext = new ArrayList<>();
        int lastPrimeAdded;
        int lastPrimeIndex = -1;

        while (true) {
            lastPrimeAdded = nextPrime(++lastPrimeIndex);
            primesInContext.add(lastPrimeAdded);

            for (int current : primesInContext) {
                if ((current + lastPrimeAdded) == ofNumber) {
                    return new int[]{current, lastPrimeAdded};
                }
            }
        }
    }

    private int nextPrime(int index) {
        return primes[index];
    }
}
