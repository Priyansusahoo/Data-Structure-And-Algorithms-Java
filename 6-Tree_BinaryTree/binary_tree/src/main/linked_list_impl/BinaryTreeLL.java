package main.linked_list_impl;

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
}
