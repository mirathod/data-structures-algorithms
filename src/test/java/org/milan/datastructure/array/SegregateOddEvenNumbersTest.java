package org.milan.datastructure.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * Test class for {@link SegregateOddEvenNumbers}
 *
 * @author Milan Rathod
 */
class SegregateOddEvenNumbersTest {

    @Test
    void testSegregate() {
        SegregateOddEvenNumbers segregateOddEvenNumbers = new SegregateOddEvenNumbers();

        int[] input = new int[]{12, 34, 45, 9, 8, 90, 3};

        segregateOddEvenNumbers.segregate(input);

        assertArrayEquals(new int[]{12, 34, 90, 8, 9, 45, 3}, input);
    }
}