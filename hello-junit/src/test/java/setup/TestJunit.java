package setup;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestJunit {
    @Test
    public void testAssertEquals() {
        String str = "Hello JUnit";
        assertEquals("Hello JUnit", str);
    }
}
