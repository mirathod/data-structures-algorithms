package org.milan.datastructure.string;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test Class for {@link StringsPermutation}
 *
 * @author Milan Rathod
 */
public class StringsPermutationTest {

    @Test
    public void testPermutation() {
        StringsPermutation stringsPermutation = new StringsPermutation();

        String s1 = "abc";
        String s2 = "ccb";

        Assert.assertFalse(stringsPermutation.isPermuted(s1, s2));
    }
}