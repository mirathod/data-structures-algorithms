package org.milan.datastructure.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class FindDuplicatesTest {

    @Test
    void find() {
        FindDuplicates findDuplicates = new FindDuplicates();

        int[] arr = new int[]{1, 2, 3, 1, 3, 6, 6};

        int[] result = findDuplicates.find(arr);

        assertArrayEquals(result, new int[]{1, 3, 6});

        arr = new int[]{5, 3, 1, 3, 5, 5};

        result = findDuplicates.find(arr);

        assertArrayEquals(result, new int[]{3, 5});

        arr = new int[]{0, 3, 1, 3, 0};

        result = findDuplicates.find(arr);

        assertArrayEquals(result, new int[]{0, 3});
    }
}