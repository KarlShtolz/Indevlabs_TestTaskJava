package org.example;

import junit.framework.TestCase;
import org.junit.Assert;

public class IndevlabsAlgorithmFindOneTest extends TestCase {
    int [] arr1 = new int[] {5, 0, 1, 3, 2};
    int [] arr2 = new int[] {7, 9, 10, 11, 12};
    int [] arr3 = new int[] {1, 2, 3, 4, 5};
    int [] arr4 = new int[] {};
    int [] arr5 = null;
    int [] arr6 = new int[] {10};
    int [] arr7 = new int[] {0, 0, 0};

    public void testFindOneMissingNumber001() {
        int expected = 4;
        int actual = IndevlabsAlgorithm.findOneMissingNumber(arr1);
        Assert.assertEquals(expected, actual);
    }

    public void testFindOneMissingNumber002() {
        int expected = 8;
        int actual = IndevlabsAlgorithm.findOneMissingNumber(arr2);
        Assert.assertEquals(expected, actual);
    }

    /**
     * test on an array without missing digits
     */
    public void testFindOneMissingNumber003() {
        int expected = -2;
        int actual = IndevlabsAlgorithm.findOneMissingNumber(arr3);
        Assert.assertEquals(expected, actual);
    }

    /**
     * test on an empty array
     */
    public void testFindOneMissingNumber004() {
        int expected = -1;
        int actual = IndevlabsAlgorithm.findOneMissingNumber(arr4);
        Assert.assertEquals(expected, actual);
    }

    /**
     * test on an null array
     */
    public void testFindOneMissingNumber005() {
        int expected = -1;
        int actual = IndevlabsAlgorithm.findOneMissingNumber(arr5);
        Assert.assertEquals(expected, actual);
    }

    /**
     * test on an array with one element
     */
    public void testFindOneMissingNumber006() {
        int expected = -3;
        int actual = IndevlabsAlgorithm.findOneMissingNumber(arr6);
        Assert.assertEquals(expected, actual);
    }

    /**
     * test on an array of identical elements
     */
    public void testFindOneMissingNumber007() {
        int expected = -2;
        int actual = IndevlabsAlgorithm.findOneMissingNumber(arr7);
        Assert.assertEquals(expected, actual);
    }

}