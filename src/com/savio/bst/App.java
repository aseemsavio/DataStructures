package com.savio.bst;

public class App {

    public static void main(String[] args) {

        Tree<Integer> binarySearchTree = new BinarySearchTree<>();
        binarySearchTree.insert(-1);
        binarySearchTree.insert(10);
        binarySearchTree.insert(200);
        binarySearchTree.insert(-21);
        binarySearchTree.insert(23);
        binarySearchTree.insert(5);
        binarySearchTree.insert(9);

        System.out.println("Min: " + binarySearchTree.getMinValue());
        System.out.println("Max: " + binarySearchTree.getMaxValue());

        binarySearchTree.traversal();
        binarySearchTree.delete(5);
        binarySearchTree.traversal();

    }

}
