package com.savio.queue;

public class Queue<T extends Comparable<T>> {

    private Node<T> firstNode;
    private Node<T> lastNode;
    private int size;

    // O(1)
    public void enqueue(T data){

        ++size;

        Node<T> oldLastNode = this.lastNode;
        this.lastNode = new Node<>(data);
        lastNode.setNextNode(null);

        if(isEmpty()){
            this.firstNode = new Node<>(data);
            this.lastNode = this.firstNode;
        } else {
            oldLastNode.setNextNode(lastNode);
        }
    }

    public  T dequeue(){
        --this.size;
        T dataToDequeue = this.firstNode.getData();
        this.firstNode = this.firstNode.getNextNode();
        if(isEmpty()){
            this.firstNode = null;
            this.lastNode = null;
        }
        return dataToDequeue    ;
    }

    public int size(){
        return this.size;
    }

    private boolean isEmpty() {
        if(this.firstNode == null || this.lastNode == null)
            return true;
        return false;
    }



}
