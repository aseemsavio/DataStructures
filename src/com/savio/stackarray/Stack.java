package com.savio.stackarray;

public class Stack<T> {

    T[] stack;
    int size;

    public Stack(){

        // In Java, we cannot create generic arrays. So, Object array, and cast it to the generic array.
        this.stack = (T[]) new Object[1];
    }

    // O(1) if no resize
    public void push(T data){
        if(this.stack.length == this.size)
            resize(2 * this.stack.length);

        this.stack[size++] = data;
    }

    // O(1) if no resize
    public T pop(){
        if(this.size == 0)
            return null;

        T itemToPop = this.stack[--size];
        // to deal with obsolate reference.
        this.stack[size] = null;

        if(size > 0 && size <= this.stack.length / 4)
            resize(this.stack.length / 2);

        return itemToPop;
    }

    public boolean isEmpty(){
        return this.stack.length == 0;
    }

    public  int size(){
        return this.size;
    }

    private void resize(int capacity) {
        T[] resizedArray = (T[]) new Object[capacity];
        for(int i = 0; i < size; i++){
            resizedArray[i] = this.stack[i];
        }
        this.stack = resizedArray;
    }

}
