package com.blueyonder;

import com.blueyonder.main.Library;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test
    void testSomeLibraryMethodReturnsTrue() {
        Library classUnderTest = new Library();
        assertTrue(classUnderTest.someLibraryMethod(), "someLibraryMethod should return 'true'");
    }

    @Test
    void testSomeLibraryMethodReturnsFalse() {
        Library classUnderTest = new Library();
        assertFalse(classUnderTest.someLibraryMethod());
    }
}
