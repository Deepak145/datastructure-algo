package com.linkedlist;
/**
 * Implementation of arrayList
 * @param <T> Generic Data type for ArrayList <br/>
 *  <b><i>Feature</i></b>
 *          <ol>
 *          <li>add element to head</li>
 *           <li>add element to tail</li>
 *      <li>remove element by value</li>
 *      <li>remove element by index</li>
 *      <li>search by value</li>
 *      <li>get index</li>
 *      <li>traverse and print</li>
 *           </ol>
 */
public class MyLinkedList<T> {
    private Node<T> node;
    private int size;

    public void addHead(T element){
        if(node == null){
            node = new Node<>();
            node.data = element;
            return;
        }
        Node<T> temp = new Node<>();
        temp.data = element;
        temp.node = node;
        node = temp;
        size++;
    }

    public void addTail(T element){
        if(node == null){
            node = new Node<>();
            node.data = element;
            return;
        }
        Node<T> temp = node;
        while(temp.node != null){
            temp = temp.node;
        }
        Node<T> dataNode = new Node<>();
        dataNode.data = element;
        temp.node = dataNode;
        size ++;
    }

    public void removeElement(T element){
        if(node.data == element){
            node = node.node;
            size--;
        }
        Node<T> current = node;
        Node<T> prev =  node;
        while(current.data != element){
            prev = current;
            current = current.node;
        }
        if(current.data == element){
            prev.node= current.node;
            size--;
        }
        else
        throw new ArrayStoreException("Element not available");
    }

    public void removeIndex(int index){
        int count = 0;
        if(index == 0){
            node = node.node;
            size--;
            return;
        }
        Node<T> temp = node;
        while(count +1 != index && temp != null){
            count++;
            temp = temp.node;
        }
        if(count+1 == index){
            temp.node = temp.node.node;
            size--;
        }
        else throw new ArrayStoreException("Index not found");
    }
    public int size(){
        return this.size;
    }

    public Node<T> getNode(){
        return node;
    }
    public void traverse() {
        Node<T> temp = node;
        while (temp.node != null){
            System.out.print(" "+ temp.data);
            temp = temp.node;
        }
        System.out.print(" "+ temp.data);
    }
}
