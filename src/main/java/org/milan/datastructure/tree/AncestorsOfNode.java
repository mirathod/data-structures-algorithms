package org.milan.datastructure.tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * Problem: {@link @https://www.geeksforgeeks.org/print-ancestors-of-a-given-binary-tree-node-without-recursion/}
 *
 * @author Milan Rathod
 */
public class AncestorsOfNode {

    private static List<Node<Integer>> output;

    /**
     * Find all ancestors of a given node in binary tree
     * Recursive approach
     *
     * @param root    root of the tree
     * @param nodeKey node for which ancestors to be found
     * @return list of ancestors
     */
    public List<Node<Integer>> findAll(Node<Integer> root, int nodeKey) {

        output = new ArrayList<>();

        findAllUtil(root, nodeKey);

        return output;
    }

    private boolean findAllUtil(Node<Integer> root, int nodeKey) {
        // Base conditions
        if (root == null) {
            return false;
        }

        if (root.getKey() == nodeKey) {
            return true;
        }

        if (findAllUtil(root.getLeft(), nodeKey) || findAllUtil(root.getRight(), nodeKey)) {
            output.add(root);
            return true;
        }

        return false;
    }

    /**
     * Find all ancestors of a given node in binary tree
     * Iterative approach
     *
     * @param root    root of the tree
     * @param nodeKey node for which ancestors to be found
     * @return list of ancestors
     */
    public List<Node<Integer>> findAllIterative(Node<Integer> root, int nodeKey) {

        // Base condition
        if (root == null) {
            throw new IllegalStateException("Tree is empty");
        }

        Deque<Node<Integer>> stack = new ArrayDeque<>();

        List<Node<Integer>> outputList = new ArrayList<>();

        // Traverse the complete tree in postorder way till we find the key
        while (true) {

            // Traverse the left side. While traversing push the nodes into stack
            // So that their right subtrees can traverse later
            while (root != null && root.key != nodeKey) {
                stack.push(root);
                root = root.getLeft();
            }

            // If node found, break the loop
            if (root != null) {
                break;
            }

            // Check if right subtree exist for the node at top
            // If not then pop the node cause we don't need it
            if (stack.peek().right == null) {
                root = stack.pop();

                // If popped node is right child of top, the remove top as well.
                // Left child must processed earlier
                while (!stack.isEmpty() && stack.peek().right == root) {
                    root = stack.pop();
                }
            }

            root = stack.isEmpty() ? null : stack.peek().right;
        }

        while (!stack.isEmpty()) {
            outputList.add(stack.pop());
        }

        return outputList;
    }
}
