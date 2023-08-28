package org.example;

import junit.framework.TestCase;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.Collections;

public class IndevlabsAlgorithmFindAllTest extends TestCase {
    int [] arr1 = new int[] {5,0,1,3,2};
    int [] arr2 = new int[] {7,9,10,11,12};
    int [] arr3 = new int[] {1,2,3};
    int [] arr4 = new int[] {0,0,0};
    int [] arr5 = new int[] {-1,-5,-6};
    int [] arr6 = new int[] {6,6,4};
    int [] arr7 = new int[] {};
    int [] arr8 = null;
    int [] arr9 = new int[] {10, -7, 4};
    int [] arr10 = new int[] {-1};

    public void testFindAllMissingNumber001() {
        ArrayList<Integer> expected = new ArrayList<>();
        Collections.addAll(expected, 4);
        ArrayList<Integer> actual = IndevlabsAlgorithm.findAllMissingNumber(arr1);
        Assert.assertEquals(expected, actual);
    }
    public void testFindAllMissingNumber002() {
        ArrayList<Integer> expected = new ArrayList<>();
        Collections.addAll(expected, 8);
        ArrayList<Integer> actual = IndevlabsAlgorithm.findAllMissingNumber(arr2);
        Assert.assertEquals(expected, actual);
    }

    /**
     * test on an array without missing digits
     */
    public void testFindAllMissingNumber003() {
        ArrayList<Integer> expected = null;
        ArrayList<Integer> actual = IndevlabsAlgorithm.findAllMissingNumber(arr3);
        Assert.assertEquals(expected, actual);
    }

    /**
     * test on an array of identical elements
     */
    public void testFindAllMissingNumber004() {
        ArrayList<Integer> expected = null;
        ArrayList<Integer> actual = IndevlabsAlgorithm.findAllMissingNumber(arr4);
        Assert.assertEquals(expected, actual);
    }

    /**
     * test on an array of negative numbers
     */
    public void testFindAllMissingNumber005() {
        ArrayList<Integer> expected = new ArrayList<>();
        Collections.addAll(expected, -4, -3, -2);
        ArrayList<Integer> actual = IndevlabsAlgorithm.findAllMissingNumber(arr5);
        Assert.assertEquals(expected, actual);
    }

    /**
     * test on an array of numbers with repetitions
     */
    public void testFindAllMissingNumber006() {
        ArrayList<Integer> expected = new ArrayList<>();
        Collections.addAll(expected, 5);
        ArrayList<Integer> actual = IndevlabsAlgorithm.findAllMissingNumber(arr6);
        Assert.assertEquals(expected, actual);
    }

    /**
     * test on an empty array
     */
    public void testFindAllMissingNumber007() {
        ArrayList<Integer> expected = null;
        ArrayList<Integer> actual = IndevlabsAlgorithm.findAllMissingNumber(arr7);
        Assert.assertEquals(expected, actual);
    }

    /**
     * test on an null array
     */
    public void testFindAllMissingNumber008() {
        ArrayList<Integer> expected = null;
        ArrayList<Integer> actual = IndevlabsAlgorithm.findAllMissingNumber(arr8);
        Assert.assertEquals(expected, actual);
    }

    /**
     * test on an array of positive and negative numbers
     */
    public void testFindAllMissingNumber009() {
        ArrayList<Integer> expected = new ArrayList<>();
        Collections.addAll(expected, -6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 5, 6, 7, 8, 9);
        ArrayList<Integer> actual = IndevlabsAlgorithm.findAllMissingNumber(arr9);
        Assert.assertEquals(expected, actual);
    }

    /**
     * test on an array with one element
     */
    public void testFindAllMissingNumber010() {
        ArrayList<Integer> expected = null;
        ArrayList<Integer> actual = IndevlabsAlgorithm.findAllMissingNumber(arr10);
        Assert.assertEquals(expected, actual);
    }
}