package com.savio.stackarray;

public class App {

    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Size: " + stack.size());

        stack.pop();
        stack.pop();

        System.out.println("Size: " + stack.size());

    }

}
