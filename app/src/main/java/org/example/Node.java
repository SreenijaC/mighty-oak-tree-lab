package org.example;

public class Node {
    private Squirrel data;
    private Node left;
    private Node right;

    public Node(Squirrel data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    // sets the left child of the node
    public void set_left(Node node) {
        this.left = node;
    }

    // sets the right child of the node
    public void set_right(Node node) {
        this.right = node;
    }

    // returns the left child node
    public Node left() {
        return this.left;
    }

    // returns the right child node
    public Node right() {
        return this.right;
    }

    // returns the squirrel object stored in this node
    public Squirrel getData() {
        return this.data;
    }
}
