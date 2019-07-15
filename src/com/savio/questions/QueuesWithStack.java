package com.savio.questions;

import java.util.Stack;

public class QueuesWithStack {

    /**
     * 2 stacks - Enqueue stack; dequeue stack
     *
     * Algorithm:
     * we push items in the enqueue stack.
     * To dequeue, we pop from the enqueue stack and push into the dequeue stack and finally pop from the dequeue stack.
     */

    Stack<Integer> enqueueStack;
    Stack<Integer> dequeueStack;

    public QueuesWithStack() {
        this.enqueueStack = new Stack<>();
        this.dequeueStack = new Stack<>();
    }

    public static void main(String[] args) {
        QueuesWithStack queue = new QueuesWithStack();
        queue.enqueue(10);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }

    private void enqueue(int newData) {
        this.enqueueStack.push(newData);
    }

    private int dequeue() {
        // if both the stacks are empty, throw exception
        if (enqueueStack.isEmpty() && dequeueStack.isEmpty())
            throw new RuntimeException("Stacks are empty.");

        if (dequeueStack.isEmpty()) {
            while (!enqueueStack.isEmpty()) {
                dequeueStack.push(enqueueStack.pop());
            }
        }
        return dequeueStack.pop();
    }


}
