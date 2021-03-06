package org.milan.datastructure.tree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.milan.datastructure.tree.TreeDataUtil.toArray;

/**
 * Test class for {@link BinarySearchTree}
 *
 * @author Milan Rathod
 */
class BinarySearchTreeTest {

    private BinarySearchTree<Integer> binarySearchTree;

    @BeforeEach
    void setup() {
        binarySearchTree = TreeDataUtil.initializeBST();
    }

    @Test
    void testPreOrder() {
        List<Integer> result = binarySearchTree.preOrder(binarySearchTree.getRoot());

        assertArrayEquals(new int[]{20, 10, 5, 15, 30, 25, 35}, toArray(result));
    }

    @Test
    void testPreOrderIterative() {
        List<Integer> result = binarySearchTree.preOrderIterative(binarySearchTree.getRoot());

        assertArrayEquals(new int[]{20, 10, 5, 15, 30, 25, 35}, toArray(result));
    }

    @Test
    void testInOrder() {
        List<Integer> result = binarySearchTree.inOrder(binarySearchTree.getRoot());

        assertArrayEquals(new int[]{5, 10, 15, 20, 25, 30, 35}, toArray(result));
    }

    @Test
    void testInOrderIterative() {
        List<Integer> result = binarySearchTree.inOrderIterative(binarySearchTree.getRoot());

        assertArrayEquals(new int[]{5, 10, 15, 20, 25, 30, 35}, toArray(result));
    }

    @Test
    void testPostOrder() {
        List<Integer> result = binarySearchTree.postOrder(binarySearchTree.getRoot());

        assertArrayEquals(new int[]{5, 15, 10, 25, 35, 30, 20}, toArray(result));
    }

    @Test
    void testPostOrderIterative() {
        List<Integer> result = binarySearchTree.postOrderIterative(binarySearchTree.getRoot());

        assertArrayEquals(new int[]{5, 15, 10, 25, 35, 30, 20}, toArray(result));
    }

    @Test
    void testLevelOrder() {
        List<Integer> result = binarySearchTree.levelOrder(binarySearchTree.getRoot());

        assertArrayEquals(new int[]{20, 10, 30, 5, 15, 25, 35}, toArray(result));
    }

    @Test
    void testLevelOrderReverse() {
        List<Integer> result = binarySearchTree.levelOrderReverse(binarySearchTree.getRoot());

        assertArrayEquals(new int[]{5, 15, 25, 35, 10, 30, 20}, toArray(result));
    }

    @Test
    void testSize() {
        assertEquals(7, binarySearchTree.size(binarySearchTree.getRoot()));
    }

    @Test
    void testSizeIterative() {
        assertEquals(7, binarySearchTree.sizeIterative(binarySearchTree.getRoot()));
    }

    @Test
    void testMinimumDepth() {
        assertEquals(3, binarySearchTree.minimumDepth(binarySearchTree.getRoot()));
    }

    @Test
    void testFindDeepestNode() {
        assertEquals(35, binarySearchTree.findDeepestNode(binarySearchTree.getRoot()).key);
    }

    @Test
    void testMaximumWidth() {
        assertEquals(4, binarySearchTree.maximumWidth(binarySearchTree.getRoot()));
    }

    @Test
    void testLca() {
        assertEquals(20, binarySearchTree.lca(binarySearchTree.getRoot(), 5, 35).key);
        assertEquals(30, binarySearchTree.lca(binarySearchTree.getRoot(), 25, 35).key);
    }

    @Test
    void testFindMax() {
        assertEquals(35, binarySearchTree.findMax(binarySearchTree.getRoot()).key);
    }

    @Test
    void testFindMin() {
        assertEquals(5, binarySearchTree.findMin(binarySearchTree.getRoot()).key);
    }

    @Test
    void testInOrderSuccessor() {
        assertEquals(25, binarySearchTree.inOrderSuccessor(binarySearchTree.getRoot(), binarySearchTree.getRoot()).key);

        assertEquals(20, binarySearchTree.inOrderSuccessor(binarySearchTree.getRoot(), binarySearchTree.getRoot().left.right).key);
    }

    @Test
    void testInOrderPredecessor() {
        assertEquals(20, binarySearchTree.inOrderPredecessor(binarySearchTree.getRoot(), binarySearchTree.getRoot().right.left).key);

        assertEquals(10, binarySearchTree.inOrderPredecessor(binarySearchTree.getRoot(), binarySearchTree.getRoot().left.right).key);
    }
}