package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NodeTest {

    @Test
    void testStoreAndRetrieveData() {
        // testing if squirrel can be stored, get its name
        Squirrel squirrel = new Squirrel("Hazel");
        Node<Squirrel> node = new Node<>(squirrel);
        assertEquals("Hazel", node.getData().getName());
    }

    @Test
    void testLeftAndRightChildren() {
        // check if can attach left and right child nodes
        Node<Squirrel> parent = new Node<>(new Squirrel("Parent"));
        Node<Squirrel> leftChild = new Node<>(new Squirrel("Lefty"));
        Node<Squirrel> rightChild = new Node<>(new Squirrel("Righty"));

        parent.set_left(leftChild);
        parent.set_right(rightChild);

        assertEquals("Lefty", parent.left().getData().getName());
        assertEquals("Righty", parent.right().getData().getName());
    }

    @Test
    void testOverwritingChildren() {
        // testing if overwriting child node works
        Node<Squirrel> parent = new Node<>(new Squirrel("Mama"));
        Node<Squirrel> firstLeft = new Node<>(new Squirrel("First"));
        Node<Squirrel> secondLeft = new Node<>(new Squirrel("Second"));

        parent.set_left(firstLeft);
        parent.set_left(secondLeft); // second one should replace first

        assertEquals("Second", parent.left().getData().getName());
    }

    @Test
    void testLeafHasNullChildren() {
        // if node is leaf, both its children should be null
        Node<Squirrel> leaf = new Node<>(new Squirrel("Leafy"));
        assertNull(leaf.left());
        assertNull(leaf.right());
    }

    @Test
    void testNullDataInNode() {
        // check behavior when null stored inside the node
        Node<Squirrel> empty = new Node<>(null);
        assertNull(empty.getData());
    }
}
