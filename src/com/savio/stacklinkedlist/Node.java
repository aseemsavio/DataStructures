package com.savio.stacklinkedlist;

public class Node<T extends Comparable<T>> {

    T data;
    Node<T> nextNode;

    Node(T data){
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return this.data.toString();
    }
}
