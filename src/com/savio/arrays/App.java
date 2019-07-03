package com.savio.arrays;

public class App {

    public static void main(String args[]){

        // Need to specify the no. of elements.
        int[] num = new int[5];

        for(int i = 0; i < num.length; ++i)
            num[i] = i;

        /**
         *  O(1) Constant time complexity
         *  Adding, deleting elements to & from the end
         *  Accessing elements with index
         */

        System.out.println(num[3]);

        /**
         *  O(N) Linear Time Complexity
         *  Need to iterate over the array snd search.
         */

        for(int i = 0; i < num.length; ++i){
            if(num[i] == 3)
                System.out.println(i);
        }

        /**
         *  Linear time complexity is the reason why advanced data structures came to be.
         *  To reduce the computational time.
         *
         *  Can reduce the time complecity to O(log N) with Binary Trees
         *  And, approximately to O(1) with hash tables.
         */
    }

}
