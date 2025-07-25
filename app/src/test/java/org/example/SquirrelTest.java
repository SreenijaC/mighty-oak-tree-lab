package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SquirrelTest {
    @Test
    void testGetName() {
        Squirrel squirrel = new Squirrel("Nutmeg");
        assertEquals("Nutmeg", squirrel.getName());
    }

    @Test
    void testEmptyName() {
        Squirrel squirrel = new Squirrel("");
        assertEquals("", squirrel.getName());
    }

    @Test
    void testNullNameHandling() {
        Squirrel squirrel = new Squirrel(null);
        assertNull(squirrel.getName());
    }
}
