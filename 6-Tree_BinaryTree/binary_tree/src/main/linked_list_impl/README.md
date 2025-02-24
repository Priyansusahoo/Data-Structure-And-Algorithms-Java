#### Binary Tree using Linked List:
    - Creating a tree
    - Inserting a node
    - Deleting a node
    - Search for a value
    - Traverse all nodes
    - Deletion of Tree

#### Binary Tree - Traversal (BinaryTreeLL.java)
    - Depth First Search
        - Preorder Traversal // Root Node -> Left SubTree -> Right SubTree
        - Inorder Traversal // left-subtree node -> root node -> right-subtree node
        - Postorder Traversal // left-subtree node -> right-subtree node -> root node
    
    - Breadth First Search
        - Level order Traversal

### Binary Tree - PreOrder Traversal

    - Root Node -> Left SubTree -> Right SubTree

![alt text](images/BTLL.png)

    - Traversal Sequence:

        N1 -> N2 -> N4 -> N8 -> N9 -> N5 -> N3 -> N6 -> N7

<img src="images/PreOrderTraversalBTLL-After.png" alt="PreOrderTraversalInBT" style="max-width: 50%; max-height: 500px; height: auto;">

### Binary Tree - InOrder Traversal
    - left-subtree node -> root node -> right-subtree node

![alt text](images/BTLL.png)

    - Traversal Sequence:

        N8 -> N4 -> N9 -> N2 -> N5 -> N1 -> N6 -> N3 -> N7

<img src="images/InOrderTraversalBTLL.png" alt="InOrderTraversalInBT" style="max-width: 50%; max-height: 500px; height: auto;">

### Binary Tree - PostOrder Traversal
    -  left-subtree node -> right-subtree node -> root node

![alt text](images/BTLL.png)

    - Traversal Sequence:

        N8 -> N9 -> N4 -> N5 -> N2 -> N6 -> N7 -> N3 -> N1
    
<img src="images/PostOrderTraversalBTLL.png" alt="PostOrderTraversalInBT" style="max-width: 50%; max-height: 500px; height: auto;">

### Binary Tree - LevelOrder Traversal
    - Level wise

<img src="images/LevelOrderTraversalBTLL.png" alt="LevelOrderTraversalInBT" style="max-width: 50%; max-height: 500px; height: auto;">

    - Traversal Sequence:

            N1 -> N2 -> N3 -> N4 -> N5 -> N6 -> N7 -> N8 -> N9


<img src="images/S_1_LevelOrderTraversalBTLL.png" alt="LevelOrderTraversalInBT" style="max-width: 50%; max-height: 500px; height: auto;">