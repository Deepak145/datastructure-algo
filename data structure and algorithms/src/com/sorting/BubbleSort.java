package com.sorting;

public class BubbleSort {

    public static void main(String[] args) {
        int [] array =  {8,3,76,2,9,5,44,66,34,86,32};
        sort(array);
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }

    public static void sort(int [] array){
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array.length-1; j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
}
