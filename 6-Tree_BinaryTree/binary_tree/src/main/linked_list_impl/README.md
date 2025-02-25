## Introduction

#### 1. Binary Tree using Linked List:
    - Traverse all nodes
    - Search for a value
    - Inserting a node
    - Creating a tree
    - Deleting a node
    - Deletion of Tree

#### 2. Binary Tree - Traversal (BinaryTreeLL.java)
    - (i). Depth First Search
        - Preorder Traversal // Root Node -> Left SubTree -> Right SubTree
        - Inorder Traversal // left-subtree node -> root node -> right-subtree node
        - Postorder Traversal // left-subtree node -> right-subtree node -> root node
    
    - (ii). Breadth First Search
        - Level order Traversal

## Traversal

#### 1. Binary Tree - PreOrder Traversal

    - Root Node -> Left SubTree -> Right SubTree

![alt text](images/BTLL.png)

    - Traversal Sequence:

        N1 -> N2 -> N4 -> N8 -> N9 -> N5 -> N3 -> N6 -> N7

<img src="images/PreOrderTraversalBTLL-After.png" alt="PreOrderTraversalInBT" style="max-width: 30%; max-height: 500px; height: auto;">

#### 2. Binary Tree - InOrder Traversal
    - left-subtree node -> root node -> right-subtree node

![alt text](images/BTLL.png)

    - Traversal Sequence:

        N8 -> N4 -> N9 -> N2 -> N5 -> N1 -> N6 -> N3 -> N7

<img src="images/InOrderTraversalBTLL.png" alt="InOrderTraversalInBT" style="max-width: 30%; max-height: 500px; height: auto;">

#### 3. Binary Tree - PostOrder Traversal
    -  left-subtree node -> right-subtree node -> root node

![alt text](images/BTLL.png)

    - Traversal Sequence:

        N8 -> N9 -> N4 -> N5 -> N2 -> N6 -> N7 -> N3 -> N1
    
<img src="images/PostOrderTraversalBTLL.png" alt="PostOrderTraversalInBT" style="max-width: 30%; max-height: 500px; height: auto;">

#### 4. Binary Tree - LevelOrder Traversal
    - Level wise

<img src="images/LevelOrderTraversalBTLL.png" alt="LevelOrderTraversalInBT" style="max-width: 30%; max-height: 500px; height: auto;">

    - Traversal Sequence:

            N1 -> N2 -> N3 -> N4 -> N5 -> N6 -> N7 -> N8 -> N9


<img src="images/S_1_LevelOrderTraversalBTLL.png" alt="LevelOrderTraversalInBT" style="max-width: 30%; max-height: 500px; height: auto;">

## Searching

#### Implements LevelOrder Traversal for searching.

        BinaryTreeLL.java --> search()