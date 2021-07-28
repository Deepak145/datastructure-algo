package com.linkedlist;

public class MyLinkedListRunner {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.addHead(12);
        list.addHead(13);
        list.addHead(14);
        list.addHead(15);

        list.addTail(16);
        list.addTail(17);

        list.removeElement(17);
        list.removeIndex(0);
        list.traverse();

        System.out.print("Size is "+ list.size());

        MyLinkedList<Integer> list1 = new MyLinkedList<>();
        list1.addHead(120);
        list1.addHead(130);
        list1.addHead(140);
        list1.addHead(150);

        System.out.println();
        MyLinkedListUtil util = new MyLinkedListUtil();
        Node<Integer> node = util.merge(list.getNode(), list1.getNode());
        while(node != null){
            System.out.print(" "+node.data);
            node = node.node;
        }

        System.out.println();
        MyLinkedList<Integer> list2 = new MyLinkedList<>();
        list2.addHead(120);
        list2.addHead(130);
        list2.addHead(140);
        list2.addHead(150);
        Node<Integer> node1 = util.reverse(list2.getNode());
        while(node1 != null){
            System.out.print(" "+node1.data);
            node1 = node1.node;
        }
    }
}
