package com.sorting;

public class InsertionSort {

    public static void main(String[] args) {
        int[] array = {8, 3, 76, 2, 9, 5, 44, 66, 34, 86, 32};
        sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    public static void sort(int[] array) {
        for(int i=1; i<array.length; i++){
            swapper(array, i);
        }
    }

    public static void swapper(int []array, int index){
        for(int i=0; i<index; i++){
            if(array[i] > array[index]){
                int temp = array[i];
                array[i] = array[index];
                array[index] = temp;
            }
        }
    }
}