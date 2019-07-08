package com.savio.questions;

import java.util.Random;

public class ReservoirSamplingProblem {

    /**
     *  Our task is to design an algorithm thats capable of selecting k items from an array!
     *  The problem is that the n size of the array is unknown (or infinitely large)!
     *
     *  Solution: we can solve this problem with the so-called reservoir sampling algoirthm!
     *
     *  Reservoir sampling is a family f algorithms for randomly choosing a
     *  sample of k items from a list S containing n items
     *  where n is a very large or unknown number.
     *
     *  Very common in Google or Facebook search results.
     *  Choosing a random sample is simple if we knew the size of the array.
     *  But, in this problem, we do not know the same.
     *
     *  This algo solves this in O(N) linear time complexity.
     *
     *
     *  **********   ALGORITHM   **********
     *  1. Create a distinct reservoir array with size k - Copy k items from teh array S
     *  2. Iterate from k+1 to n.
     *  3. With probability k/i, (i is the index of the next item in the for loop), we keep the new item,
     *      so selecting a random bucket in the array to replace with.
     *
     *     With probability 1- (k/i), we ignore the new item (i item).
     *   The resulting sample is an uniformely distributed sample.
     */

    private Random random = new Random();

    public static void main(String[] args){
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 23, 34, 45, 56, 67, 78, 89, 90, 13, 24, 35, 46, 57, 68, 79, 80, 14, 25, 36, 47, 58, 69 , 70, 31,  42, 53, 64, 75, 86, 97, 80, 27, 38, 49};
        ReservoirSamplingProblem reservoirSamplingProblem = new ReservoirSamplingProblem();
        reservoirSamplingProblem.createSampleIt(intArray, 5);
    }

    private void createSampleIt(int[] originalArray, int sampleSize) {

        // Creation of reservoir array
        int reservoir[] = new int[sampleSize];

        // Copying k items from original array to the reservoir array
        for(int i = 0; i < sampleSize; i++)
            reservoir[i] = originalArray[i];

        //
        for(int i = sampleSize + 1; i < originalArray.length; ++i){
            int j = random.nextInt(i) + 1;
            if(j < sampleSize) reservoir[j] = originalArray[i];
        }

        for(int i = 0; i < reservoir.length; ++i)
            System.out.println(reservoir[i] + " ");
    }

}
