package main.linked_list_impl;

public class BinaryTreeLL {
    
    public BinaryNode root;

    public BinaryTreeLL() { // TC -> O(1) ; SC -> O(1)
        this.root = null;
    }

    // PreOrder Traversal
    public void PreOrder(BinaryNode node){ // TC -> O(N) ; SC -> O(N)
        if (node == null) { // TC -> O(1)
            return; // TC -> O(1)
        }
        System.out.print(node.value + " "); // TC -> O(1)

        PreOrder(node.left); // TC -> O(N/2)
        PreOrder(node.right); // TC -> O(N/2)
    }
}
