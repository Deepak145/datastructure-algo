package com.arraylist;

import java.lang.reflect.Array;

/**
 * Implementation of arrayList
 * @param <T> Generic Data type for ArrayList <br/>
 *  <b><i>Feature</i></b>
 *          <ol>
 *      <li>add element to tail</li>
 *      <li>remove element by value</li>
 *      <li>remove element by index</li>
 *      <li>search by value</li>
 *      <li>get index</li>
 *      <li>traverse and print</li>
 *           </ol>
 */
public class MyArrayList<T> {

    private T [] array = null;
    private int length=0;
    private int capacity = 0;
    private Class clazz= null;

    public MyArrayList(Class clazz , int size){
        this.clazz = clazz;
        this.array =  (T[]) Array.newInstance(clazz, size);
        this.capacity = size;
    }
    public void print(){
        for(int i=0; i<length; i++){
            System.out.print(" "+ array[i]);
        }
    }
    public void add(T element){
        if(length +2 >= capacity){
            upSizeArray();
        }
        array[length] = element;
        length++;
    }

    public void removeElement(T element){
        for(int i=0; i< this.length; i++){
            if(array[i].equals(element)){
                array[i] = null;
            }
        }
        organize();
        this.length -=1;
        if(length - 7 == capacity){
            downSizeArray();
        }
    }

    public void removeIndex(int index){
        array[index] = null;
        if(this.length != index){
            organize();
        }
        this.length -=1;
        if(length - 7 == capacity){
            downSizeArray();
        }
    }

    public Integer getIndex( T element){
        for(int i=0; i< this.length; i++){
            if(array[i].equals(element)){
               return i;
            }
        }
        return -1;
    }

    public T getElement(int index){
        if(index > this.length) throw new ArrayStoreException("Index is out of array size");
        if(index < 0) throw  new ArrayStoreException("index cant be a negetive value");
        return array[index];
    }

    public int size(){
        return this.length;
    }

    public int capacity() {
        return this.capacity;
    }

    private void organize() {
        for(int i=0; i< this.length ; i++){
            if(array[i] == null && i != this.length){
                for(int j=i; j<this.length-1; j++){
                    T temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    private void upSizeArray() {
        this.capacity = capacity+5;
        T [] temp = (T[]) Array.newInstance(clazz,capacity);
        for(int i=0; i< array.length; i++){
            temp[i] = array[i];
        }
        this.array = temp;
    }

    private void downSizeArray() {
        this.capacity = capacity - 5;
        T[] temp = (T[]) Array.newInstance(clazz, capacity);
        for (int i = 0; i < array.length; i++) {
            temp[i] = array[i];
        }
        this.array = temp;
    }
}
