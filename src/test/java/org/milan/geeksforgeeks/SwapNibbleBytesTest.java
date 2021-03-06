package org.milan.geeksforgeeks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link SwapNibbleBytes}
 *
 * @author Milan Rathod
 */
class SwapNibbleBytesTest {

    @Test
    void testSwap() {
        SwapNibbleBytes swapNibbleBytes = new SwapNibbleBytes();

        assertEquals(70, swapNibbleBytes.swap(100));
    }
}