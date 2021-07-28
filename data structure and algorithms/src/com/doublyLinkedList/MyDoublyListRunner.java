package com.doublyLinkedList;

public class MyDoublyListRunner {
    public static void main(String[] args) {
        MyDoublyList<Integer> list = new MyDoublyList<>();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(6);
        list.insert(7);
        list.insert(8);
        list.insert(9);

        System.out.println(list.removeElement(8));
        System.out.println("Index is "+list.getIndex(3));
        list.print();
    }
}
