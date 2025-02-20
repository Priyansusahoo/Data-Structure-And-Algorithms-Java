package org.example;

import java.util.ArrayList;

public class TreeNode {
    String data;
    ArrayList<TreeNode> child;

    TreeNode(String data) {
        this.data = data;
        this.child = new ArrayList<TreeNode>();
    }

    public void addChild(TreeNode node) {
        this.child.add(node);
    }

    public String printTree(int level) {
        String result;
        result = "  ".repeat(level) + this.data + "\n";
        for(TreeNode node : this.child) {
            result += node.printTree(level+1);
        }
        return result;
    }
}
