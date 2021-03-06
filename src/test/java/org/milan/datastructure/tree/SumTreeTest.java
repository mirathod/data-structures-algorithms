package org.milan.datastructure.tree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test class for {@link SumTree}
 *
 * @author Milan Rathod
 */
class SumTreeTest {

    private BinaryTree<Integer> binaryTree;

    private SumTree sumTree;

    @BeforeEach
    void setup() {
        sumTree = new SumTree();
        binaryTree = new BinaryTree<>(26);
        binaryTree.getRoot().left = new Node<>(3);
        binaryTree.getRoot().right = new Node<>(10);
        binaryTree.getRoot().left.right = new Node<>(3);
        binaryTree.getRoot().right.left = new Node<>(6);
        binaryTree.getRoot().right.right = new Node<>(4);
    }

    @Test
    void testIsSumTree() {
        assertTrue(sumTree.isSumTree(binaryTree.getRoot()));
    }

    @Test
    void testIsSumTreeV2() {
        assertTrue(sumTree.isSumTreeV2(binaryTree.getRoot()));
    }
}