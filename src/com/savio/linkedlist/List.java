package com.savio.linkedlist;

public interface List<T extends Comparable<T>> {
    void insert(T data);
    void remove(T data);
    void traverse();
    int size();
    Node<T> getMiddleNode();
    void reverse();
}
