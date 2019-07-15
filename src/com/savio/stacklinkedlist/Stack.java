package com.savio.stacklinkedlist;

public class Stack<T extends Comparable<T>> {

    private Node<T> root;
    private int size;

    public void push(T newData) {
        ++size;
        if (this.root == null) {
            this.root = new Node<>(newData);
        } else {
            Node<T> oldNode = this.root;
            this.root = new Node<>(newData);
            this.root.setNextNode(oldNode);
        }
    }

    public T pop(){
        T itemToPop = this.root.getData();
        --size;
        if(this.root == null) return null;
        else {
            this.root = this.root.getNextNode();
            return itemToPop;
        }
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        if(getSize() == 0)
            return true;
        return false;
    }

}
