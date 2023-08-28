package org.example;

public class SortAlg {
    public static int[] bubbleSort (int [] arr) {
        int tmp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                     tmp = arr[j];
                     arr[j] = arr[j + 1];
                     arr[j + 1] = tmp;
                }
            }
        }
        return arr;
    }
    public static void mergeSort(int[] a, int lenArr) {
        if (lenArr < 2) {
            return;
        }
        int mid = lenArr / 2;
        int[] l = new int[mid];
        int[] r = new int[lenArr - mid];
        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < lenArr; i++) {
            r[i - mid] = a[i];
        }
        mergeSort(l, mid);
        mergeSort(r, lenArr - mid);

        merge(a, l, r, mid, lenArr - mid);
    }
    public static void merge(
            int[] a, int[] l, int[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }
}
