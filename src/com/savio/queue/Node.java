package com.savio.queue;

public class Node<T extends Comparable<T>> {

    T data;
    Node<T> nextNode;

    public Node(T newData) {
        this.data = newData;
    }

    @Override
    public String toString() {
        return this.data.toString();
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
}
