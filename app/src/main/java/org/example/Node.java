package org.example;

//  class represents one node in binary tree
public class Node<T> {
    private T data;
    private Node<T> left;
    private Node<T> right;

    // constructor to store squirrel object when node created
    public Node(T data) {
        this.data = data;
        this.left = null; // no left child initially
        this.right = null; // no right child initially
    }

    // attaches new node to left of current node
    public void set_left(Node<T> node) {
        this.left = node;
    }

    // attaches new node to current node' right
    public void set_right(Node<T> node) {
        this.right = node;
    }

    // returns left child node if it exists
    public Node<T> left() {
        return this.left;
    }

    // returns right child node if it exists
    public Node<T> right() {
        return this.right;
    }

    // accessing  actual object stored in the node 
    public T getData() {
        return this.data;
    }
}
