package com.bst;

import java.util.List;

public class BinarySearchTreeTest {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(71);
        bst.insert(22);
        bst.insert(31);
        bst.insert(42);
        bst.insert(84);

        bst = bst.remove(42);
        bst = bst.remove(22);

        List inorder = bst.inorder();
        inorder.forEach(k -> System.out.print(" "+k));

        System.out.println();

        List preorder = bst.preorder();
        preorder.forEach(k -> System.out.print(" "+k));

        System.out.println();

        List postOrder = bst.postOrder();
        postOrder.forEach(k -> System.out.print(" "+k));

        System.out.println(bst.findMax());
        System.out.println(bst.findMin());

    }
}
