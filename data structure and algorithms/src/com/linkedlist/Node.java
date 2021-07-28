package com.linkedlist;

public class Node<T> {
    //to avoid getters setters to access these
    public T data;
    public Node<T> node;
    Node() {
        //constructor
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", node=" + node +
                '}';
    }
}
