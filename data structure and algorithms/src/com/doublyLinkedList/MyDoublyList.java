package com.doublyLinkedList;
/**
 * Implementation of MyDoublyList
 * @param <T> Generic Data type for MyDoublyList <br/>
 *  <b><i>Feature</i></b>
 *    <ol>
 *      <li>add element to head</li>
 *      <li>remove element by value</li>
 *      <li>remove element by index</li>
 *      <li>search by value</li>
 *      <li>get index</li>
 *      <li>getPrev</li>
 *      <li>getNext</li>
 *      <li>traverse and print</li>
 *     </ol>
 */

public class MyDoublyList<T> {

    private DNode<T> node = null;

    public void insert(T data){
        if(this.node == null){
            this.node = new DNode<>();
            this.node.data = data;
            return;
        }
        DNode<T> temp = new DNode<>();
        temp.data = data;
        temp.next = this.node;
        this.node.prev = temp;
        this.node = temp;
    }

    public boolean removeIndex(int index){
        int count =-1;
        DNode<T> temp = this.node;
        DNode<T> prev = null;
        DNode<T> next = null;
        if(index == 0){
            this.node = node.next;
            return true;
        }
        while(count != index && temp.next != null){
            prev = temp.prev;
            next = temp.next;
            temp = temp.next;
            count ++;
        }
        if(count == index){
            prev.next = next;
            return true;
        }
        else{
            return false;
        }
    }

    public boolean removeElement(T element){
        int index = getIndex(element);
        return removeIndex(index+1);
    }

    public int getIndex(T element){
        DNode<T> temp = this.node;
        int count =-1;
        while(temp.data != element && temp != null){
            temp = temp.next;
            count ++;
        }
        if(temp.data == element){
            return count;
        }
        return -1;
    }

    public void print(){
        DNode<T> temp = this.node;
        while(temp.next != null){
            System.out.print(" " +temp.data);
            temp = temp.next;
        }
        System.out.print(" "+temp.data);
    }
}
