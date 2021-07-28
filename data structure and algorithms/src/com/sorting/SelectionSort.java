package com.sorting;

public class SelectionSort {

    public static void main(String[] args) {
        int [] array =  {8,3,76,2,9,5,44,66,34,86,32};
        sort(array);
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }

    public static void sort(int [] array){
        for(int j=0; j<array.length; j++) {
            int min = j;  // 0
            for (int i = j; i < array.length; i++) {
                if (array[min] > array[i]) {
                    min = i; // 3
                }
            }
            int temp = array[j];
            array[j] = array[min];
            array[min] = temp;
        }
    }
}