package com.savio.questions;

public class ReversingAnArray {

    /**
     *  Reversing an array (In-Place) in O(N) time complecity.
     *  In-Place means, designing an algorithm without any extra memory.
     *  eg: 1, 2, 3, 4,5  to 5, 4, 3, 2, 1
     *
     *  Set start index and end index.
     *  swap them; move a step inside (inc start and dec end index); swap;
     *  Do this until the start index is not smaller than the end index.
     *
     *  This is an in-place algorithm - no need for extra memory.
     */

    private static int[] numbers = {1, 2, 3, 4, 5};

    public static void main(String args[]){
        int[] reversedArray = prepareSwap(numbers);
        for(int num : reversedArray)
            System.out.println(num);
    }

    /**
     *  O(N) linear time complexity.
     *  This will take N/2 number of iterations. As N2 is a constant, we omit 2. So, this is an O(N) linear time complexity.
     */
    private static int[] prepareSwap(int[] numbers) {
        int startIndex = 0;
        int endIndex = numbers.length - 1;

        while((startIndex < endIndex)){
            swap(numbers, startIndex, endIndex);
            ++startIndex;
            --endIndex;
        }
        return numbers;
    }

    private static void swap(int[] numbers, int startIndex, int endIndex) {
        int temp = numbers[startIndex];
        numbers[startIndex] = numbers[endIndex];
        numbers[endIndex] = temp;
    }
}
