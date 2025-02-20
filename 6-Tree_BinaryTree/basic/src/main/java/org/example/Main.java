package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        TreeNode drink = new TreeNode("drink");

        TreeNode hot = new TreeNode("hot");
        TreeNode cold = new TreeNode("cold");
        TreeNode tea = new TreeNode("tea");
        TreeNode coffee = new TreeNode("coffee");
        TreeNode soda = new TreeNode("soda");
        TreeNode beer = new TreeNode("beer");

        drink.addChild(hot);
        drink.addChild(cold);
        hot.addChild(tea);
        hot.addChild(coffee);
        cold.addChild(soda);
        cold.addChild(beer);

        System.out.println(drink.printTree(0));
    }
}