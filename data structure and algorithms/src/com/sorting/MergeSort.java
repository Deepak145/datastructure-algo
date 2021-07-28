package com.sorting;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = {8, 3, 76, 2, 9, 5, 44, 66, 34, 86, 32};
        sort(array, 0, array.length - 1);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    private static void sort(int[] array, int left, int right) {
        if(left < right) {
            int middle = (left + right) / 2;
            sort(array, left, middle);
            sort(array, middle+1, right);
            merge(array,left, middle, right);
        }
    }

    private static void merge(int[] array,int left, int middle, int right) {
        int sizeA = middle - left +1;
        int sizeB = right - middle;

        int [] arA = new int [sizeA];
        int [] arB = new int [sizeB];

        for(int i=0; i<sizeA; i++){
            arA[i] = array[left+i];
            System.out.print(" "+arA[i]);
        }
        System.out.println();
        for(int j =0; j<sizeB; j++){
            arB[j] = array[middle + 1+ j];
            System.out.print(" "+arA[j]);
        }

        int i=0, j=0, k=left;

        while(i < sizeA && j < sizeB){
            if(arA[i] <= arB[j]){
                array[k] = arA[i];
                i++;
                k++;
            }
            else{
                array[k] = arB[j];
                j++;
                k++;
            }
        }

        while(i < sizeA){
            array[k] = arA[i];
            i++;
            k++;
        }
        while( j < sizeB) {
            array[k] = arB[j];
            j++;
            k++;
        }
    }
}