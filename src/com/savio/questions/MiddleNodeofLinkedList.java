package com.savio.questions;

import com.savio.linkedlist.LinkedList;
import com.savio.linkedlist.List;

public class MiddleNodeofLinkedList {

    /**
     * Need an in-place algorithm; a linear running time algorithm O(N)
     *
     * 1. Naive solution:
     *      Count the no. of nodes and (total/2)th node is the index of the middle node.
     *
     * A better solution:
     * 2. Using 2 pointers
     *      O(N) linear time complexity.
     *      First Node: traverses the linked list one node at a time
     *      Second Node: traverses the ll 2 nodes at a time. (twice as fast as the fast)
     *      When the second pointer reaches the end node, the 1st pointer will still be in the middle.
     *
     *      SEE THE IMPLEMENTATION IN THE com.savio.linkedlist.LinkedList class.
     */

    public static void main(String[] args){

        List<Integer> integerList = new LinkedList<>();
        integerList.insert(1);
        integerList.insert(2);
        integerList.insert(3);
        integerList.insert(4);
        integerList.insert(5);

        System.out.print(integerList.getMiddleNode().getData());
    }



}
