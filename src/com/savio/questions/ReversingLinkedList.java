package com.savio.questions;

import com.savio.linkedlist.LinkedList;
import com.savio.linkedlist.List;

public class ReversingLinkedList {

    /**
     * In-place algorithm; O(N) algo to reverse a single linked list.
     * 1. Naive SOlution - Consider all nodes one by one and construct a new Linked list with the reverse.
     *           NOT EFFICIENT
     *
     * 2. Using Pointers - In-place & O(N) time complexity.
     *
     *      null 5 -> 13 -> 2 -> 10 -> null
     *
     *      Need 4 pointers:
     *          head - points to 5 initially
     *          current - points to 5 initially
     *          previous - initialized to null
     *          next - initialized to null
     */

    public static void main(String[] args){
        List<Integer> integerList = new LinkedList<>();
        integerList.insert(1);
        integerList.insert(2);
        integerList.insert(3);
        integerList.insert(4);
        integerList.insert(5);
        integerList.traverse();

        System.out.println();

        integerList.reverse();
        integerList.traverse();
    }
}
