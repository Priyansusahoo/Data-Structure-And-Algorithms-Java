package main.linked_list_impl;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeLL {
    
    public BinaryNode root;

    public BinaryTreeLL() { // TC -> O(1) ; SC -> O(1)
        this.root = null;
    }

    /**
     * Depth-First-Search
     */

    // PreOrder Traversal
    // Root Node -> Left SubTree -> Right SubTree
    public void preOrder(BinaryNode node){ // TC -> O(N) ; SC -> O(N)
        if (node == null) { // TC -> O(1)
            return; // TC -> O(1)
        }
        System.out.print(node.value + " "); // TC -> O(1)

        preOrder(node.left); // TC -> O(N/2)
        preOrder(node.right); // TC -> O(N/2)
    }

    // InOrder Traversal
    // left-subtree node -> root node -> right-subtree node
    public void inOrder(BinaryNode node) { // TC -> O(N) ; SC -> O(N)
        if(node == null) { // TC -> O(1)
            return; // TC -> O(1)
        }

        inOrder(node.left); // TC -> O(N/2)
        System.out.print(node.value + " "); // TC -> O(1)
        inOrder(node.right); // TC -> O(N/2)
    }

    // PostOrder Traversal
    // left-subtree node -> right-subtree node -> root node
    public void postOrder(BinaryNode node) { // TC -> O(N) ; SC -> O(N)
        if (node == null) { // TC -> O(1)
            return; // TC -> O(1)
        }
        postOrder(node.left); // TC -> O(N/2)
        postOrder(node.right); // TC -> O(N/2)
        System.out.print(node.value + " "); // TC -> O(1)
    }



    /**
     * Breadth-First-Search
     */
    // LevelOrder Traversal
    public void levelOrder() { // TC -> O(N) ; SC -> O(N)
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>(); // TC -> O(1)
        queue.add(root); // TC -> O(1)
        while (!queue.isEmpty()) { // TC -> O(N)
            BinaryNode presNode = queue.remove(); // TC -> O(1)
            System.out.print(presNode.value + " "); // TC -> O(1)
            if (presNode.left != null) { // TC -> O(1)
                queue.add(presNode.left); // TC -> O(1)
            }
            if (presNode.right != null) { // TC -> O(1)
                queue.add(presNode.right); // TC -> O(1)
            }
        }
        System.out.println("\n"); // O(1)
        /**
         * Example for Better Understanding:
         *         N1
                  /  \
                N2    N3
               / \    / \
              N4  N5 N6  N7
             / \
            N8  N9
         * Level-Order Traversal Steps:
         *  1. Initialization:
                - Create a queue and add the root node (N1) to it.
                - Queue: [N1]
         *  2. First Iteration:
                - Check if the queue is empty: No.
                - Remove N1 from the queue: presNode = queue.remove().
                - Print N1's value: System.out.print(N1.value + " "); (Output: N1).
                - Check N1's left child (N2): Not null, add N2 to the queue.
                - Check N1's right child (N3): Not null, add N3 to the queue.
                - Queue: [N2, N3]
         *  3. Second Iteration:
                - Check if the queue is empty: No.
                - Remove N2 from the queue: presNode = queue.remove().
                - Print N2's value: System.out.print(N2.value + " "); (Output: N2).
                - Check N2's left child (N4): Not null, add N4 to the queue.
                - Check N2's right child (N5): Not null, add N5 to the queue.
                - Queue: [N3, N4, N5]
         *  4. Third Iteration:
                - Check if the queue is empty: No.
                - Remove N3 from the queue: presNode = queue.remove().
                - Print N3's value: System.out.print(N3.value + " "); (Output: N3).
                - Check N3's left child (N6): Not null, add N6 to the queue.
                - Check N3's right child (N7): Not null, add N7 to the queue.
                - Queue: [N4, N5, N6, N7]
         *  5. Fourth Iteration:
                - Check if the queue is empty: No.
                - Remove N4 from the queue: presNode = queue.remove().
                - Print N4's value: System.out.print(N4.value + " "); (Output: N4).
                - Check N4's left child (N8): Not null, add N8 to the queue.
                - Check N4's right child (N9): Not null, add N9 to the queue.
                - Queue: [N5, N6, N7, N8, N9]
         *  6. Fifth Iteration:
                - Check if the queue is empty: No.
                - Remove N5 from the queue: presNode = queue.remove().
                - Print N5's value: System.out.print(N5.value + " "); (Output: N5).
                - Check N5's left child: Null, do nothing.
                - Check N5's right child: Null, do nothing.
                - Queue: [N6, N7, N8, N9]
         *  7. Sixth Iteration:
                - Check if the queue is empty: No.
                - Remove N6 from the queue: presNode = queue.remove().
                - Print N6's value: System.out.print(N6.value + " "); (Output: N6).
                - Check N6's left child: Null, do nothing.
                - Check N6's right child: Null, do nothing.
                - Queue: [N7, N8, N9]
         *  8. Seventh Iteration:
                - Check if the queue is empty: No.
                - Remove N7 from the queue: presNode = queue.remove().
                - Print N7's value: System.out.print(N7.value + " "); (Output: N7).
                - Check N7's left child: Null, do nothing.
                - Check N7's right child: Null, do nothing.
                - Queue: [N8, N9]
         *  9. Eighth Iteration:
                - Check if the queue is empty: No.
                - Remove N8 from the queue: `
         */
    }

    /**
     * Implements LevelOrder Traversal for searching
     * Cause it implements queue instead of stack which is best
     */
    public void search(String value) { // TC -> O(N) ; SC -> O(N)
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>(); // TC -> O(1)
        queue.add(root); // TC -> O(1)
        while (!queue.isEmpty()) { // TC -> O(N)
            BinaryNode presentNode = queue.remove(); // TC -> O(1)
            if (presentNode.value == value) { // TC -> O(1)
                System.out.println("Value Found " + value + " in tree"); // TC -> O(1)
                return;
            } else {
                if (presentNode.left != null) { // TC -> O(1)
                    queue.add(presentNode.left); // TC -> O(1)
                }
                if (presentNode.right != null) { // TC -> O(1)
                    queue.add(presentNode.right); // TC -> O(1)
                }
            }
        }
        System.out.println("Value " + value + " not found in tree"); // TC -> O(1)
    }
}
