package com.stack;

import com.arraylist.MyArrayList;
import com.linkedlist.MyLinkedList;

public class MyStack<T> {
    MyLinkedList<T> list = new MyLinkedList<>();

    public void push(T element){
        list.addHead(element);
    }

    public T pop(){
        T data = list.getNode().data;
        list.removeIndex(0);
        return data;
    }
}
