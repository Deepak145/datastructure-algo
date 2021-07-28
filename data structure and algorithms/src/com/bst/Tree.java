package com.bst;

public class Tree {
    Integer data;
    Tree LNode;
    Tree RNode;

    @Override
    public String toString() {
        return "Tree{" +
                "data=" + data +
                ", LNode=" + LNode +
                ", RNode=" + RNode +
                '}';
    }
}
