package com.savio.linkedlist;

public class LinkedList<T extends Comparable<T>> implements List<T> {

    private Node<T> root;
    private int size;


    @Override
    public void insert(T data) {
        ++size;
        if(this.root == null){
            root = new Node<T>(data);
        } else {
            insertAtBegining(data);
        }
    }

    //  O(1)
    private void insertAtBegining(T data) {
        Node<T> newNode = new Node<T>(data);
        newNode.setNextNode(root);
        root = newNode;
    }

    @Override
    public void remove(T data) {
        if(this.root == null) return;

        --size;
        // if the data to delete is the root node
        if(this.root.getData().compareTo(data) == 0){
            this.root = this.root.getNextNode();
        } else {
            // id the data to delete is not the root node.
            remove(data, root, root.getNextNode());
        }

    }

    private void remove(T dataToDelete, Node<T> previousNode, Node<T> actualNode) {
        while(actualNode != null){
            if(actualNode.getData().compareTo(dataToDelete) == 0){
                previousNode.setNextNode(actualNode.getNextNode());
                actualNode = null;
                return;
            }

            // Iterating through the limked list
            previousNode = actualNode;
            actualNode = actualNode.getNextNode();

        }
    }

    @Override
    public void traverse() {
        if(this.root == null) return;

        Node<T> actualNode = this.root;
        while(actualNode != null){
            System.out.print(actualNode.getData().toString() + " -> ");

            // incrementing
            actualNode = actualNode.getNextNode();
        }
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public Node<T> getMiddleNode() {

        Node<T> fastPointer = this.root;
        Node<T> slowPointer = this.root;

        while((fastPointer.getNextNode() != null) && fastPointer.getNextNode().getNextNode() != null){
            fastPointer = fastPointer.getNextNode().getNextNode();
            slowPointer = slowPointer.getNextNode();
        }

        return slowPointer;
    }

    @Override
    public void reverse() {
        Node<T> currentNode = this.root;
        Node<T> nextNode = null;
        Node<T> previousNode = null;

        while(currentNode != null){
            nextNode = currentNode.getNextNode();
            currentNode.setNextNode(previousNode);
            previousNode = currentNode;
            currentNode = nextNode;
        }

        this.root = previousNode;
    }
}
