package com.sorting;

public class QuickSort {

    public static void main(String[] args) {
        int[] array = {8, 3, 76, 2, 9, 5, 44, 66, 34, 86, 32};
        sort(array, 0, array.length - 1);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    private static void sort(int[] array, int left, int right) {
        if(left < right) {
            int pivot = getPivot(array, left, right);
            sort(array, left, pivot -1);
            sort(array, pivot+1, right);
        }
    }

    private static int getPivot(int[] array, int left, int right) {
        int pivot = array[right];
        int index = left-1;

        for(int i=left ; i<right; i++){
            if(array[i] < pivot){
                index ++ ;
                swap(array, index, i);
            }
        }
        swap(array, index+1, right);
        return index+1;
    }

    private static void swap(int[] array, int index, int right) {
        int temp = array[right];
        array[right] = array[index];
        array[index]= temp;
    }
}
