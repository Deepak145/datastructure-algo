package com.linkedlist;

public class MyLinkedListUtil<T> {

    MyLinkedListUtil() {}

    public Node<T> merge(Node<T> list_0, Node<T> list_1){
        Node<T> list = list_0;
        while(list.node != null){
            list = list.node;
        }
        list.node = list_1;
        return list_0;
    }

    public Node<T> reverse(Node<T> node){
        MyLinkedList<T> list = new MyLinkedList<>();
        while(node.node != null){
            list.addHead(node.data);
            node = node.node;
        }
        list.addHead(node.data);
        return list.getNode();
    }
}
