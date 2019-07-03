package com.savio.collections;

import java.util.List;

public class ArrayList {

    /**
     * Arrays are the underlying DS in Array Lists.
     * Efficient for random access.
     * Not efficient for deleting items as shifting of elements will have to take place.
     *
     * If we're gonna store insanely huge amounts of data in a list, specify the capacity first to make it efficient.
     *      This will reduce the incremental reallocation (by te underlying array DS)
     *
     *      list = new ArayList(10000);
     *
     *      We like - Random Access
     *      We don't like - Removing items
     */

    public static void main(String args[]){

        List<String> stringList = new java.util.ArrayList<>();
        stringList.add("Aseem");
        stringList.add("Savio");
        stringList.add("Peter");
        stringList.add("Parker");

        for(String s : stringList)
            System.out.println(s);

        /**
         * Random Access - very fast & efficient
         * If you know the index, use ArrayListr̥
         */
        System.out.println(stringList.get(0));

        /**
         * Removing is NOT efficient as reallocation takes place.
         */
        stringList.remove(0);
    }
}
