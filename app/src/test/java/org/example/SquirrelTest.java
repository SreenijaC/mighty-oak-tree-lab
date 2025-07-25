package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SquirrelTest {
    @Test
    void testGetName() {
          // normal case: name should come out correctly
        Squirrel squirrel = new Squirrel("Nutmeg");
        assertEquals("Nutmeg", squirrel.getName());
    }

    @Test
    void testEmptyName() {
        // handles empty string name
        Squirrel squirrel = new Squirrel("");
        assertEquals("", squirrel.getName());
    }

    @Test
    void testNullNameHandling() {
        // handles null name doesnt crash
        Squirrel squirrel = new Squirrel(null);
        assertNull(squirrel.getName());
    }
}
