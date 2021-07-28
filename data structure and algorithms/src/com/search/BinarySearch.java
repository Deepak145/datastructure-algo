package com.search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(recurSearch(array, 5)); // true
        System.out.println(loopSearch(array, 8)); // true
    }

    public static int recurSearch(int [] array, int element){
        // find the middle element
        return recur(array, 0, array.length-1, element);
    }

    private static int recur(int[] array, int start, int end, int element) {
        if(start <= end) {
            int middle = (start + end) / 2;
            if(array[middle] == element) return middle;
            if (array[middle] > element) return recur(array, start, middle, element);
            return recur(array, middle + 1, end, element);

        }
        return -1;
    }

    public static int loopSearch(int [] array, int element){
        for(int i=0; i<array.length; i++){
            if(array[i] == element) return i;
        }
        return -1;
    }
}
