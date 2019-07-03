package com.savio.questions;

import java.util.Arrays;

public class Anagram {

    /**
     *  Construct an algorithm to check whether two words
     *  (or phrases) are anagrams or not!
     *
     *  An anagram is a word or phrase formed by rearranging the
     *  letters of a different word or phrase, typically using
     *  all the original letters exactly once
     *
     *  original word - subject
     *  The word/phrase that exactly reproduces the letters in another order - anagram
     *
     *  eg: restful - fluster
     */

    public static void main(String args[]){
        char[] subject = "restful".toCharArray();
        char[] anagram = "fluster".toCharArray();
        boolean isAnagram = anagramCheck(subject, anagram);
        if(isAnagram)
            System.out.println("Anagram");
        else
            System.out.println("Not Anagram");
    }

    private static boolean anagramCheck(char[] subject, char[] anagram) {

        /**
         * sorting operation is O(NlogN)
         */
        Arrays.sort(subject);
        Arrays.sort(anagram);

        /**
         *  This operation is O(N).
         *  When we do, O(NlogN) + O(N), the algorithm's time complexity is O()NlogN as
         *  it is slower than O(N).
         */
        for(int i = 0; i < subject.length; ++i)
            if(subject[i] != anagram[i])
                return false;
        return true;
    }

}
