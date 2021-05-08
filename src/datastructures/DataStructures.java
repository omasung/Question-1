/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author USER
 */
public class DataStructures {

    static int getFirstSmallestPositiveNumber(int[] A) {

        int N = A.length;

        Set<Integer> set = new HashSet<>();

        for (int a : A) {

            if (a > 0) {
                set.add(a);
            }

        }

        for (int i = 1; i <= N + 1; i++) {

            if (!set.contains(i)) {
                return i;
            }

        }

        return N + 1;
    }

    // Driver method 
    public static void main(String[] args) {

        /*
         * Example for the given arrays
         * 
         * given A= [1,5,7,4,1,2] the function should return 3.
         * 
         * Given A = [1,2,3] the function should return 4.
         * 
         * Given A = [-1, -3] the function should return 1 
         */
        
        int[][] exampleArrays = new int[][]{{1, 5, 7, 4, 1, 2}, {1, 2, 3}, {-1, -3}};

        System.out.println("For the given arrays");

        for (int[] exampleArray : exampleArrays) {
            System.out.println(getFirstSmallestPositiveNumber(exampleArray));
        }

        /*
         * Efficient algorithm for the following assumptions 
         * 
         * N is an integer within the range [1..100,000]
         * 
         * Each element of array A is an integer within the range [-1,000,000..1,000,000] 
         * 
         */
        
        int[][] assumptionArrays = new int[][]{{1, 100000}, {-1000000, 1000000}};

        System.out.println("For the assumptions");

        for (int[] assumptionArray : assumptionArrays) {
            System.out.println(getFirstSmallestPositiveNumber(assumptionArray));
        }

    }
    
}
