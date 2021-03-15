package learning.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloJUnitTests {

    @Test
    public void passingTest() {
        HelloJUnit helloJUnit = new HelloJUnit();
        assertEquals(6, helloJUnit.sum(4, 2));
    }

    @Test
    public void failingTest() {
        HelloJUnit helloJUnit = new HelloJUnit();
        assertEquals("Hello, World", helloJUnit.greeting("World"));
    }
}
