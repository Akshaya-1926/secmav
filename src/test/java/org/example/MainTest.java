package org.example;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class MainTest {
    @Test
    public void testArea()
{
    assertEquals(27,Main.area(3),0.001);
    assertEquals(48,Main.area(4),0.001);
}
}
