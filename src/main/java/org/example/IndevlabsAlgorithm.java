package org.example;

import java.util.ArrayList;

/**
 * General
 * Write a function as described below and test scenarios to test its validity.
 * Details
 * Write a function that finds missing number in array:
 * Given array of sequent numbers 0,1,2,3...N with missing member
 * Function finds a first missing number occurrence in the sequence.
 * Example:
 * Input: [5,0,1,3,2]
 * Output: 4
 * Input: [7, 9, 10, 11, 12]
 * Output: 8
 * Implement the function + tests and explain your thinking and assumptions as comments.
 * You can send the solution as a link to GitHub (or similar)
 * Note:
 * 1- Think of every possible scenario to test your function including corner cases.
 * 2- Solutions in email will not be accepted
 */

public class IndevlabsAlgorithm {
    /**
     * @Author Харьков Александр
     * e-mail:
     * karl.shtolz.army@gmail.com
     * hh:
     * https://hh.ru/resume/e94f8473ff0b75b3c30039ed1f72635a456853
     */
    /**
     * function to find missing number in array if one number is missing
     * @param arr
     * @return
     */
    public static int findOneMissingNumber(int [] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("Array is null or array length is zero.");
            return -1;
        }
        if (arr.length == 1) {
            System.out.println("Array has only one element.");
            return -3;
        }
        int arrXor = 0;
        int arithmeticProgressionXor = 0;
        int maxInArr = -2147483648;
        int minInArr = 2147483647;
        int lengthArr = arr.length;
        for (int i = 0; i < lengthArr; i++) {
            if (arr[i] < 0) {
                System.out.println("Array must contain numbers greater than or equal to zero");
                return -4;
            }
            arrXor = arrXor ^ arr[i];
            if (arr[i] < minInArr) {
                minInArr = arr[i];
            }
            if (arr[i] > maxInArr) {
                maxInArr = arr[i];
            }
        }
        for (int i = minInArr; i <= maxInArr; i++) {
            arithmeticProgressionXor = arithmeticProgressionXor ^ i;
        }
        if ((arithmeticProgressionXor ^ arrXor) == 0) {
            System.out.println("There are no missing numbers in the array");
            return -2;
        }
        return arithmeticProgressionXor ^ arrXor;
    }
    /**
     * The function will return an ArrayList<Integer> containing all the missing numbers in the array
     * @param arr
     * @return
     */
    public static ArrayList<Integer> findAllMissingNumber(int [] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("Array is null or array length is zero.");
            return null;
        }
        if (arr.length == 1) {
            System.out.println("Array has only one element.");
            return null;
        }
        int maxInArr = -2147483648;
        int minInArr = 2147483647;
        ArrayList<Integer> listOfMissingNumbers = new ArrayList<>();
        int [] arrSorted = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrSorted[i] = arr[i];
            if (arr[i] < minInArr) {
                minInArr = arr[i];
            }
            if (arr[i] > maxInArr) {
                maxInArr = arr[i];
            }
        }
        SortAlg.mergeSort(arrSorted, arrSorted.length);
        for (int i = 1; i < arrSorted.length; i++) {
            if (arrSorted[i] - arrSorted[i - 1] != 1) {
                for (int j = arrSorted[i - 1] + 1; j < arrSorted[i]; j++) {
                    listOfMissingNumbers.add(j);
                }
            }
        }
        if (listOfMissingNumbers.isEmpty()) {
            System.out.println("There are no missing numbers in the array");
            return null;
        }
        return listOfMissingNumbers;
    }
}
