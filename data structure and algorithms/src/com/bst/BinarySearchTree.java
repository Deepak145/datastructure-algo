package com.bst;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//insert into BST
// remove From BST
// Traverse BST (Inorder, preorder, postorder)
// find max / min
public class BinarySearchTree {
    Tree tree = null;

    public void insert(Integer element){
        if(tree == null){
            tree = new Tree();
            tree.data = element;
            return;
        }
        Tree temp = this.tree;
        Tree newData = new Tree();
        newData.data = element;
        findNodeAndInsert(element, temp, newData);
    }

    private void findNodeAndInsert(Integer element, Tree temp, Tree newData) {
        if(element >= temp.data){
            if(temp.RNode == null){
                temp.RNode = newData;
                return;
            }
            else findNodeAndInsert(element, temp.RNode, newData);
        }
        else {
            if(temp.LNode == null){
                temp.LNode = newData;
                return;
            }
            else findNodeAndInsert(element , temp.LNode, newData);
        }
    }

    public List inorder(){
        Tree temp = this.tree;
        List list = new ArrayList();
        inorder(list, temp);
        return list;
    }
    private void inorder(List list, Tree temp){
        if(temp == null) return;
        list.add(temp.data);
        inorder(list, temp.LNode);
        inorder(list, temp.RNode);
    }

    public List preorder(){
        Tree temp = this.tree;
        List list = new ArrayList();
        preorder(list, temp);
        return list;
    }
    private void preorder(List list, Tree temp){
        if(temp == null) return;
        preorder(list, temp.LNode);
        list.add(temp.data);
        preorder(list, temp.RNode);
    }

    public List postOrder(){
        Tree temp = this.tree;
        List list = new ArrayList();
        postOrder(list, temp);
        return list;
    }
    private void postOrder(List list, Tree temp){
        if(temp == null) return;
        postOrder(list, temp.LNode);
        postOrder(list, temp.RNode);
        list.add(temp.data);
    }

    public BinarySearchTree remove(Integer element){
        BinarySearchTree bst = new BinarySearchTree();
        List<Integer> inOrder = inorder();
        List<Integer> inOrder2 = inOrder.stream().filter(k -> !k.equals(element)).collect(Collectors.toList());
        inOrder2.forEach(k -> bst.insert(k));
        return bst;
    }

    public Integer findMax(){
        Tree temp = this.tree;
        while(temp.RNode != null){
            temp = temp.RNode;
        }
        return temp.data;
    }

    public Integer findMin(){
        Tree temp = this.tree;
        while(temp.LNode != null){
            temp = temp.LNode;
        }
        return temp.data;
    }
}
