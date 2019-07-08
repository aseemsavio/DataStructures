package com.savio.questions;

public class DuplicatesInAnArray {

    /**
     *  The problem is that we want to find duplicates in
     *  a T[] one-dimensional array of integers in
     *  O(N) running time where the integer values are
     *  smaller than the length of the array!
     *
     *  1. Brute-force approach - Comparing each element with each other.
     *     It has O(N^2) quadratic time complexity.
     *
     *  2. Use HashMaps
     *          Traverse through the array and insert elements in a hash table (Hash table cannot have duplicate values).
     *          This is pretty good. Nut NOT an in-place algorithm.
     *
     *  3. Use Absolute Values
     *          O(N) and in-place as well.
     *
     *  **********   ALGORITHM   **********
     *  Consider all the elements in the array T[].
     *  Check the sign of T[abs(T[i])]:
     *      if it is Positive:
     *          flip the sign - T[abs(T[i])] = -T[abs(T[i])]
     *      else:
     *          The given i item is a repetition.
     *
     *  *********  Example  ****************
     *
     *  2   3   1   2   4   3
     *  T[2] = 1   (1 is positive. Flip the sign)
     *  2   3   -1   2   4   3
     *
     *  Next Iteration: Consider the next item: index: 1
     *  T[3] = 2
     *  2   3   -1   -2   4   3
     *  Proceed like this. If the value is -ve, the number we're pointing is a repetition.
     */


    public static void main(String[] args){
        int[] intArray = {1, 2, 2, 3, 4, 4};
        DuplicatesInAnArray duplicatesInAnArray = new DuplicatesInAnArray();
        duplicatesInAnArray.findDuplicates(intArray);
    }

    private void findDuplicates(int[] intArray) {
        /**
         *  O(N) linear running time complexity
         */
        for(int i = 0; i < intArray.length; ++i){
            if(intArray[Math.abs(intArray[i])] > 0){
                intArray[Math.abs(intArray[i])] = -intArray[Math.abs(intArray[i])];
            } else {
                System.out.println( (-1 * intArray[Math.abs(intArray[i])]) + " is a repetition");
            }
        }
    }

}
