package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NodeTest {
    @Test
    void testStoreAndRetrieveData() {
        Squirrel squirrel = new Squirrel("Hazel");
        Node node = new Node(squirrel);
        assertEquals("Hazel", node.getData().getName());
    }

    @Test
    void testLeftAndRightChildren() {
        Node parent = new Node(new Squirrel("Parent"));
        Node leftChild = new Node(new Squirrel("Lefty"));
        Node rightChild = new Node(new Squirrel("Righty"));

        parent.set_left(leftChild);
        parent.set_right(rightChild);

        assertEquals("Lefty", parent.left().getData().getName());
        assertEquals("Righty", parent.right().getData().getName());
    }

    @Test
    void testOverwritingChildren() {
        Node parent = new Node(new Squirrel("Mama"));
        Node firstLeft = new Node(new Squirrel("First"));
        Node secondLeft = new Node(new Squirrel("Second"));

        parent.set_left(firstLeft);
        parent.set_left(secondLeft);  // overwrite

        assertEquals("Second", parent.left().getData().getName());
    }

    @Test
    void testLeafHasNullChildren() {
        Node leaf = new Node(new Squirrel("Leafy"));
        assertNull(leaf.left());
        assertNull(leaf.right());
    }

    @Test
    void testNullDataInNode() {
        Node empty = new Node(null);
        assertNull(empty.getData());
    }
}
