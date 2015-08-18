package org.celtric.katas.goldbachconjecture;

import org.junit.Test;

import static org.junit.Assert.*;

public class GoldbachConjectureSolverTest {

    @Test
    public void input_of_4_returns_2_and_2() {
        assertPartitionOf(4).is(2, 2);
    }

    @Test
    public void input_of_6_returns_3_and_3() {
        assertPartitionOf(6).is(3, 3);
    }

    @Test
    public void input_of_8_returns_3_and_5() {
        assertPartitionOf(8).is(3, 5);
    }

    @Test
    public void input_of_10_returns_5_and_5() {
        assertPartitionOf(10).is(5, 5);
    }

    @Test
    public void input_of_12_returns_5_and_7() {
        assertPartitionOf(12).is(5, 7);
    }

    @Test
    public void input_of_100_returns_47_and_53() {
        assertPartitionOf(100).is(47, 53);
    }

    private PartitionAsserter assertPartitionOf(int of) {
        return new PartitionAsserter(of);
    }

    private class PartitionAsserter {
        private final int of;

        public PartitionAsserter(int of) {
            this.of = of;
        }

        private void is(int first, int second) {
            assertArrayEquals(new int[]{first, second}, new GoldbachConjectureSolver().partitionOf(of));
        }
    }
}
