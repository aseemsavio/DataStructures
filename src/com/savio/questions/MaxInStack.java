package com.savio.questions;

import java.util.Stack;

public class MaxInStack {

    /**
     * The aim is to design an algorithm that can return the
     * maximum item of a stack in O(1) running time complexity. We can use O(N) extra memory!
     *
     * Hint: we can use another stack to track the max item
     *
     * Algorithm:
     *
     * 2 stacks; both their size must be maintained uniform.
     * max stack only enqueues if the top new value is greater than the previous. Or else, it just duplicates during every addition.
     * max stack.peek() gives the max element.
     */

    Stack<Integer> mainStack;
    Stack<Integer> maxStack;

    public MaxInStack(){
        this.mainStack = new Stack<>();
        this.maxStack = new Stack<>();
    }

    public static void main(String[] args){
        MaxInStack maxInStack = new MaxInStack();
        maxInStack.push(1);
        maxInStack.push(10);
        maxInStack.push(9);
        maxInStack.push(13);
        maxInStack.push(18);
        maxInStack.push(15);

        System.out.println("Max Item: " + maxInStack.getMaxItem());
    }

    private void push(int newData){
        if(this.mainStack.isEmpty() && this.maxStack.isEmpty()){
            mainStack.push(newData);
            maxStack.push(newData);
        } else if(newData > maxStack.peek()) {
            mainStack.push(newData);
            maxStack.push(newData);
        } else if(newData < maxStack.peek()) {
            mainStack.push(newData);
            maxStack.push(maxStack.peek());
        }
    }

    private int getMaxItem(){
        return this.maxStack.peek();
    }




}
