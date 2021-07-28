package com.arraylist;

public class MyArrayListTester {
    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>(Integer.class, 5);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(16);
        list.add(18);
        list.add(17);

        //list.removeElement(15);
        //list.removeElement(16);

        //list.removeIndex(0);
        //list.removeIndex(1);
        System.out.print("Element :: 3 --> "+list.getElement(3));
        System.out.print("Index :: 13 --> "+list.getIndex(13));
        list.print();

    }
}
