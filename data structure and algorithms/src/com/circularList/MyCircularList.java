package com.circularList;
/**
 * Implementation of MyCircularList
 * @param <T> Generic Data type for MyCircularList <br/>
 *  <b><i>Feature</i></b>
 *    <ol>
 *      <li>add element to head</li>
 *      <li>remove element by value</li>
 *      <li>remove element by index</li>
 *      <li>search by value</li>
 *      <li>get index</li>
 *      <li>traverse and print</li>
 *     </ol>
 */
public class MyCircularList<T> {

    private CNode<T> node = null;

    public void insert(T data){
        if(node == null){
            node = new CNode<>();
            node.data = data;
            node.node = this.node;
            return;
        }
        CNode<T> temp = new CNode<>();
        temp.data = data;
        CNode<T> copy = this.node;
        while(copy.node.data != node.data){
            copy = copy.node;
        }
        copy.node = temp;
        temp.node = this.node;
        this.node = temp;
    }
}
